package cn.hh.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import cn.hh.model.Custom;

public class Test {
	public static void main(String[] args) {
		//读取配置文件
		Configuration conf = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		
		try {
			//读取配置文件
			conf = new Configuration().configure();
			//创建SessionFactory
			sessionFactory = conf.buildSessionFactory();
			//打开session
			session = sessionFactory.openSession();
			//开始一个事务
			tx = session.beginTransaction();
			Custom c = new Custom();
			c.setId(4);
			c.setName("英");
			c.setAge(22);
			c.setSex("女");
			//持久化操作
			session.save(c);
			//提交事务
			tx.commit();
			
			System.out.println(c.getName()+"   "+c.getAge()+"   "+c.getSex());
		
			
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}finally {
			session.close();
		}
	}
	
}
