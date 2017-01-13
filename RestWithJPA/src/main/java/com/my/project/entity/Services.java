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
@Table(name="Service_Table")
public class Services {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Service_Id;
	@ManyToOne
	@JoinColumn(name="Order_Id")
	private Order Order_Id;

	@OneToOne
	@JoinColumn(name="Status_Id")
	private Status status;
	
	@OneToOne
	@JoinColumn(name="ServiceType_Id")
	private ServiceType TypeOfService;
	
	@OneToOne
	@JoinColumn(name="Employee_Id")
	private Employee ServiceEmployee;
	
	private int ServiceingPrice;

	public int getService_Id() {
		return Service_Id;
	}

	public void setService_Id(int service_Id) {
		Service_Id = service_Id;
	}

	public Order getOrder_Id() {
		return Order_Id;
	}

	public void setOrder_Id(Order order_Id) {
		Order_Id = order_Id;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public ServiceType getTypeOfService() {
		return TypeOfService;
	}

	public void setTypeOfService(ServiceType typeOfService) {
		TypeOfService = typeOfService;
	}

	public Employee getServiceEmployee() {
		return ServiceEmployee;
	}

	public void setServiceEmployee(Employee serviceEmployee) {
		ServiceEmployee = serviceEmployee;
	}

	public int getServiceingPrice() {
		return ServiceingPrice;
	}

	public void setServiceingPrice(int ServiceingPrice) {
		this.ServiceingPrice = ServiceingPrice;
	}

	@Override
	public String toString() {
		return "Services [Service_Id=" + Service_Id + ", Order_Id=" + Order_Id
				+ ", status=" + status + ", TypeOfService=" + TypeOfService
				+ ", ServiceEmployee=" + ServiceEmployee + ", ServiceingPrice="
				+ ServiceingPrice + "]";
	}
	
	
	
	

}
