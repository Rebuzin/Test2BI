/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizza;

/**
 *
 * @author renan
 */
public class Calculate {
	private double pizzaBordAdditional;
	private double pizzaSizeValue;
	private double pizzaFlavorValue;
	private double drinkValue;
	
	public double calculate(Order order) {
		validateOrder(order);
		double totalValue;
		if (validateBordAdditional(order) == 1) {
			totalValue = pizzaSizeValue + pizzaFlavorValue + pizzaBordAdditional + drinkValue;
		} else
			totalValue = pizzaSizeValue + pizzaFlavorValue + drinkValue;
		return totalValue;
	}
	
	public void validateOrder(Order order) {
		validateBordAdditional(order);
		validatePizzaFlavorValue(order);
		validatePizzaSizeValue(order);
		validateDrinkValue(order);
	}
	
	public int validateBordAdditional(Order order) {
		if (order.getOrderPizzaWithBordYesNo().equals("S")) {
			if (order.getOrderPizzaBordFlavor().contains("Cheedar")) {pizzaBordAdditional = 0.00;}
			if (order.getOrderPizzaBordFlavor().contains("Catupiry")) {pizzaBordAdditional = 0.00;}
			if (order.getOrderPizzaBordFlavor().contains("1/2")) {pizzaBordAdditional = 3.00;}
			if (order.getOrderPizzaBordFlavor().contains("Nutella")) {pizzaBordAdditional = 2.00;}
			return 1;
		} else return 0;
	}
	
	public void validatePizzaSizeValue(Order order) {
		if (validateBordAdditional(order) == 1) {
			if(order.getOrderPizzaFlavors().contains("Gigante")) {pizzaSizeValue = 80.00;};
			if(order.getOrderPizzaFlavors().contains("Família")) {pizzaSizeValue = 69.50;};
			if(order.getOrderPizzaFlavors().contains("Média")) {pizzaSizeValue = 56.50;};
			if(order.getOrderPizzaFlavors().contains("Pequena")) {pizzaSizeValue = 44.50;};
		} else {
			if(order.getOrderPizzaFlavors().contains("Gigante")) {pizzaSizeValue = 75.00;};
			if(order.getOrderPizzaFlavors().contains("Família")) {pizzaSizeValue = 66.00;};
			if(order.getOrderPizzaFlavors().contains("Média")) {pizzaSizeValue = 52.00;};
			if(order.getOrderPizzaFlavors().contains("Pequena")) {pizzaSizeValue = 42.00;};
			if(order.getOrderPizzaFlavors().contains("Broto")) {pizzaSizeValue = 28.00;};
		}
	}
	public void validatePizzaFlavorValue(Order order) {
		if(order.getOrderPizzaFlavors().contains("5 Queijos")) {pizzaFlavorValue = 0.00;};
		if(order.getOrderPizzaFlavors().contains("Frango Catupiry")) {pizzaFlavorValue = 0.00;};
		if(order.getOrderPizzaFlavors().contains("Abacaxi com Canela")) {pizzaFlavorValue = 0.00;};
		if(order.getOrderPizzaFlavors().contains("Calabresa")) {pizzaFlavorValue = 0.00;};
		if(order.getOrderPizzaFlavors().contains("Chocolate")) {pizzaFlavorValue = 0.00;};
		if(order.getOrderPizzaFlavors().contains("Prestígio")) {pizzaFlavorValue = 0.00;};
		if(order.getOrderPizzaFlavors().contains("Salmão com Alcaparras")) {pizzaFlavorValue = 4.00;};
		if(order.getOrderPizzaFlavors().contains("Camarão")) {pizzaFlavorValue = 4.50;};
		if(order.getOrderPizzaFlavors().contains("Cheddar")) {pizzaFlavorValue = 3.50;};
	}
	public void validateDrinkValue(Order order) {
		if(order.getOrderDrinks().contains("Coca-Cola 2L")) {drinkValue = 9.50;};
		if(order.getOrderDrinks().contains("Cerveja Heineken 330ml")) {drinkValue = 6.50;};
		if(order.getOrderDrinks().contains("Suco Pratz 900ml")) {drinkValue = 12.50;};
		if(order.getOrderDrinks().contains("Água Mineral 600ml")) {drinkValue = 3.50;};
	}
}
