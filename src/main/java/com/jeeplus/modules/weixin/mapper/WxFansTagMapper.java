/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package com.jeeplus.modules.weixin.mapper;

import com.jeeplus.core.persistence.BaseMapper;
import com.jeeplus.core.persistence.annotation.MyBatisMapper;
import com.jeeplus.modules.weixin.entity.WxFansTag;

/**
 * 用户标签MAPPER接口
 *
 * @author toteny
 * @version 2018-07-14
 */
@MyBatisMapper
public interface WxFansTagMapper extends BaseMapper<WxFansTag> {
    WxFansTag getName(WxFansTag tag);
}