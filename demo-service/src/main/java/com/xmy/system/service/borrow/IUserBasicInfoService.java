package com.xmy.system.service.borrow;

import com.xmy.system.domain.UserBasicInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 *  用户基本信息Service接口
 *
 * @author WXL
 * @date 2023-03-21
 */
public interface IUserBasicInfoService extends IService<UserBasicInfo>{

    /**
     * 查询用户列表
     * @param userBasicInfo 条件
     * @return 用户信息
     */
    List<UserBasicInfo> queryList(UserBasicInfo userBasicInfo);


}
