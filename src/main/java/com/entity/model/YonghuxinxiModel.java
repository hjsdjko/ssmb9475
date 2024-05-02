package com.entity.model;

import com.entity.YonghuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 用户信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-23 17:47:29
 */
public class YonghuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 学院名称
	 */
	
	private String xueyuanmingcheng;
		
	/**
	 * 院系
	 */
	
	private String yuanxi;
		
	/**
	 * 专业
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zhuanye;
		
	/**
	 * 政治面貌
	 */
	
	private String zhengzhimianmao;
		
	/**
	 * 毕业日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date biyeriqi;
		
	/**
	 * 协议书编号
	 */
	
	private String xieyishubianhao;
		
	/**
	 * 附件
	 */
	
	private String fujian;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
				
	
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
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：学院名称
	 */
	 
	public void setXueyuanmingcheng(String xueyuanmingcheng) {
		this.xueyuanmingcheng = xueyuanmingcheng;
	}
	
	/**
	 * 获取：学院名称
	 */
	public String getXueyuanmingcheng() {
		return xueyuanmingcheng;
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
	 * 设置：专业
	 */
	 
	public void setZhuanye(Date zhuanye) {
		this.zhuanye = zhuanye;
	}
	
	/**
	 * 获取：专业
	 */
	public Date getZhuanye() {
		return zhuanye;
	}
				
	
	/**
	 * 设置：政治面貌
	 */
	 
	public void setZhengzhimianmao(String zhengzhimianmao) {
		this.zhengzhimianmao = zhengzhimianmao;
	}
	
	/**
	 * 获取：政治面貌
	 */
	public String getZhengzhimianmao() {
		return zhengzhimianmao;
	}
				
	
	/**
	 * 设置：毕业日期
	 */
	 
	public void setBiyeriqi(Date biyeriqi) {
		this.biyeriqi = biyeriqi;
	}
	
	/**
	 * 获取：毕业日期
	 */
	public Date getBiyeriqi() {
		return biyeriqi;
	}
				
	
	/**
	 * 设置：协议书编号
	 */
	 
	public void setXieyishubianhao(String xieyishubianhao) {
		this.xieyishubianhao = xieyishubianhao;
	}
	
	/**
	 * 获取：协议书编号
	 */
	public String getXieyishubianhao() {
		return xieyishubianhao;
	}
				
	
	/**
	 * 设置：附件
	 */
	 
	public void setFujian(String fujian) {
		this.fujian = fujian;
	}
	
	/**
	 * 获取：附件
	 */
	public String getFujian() {
		return fujian;
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
			
}
