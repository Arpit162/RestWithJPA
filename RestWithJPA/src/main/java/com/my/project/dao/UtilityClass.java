package com.my.project.dao;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import com.my.project.Logger.LogFactory;
import com.my.project.dto.CarSale;
import com.my.project.entity.OrderDetail;

public class UtilityClass {

	private static final Logger log = LogFactory.getLogger(UtilityClass.class);

	public static List<CarSale> processRecord(List<OrderDetail> orderDetailList) {
		List<CarSale> saleRecord = new ArrayList<CarSale>();
		for (OrderDetail record : orderDetailList) {
			if (!record.getStatus().getState().equals("Canceled")) {
				CarSale details = new CarSale();
				details.setDeliveryDate(record.getOrderNumber().getDeliveryDate());
				details.setOrderDate(record.getOrderNumber().getOrderDate());
				details.setOrderDetail_Id(record.getOrder_Id());
				details.setOrderNumber(record.getOrderNumber().getOrder_Id());
				details.setModelName(record.getProductCode().getProductname());
				details.setVendorName(record.getProductCode().getVendorName());
				details.setQuantity(record.getQuantityOrdered());
				details.setSoldPrice(record.getPriceEach() + "/car");
				details.setSalesEmployee(
						record.getSalesEmployeeId().getFirstName() + " " + record.getSalesEmployeeId().getLastName());
				log.info(details.toString());
				saleRecord.add(details);
			}
		}
		return saleRecord;
	}

}
