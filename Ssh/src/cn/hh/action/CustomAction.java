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
	
	
	//��ӿͻ�
	public boolean addCus(){
		return customService.addCus();
	}
	
	
	//ɾ���ͻ�
	public boolean deleteCus(){
		return customService.deleteCus();
		
	}
	
	
}
