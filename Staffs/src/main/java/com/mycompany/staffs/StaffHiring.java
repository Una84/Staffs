/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.staffs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RC_Student_lab
 */
public class StaffHiring {
      public StaffHiring(int staffNumber, String staffLocation) {
        
    }

    public String getStaffHiringProcess() {
          int staffNumber = 0;
        if (staffNumber < 20) {
            return "Hiring process must start.";
        } else {
            return "No hiring needed.";
        }
    }

    public void printStaffHiring() {
        System.out.println("Staff Number: " + getStaffNumber());
        System.out.println("Staff Location: " + getStaffLocation());
        System.out.println("Hiring Decision: " + getStaffHiringProcess());
    }

    private String getStaffNumber() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getStaffLocation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
