package Template2;

public class Coffee extends HotDrink{

    @Override
    void brew() {
        System.out.println("Завариваем кофе...");
    }

    @Override
    void addIngridients() {
        System.out.println("Добавляем молоко...");
    }
 
	
}
