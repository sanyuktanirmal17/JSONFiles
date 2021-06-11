package com.Bridgelabz.Project;

import java.util.List;

//import com.bridgelabz.oops.model.Stock;

public class Inventory {
	public static void main(String[] args) {
		Util utiljson = new Util();
		List<Stock> listStock = utiljson.convertJsonObj("E://Bridgelabz//Inventory.json");

		System.out.println("Total items in inventory =");
		InventoryManager manage = new InventoryManager();

		manage.readInventory(listStock);
		manage.getTotalRiceWeight();
		manage.getTotalPulsesWeight();
		manage.getTotalWheatWeight();
		manage.getPriceOfRice();
		manage.getPriceOfPulses();
		manage.getPriceOfWheat();

	}


}