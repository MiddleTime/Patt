package singletone1;

public class Controller1 {
	public static void main(String args[]) {
		Boiler boiler = Boiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();

		// попытаемся создать еще один экземпляр нагревателя 
		Boiler boiler2 = Boiler.getInstance();
	}
}
