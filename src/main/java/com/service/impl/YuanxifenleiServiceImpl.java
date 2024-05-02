package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YuanxifenleiDao;
import com.entity.YuanxifenleiEntity;
import com.service.YuanxifenleiService;
import com.entity.vo.YuanxifenleiVO;
import com.entity.view.YuanxifenleiView;

@Service("yuanxifenleiService")
public class YuanxifenleiServiceImpl extends ServiceImpl<YuanxifenleiDao, YuanxifenleiEntity> implements YuanxifenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanxifenleiEntity> page = this.selectPage(
                new Query<YuanxifenleiEntity>(params).getPage(),
                new EntityWrapper<YuanxifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuanxifenleiEntity> wrapper) {
		  Page<YuanxifenleiView> page =new Query<YuanxifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuanxifenleiVO> selectListVO(Wrapper<YuanxifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanxifenleiVO selectVO(Wrapper<YuanxifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanxifenleiView> selectListView(Wrapper<YuanxifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanxifenleiView selectView(Wrapper<YuanxifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
