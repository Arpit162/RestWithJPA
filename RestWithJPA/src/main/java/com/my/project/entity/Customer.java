package com.my.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="customer_table")
public class Customer {


    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Customer_Id;
	private String LastName;
	private String FirstName;
	private String Phone;
	private String Addreass;
	private String City;
	private String State;
	private String Postalcode;
	private String Country;
	
	
	public int getCustomer_Id() {
		return Customer_Id;
	}
	public void setCustomer_Id(int customer_Id) {
		Customer_Id = customer_Id;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getAddreass() {
		return Addreass;
	}
	public void setAddreass(String addreass) {
		Addreass = addreass;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getPostalcode() {
		return Postalcode;
	}
	public void setPostalcode(String postalcode) {
		Postalcode = postalcode;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
	@Override
	public String toString() {
		return "Customer [Customer_Id=" + Customer_Id + ", LastName="
				+ LastName + ", FirstName=" + FirstName + ", Phone=" + Phone
				+ ", Addreass=" + Addreass + ", City=" + City + ", State="
				+ State + ", Postalcode=" + Postalcode + ", Country=" + Country
				+  "]";
	}
    
}


