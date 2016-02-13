package cn.ssh2.demo;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.ssh2.demo.service.ICarService;
import cn.ssh2.domain.Car;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
@Scope(value="prototype")
@Controller(value="carAction")
public class CarAction extends ActionSupport implements ModelDriven<Car> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Car car = new Car();
	public Car getModel() {
		return car;
	};
	@Resource(name="carService")
	private ICarService service;
	@Override
	public String execute() throws Exception {
		service.save(car);
		System.err.println("保存成功。。。。"+car);
		return null;
	}
	
	public String query(){
		List<Car> list = 
				service.query();
		System.err.println(">>>>:"+list);
		return null;
	}
}
