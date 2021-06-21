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
import java.util.ArrayList;

public class Drink {
	SystemIn systemInDrinkMethod = new SystemIn();
	
	private ArrayList <String> drinks = new ArrayList();//LISTA DE BEBIDAS
	private String drinksQuantity; //QUANTIDADE DE BEBIDAS
	
	public void drinkMethod(Drink drink) {
		systemInDrinkMethod.drinkSystemIn(drink);
	}
	
	//GETTERS AND SETTERS
	public ArrayList getDrinks() {
		return drinks;
	}
	public void setDrinks(String drinks) {  
		this.drinks.add(drinks);
	}
	public String getDrinksQuantity() {
		return drinksQuantity;
	}
	public void setDrinksQuantity(String drinksQuantity) {
		this.drinksQuantity = drinksQuantity;
	}
}
