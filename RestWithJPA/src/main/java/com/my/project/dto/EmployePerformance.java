package com.my.project.dto;

public class EmployePerformance {
	
	private Integer Employee_Id;
	private Long OrderCount;
	private Long ServiceCount;
	

	public Long getServiceCount() {
		return ServiceCount;
	}
	public void setServiceCount(Long serviceCount) {
		ServiceCount = serviceCount;
	}
	public int getEmployee_Id() {
		return Employee_Id;
	}
	public void setEmployee_Id(int employee_Id) {
		Employee_Id = employee_Id;
	}
	public Long getOrderCount() {
		return OrderCount;
	}
	public void setOrderCount(Long orderCount) {
		OrderCount = orderCount;
	}

	@Override
	public String toString() {
		return "EmployePerformance [Employee_Id=" + Employee_Id
				+ ", OrderCount=" + OrderCount + ", ServiceCount="
				+ ServiceCount + "]";
	}
	

}
