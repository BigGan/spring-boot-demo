package com.ghj.spring_boot_demo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Demo {
	private int id;
	
	private String name;

	@JSONField(format="yyyy-MM-dd")
	private Date createTime;
	
	@JSONField(serialize=false)
	private String remark;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
