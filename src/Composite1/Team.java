/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite1;

import java.util.ArrayList;
import java.util.List;


public class Team {
    private List<Developer> developers = new ArrayList<>();
    
    public void addDeveloper(Developer developer){
        developers.add(developer);
    }
    public void removeDeveloper(Developer developer){
        developers.remove(developer);
    }
    
    public void createProject(){
        System.out.println("Team creats project...\n");
        developers.forEach((developer) -> {
            developer.writeCode();
        });
    }
}
