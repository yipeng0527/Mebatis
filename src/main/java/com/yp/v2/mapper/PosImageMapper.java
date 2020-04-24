package com.yp.v2.mapper;

import com.yp.v2.annotation.Entity;
import com.yp.v2.annotation.Select;

/**
 * @author ex-yipeng
 * @version Id: PosImageMapper.java, v 0.1 2020/4/24 10:56 ex-yipeng Exp $
 */
@Entity(PosImage.class)
public interface PosImageMapper {

    @Select(" select pos_image_id,pos_accept_id,pos_batch_id from pos_image_info where pos_image_id = ?")
    PosImage selectById(String id);
}
