package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 求职信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-23 17:47:29
 */
@TableName("qiuzhixinxi")
public class QiuzhixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QiuzhixinxiEntity() {
		
	}
	
	public QiuzhixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学号
	 */
					
	private String xuehao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
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
