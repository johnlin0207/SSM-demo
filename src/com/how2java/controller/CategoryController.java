package com.how2java.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.how2java.pojo.Category;
import com.how2java.pojo.Test;
import com.how2java.service.CategoryService;
import com.how2java.util.Page;
import com.how2java.mapper.CategoryMapper;
import com.how2java.mapper.CategoryMapperImpl;

// 鍛婅瘔spring mvc杩欐槸涓�涓帶鍒跺櫒绫�
@Controller
public class CategoryController {
	@Autowired
	CategoryService categoryService;

	@RequestMapping("listCategory")
	public ModelAndView listCategory(Page page){
	
		ModelAndView mav = new ModelAndView();
		List<Category> cs= categoryService.list(page);
		int total = categoryService.total();
		
		page.caculateLast(total);
		
		// 鏀惧叆杞彂鍙傛暟
		mav.addObject("cs", cs);
		// 鏀惧叆jsp璺緞
		mav.setViewName("listCategory");
		return mav;
	}

}
