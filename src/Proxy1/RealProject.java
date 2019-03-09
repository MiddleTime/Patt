/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy1;



public class RealProject implements Project{

    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }
    
       
    public void load(){
        System.out.println("loading project from "+url+"...");
    }
    
    @Override
    public void run() {
        System.out.println("Running project..." + url + "...");   
    }
    
}
