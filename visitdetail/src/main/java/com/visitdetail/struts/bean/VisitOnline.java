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
	private Integer id;//id 主键
	
	private String userid;//用户标识，用户区别不同的用户
	
	private String ip;//ip地址
	
	private String address;//实际地址
	
	private boolean online;//是否在线，true 为仍在线， false 为已离线
	
	private String url;//正在访问的网页url
	
	private String title;//正在访问的网页标题
	
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
