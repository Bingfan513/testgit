package cn.hh.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import cn.hh.model.Custom;

public class Test {
	public static void main(String[] args) {
		//��ȡ�����ļ�
		Configuration conf = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		
		try {
			//��ȡ�����ļ�
			conf = new Configuration().configure();
			//����SessionFactory
			sessionFactory = conf.buildSessionFactory();
			//��session
			session = sessionFactory.openSession();
			//��ʼһ������
			tx = session.beginTransaction();
			Custom c = new Custom();
			c.setId(4);
			c.setName("Ӣ");
			c.setAge(22);
			c.setSex("Ů");
			//�־û�����
			session.save(c);
			//�ύ����
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
