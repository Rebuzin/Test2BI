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
public class SystemOut {
	
	public void outPrintPizzaOrder(Order order, Calculate calculate) {
		System.out.println(
				"Tamanho da pizza: " + order.getOrderPizzaSize() + "\n"
			  + "Sabores da pizza: " + order.getOrderPizzaFlavors() + "\n"
			  + "Sabor da borda: "   + order.getOrderPizzaBordFlavor() + "\n"
			  + "Valor Total: R$" + calculate.calculate(order)
		);
	}
	public void outPrintDrinkOrder(Order order, Calculate calculate) {
		System.out.println(
				"Bebida: " + order.getOrderDrinks() + "\n"
			  + "Valor Total: R$" + calculate.calculate(order));
		
	}
	public void outPrintAll(Order order, Calculate calculate) {
		outPrintPizzaOrder(order, calculate);
		outPrintDrinkOrder(order, calculate);
		System.out.println("Valor Total: R$" + calculate.calculate(order));
	}
}
