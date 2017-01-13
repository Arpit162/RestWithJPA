package com.my.project.service;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.slf4j.Logger;
import com.my.project.IService.IService;
import com.my.project.Logger.LogFactory;
import com.my.project.dao.EBusinessLogic;
import com.my.project.dto.CarSale;
import com.my.project.dto.EmployePerformance;
import com.my.project.entity.Customer;
import com.my.project.entity.Product;
import com.my.project.entity.Services;
import com.my.project.exception.DAOException;
import com.my.project.exception.PersistException;
import com.my.project.exception.ServiceException;

@Path("/Fetch")
public class Service implements IService {
	private static final Logger log = LogFactory.getLogger(Service.class);

	@Inject
	private EBusinessLogic dboInterface2;

	@GET
	@Path("/GetCarServiceReport")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Services> getCarServiceReport() throws ServiceException {
		try {
			return dboInterface2.genrateCarServiceReport();
		} catch (DAOException e) {
			e.printStackTrace();
			log.error(e.getMessage());
			throw new ServiceException("Some problem during Fetching of data ");
		}
	}

	@GET
	@Path("/GetCustomerReport")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> getCustomersInformationReport(@QueryParam("fname") String firstname,
			@QueryParam("phone") String phone) throws ServiceException {
		try {
			return dboInterface2.genrateCustomersInformationReport(firstname, phone);
		} catch (DAOException e) {
			e.printStackTrace();
			log.error(e.getMessage());
			throw new ServiceException("Some problem during Fetching of data ");
		}
	}

	@GET
	@Path("/GetInventoryReport")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getInventoryInformationReport(@QueryParam("modelname") String modelname,
			@QueryParam("vendorname") String vendorname) throws ServiceException {
		try {
			return dboInterface2.genrateInventoryInformationReport(modelname, vendorname);
		} catch (DAOException e) {
			e.printStackTrace();
			log.error(e.getMessage());
			throw new ServiceException("Some problem during Fetching of data ");
		}
	}

	@GET
	@Path("/GetEmployeePerformanceReport")
	@Produces(MediaType.APPLICATION_JSON)
	public List<EmployePerformance> getEmployeePerformaneReport() throws ServiceException {
		try {
			return dboInterface2.genrateEmployeePerformanceReport();
		} catch (DAOException e) {
			e.printStackTrace();
			log.error(e.getMessage());
			throw new ServiceException("Some problem during Fetching of data ");
		}
	}

	@GET
	@Path("/GetCarSaleReport")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CarSale> getCarSalesReprort(@QueryParam("modelname") String modelname,
			@QueryParam("vendorname") String vendorname) throws ServiceException {
		try {
			return dboInterface2.genrateCarSalesReport(modelname, vendorname);
		} catch (DAOException e) {
			e.printStackTrace();
			log.error(e.getMessage());
			throw new ServiceException("Some problem during Fetching of data ");
		}

	}

	@GET
	@Path("/Check")
	@Produces(MediaType.APPLICATION_JSON)
	public String check() throws ServiceException, PersistException {
		return "Working";
	}

}
