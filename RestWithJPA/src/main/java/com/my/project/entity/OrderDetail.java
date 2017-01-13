package com.my.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="orderdetail_table")
public class OrderDetail {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int OrderDetail_Id;
	@ManyToOne
	@JoinColumn(name="Order_Id")
	private Order OrderNumber;
	@OneToOne
	@JoinColumn(name="Product_Id")
	private Product ProductCode;
	private int QuantityOrdered;
	private long PriceEach;
	@OneToOne
	@JoinColumn(name="Status_Id")
	private Status Status;
	@ManyToOne
	@JoinColumn(name="Employee_Id")
	private Employee SalesEmployeeId;
	
	public int getOrder_Id() {
		return OrderDetail_Id;
	}
	public void setOrder_Id(int orderDetail_Id) {
		OrderDetail_Id = orderDetail_Id;
	}
	public Order getOrderNumber() {
		return OrderNumber;
	}
	public void setOrderNumber(Order orderNumber) {
		OrderNumber = orderNumber;
	}
	public Product getProductCode() {
		return ProductCode;
	}
	public void setProductCode(Product productCode) {
		ProductCode = productCode;
	}
	public int getQuantityOrdered() {
		return QuantityOrdered;
	}
	public void setQuantityOrdered(int quantityOrdered) {
		QuantityOrdered = quantityOrdered;
	}
	public long getPriceEach() {
		return PriceEach;
	}
	public void setPriceEach(long priceEach) {
		PriceEach = priceEach;
	}
	public Status getStatus() {
		return Status;
	}
	public void setStatus(Status status) {
		Status = status;
	}
	public Employee getSalesEmployeeId() {
		return SalesEmployeeId;
	}
	public void setSalesEmployeeId(Employee salesEmployeeId) {
		SalesEmployeeId = salesEmployeeId;
	}
	
	@Override
	public String toString() {
		return "OrderDetail [OrderDetail_Id=" + OrderDetail_Id + ", OrderNumber="
				+ OrderNumber + ", ProductCode=" + ProductCode
				+ ", QuantityOrdered=" + QuantityOrdered + ", PriceEach="
				+ PriceEach + ", Status=" + Status + ", SalesEmployeeId="
				+ SalesEmployeeId + "]";
	}
	
}
