package com.my.project.Idao;

import java.util.List;

import com.my.project.dto.CarSale;
import com.my.project.dto.EmployePerformance;
import com.my.project.entity.Customer;
import com.my.project.entity.Product;
import com.my.project.entity.Services;
import com.my.project.exception.DAOException;

public interface IBussinessLogic {
	public List<Services> genrateCarServiceReport() throws DAOException;

	public List<Customer> genrateCustomersInformationReport(String firstname, String phone) throws DAOException;

	public List<Product> genrateInventoryInformationReport(String modelname, String vendorname) throws DAOException;

	public List<EmployePerformance> genrateEmployeePerformanceReport() throws DAOException;

	public List<CarSale> genrateCarSalesReport(String modelname, String vendorname) throws DAOException;

}
