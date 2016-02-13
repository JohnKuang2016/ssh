package cn.ssh2.utils;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
public class BaseHibernateDaoSupport extends HibernateDaoSupport {
	//所有继承了HiberanteDaoSupport的类，都必须要设置属性sessionFactory
	//原来在配置文件中直接可以通过<peroperty name="sessionFactory" ref="sessionFactory"/>的方式就可以设置
	//但是现在是在注解中实现，必须要有一地方可以放@Resource注解来引用sessionFactory
	//但是在HibernateDaoSupport里面的setSessionFactory是final的子类不能重写
	//所以，就必须要提供一个非setSessionFactory,用于组父类设置sessionFactory
	@Resource(name="sessionFactory")
	public void setSF(SessionFactory sf){
		super.setSessionFactory(sf);
	}
}
