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
public class Task {
    public static void main(String[] args) {
        
        Developer developer = new ManagerPhpDeveloper( new TesterPHPDeveloper(new PhpDeveloper()));
        Developer developerNew = new SupportPhpDeveloper(new ManagerPhpDeveloper( new TesterPHPDeveloper(new PhpDeveloper())));
        Developer developerold  = new PhpDeveloper();
        System.out.println(developer.makeJob());
        System.out.println(developerold.makeJob());
        System.out.println(developerNew.makeJob());
    }
}
