package com.dl.domain;

import java.util.Arrays;

public class Middle {
	private int mid;
	private int sid;
	private int iid;
	private Integer[] iids;
	public Middle() {
		super();
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public Integer[] getIids() {
		return iids;
	}
	public void setIids(Integer[] iids) {
		this.iids = iids;
	}
	@Override
	public String toString() {
		return "Middle [mid=" + mid + ", sid=" + sid + ", iid=" + iid + ", iids=" + Arrays.toString(iids) + "]";
	}
	
}
