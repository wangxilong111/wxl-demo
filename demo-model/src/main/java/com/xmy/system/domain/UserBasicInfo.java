package com.xmy.system.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户基本信息 user_basic_info
 * @author WXL
 *  @date 2023-03-21
 */
@Data
@NoArgsConstructor
@TableName("user_basic_info")
@Accessors(chain = true)
@ApiModel("签单记录")
public class UserBasicInfo implements Serializable {

    private static final long serialVersionUID=1L;

    /** 主键 */
    @TableId(value = "id")
    private Long id;

    /** 用户名 */
    private String userName;

    /** 密码 */
    private String password;

    /** 性别(0：男，1：女 */
    private Long sex;

    /** 手机号 */
    private String phone;

    /** 审核状态 */
    private Long auditStatus;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /** 是否删除(0:：未删除，1：已删除) */
    private Long isDelete;

    /** 是否登陆(0：未登录，1：以登录) */
    private Long isSelete;


}
