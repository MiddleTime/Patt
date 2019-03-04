package Template4;


public class Barista {
 
	public static void main(String[] args) {
		HotDrink tea = new Tea();
		HotDrink coffee = new Coffee();
		System.out.println("Making tea...");
                System.out.println("========================");
		tea.prepareRecipe();
                System.out.println("========================");
		System.out.println("Making coffee...");
                System.out.println("========================");
		coffee.prepareRecipe();
	}
}
