package cn.ssh2.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@Entity
@Table(name = "cars")
@GenericGenerator(name = "iid", strategy = "uuid")
public class Car {
	@Id
	@GeneratedValue(generator = "iid")
	@Column(name = "id")
	private String id;
	@Column(name = "name")
	private String name;
	@Column(name = "price")
	private Double price;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
