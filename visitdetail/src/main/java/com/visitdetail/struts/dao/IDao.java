package com.visitdetail.struts.dao;

/**
 * DAO 接口
 * 
 * @author zhoupeng
 *
 */
public interface IDao {

	public static final int TIME_OUT = 60 * 1000 * 20;// 超时时间：20 分钟。

	public void create(Object obj);
}
