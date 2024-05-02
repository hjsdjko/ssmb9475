package com.dao;

import com.entity.YuanxifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuanxifenleiVO;
import com.entity.view.YuanxifenleiView;


/**
 * 院系分类
 * 
 * @author 
 * @email 
 * @date 2021-04-23 17:47:29
 */
public interface YuanxifenleiDao extends BaseMapper<YuanxifenleiEntity> {
	
	List<YuanxifenleiVO> selectListVO(@Param("ew") Wrapper<YuanxifenleiEntity> wrapper);
	
	YuanxifenleiVO selectVO(@Param("ew") Wrapper<YuanxifenleiEntity> wrapper);
	
	List<YuanxifenleiView> selectListView(@Param("ew") Wrapper<YuanxifenleiEntity> wrapper);

	List<YuanxifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<YuanxifenleiEntity> wrapper);
	
	YuanxifenleiView selectView(@Param("ew") Wrapper<YuanxifenleiEntity> wrapper);
	
}
