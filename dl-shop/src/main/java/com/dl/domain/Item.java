package com.dl.domain;

import java.util.ArrayList;
import java.util.List;

public class Item {
	private int iid;
	private String iname;
	List<Shop> list = new ArrayList<Shop>();
	public Item() {
		super();
	}
	
	public int getIid() {
		return iid;
	}

	public void setIid(int iid) {
		this.iid = iid;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public List<Shop> getList() {
		return list;
	}

	public void setList(List<Shop> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Item [iid=" + iid + ", iname=" + iname + ", list=" + list + "]";
	}
	
}
