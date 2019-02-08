/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator1;

/**
 *
 * @author inbox_bv8awe9
 */
public class SupportPhpDeveloper extends DeveloperDecorator{
    
    public SupportPhpDeveloper(Developer developer) {
        super(developer);
    }
    public String supportProject(){
        return "  supporting project...";
    } 

    @Override
    public String makeJob() {
        return super.makeJob()+ supportProject();
    }
    
}
