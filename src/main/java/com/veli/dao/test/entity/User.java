package com.veli.dao.test.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * user 
 * 
 * @author yangwei
 */
@Data
@Accessors(chain = true)
public class User {
    private Integer id;

    @ApiModelProperty("用户名")
    private String username;
}