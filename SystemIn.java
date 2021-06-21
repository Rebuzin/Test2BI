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
import java.util.Scanner;

public class SystemIn {
	
	private String ans;
    Scanner answer = new Scanner(System.in);
	
    public String throwAnswer() {//EXECUTOR E ARMAZENAMENTO DE ENTRADAS DE DADOS, QUALQUER QUE SEJA
    	ans = answer.nextLine();
    	return ans;
    }
    
    public void pizzaSystemIn(Pizza pizza) { //EXECUTOR DE ENTRADAS PARA A PIZZA
    	SystemInPizza systemInPizza = new SystemInPizza();
    	
    	systemInPizza.pizzaSizeSystemIn(pizza); //ENCAMINHA PARA A ENTRADA DE TAMANHO
    	if (pizza.getPizzaSize().equals("5")) {
    	systemInPizza.pizzaFlavorQuantitySystemIn(pizza); //ENCAMINHA PARA ENTRADA DE QUANTIDADE DE SABORES
    	systemInPizza.pizzaFlavorSystemIn(pizza); //ENCAMINHA PARA ENTRADA DE SABORES
    	return;
    	} 
    	systemInPizza.pizzaFlavorQuantitySystemIn(pizza); //ENCAMINHA PARA ENTRADA DE QUANTIDADE DE SABORES
    	systemInPizza.pizzaFlavorSystemIn(pizza); //ENCAMINHA PARA ENTRADA DE SABORES
    	systemInPizza.pizzaWithBordYesNo(pizza); //ENCAMINHA PARA ENTRADA DE "SE" DESEJA BORDA
    
    	//FAZER A CALCULADORA QUE PUXARA OS PREÇOS DAS PIZZAS, BEBIDAS e ADCIONAIS;
    	//FAZER UMA SYSTEMOUT QUE PRINTARÁ O PEDIDO NA TELA;
    }
    
    public void drinkSystemIn(Drink drink) {//EXECUTOR DE ENTRADAS PARA BEBIDAS
    	SystemInDrinks systemInDrink = new SystemInDrinks();

    	systemInDrink.drinkChoice(drink); //ENCAMINHA PARA ENTRADA DE BEBIDAS
    }
    
    
    
    public String getAns() {
    	return ans; 
    }
}
