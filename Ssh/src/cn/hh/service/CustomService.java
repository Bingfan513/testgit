package cn.hh.service;

import cn.hh.dao.CustomDao;
import cn.hh.serviceImpl.CustomServiceImpl;

public class CustomService implements CustomServiceImpl{

	private CustomDao customdao;

	public CustomDao getCustomdao() {
		return customdao;
	}

	public void setCustomdao(CustomDao customdao) {
		this.customdao = customdao;
	}

	@Override
	public int addCus() {
		// TODO Auto-generated method stub
		return customdao.addCus();
	}

	@Override
	public int deleteCus() {
		// TODO Auto-generated method stub
		return customdao.deleteCus();
	}
	
	

}
