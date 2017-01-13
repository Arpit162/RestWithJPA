package com.my.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_table")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Product_Id;
	private String ProductName;
	private int OrderYetToCome;
	private String VendorName;
	private String Description;
	private int QunatityInStock;
	private long BuyPrice;
	private long MSRP;
	
	public int getProduct_Id() {
		return Product_Id;
	}
	public void setProduct_Id(int product_Id) {
		Product_Id = product_Id;
	}
	public String getProductname() {
		return ProductName;
	}
	public void setProductname(String productname) {
		ProductName = productname;
	}
	public int getOrderYetToCome() {
		return OrderYetToCome;
	}
	public void setOrderYetToCome(int orderYetToCome) {
		OrderYetToCome = orderYetToCome;
	}
	public String getVendorName() {
		return VendorName;
	}
	public void setVendorName(String vendorName) {
		VendorName = vendorName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getQunatityInStock() {
		return QunatityInStock;
	}
	public void setQunatityInStock(int qunatityInStock) {
		QunatityInStock = qunatityInStock;
	}
	public long getBuyPrice() {
		return BuyPrice;
	}
	public void setBuyPrice(long buyPrice) {
		BuyPrice = buyPrice;
	}
	public long getMSRP() {
		return MSRP;
	}
	public void setMSRP(long mSRP) {
		MSRP = mSRP;
	}
	@Override
	public String toString() {
		return "Product [Product_Id=" + Product_Id + ", Productname="
				+ ProductName + ", OrderYetToCome=" + OrderYetToCome
				+ ", VendorName=" + VendorName + ", Description=" + Description
				+ ", QunatityInStock=" + QunatityInStock + ", BuyPrice="
				+ BuyPrice + ", MSRP=" + MSRP + "]";
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	