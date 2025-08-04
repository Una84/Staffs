/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.staffs;

/**
 *
 * @author RC_Student_lab
 */
public abstract class Staff implements Istaff {
     protected int staffNumber;
    protected String staffLocation;

    public Staff(int staffNumber, String staffLocation) {
        this.staffNumber = staffNumber;
        this.staffLocation = staffLocation;
    }

    @Override
    public int getStaffNumber() {
        return staffNumber;
    }

    @Override
    public String getStaffLocation() {
        return staffLocation;
    }

    @Override
    public abstract String getStaffHiringProcess();
}
