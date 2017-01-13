package com.my.project.IService;

import java.util.List;

import com.my.project.dto.CarSale;
import com.my.project.dto.EmployePerformance;
import com.my.project.entity.Customer;
import com.my.project.entity.Product;
import com.my.project.entity.Services;
import com.my.project.exception.ServiceException;

public interface IService {
	public List<Services> getCarServiceReport() throws ServiceException;

	public List<Customer> getCustomersInformationReport(String firstname, String phone) throws ServiceException;

	public List<Product> getInventoryInformationReport(String modelname, String vendorname) throws ServiceException;

	public List<EmployePerformance> getEmployeePerformaneReport() throws ServiceException;

	public List<CarSale> getCarSalesReprort(String modelname, String vendorname) throws ServiceException;

}
