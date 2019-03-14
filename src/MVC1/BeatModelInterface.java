package MVC1;
  
public interface BeatModelInterface {
//( методы, используемые контроллером для управления моделью 
//    на основании действия пользователя
    void initialize();
  
	void on();
  
	void off();
  
    void setBPM(int bpm);
    
    
    
    /* Методы, при помощи которых представление
      и контроллер получают информацию состояния и
    изменяют свой статус наблюдателя
    */
  
	int getBPM();
  
	void registerObserver(BeatObserver o);
  
	void removeObserver(BeatObserver o);
  
	void registerObserver(BPMObserver o);
  
	void removeObserver(BPMObserver o);
}
