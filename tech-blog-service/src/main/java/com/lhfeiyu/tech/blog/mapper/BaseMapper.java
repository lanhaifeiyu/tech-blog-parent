package com.lhfeiyu.tech.blog.mapper;

import java.util.List;
import java.util.Map;

/**
 * base mapper
 *
 * @param <T>
 * @author Airson Yu
 */
public interface BaseMapper<T> {

    // select
    T selectByPrimaryKey(long id);

    T selectByCondition(Map<String, Object> map);

    List<T> selectListByCondition(Map<String, Object> map);

    long selectCountByCondition(Map<String, Object> map);

    // update
    int updateByPrimaryKey(T record);

    int updateByPrimaryKeySelective(T record);

    // insert
    int insert(T record);

    int insertBatch(List<T> recordList);

    int insertSelective(T record);

    // delete
    int deleteByPrimaryKey(long id);

}

