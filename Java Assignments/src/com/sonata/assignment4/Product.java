package com.sonata.assignment4;

public class Product {
int proId;
String proName;
int proPrize;


public Product(int id, String name, int prize) {
	// TODO Auto-generated constructor stub
	this.proId = id;
	this.proName = name;
	this.proPrize =prize;
}

public int getProId() {
	return proId;
}

public void setProId(int proId) {
	this.proId = proId;
}

public String getProName() {
	return proName;
}

public void setProName(String proName) {
	this.proName = proName;
}

public int getProPrize() {
	return proPrize;
}

public void setProPrize(int proPrize) {
	this.proPrize = proPrize;
}

@Override
public String toString() {
	return "Product [proId=" + proId + ", proName=" + proName + ", proPrize=" + proPrize + "]";
}



}