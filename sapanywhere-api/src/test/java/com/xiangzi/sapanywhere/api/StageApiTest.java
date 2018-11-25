package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.xiangzi.sapanywhere.bean.Stage;
import com.xiangzi.sapanywhere.condition.Criteria;
import com.xiangzi.sapanywhere.condition.Expand;
import com.xiangzi.sapanywhere.condition.Filter;
import com.xiangzi.sapanywhere.condition.Select;
import com.xiangzi.util.JSONUtil;

public class StageApiTest extends BaseAnywhereTest {

	private StageApi stageApi;

	@Before
	public void before() throws Exception {
		super.before();
		stageApi = new StageApi();
	}

	@Ignore
	@Test
	public void all() {
		Filter filter = null;
		
		Expand expand = null;
		// expand = new Expand("*");

		List<String> columnList = new ArrayList<>();
		// columnList.add("id");
		Select select = new Select();
		select.setColumnList(columnList);

		Criteria criteria = new Criteria();
		criteria.setFilter(filter);
		criteria.setExpand(expand);
		criteria.setSelect(select);

		String orderBy = "id";
		String orderType = "asc";

		List<Stage> allStages = stageApi.all(accessToken.getValue(), criteria, orderBy, orderType);
		logger.info("allStages.size:" + allStages.size());
		logger.info("allStages.json:" + JSONUtil.toJSONString(allStages));

		for (Stage stage : allStages) {
			logger.info("stage.json:" + JSONUtil.toJSONString(stage));
		}

	}

}
