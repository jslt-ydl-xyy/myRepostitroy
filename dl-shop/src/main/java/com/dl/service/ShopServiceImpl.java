package com.dl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dl.domain.Middle;
import com.dl.domain.Shop;
import com.dl.domain.ShopVo;
import com.dl.mapper.ShopMapper;
@Service
@Transactional
public class ShopServiceImpl implements ShopService{

	@Autowired
	private ShopMapper mapper;
	

	@Override
	public int addShop(ShopVo sv) {
		return mapper.addShop(sv);
	}

	@Override
	public int addMiddle(Middle m) {
		return mapper.addMiddle(m);
	}

	@Override
	public List<Shop> selAll(ShopVo vo) {
		return mapper.selAll(vo);
	}

	@Override
	public int del(ShopVo vo) {
		return mapper.del(vo);
	}

}
