package singletone1;
 
public class Boiler0 {
	private boolean empty;
	private boolean boiled;


	public Boiler0() {
		empty = true;
		boiled = false;
                System.out.println("new Boiler created");
	}
  
	public void fill() {
		//перед наполением проверяем что нагреватель пустой и меняем зачем его значение.
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// заполняем его водой
                        System.out.println("Boiler is filled");
		}
	}
 
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// перед тем как налить проверяем что нагреватель не пустой и  доведен до кипения.
			//затем снова меняем флаг на "пустой"

			//налить воду
			empty = true;
                        System.out.println("Boiler is empty");
		}
	}
 
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			//проверяем вначале, что нагреватель не пустой и вода не доведена до кипения

			// доводим до кипения содержимое...
			boiled = true;
                        System.out.println("boiling...");
		}
	}
  
	public boolean isEmpty() {
		return empty;
	}
 
	public boolean isBoiled() {
		return boiled;
	}
}

//проблема, если добавить еще один экземпляр класса Нагревателя