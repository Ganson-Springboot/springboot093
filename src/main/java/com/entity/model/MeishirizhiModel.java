package com.entity.model;

import com.entity.MeishirizhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 美食日志
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-30 10:01:54
 */
public class MeishirizhiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 日志标题
	 */
	
	private String rizhibiaoti;
		
	/**
	 * 日志封面
	 */
	
	private String rizhifengmian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 美食日志
	 */
	
	private String meishirizhi;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：日志标题
	 */
	 
	public void setRizhibiaoti(String rizhibiaoti) {
		this.rizhibiaoti = rizhibiaoti;
	}
	
	/**
	 * 获取：日志标题
	 */
	public String getRizhibiaoti() {
		return rizhibiaoti;
	}
				
	
	/**
	 * 设置：日志封面
	 */
	 
	public void setRizhifengmian(String rizhifengmian) {
		this.rizhifengmian = rizhifengmian;
	}
	
	/**
	 * 获取：日志封面
	 */
	public String getRizhifengmian() {
		return rizhifengmian;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：美食日志
	 */
	 
	public void setMeishirizhi(String meishirizhi) {
		this.meishirizhi = meishirizhi;
	}
	
	/**
	 * 获取：美食日志
	 */
	public String getMeishirizhi() {
		return meishirizhi;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
