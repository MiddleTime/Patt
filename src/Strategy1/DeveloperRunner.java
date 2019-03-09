/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy1;

/**
 *
 * @author inbox_bv8awe9
 */
public class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer = new Developer();
        
        developer.setActivity(new Sleeping());
        developer.executeActivity();
        
        developer.setActivity(new Training());
        developer.executeActivity();
        
        developer.setActivity(new Coding());
        developer.executeActivity();
        
        developer.setActivity(new Reading());
        developer.executeActivity();
        
        developer.setActivity(new Sleeping());
        developer.executeActivity();
        
        
    }
}
