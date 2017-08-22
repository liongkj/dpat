/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StructuralFacade;

/**
 *
 * @author xinquanteoh
 */
public class Main {
    
    public static void main(String[] args) {
        MenuFacade menu = new MenuFacade();
        menu.getMenu();
        
        menu.order();
    }
}

class drink{
    public void viewDrinks(){
        System.out.println("getting drinks menu");
    }
    
    public void orderDrinks(){
        System.out.println("ordering drink");
    }
}

class food{
    public void viewFood(){
        System.out.println("getting food menu");
    }
    
    public void orderFood(){
        System.out.println("ordering food");
    }
}

class MenuFacade{
    
    food foo;
    drink dri;
    
    public MenuFacade(){
        foo = new food();
        dri = new drink();
    }
    
    public void getMenu(){
        dri.viewDrinks();
        foo.viewFood();
    }
    
    public void order(){
        dri.orderDrinks();
        foo.orderFood();
    }
       
}

