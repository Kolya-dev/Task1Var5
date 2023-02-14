/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author krivosheevnikolaj
 */
public class mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Enter the number of day: ");
        Scanner scan = new Scanner(System.in);

        int day = scan.nextInt();
        int sec = 0;
        switch(day){
            case 1:
                System.out.println("working sec: " + 8 * 3600);
                break;
            case 2:
                System.out.println("working sec: " + 8 * 3600);
                break;
            case 3:
                System.out.println("working sec: " + 8 * 3600);
                break;
            case 4:
                System.out.println("working sec: " + 8 * 3600);
                break;
            case 5:
                System.out.println("working sec: " + 6 * 3600);
                break;
            case 6:
                System.out.println("working sec: " + 0);
                break;
            case 7:
                System.out.println("working sec: " + 0);
                break;
            default:
                System.out.println("error");
                
            
        }
       
    }
}
