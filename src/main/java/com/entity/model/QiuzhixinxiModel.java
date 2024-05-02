package com.entity.model;

import com.entity.QiuzhixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 求职信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-23 17:47:29
 */
public class QiuzhixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 院系
	 */
	
	private String yuanxi;
		
	/**
	 * 专业特长
	 */
	
	private String zhuanyetezhang;
		
	/**
	 * 个人简介
	 */
	
	private String gerenjianjie;
		
	/**
	 * 需求职位
	 */
	
	private String xuqiuzhiwei;
		
	/**
	 * 待遇要求
	 */
	
	private String daiyuyaoqiu;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：院系
	 */
	 
	public void setYuanxi(String yuanxi) {
		this.yuanxi = yuanxi;
	}
	
	/**
	 * 获取：院系
	 */
	public String getYuanxi() {
		return yuanxi;
	}
				
	
	/**
	 * 设置：专业特长
	 */
	 
	public void setZhuanyetezhang(String zhuanyetezhang) {
		this.zhuanyetezhang = zhuanyetezhang;
	}
	
	/**
	 * 获取：专业特长
	 */
	public String getZhuanyetezhang() {
		return zhuanyetezhang;
	}
				
	
	/**
	 * 设置：个人简介
	 */
	 
	public void setGerenjianjie(String gerenjianjie) {
		this.gerenjianjie = gerenjianjie;
	}
	
	/**
	 * 获取：个人简介
	 */
	public String getGerenjianjie() {
		return gerenjianjie;
	}
				
	
	/**
	 * 设置：需求职位
	 */
	 
	public void setXuqiuzhiwei(String xuqiuzhiwei) {
		this.xuqiuzhiwei = xuqiuzhiwei;
	}
	
	/**
	 * 获取：需求职位
	 */
	public String getXuqiuzhiwei() {
		return xuqiuzhiwei;
	}
				
	
	/**
	 * 设置：待遇要求
	 */
	 
	public void setDaiyuyaoqiu(String daiyuyaoqiu) {
		this.daiyuyaoqiu = daiyuyaoqiu;
	}
	
	/**
	 * 获取：待遇要求
	 */
	public String getDaiyuyaoqiu() {
		return daiyuyaoqiu;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
			
}
