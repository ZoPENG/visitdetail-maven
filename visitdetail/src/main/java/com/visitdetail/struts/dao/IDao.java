package com.visitdetail.struts.dao;

/**
 * DAO �ӿ�
 * 
 * @author zhoupeng
 *
 */
public interface IDao {

	public static final int TIME_OUT = 60 * 1000 * 20;// ��ʱʱ�䣺20 ���ӡ�

	public void create(Object obj);
}
