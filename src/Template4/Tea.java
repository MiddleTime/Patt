package Template4;


public class Tea extends HotDrink{

    @Override
    void brew() {
        System.out.println("Завариваем чай...");
    }

    @Override
    void addIngridients() {
        System.out.println("Добавляем лимон...");
    }
 
	
}
