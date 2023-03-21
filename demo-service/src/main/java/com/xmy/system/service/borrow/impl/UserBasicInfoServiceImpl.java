package com.xmy.system.service.borrow.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xmy.system.domain.UserBasicInfo;
import com.xmy.system.mapper.borrow.UserBasicInfoMapper;
import com.xmy.system.service.borrow.IUserBasicInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Admin
 */
@Service
public class UserBasicInfoServiceImpl extends ServiceImpl<UserBasicInfoMapper, UserBasicInfo> implements IUserBasicInfoService {



    @Override
    public List<UserBasicInfo> queryList(UserBasicInfo userBasicInfo){
        return baseMapper.;
    }

}
