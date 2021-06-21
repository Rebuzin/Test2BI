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
public class Main {
	
    
    public static void main(String[] args) {
    	SystemIn enters = new SystemIn();
        Order order = new Order();
        SystemOut systemOut = new SystemOut();
        Calculate calculate = new Calculate();
        Pizza pizza = new Pizza();
        Drink drink = new Drink();
        
    	 
        System.out.println("Pizzas Ma' Bene \n"
        		+ "Bem vindo ao nosso cardápio virtual, o que deseja hoje? \n"
        		+ "Digite [1] somente para pizzas \n"
        		+ "Digite [2] somente para bebidas \n"
        		+ "Digite [3] para pizzas e bebidas \n");
        enters.throwAnswer();
        
        switch (enters.getAns()) {
        	case "1": 
        		pizza.pizzaMethod(pizza);
        		order.pizzaOrder(pizza);
        		systemOut.outPrintPizzaOrder(order, calculate);
        	break;
        	case "2":
        		drink.drinkMethod(drink);
        		order.drinksOrder(drink);
        		systemOut.outPrintDrinkOrder(order, calculate);
        	break;
        	case "3":
        		pizza.pizzaMethod(pizza);
        		System.out.println("Essas são nossas opções de bebidas: ");
        		drink.drinkMethod(drink);
        		order.pizzaAndDrinkOrder(pizza, drink);
        		systemOut.outPrintAll(order, calculate);
        	break;
        }
    }
}
