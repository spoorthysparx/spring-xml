package com.hexa.spring1.com.hexa.spring1;

public class Book {
	int bno;
	String name;
	double fee;
	
	Book(){
		
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public Book(int bno, String name, double fee) {
		super();
		this.bno = bno;
		this.name = name;
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Book [bno=" + bno + ", name=" + name + ", fee=" + fee + "]";
	}
	
	
}
