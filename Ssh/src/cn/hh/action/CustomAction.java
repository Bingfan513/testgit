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
	public int addCus(){
		return customService.addCus();
	}
	
	
	//ɾ���ͻ�
	public int deleteCus(){
		return customService.deleteCus();
		
	}
	
	
}
