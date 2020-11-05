package com.yp.v2.mapper;

import com.yp.v2.annotation.Entity;
import com.yp.v2.annotation.Select;

/**
 * @author ex-yipeng
 * @version Id: ImUserMapper.java, v 0.1 2020/4/24 10:56 ex-yipeng Exp $
 */
@Entity(ImUser.class)
public interface ImUserMapper {

    @Select("select user_id,name,icon from im_user where user_id = ?")
    ImUser selectByUserId(String id);
}
