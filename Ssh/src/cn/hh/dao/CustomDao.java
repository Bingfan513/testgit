package cn.hh.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate3.HibernateTemplate;


import cn.hh.daoImpl.CustomDaoImpl;

import cn.hh.model.Custom;
//Dao层属于业务逻辑层   需要添加功能！
public class CustomDao implements CustomDaoImpl{
	
	private JdbcTemplate jdbcTemplate;
	private Custom custom;
	
	private HibernateTemplate hibernateTemplate;
		

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Custom getCustom() {
		return custom;
	}

	public void setCustom(Custom custom) {
		this.custom = custom;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
	public List<Custom> getCustomsByRowMapper(){
		List<Custom> ls = new ArrayList<Custom>();
		jdbcTemplate.query("select * from custom", new RowMapper<Custom>(){

			@Override
			public Custom mapRow(ResultSet arg0, int arg1) throws SQLException {
				
				Custom custom = new Custom();
//				custom.setAge();
				return null;
			}
			
		});
		
		
		return ls;
		
	}
		
	public void addCustom(Custom custom){
		hibernateTemplate.save(custom);
	}
	
	public void deleteCustom(Custom custom){
		hibernateTemplate.delete(custom);
	}

	
	@Override
	public boolean addCus() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCus() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
