/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.staffs;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Staffs {

    public static void main(String[] args) {
              
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of staff members: ");
        int number = input.nextInt();
        input.nextLine(); // consume the leftover newline

        System.out.print("Enter staff location: ");
        String location = input.nextLine();

        // Corrected constructor call
        StaffHiring staffHiring = new StaffHiring(number, location);

        System.out.println("\n--- Hiring Report ---");
        staffHiring.printStaffHiring();

        input.close();
    }
}

