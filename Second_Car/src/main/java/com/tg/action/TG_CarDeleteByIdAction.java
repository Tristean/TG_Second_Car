package com.tg.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.tg.service.TG_CarService;

public class TG_CarDeleteByIdAction extends ActionSupport {
	@Autowired
	private TG_CarService tcs;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	//�о�������Լ���һ��struts2��validate
	public String execute()throws Exception{
		tcs.deleteById(id);
		return SUCCESS;
	}
}
