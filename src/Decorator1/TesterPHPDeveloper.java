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
public class TesterPHPDeveloper extends DeveloperDecorator{
    
    public TesterPHPDeveloper(Developer developer) {
        super(developer);
    }
    
    public String makeCodeTesting(){
        return " Make code review";
    }

    @Override
    public String makeJob() {
        return super.makeJob()  + makeCodeTesting();
    }
    
    
}
