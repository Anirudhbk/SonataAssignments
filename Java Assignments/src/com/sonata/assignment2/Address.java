package com.sonata.assignment2;

public class Address {
	int Doorno;
	String street;
	int  pincode;
	String city;
	
	Address(){
		
	}
	Address(int doorno, String street, int pin, String city){
		this.Doorno=doorno;
		this.street=street;
		this.pincode=pin;
		this.city=city;
				}
	@Override
	public String toString() {
		return "Address [Doorno=" + Doorno + ", street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}
}