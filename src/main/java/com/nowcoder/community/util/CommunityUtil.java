package com.nowcoder.community.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

import java.util.UUID;

public class CommunityUtil {
    //生成随机的字符串
    public static String generateUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }
    //MD5加密，只能加密不能解密，每次加密的结果都一样
    //通过在密码后面加上一段随机的字符串和密码一起加密提高安全性
    public static String md5(String key){
        if(StringUtils.isBlank(key)){
            return null;
        }else{
            return  DigestUtils.md5DigestAsHex(key.getBytes());
        }
    }
}
