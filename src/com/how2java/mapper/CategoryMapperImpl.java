package com.how2java.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.how2java.pojo.Category;
import com.how2java.util.Page;
import com.how2java.mapper.CategoryMapper;

public class CategoryMapperImpl implements CategoryMapper{
	@Autowired
	CategoryMapper categoryMapper;

	@Override
	public List<Category> list(Page page){
		return categoryMapper.list(page);
	}

	@Override
	public int add(Category category) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Category category) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return 0;
	}
}
