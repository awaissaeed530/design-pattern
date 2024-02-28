package io.awais.patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class OrderService implements Iorder {
	private List<Warehouse> warehouses;

	public OrderService() {
		Warehouse defaultWarehouse = new Warehouse(10);
		this.warehouses = new ArrayList<>();
		this.warehouses.add(defaultWarehouse);
	}

	@Override
	public Order fulfillOrder(Order order) {
		for (Warehouse warehouse : warehouses) {
			if (warehouse.checkInventory(1)) {
				break;
			}
			warehouse.fulfillOrder(order);
		}
		return order;
	}
}
