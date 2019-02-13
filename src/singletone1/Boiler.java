package singletone1;
 
public class Boiler {
	private boolean empty;
	private boolean boiled;
	private static Boiler uniqueInstance;
  
	private Boiler() {
		empty = true;
		boiled = false;
	}

	//public  static synchronized Boiler getInstance() {  //для многопоточной среды, но снижает производительность
	public  static Boiler getInstance() {
		if (uniqueInstance == null) {
			System.out.println("Creating unique instance of Chocolate Boiler");
			uniqueInstance = new Boiler();
		}
		System.out.println("Returning instance of Chocolate Boiler");
		return uniqueInstance;
	}

	//вариант лучше для многопоточной среды.
	public  static Boiler getInstance2() {
		if (uniqueInstance == null) {
			synchronized (Boiler.class){

			System.out.println("Creating unique instance of Chocolate Boiler");
			uniqueInstance = new Boiler();
			}
			}

		System.out.println("Returning instance of Chocolate Boiler");
		return uniqueInstance;
	}


	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// fill the boiler with a milk/chocolate mixture
		}
	}

	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// drain the boiled milk and chocolate
			empty = true;
		}
	}
 
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// bring the contents to a boil
			boiled = true;
		}
	}
  
	public boolean isEmpty() {
		return empty;
	}
 
	public boolean isBoiled() {
		return boiled;
	}
}
