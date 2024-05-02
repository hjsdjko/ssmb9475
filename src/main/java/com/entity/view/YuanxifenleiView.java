package com.entity.view;

import com.entity.YuanxifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 院系分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-23 17:47:29
 */
@TableName("yuanxifenlei")
public class YuanxifenleiView  extends YuanxifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuanxifenleiView(){
	}
 
 	public YuanxifenleiView(YuanxifenleiEntity yuanxifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, yuanxifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
