package com.xmy.common.core.domain;

import cn.hutool.core.lang.Validator;
import cn.hutool.http.HttpStatus;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author Admin
 */
public class AjaxResult extends HashMap<String, Object>{
    private static final long serialVersionUID = 1L;

    /** 状态码 */
    public static final String CODE_TAG = "code";

    /** 返回内容 */
    public static final String MSG_TAG = "msg";

    /** 数据对象 */
    public static final String DATA_TAG = "data";

    /**
     * 初始化一个新创建的 AjaxResult 对象，使其表示一个空消息。
     */
    public AjaxResult()
    {
    }

    /**
     * 初始化一个新创建的 AjaxResult 对象
     *
     * @param code 状态码
     * @param msg 返回内容
     */
    public AjaxResult(int code, String msg)
    {
        super.put(CODE_TAG, code);
        super.put(MSG_TAG, msg);
    }

    /**
     * 初始化一个新创建的 AjaxResult 对象
     *
     * @param code 状态码
     * @param msg 返回内容
     * @param data 数据对象
     */
    public AjaxResult(int code, String msg, Object data)
    {
        super.put(CODE_TAG, code);
        super.put(MSG_TAG, msg);
        if (Validator.isNotNull(data))
        {
            super.put(DATA_TAG, data);
        }
    }

    /**
     * 返回成功消息
     *
     * @return 成功消息
     */
    public static AjaxResult success()
    {
        return AjaxResult.success("操作成功");
    }

    /**
     * 返回成功数据
     *
     * @return 成功消息
     */
    public static AjaxResult success(Object data)
    {
        return AjaxResult.success("操作成功", data);
    }

    /**
     * 返回成功消息
     *
     * @param msg 返回内容
     * @return 成功消息
     */
    public static AjaxResult success(String msg)
    {
        return AjaxResult.success(msg, null);
    }

    /**
     * 返回成功消息
     *
     * @param msg 返回内容
     * @param data 数据对象
     * @return 成功消息
     */
    public static AjaxResult success(String msg, Object data)
    {
        return new AjaxResult(HttpStatus.HTTP_OK, msg, data);
    }

    /**
     * 返回错误消息
     *
     * @return
     */
    public static AjaxResult error()
    {
        return AjaxResult.error("操作失败");
    }

    /**
     * 返回错误消息
     *
     * @param msg 返回内容
     * @return 警告消息
     */
    public static AjaxResult error(String msg)
    {
        return AjaxResult.error(msg, null);
    }

    /**
     * 返回错误消息
     *
     * @param msg 返回内容
     * @param data 数据对象
     * @return 警告消息
     */
    public static AjaxResult error(String msg, Object data)
    {
        return new AjaxResult(HttpStatus.HTTP_INTERNAL_ERROR, msg, data);
    }

    /**
     * 返回错误消息
     *
     * @param code 状态码
     * @param msg 返回内容
     * @return 警告消息
     */
    public static AjaxResult error(int code, String msg)
    {
        return new AjaxResult(code, msg, null);
    }

    /**
     * 判断操作是否成功
     * @return
     */
    public boolean isSuccess(){
        if("200".equals(String.valueOf(get(CODE_TAG)))){
            return true;
        }
        return false;
    }

    /**
     * 获取结果中的内容
     * @return
     */
    public Object getData(){
        return get(DATA_TAG);
    }

    /**
     * 获取结果中的内容
     * @return
     */
    public JSONObject getData2Json(){
        Object data = get(DATA_TAG);
        if(Objects.isNull(data)){
            return null;
        }
        return JSON.parseObject(data.toString());
    }

    /**
     * 描述信息放在data里面
     * @param type
     * @param msg
     * @return
     */
    public static AjaxResult successDataMsg(String type,String msg)
    {
        Map<String,String> res = new HashMap<>();
        res.put("msg",msg);
        res.put("type",type);
        return  AjaxResult.success(null,res);
    }

    /**
     * 获取失败的信息
     * @return
     */
    public String errorMsg()
    {
        return String.valueOf(get(MSG_TAG));
    }

}
