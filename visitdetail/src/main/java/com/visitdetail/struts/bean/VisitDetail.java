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
	private Integer id;//id 主键
	
	private String userid;//用户标识，用户区别不同的用户
	
	private String ip;//IP地址
	
	private String address;//实际地址
	
	private String url;//正在访问的网页URL
	
	private String title;//正在访问的网页标题
	
	private String reffer;//网页来源，例如搜索引擎
	
	private String keyword;//如果网络搜索引擎，记录关键字
	
	private int screenwidth;//屏幕分辨率宽度
	
	private int screenheight;//屏幕分辨率高度
	
	private int colordepth;//颜色位数
	
	private String appname;//浏览器内核
	
	private String useragent;//浏览器·操作系统详情
	
	private String systemlanguage;//系统语言
	
	private int activetimes;//访问次数
	
	private Date startdate;//第一次访问时间
	
	private Date lastactiondate;//最后一次访问时间
	
}
