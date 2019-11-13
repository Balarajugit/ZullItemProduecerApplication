package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private double cost;
	private int excepteddays;
	public Item() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getExcepteddays() {
		return excepteddays;
	}
	public void setExcepteddays(int excepteddays) {
		this.excepteddays = excepteddays;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", cost=" + cost + ", excepteddays=" + excepteddays + "]";
	}

}
