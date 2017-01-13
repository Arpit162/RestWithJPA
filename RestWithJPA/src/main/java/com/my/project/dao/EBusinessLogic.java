package com.my.project.dao;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

import com.my.project.Idao.IBussinessLogic;
import com.my.project.Logger.LogFactory;
import com.my.project.dto.CarSale;
import com.my.project.dto.EmployePerformance;
import com.my.project.entity.Customer;
import com.my.project.entity.OrderDetail;
import com.my.project.entity.Product;
import com.my.project.entity.Services;
import com.my.project.exception.DAOException;

@RequestScoped
public class EBusinessLogic implements IBussinessLogic {

	private static final Logger log = LogFactory.getLogger(EBusinessLogic.class);

	String queryString = "";
	@PersistenceContext(unitName = "restjpa")
	private EntityManager em;

	public List<Services> genrateCarServiceReport() throws DAOException {
		queryString = "SELECT s FROM Services S";
		List<Services> record = (List<Services>) em.createQuery(queryString).getResultList();
		log.debug("" + record);
		return record;
	}

	public List<Product> genrateInventoryInformationReport(String modelname, String vendorname) throws DAOException {
		if (((modelname.equalsIgnoreCase("null") || StringUtils.isEmpty(modelname)))
				&& (vendorname.equalsIgnoreCase("null") || StringUtils.isEmpty(vendorname))) {
			queryString = "SELECT p " + "FROM Product p";
		} else if ((!modelname.equalsIgnoreCase("null") || !StringUtils.isEmpty(modelname))
				&& (vendorname.equalsIgnoreCase("null") || StringUtils.isEmpty(vendorname))) {
			queryString = "SELECT p " + "FROM Product p" + " WHERE p.ProductName='" + modelname + "'";
		} else if ((modelname.equalsIgnoreCase("null") || StringUtils.isEmpty(modelname))
				&& (!vendorname.equalsIgnoreCase("null") || !StringUtils.isEmpty(vendorname))) {
			queryString = "SELECT p " + "FROM Product p" + " WHERE p.VendorName='" + vendorname + "'";
		} else {
			queryString = "SELECT p " + "FROM Product p" + " WHERE p.ProductName='" + modelname + "' AND p.VendorName='"
					+ vendorname + "'";
		}

		List<Product> record = (List<Product>) em.createQuery(queryString).getResultList();
		log.debug("" + record);
		return record;

	}

	public List<EmployePerformance> genrateEmployeePerformanceReport() throws DAOException {

		List<EmployePerformance> performanceReport = new ArrayList<EmployePerformance>();
		queryString = "select od.SalesEmployeeId.Employee_Id,count(od.SalesEmployeeId.Employee_Id) from OrderDetail od group by od.SalesEmployeeId.Employee_Id ";

		List<Object> record1 = (List<Object>) em.createQuery(queryString).getResultList();
		log.debug("to process-->" + record1);

		for (int i = 0; i < record1.size(); i++) {

			EmployePerformance perfObj = new EmployePerformance();
			Object array[] = (Object[]) record1.get(i);
			perfObj.setEmployee_Id(new Integer((Integer) array[0]));
			perfObj.setOrderCount((Long) array[1]);
			performanceReport.add(perfObj);
		}

		queryString = "select sr.ServiceEmployee.Employee_Id,count(sr.ServiceEmployee.Employee_Id) from Services sr group by sr.ServiceEmployee.Employee_Id ";
		List<Object> record = (List<Object>) em.createQuery(queryString).getResultList();
		for (int i = 0; i < record.size(); i++) {
			Object array[] = (Object[]) record.get(i);
			for (EmployePerformance perfObj : performanceReport)
				if (perfObj.getEmployee_Id() == new Integer((Integer) array[0])) {
					perfObj.setServiceCount((Long) array[1]);
				}
		}
		log.debug("" + performanceReport);
		return performanceReport;

	}

	public List<CarSale> genrateCarSalesReport(String modelname, String vendorname) throws DAOException {
		queryString = "Select od from OrderDetail od";
		List<OrderDetail> odList;
		odList = (List<OrderDetail>) em.createQuery(queryString).getResultList();
		log.debug("to process-->" + odList);
		return (List<CarSale>) UtilityClass.processRecord(odList);

	}

	public List<Customer> genrateCustomersInformationReport(String firstname, String phone) throws DAOException {

		if (((firstname.equalsIgnoreCase("null") || StringUtils.isEmpty(firstname)))
				&& (phone.equalsIgnoreCase("null") || StringUtils.isEmpty(phone))) {
			queryString = "SELECT c " + "FROM Customer c";
		} else if ((!firstname.equalsIgnoreCase("null") || !StringUtils.isEmpty(firstname))
				&& (phone.equalsIgnoreCase("null") || StringUtils.isEmpty(phone))) {
			queryString = "SELECT c " + "FROM Customer c" + " WHERE c.FirstName='" + firstname + "'";
		} else if ((firstname.equalsIgnoreCase("null") || StringUtils.isEmpty(firstname))
				&& (!phone.equalsIgnoreCase("null") || !StringUtils.isEmpty(phone))) {
			queryString = "SELECT c " + "FROM Customer c" + " WHERE c.LastName='" + phone + "'";
		} else {
			queryString = "SELECT c " + "FROM Customer c" + " WHERE c.FirstName='" + firstname + "' AND c.LastName='"
					+ phone + "'";
		}
		queryString = "SELECT c FROM " + Customer.class.getName() + " c";
		List record = em.createQuery(queryString).getResultList();
		log.debug("" + record);
		return (List<Customer>) record;

	}

}
