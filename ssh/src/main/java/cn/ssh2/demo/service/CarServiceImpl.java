package cn.ssh2.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.ssh2.demo.dao.ICarDao;
import cn.ssh2.domain.Car;
@Service(value="carService")
public class CarServiceImpl implements ICarService {
	@Resource(name="carDao")
	private ICarDao dao;
	public void save(Car car){
		dao.save(car);
	}
	public List<Car> query(){
		return dao.query();
	}
}
