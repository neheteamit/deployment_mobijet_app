package com.example.demo.entities;



public class SolutionAdd {
	 int reqid;
    int userid;
	 String remark;
	 String status;
	public SolutionAdd() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SolutionAdd(int reqid, int userid, String remark, String status) {
		super();
		this.reqid = reqid;
		this.userid = userid;
		this.remark = remark;
		this.status = status;
	}
	public int getReqid() {
		return reqid;
	}
	public void setReqid(int reqid) {
		this.reqid = reqid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
