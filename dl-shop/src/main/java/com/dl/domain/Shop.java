package com.dl.domain;

import java.util.ArrayList;
import java.util.List;

public class Shop {
	private int sid;
	private String sname;
	private String createtime;
	private List<Item> list = new ArrayList<Item>();
	public Shop() {
		super();
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public List<Item> getList() {
		return list;
	}
	public void setList(List<Item> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Shop [sid=" + sid + ", sname=" + sname + ", createtime=" + createtime + ", list=" + list + "]";
	}
	
}
