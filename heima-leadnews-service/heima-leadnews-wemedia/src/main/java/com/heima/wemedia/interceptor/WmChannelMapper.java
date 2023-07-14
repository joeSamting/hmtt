package com.heima.wemedia.interceptor;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heima.model.wemedia.pojos.WmChannel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WmChannelMapper extends BaseMapper<WmChannel> {
}