package com.dl.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dl.domain.Middle;
import com.dl.domain.Shop;
import com.dl.domain.ShopVo;
import com.dl.service.ShopService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class ShopController {
	
	
	@Autowired
	private ShopService service;
	
	@RequestMapping("list.do")
	public String selAll(HttpServletRequest request,ShopVo vo,@RequestParam(defaultValue="1")int pageNum){
		PageHelper.startPage(pageNum, 3);
		List<Shop> list = service.selAll(vo);
		System.out.println(list.toString());
		PageInfo<Shop> page = new PageInfo<Shop>(list);
		request.setAttribute("list", list);
		request.setAttribute("page", page);
		return "list";
	}
	@RequestMapping("detail.do")
	public String detail(HttpServletRequest request,ShopVo vo){
		
		List<Shop> list = service.selAll(vo);
		System.out.println(list.toString());
		request.setAttribute("list", list);
		return "detail";
	}
	@RequestMapping("add.do")
	public String add(ShopVo sv){
		
		int index1 = service.addShop(sv);
		Middle m = new Middle();
		m.setSid(sv.getSid());
		m.setIids(sv.getIids());
		int iddex2 = service.addMiddle(m);
		return "redirect:list.do";
	}
	
	@RequestMapping("del.do")
	@ResponseBody
	public Object del(ShopVo vo){
		int index = service.del(vo);
		return true;
	}
}
