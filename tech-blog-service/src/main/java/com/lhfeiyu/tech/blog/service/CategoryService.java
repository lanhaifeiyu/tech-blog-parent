package com.lhfeiyu.tech.blog.service;

import com.lhfeiyu.tech.blog.mapper.CategoryMapper;
import com.lhfeiyu.tech.blog.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Airson Yu
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    public Category load(long id) {
        return categoryMapper.selectByPrimaryKey(1l);
    }

}
