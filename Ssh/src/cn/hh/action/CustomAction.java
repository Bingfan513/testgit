package cn.hh.action;

import cn.hh.service.CustomService;

public class CustomAction {
	private CustomService customService;

	public CustomService getCustomService() {
		return customService;
	}

	public void setCustomService(CustomService customService) {
		this.customService = customService;
	}
	
	
	//添加客户
	public boolean addCus(){
		return customService.addCus();
	}
	
	
	//删除客户
	public boolean deleteCus(){
		return customService.deleteCus();
		
	}
	
	
}
