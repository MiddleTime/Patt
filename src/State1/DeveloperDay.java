/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State1;


public class DeveloperDay {
    public static void main(String[] args) {
        
    Activity activity = new Sleeping();
    
    Developer developer = new Developer();
    
    developer.setActivity(activity);
    
        for (int i = 0; i < 10; i++) {
            developer.justDoIt();
            developer.changeActivity();
            
        }
    }
}
