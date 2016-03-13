/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.vu.mif.labanorodraugai;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.Stateful;

/**
 *
 * @author Karolis
 */
@Named
@Stateful
@SessionScoped
public class Test implements Serializable {
    private int number;
    
    @PostConstruct
    public void init() {
        number = 1;
    }
    
    public String hello(){
        return "Labas vakaras";
    }
    
    public void add(){
        number++;
    }
    
    public int getNumber(){
        return number;
    }
}
