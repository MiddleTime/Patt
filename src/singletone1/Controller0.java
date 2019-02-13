package singletone1;

public class Controller0 {
	public static void main(String args[]) {
		Boiler0 boiler = new Boiler0();
		boiler.fill();
		boiler.boil();
		boiler.drain();

	}
}
