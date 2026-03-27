package com.it.dao;

import com.it.entity.Category;

import java.util.HashMap;
import java.util.List;


public interface CategoryDAO {
    List<Category> selectAll(HashMap map);

    void add(Category category);

    void update(Category category);

    Category findById(int id);

    void delete(int id);
}
