/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StructuralAdapter;

/**
 *
 * @author xinquanteoh
 */
public class Main {
    

    public static void fight(superhero s){
        s.fly();
        s.lasereye();
    }
    
    public static void main(String[] args) {
        superman KalEl = new superman();
   
        Batman Bat = new Batman();
        heroAdapter HA = new heroAdapter(Bat);
    
    
        fight(HA);
        fight(KalEl);
    
    }
    
}

class superman implements superhero{

    @Override
    public void fly() {
        System.out.println("im fliying..really fast");
    }

    @Override
    public void lasereye() {
        System.out.println("bzzzzzzz.....im using my laser eyes");
    }
    
}

class Batman{
    public void drive(){
        System.out.println("cant fly so gonna drive");
    }
    
    public void punch(){
        System.out.println("powwwww....");
    }
    
    public void throwBaterrang(){
        System.out.println("thrrrrrr...im batman!");
    }
}

class heroAdapter implements superhero{

    Batman bat;
    
    public heroAdapter(Batman bat){
        this.bat = bat;
    }
    
    @Override
    public void fly() {
       bat.drive();
    }

    @Override
    public void lasereye() {
        bat.punch();
    }

    
}

interface superhero{
    public void fly();
    public void lasereye();
}