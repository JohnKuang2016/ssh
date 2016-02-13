package cn.ssh2.demo.dao;

import java.util.List;

import cn.ssh2.domain.Car;

public interface ICarDao {

	void save(Car c);
	public List<Car> query();
}