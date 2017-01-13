package com.my.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ServiceType_Table")
public class ServiceType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ServiceType_Id;
	private String ServiceType;
	
	
	public int getServiceType_Id() {
		return ServiceType_Id;
	}
	public void setServiceType_Id(int serviceType_Id) {
		ServiceType_Id = serviceType_Id;
	}
	public String getServiceType() {
		return ServiceType;
	}
	public void setServiceType(String serviceType) {
		ServiceType = serviceType;
	}
	
	@Override
	public String toString() {
		return "ServiceType [ServiceType_Id=" + ServiceType_Id
				+ ", ServiceType=" + ServiceType + "]";
	}
	

}
