package com.visitdetail.struts.bean;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_visit_detail")
public class VisitDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;//id ����
	
	private String userid;//�û���ʶ���û�����ͬ���û�
	
	private String ip;//IP��ַ
	
	private String address;//ʵ�ʵ�ַ
	
	private String url;//���ڷ��ʵ���ҳURL
	
	private String title;//���ڷ��ʵ���ҳ����
	
	private String reffer;//��ҳ��Դ��������������
	
	private String keyword;//��������������棬��¼�ؼ���
	
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
