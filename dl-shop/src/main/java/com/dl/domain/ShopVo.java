package com.dl.domain;

import java.util.Arrays;

public class ShopVo extends Shop{
	private Integer[] iids;
	private Integer[] ids;

	public ShopVo() {
		super();
	}

	public Integer[] getIids() {
		return iids;
	}

	public void setIids(Integer[] iids) {
		this.iids = iids;
	}
	
	public Integer[] getIds() {
		return ids;
	}

	public void setIds(Integer[] ids) {
		this.ids = ids;
	}

	@Override
	public String toString() {
		return "ShopVo [iids=" + Arrays.toString(iids) + "]";
	}
	
}
