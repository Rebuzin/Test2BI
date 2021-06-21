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
public class SystemInDrinks {
	SystemIn systemInDrinks = new SystemIn();
	public Drink drinks = new Drink();
	
	public void drinkChoice(Drink drink) {//USUÁRIO ESCOLHE QUAL BEBIDA DESEJA
		int count = 1;
		
		System.out.println("Qual a quantidade de bebidas que você deseja? (Insira apenas números)");
		drinks.setDrinksQuantity(systemInDrinks.throwAnswer());;//SETA NA CLASSE DRINK A QUANTIDADE DE BEBIDAS QUE O USUÁRIO DESEJA
		System.out.println("Menú de Bebidas: \n"
					 + "    Bebidas                     Valores \n"
					 + "[1] Coca-Cola 2L                 R$9,50 \n"
					 + "[2] Cerveja Heineken 330ml       R$6,50 \n"
					 + "[3] Suco Pratz 900ml            R$12,50 \n"
					 + "[4] Água Mineral 600ml           R$3,50 \n");
		do {//LAÇO PARA REPETIR PERGUNTA DE ESCOLHA DE BEBIDA DE ACORDO COM A QUANTIDADE DE BEBIDA INDICADA PELO USUÁRIO
			System.out.println("Escolha a " + count + "ª bebida: ");
			drink.setDrinks(systemInDrinks.throwAnswer());;//SETA NA CLASSE DRINK A BEBIDA QUE O USUÁRIO SELECIONA, REPETINDO A PERGUNTA DE ACORDO COM A QUANTIDADE DE BEBIDAS QUE ELE INDICOU
			count++;
		} while (count <= Integer.parseInt(drinks.getDrinksQuantity()));
	}
}
