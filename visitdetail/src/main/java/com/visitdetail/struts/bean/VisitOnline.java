package com.visitdetail.struts.bean;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_visit_online")
public class VisitOnline {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;//id ����
	
	private String userid;//�û���ʶ���û�����ͬ���û�
	
	private String ip;//ip��ַ
	
	private String address;//ʵ�ʵ�ַ
	
	private boolean online;//�Ƿ����ߣ�true Ϊ�����ߣ� false Ϊ������
	
	private String url;//���ڷ��ʵ���ҳurl
	
	private String title;//���ڷ��ʵ���ҳ����
	
	private int screenwidth;//��Ļ�ֱ��ʿ��
	
	private int screenheight;//��Ļ�ֱ��ʸ߶�
	
	private int colordepth;//��ɫλ��
	
	private String appname;//������ں�
	
	private String useragent;//�����������ϵͳ����
	
	private String systemlanguage;//ϵͳ����
	
	private int activetimes;//���ʴ���
	
	private Date startdate;//��һ�η���ʱ��
	
	private Date lastactiondate;//���һ�η���ʱ��
	
}
