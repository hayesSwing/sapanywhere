package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.xiangzi.sapanywhere.bean.Customer;
import com.xiangzi.sapanywhere.bean.CustomerStage;
import com.xiangzi.sapanywhere.bean.CustomerStatus;
import com.xiangzi.sapanywhere.bean.CustomerType;
import com.xiangzi.sapanywhere.bean.Gender;
import com.xiangzi.sapanywhere.bean.MarketingStatus;
import com.xiangzi.sapanywhere.bean.TaxGroup;
import com.xiangzi.sapanywhere.condition.Criteria;
import com.xiangzi.sapanywhere.condition.Expand;
import com.xiangzi.sapanywhere.condition.Filter;
import com.xiangzi.sapanywhere.condition.Pager;
import com.xiangzi.sapanywhere.condition.Restrictions;
import com.xiangzi.sapanywhere.condition.Select;
import com.xiangzi.sapanywhere.info.ContactInfo;
import com.xiangzi.util.DateUtils;
import com.xiangzi.util.JSONUtil;
import com.xiangzi.util.UTCDateUtil;

public class CustomerApiTest extends BaseAnywhereTest {

	private CustomerApi customerApi;

	@Before
	public void before() throws Exception {
		super.before();
		customerApi = new CustomerApi();
	}

	@Ignore
	@Test
	public void count() {
		int count = customerApi.count(accessToken.getValue());
		logger.info("count:" + count);
	}

	@Ignore
	@Test
	@SuppressWarnings("unchecked")
	public void pager() {
		Filter filter = null;
		// filter = Restrictions.eq("membershipEnabled", "false");
		filter = Restrictions.eq("customerCode", "35");

		Expand expand = null;
		// expand = new Expand("*");

		List<String> columnList = new ArrayList<>();
		// columnList.add("id");
		// columnList.add("name");
		Select select = new Select();
		select.setColumnList(columnList);

		Criteria criteria = new Criteria();
		criteria.setFilter(filter);
		criteria.setExpand(expand);
		criteria.setSelect(select);

		Pager pager = new Pager();
		pager.setCriteria(criteria);
		pager.setPageNumber(1);
		pager.setPageSize(10);
		// pager.setOrderBy("");

		pager = customerApi.pager(accessToken.getValue(), pager);

		logger.info("list.totalCount:" + pager.getTotalCount());
		logger.info("list.pageSize:" + pager.getPageSize());
		logger.info("list.pageCount:" + pager.getPageCount());

		List<Customer> list = (List<Customer>) pager.getList();
		logger.info("list.size:" + list.size());
		logger.info("list.json:" + JSONUtil.toJSONString(list));

		for (Customer customer : list) {
			logger.info("customer.json:" + JSONUtil.toJSONString(customer));
		}

	}

	@Ignore
	@Test
	public void get() {
		String id = "78136";
		// id = "363";// "membershipEnabled":false
		// id = "78134";
		// id = "101978";
		// id = "101986";
		id = "102005";
		
		Expand expand = null;
		expand = new Expand("*");
		Customer customer = customerApi.get(accessToken.getValue(), id, expand);
		logger.info("customer:" + customer);
	}

	@Ignore
	@Test
	public void contacts() {
		String customerId = "78136";

		List<ContactInfo> list = customerApi.contacts(accessToken.getValue(), customerId);
		logger.info("list.size:" + list.size());
		logger.info("list.json:" + JSONUtil.toJSONString(list));

		for (ContactInfo contactInfo : list) {
			logger.info("contactInfo.json:" + JSONUtil.toJSONString(contactInfo));
		}

	}

	@Ignore
	@Test
	public void enableMembership() {
		String customerId = "78134";// membershipEnabled=false,membershipBalance=0.0

		boolean enableMembership = false;
		// enableMembership = true;

		boolean result = customerApi.enableMembership(accessToken.getValue(), customerId, enableMembership);
		logger.info("result:" + result);
	}

	@Ignore
	@Test
	public void validValues() {
		String fieldName = "title";
		fieldName = "position";

		List<String> list = customerApi.validValues(accessToken.getValue(), fieldName);
		logger.info("list.size:" + list.size());
		logger.info("list.json:" + JSONUtil.toJSONString(list));

	}

	@Ignore
	@Test
	public void create() {
		Customer customer = new Customer();
		customer.setType(CustomerType.INDIVIDUAL_CUSTOMER);// 公司客户
		customer.setStage(CustomerStage.CUSTOMER);
		customer.setStatus(CustomerStatus.ACTIVE);
		// 许可邮件状态:SUBSCRIBED-已订阅,UNSUBSCRIBED-不订阅,CLEANED-邮件发送失败,UNKNOWN-未知
		customer.setMarketingStatus(MarketingStatus.UNKNOWN);

		// 以下为非必填项
		customer.setCorporateName("巨为科技");// 公司名称
		customer.setFirstName("三儿");
		customer.setLastName("张");
		// customer.setMembershipNo("240012017010600001");//不能重复

		customer.setMobile("15838175284");
		customer.setRemark("备注信息");

		customer.setPhone("15838175283");
		customer.setFax("65664560");
		// customer.setEmail("418146746@qq.com");//不能重复
		customer.setWebSite("www.xxx.com");

		customer.setGender(Gender.MALE);
		customer.setDateOfBirth(UTCDateUtil.local2Utc(DateUtils.format(DateUtils.parseDate("1988-04-19", DateUtils.SHOW_DATE_FORMAT), UTCDateUtil.localTimePatten)));

		String id = customerApi.create(accessToken.getValue(), customer);
		logger.info("id:" + id);

		// id:78107,id=78107,code=IC021
		// id:78136
		// id:101978
		// id:101986
		// id:101999
		// id:102005

	}

	@Ignore
	@Test
	public void update() {
		String id = "102005";
		Customer customer = new Customer();
		customer.setId(id);
		customer.setType(CustomerType.INDIVIDUAL_CUSTOMER);// 公司客户
		customer.setStage(CustomerStage.CUSTOMER);
		customer.setStatus(CustomerStatus.ACTIVE);
		// // 许可邮件状态:SUBSCRIBED-已订阅,UNSUBSCRIBED-不订阅,CLEANED-邮件发送失败,UNKNOWN-未知
		// customer.setMarketingStatus(MarketingStatus.UNKNOWN);

		// 以下为非必填项
		customer.setCorporateName("巨为科技");// 公司名称
		customer.setFirstName("三儿");
		customer.setLastName("张");
		// customer.setMembershipNo("240012017010600001");//不能重复

		customer.setMobile("15838175283");// 个人客户手机号码不能重复
		customer.setRemark("备注信息,张三儿");

		customer.setPhone("15838175283");
		customer.setFax("65664560");
		// customer.setEmail("418146746@qq.com");//不能重复
		customer.setWebSite("www.xxx.com");

		customer.setGender(Gender.MALE);
		customer.setDateOfBirth(UTCDateUtil.local2Utc(DateUtils.format(DateUtils.parseDate("1988-04-19", DateUtils.SHOW_DATE_FORMAT), UTCDateUtil.localTimePatten)));

		// 增值税号
		customer.setVatRegistrationNumber("00001");
		customer.setTaxType(TaxGroup.EXEMPT);

		// 信用额度提醒临界值不能大于信用额度。
		customer.setCreditLimit(10000.00);// 信用额度
		customer.setCreditLimitThreshold(9000.00);// 信用额度提醒临界值

		boolean updateResult = customerApi.update(accessToken.getValue(), customer);
		logger.info("updateResult:" + updateResult);
	}

}
