package com.entity.model;

import com.entity.ZhaopinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 招聘信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-23 17:47:29
 */
public class ZhaopinxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 企业名称
	 */
	
	private String qiyemingcheng;
		
	/**
	 * 企业地点
	 */
	
	private String qiyedidian;
		
	/**
	 * 招聘岗位
	 */
	
	private String zhaopingangwei;
		
	/**
	 * 招聘人数
	 */
	
	private Integer zhaopinrenshu;
		
	/**
	 * 职位要求
	 */
	
	private String zhiweiyaoqiu;
		
	/**
	 * 工作内容
	 */
	
	private String gongzuoneirong;
		
	/**
	 * 薪资待遇
	 */
	
	private String xinzidaiyu;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 投递邮箱
	 */
	
	private String toudiyouxiang;
		
	/**
	 * 企业介绍
	 */
	
	private String qiyejieshao;
		
	/**
	 * 企业封面
	 */
	
	private String qiyefengmian;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：企业名称
	 */
	 
	public void setQiyemingcheng(String qiyemingcheng) {
		this.qiyemingcheng = qiyemingcheng;
	}
	
	/**
	 * 获取：企业名称
	 */
	public String getQiyemingcheng() {
		return qiyemingcheng;
	}
				
	
	/**
	 * 设置：企业地点
	 */
	 
	public void setQiyedidian(String qiyedidian) {
		this.qiyedidian = qiyedidian;
	}
	
	/**
	 * 获取：企业地点
	 */
	public String getQiyedidian() {
		return qiyedidian;
	}
				
	
	/**
	 * 设置：招聘岗位
	 */
	 
	public void setZhaopingangwei(String zhaopingangwei) {
		this.zhaopingangwei = zhaopingangwei;
	}
	
	/**
	 * 获取：招聘岗位
	 */
	public String getZhaopingangwei() {
		return zhaopingangwei;
	}
				
	
	/**
	 * 设置：招聘人数
	 */
	 
	public void setZhaopinrenshu(Integer zhaopinrenshu) {
		this.zhaopinrenshu = zhaopinrenshu;
	}
	
	/**
	 * 获取：招聘人数
	 */
	public Integer getZhaopinrenshu() {
		return zhaopinrenshu;
	}
				
	
	/**
	 * 设置：职位要求
	 */
	 
	public void setZhiweiyaoqiu(String zhiweiyaoqiu) {
		this.zhiweiyaoqiu = zhiweiyaoqiu;
	}
	
	/**
	 * 获取：职位要求
	 */
	public String getZhiweiyaoqiu() {
		return zhiweiyaoqiu;
	}
				
	
	/**
	 * 设置：工作内容
	 */
	 
	public void setGongzuoneirong(String gongzuoneirong) {
		this.gongzuoneirong = gongzuoneirong;
	}
	
	/**
	 * 获取：工作内容
	 */
	public String getGongzuoneirong() {
		return gongzuoneirong;
	}
				
	
	/**
	 * 设置：薪资待遇
	 */
	 
	public void setXinzidaiyu(String xinzidaiyu) {
		this.xinzidaiyu = xinzidaiyu;
	}
	
	/**
	 * 获取：薪资待遇
	 */
	public String getXinzidaiyu() {
		return xinzidaiyu;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：投递邮箱
	 */
	 
	public void setToudiyouxiang(String toudiyouxiang) {
		this.toudiyouxiang = toudiyouxiang;
	}
	
	/**
	 * 获取：投递邮箱
	 */
	public String getToudiyouxiang() {
		return toudiyouxiang;
	}
				
	
	/**
	 * 设置：企业介绍
	 */
	 
	public void setQiyejieshao(String qiyejieshao) {
		this.qiyejieshao = qiyejieshao;
	}
	
	/**
	 * 获取：企业介绍
	 */
	public String getQiyejieshao() {
		return qiyejieshao;
	}
				
	
	/**
	 * 设置：企业封面
	 */
	 
	public void setQiyefengmian(String qiyefengmian) {
		this.qiyefengmian = qiyefengmian;
	}
	
	/**
	 * 获取：企业封面
	 */
	public String getQiyefengmian() {
		return qiyefengmian;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
