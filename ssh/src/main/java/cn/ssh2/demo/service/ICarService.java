package cn.ssh2.demo.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.ssh2.domain.Car;
@Transactional(propagation=Propagation.REQUIRED)
public interface ICarService {
	public void save(Car car);
	public List<Car> query();
}