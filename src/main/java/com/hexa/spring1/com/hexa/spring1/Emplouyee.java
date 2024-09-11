package com.hexa.spring1.com.hexa.spring1;

public class Emplouyee {
	int id;
	Double salary;
	String name;
	Result res;
	
	
	public Result getRes() {
		return res;
	}
	public void setRes(Result res) {
		this.res = res;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emplouyee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}
	
	
}
