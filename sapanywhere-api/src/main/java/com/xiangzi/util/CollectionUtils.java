package com.xiangzi.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

public class CollectionUtils {

	private static Logger logger = LoggerFactory.getLogger(CollectionUtils.class);

	/**
	 * 执行序列化和反序列化 进行深度拷贝
	 * 
	 * @param src
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static List<?> deepCopy(List<?> src) {
		List<?> dest = null;
		try {
			ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(byteOut);
			out.writeObject(src);
			ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
			ObjectInputStream in = new ObjectInputStream(byteIn);
			dest = (List<?>) in.readObject();
		} catch (Exception e) {
			logger.error("CollectionUtils.deepCopy时发生异常", e);
		}
		return dest;
	}

	@SuppressWarnings("unchecked")
	public static <T> T deepCopy(T src) {
		T dest = null;
		try {
			ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(byteOut);
			out.writeObject(src);
			ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
			ObjectInputStream in = new ObjectInputStream(byteIn);
			dest = (T) in.readObject();
		} catch (Exception e) {
			logger.error("CollectionUtils.deepCopy时发生异常", e);
		}
		return dest;
	}

	/**
	 * 复制集合
	 */
	public static <E> List<E> copyTo(List<?> source, Class<E> destinationClass)
			throws InstantiationException, IllegalAccessException {
		if (source.size() == 0)
			return Collections.emptyList();
		List<E> res = new ArrayList<E>(source.size());
		for (Object o : source) {
			E e = destinationClass.newInstance();
			BeanUtils.copyProperties(o, e);
			res.add(e);
		}
		return res;
	}

}
