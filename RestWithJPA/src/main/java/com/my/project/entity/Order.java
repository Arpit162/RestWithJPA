package com.my.project.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="order_table")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Order_Id;
	private String OrderDate;
	private String DeliveryDate;
	private String Comments;
	private int ForServiceFlag;
	
	public int getForServiceFlag() {
		return ForServiceFlag;
	}
	public void setForServiceFlag(int forServiceFlag) {
		ForServiceFlag = forServiceFlag;
	}

	@ManyToOne
	@JoinColumn(name = "CUSTOMERID")
	private Customer customer;

	public int getOrder_Id() {
		return Order_Id;
	}
	public void setOrder_Id(int order_Id) {
		Order_Id = order_Id;
	}
	public String getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(String orderDate) {
		OrderDate = orderDate;
	}
	public String getDeliveryDate() {
		return DeliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		DeliveryDate = deliveryDate;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Order [Order_Id=" + Order_Id + ", OrderDate=" + OrderDate
				+ ", DeliveryDate=" + DeliveryDate + ", Comments=" + Comments
				+ ", ForServiceFlag=" + ForServiceFlag + ", customer="
				+ customer + "]";
	}
	


	
}

