package com.xmy.system.mapper.borrow;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xmy.system.domain.UserBasicInfo;

import java.util.List;

/**
 * @author Admin
 * @author WXL
 */
public interface UserBasicInfoMapper extends BaseMapper<UserBasicInfo> {

    /**
     * 查询用户列表
     * @param userBasicInfo 条件
     * @return 用户信息
     */
    List<UserBasicInfo> queryList(UserBasicInfo userBasicInfo);

}
