package io.awais.patterns.structural.proxy;

public class Warehouse implements Iorder {
	public int remainingInventory;

	public Warehouse(int inventory) {
		this.remainingInventory = inventory;
	}

	@Override
	public Order fulfillOrder(Order order) {
		System.out.println("Order fulfilled");
		return order;
	}

	public boolean checkInventory(int amount) {
		return this.remainingInventory >= amount;
	}
}
