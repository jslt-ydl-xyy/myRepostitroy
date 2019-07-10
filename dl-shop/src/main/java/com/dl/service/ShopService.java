package com.dl.service;

import java.util.List;

import com.dl.domain.Middle;
import com.dl.domain.Shop;
import com.dl.domain.ShopVo;

public interface ShopService {
	public List<Shop> selAll(ShopVo vo);

	public int addShop(ShopVo sv);

	public int addMiddle(Middle m);

	public int del(ShopVo vo);
}
