/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template2;


public abstract class HotDrink {
    void prepareRecipe() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
	}
 
	public void boilWater() {
		System.out.println("Boiling water");
	}
 
	public void brewCoffeeGrinds() {
		System.out.println("Dripping Coffee through filter");
	}
 
	public void pourInCup() {
		System.out.println("Pouring into cup");
	}
 
	public void addSugarAndMilk() {
		System.out.println("Adding Sugar and Milk");
	}
}
