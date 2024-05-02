package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuanxifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuanxifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuanxifenleiView;


/**
 * 院系分类
 *
 * @author 
 * @email 
 * @date 2021-04-23 17:47:29
 */
public interface YuanxifenleiService extends IService<YuanxifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuanxifenleiVO> selectListVO(Wrapper<YuanxifenleiEntity> wrapper);
   	
   	YuanxifenleiVO selectVO(@Param("ew") Wrapper<YuanxifenleiEntity> wrapper);
   	
   	List<YuanxifenleiView> selectListView(Wrapper<YuanxifenleiEntity> wrapper);
   	
   	YuanxifenleiView selectView(@Param("ew") Wrapper<YuanxifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuanxifenleiEntity> wrapper);
   	
}

