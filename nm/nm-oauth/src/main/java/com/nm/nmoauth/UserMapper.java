package com.nm.nmoauth;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author baostorm
 */
@Mapper
public interface UserMapper {
    User selectByUserName(String userName);
}
