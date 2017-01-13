package com.my.project.dto;


public class CarSale {
	private String OrderDate;
	private String DeliveryDate;
	private int OrderNumber;
	private int OrderDetail_Id;
	private String SalesEmployee;
	private String ModelName;
	private String VendorName;
	private String SoldPrice;
	private int Quantity;
	
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
	public int getOrderNumber() {
		return OrderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		OrderNumber = orderNumber;
	}
	public int getOrderDetail_Id() {
		return OrderDetail_Id;
	}
	public void setOrderDetail_Id(int orderDetail_Id) {
		OrderDetail_Id = orderDetail_Id;
	}
	public String getSalesEmployee() {
		return SalesEmployee;
	}
	public void setSalesEmployee(String salesEmployee) {
		SalesEmployee = salesEmployee;
	}
	public String getModelName() {
		return ModelName;
	}
	public void setModelName(String modelName) {
		ModelName = modelName;
	}
	public String getVendorName() {
		return VendorName;
	}
	public void setVendorName(String vendorName) {
		VendorName = vendorName;
	}
	public String getSoldPrice() {
		return SoldPrice;
	}
	public void setSoldPrice(String SoldPrice) {
		this.SoldPrice = SoldPrice;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	@Override
	public String toString() {
		return "CarSale [OrderNumber=" + OrderNumber + ", OrderDetail_Id="
				+ OrderDetail_Id + ", SalesEmployee=" + SalesEmployee
				+ ", ModelName=" + ModelName + ", VendorName=" + VendorName
				+ ", SoldPrice=" + SoldPrice + ", Quantity=" + Quantity + "]";
	}
	
	

}
