/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer5;

/**
 *
 * @author inbox_bv8awe9
 */
public class JobSearch {
    public static void main(String[] args) {
        JavaDevelopersJobSite jobSite = new JavaDevelopersJobSite();
        
        
        Observer firstSubsciber = new Subscriber("Jelena Petrova");
        Observer secondSubsciber = new Subscriber("Tim Hex");
        Observer thirdSubsciber = new Subscriber("Aaron gimp");
        
        
        jobSite.addObserver(firstSubsciber);
        jobSite.addObserver(secondSubsciber);
        jobSite.addObserver(thirdSubsciber);
        
        jobSite.addVacancy("Java developer in Tallin");
        jobSite.addVacancy("Java developer in Berlin");
        jobSite.addVacancy("java developer in Riga");
      
        
        
        
        
        
        
        
        
        
        
        //удалить одну вакансию
        jobSite.removeVacancy("Java developer in Tallin");
        
        //добавить еще одного подписчика и проверить
        //удалить второго подписчика и проверить
        
    }
}
