/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StructuralProxy;

/**
 *
 * @author xinquanteoh
 */
public class Main {
    public static void main(String[] args) {
        iAttend att = new attendanceProxy();
        
        att.viewAttendance(); //student only can view the attendance
        
        attendance attt = new attendance();
        
        attt.editAttendace(); //lecturer can edit the attendance
    
    }
}

interface iAttend{
    
    public void viewAttendance();
    
}

class attendance implements iAttend{

    @Override
    public void viewAttendance() {
        System.out.println("getting attendance");
    }
    
    public void newAttendance(){
        System.out.println("taking attendance");
    }
    
    public void editAttendace(){
        System.out.println("editing attendance");
    }
    
}

class attendanceProxy implements iAttend{ //atudentproxy, student only can view attendance

    private attendance at = new attendance();
    
    @Override
    public void viewAttendance() {
        at.viewAttendance();
    }
    
}