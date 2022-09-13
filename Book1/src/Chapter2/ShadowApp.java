/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2;

/**
 *
 * @author Sean
 */
public class ShadowApp {
    static int x; // x is declared and its scope is from line 12 till 23
 public static void main(String[] args)
 {
 x = 5; // the class veriable is now 5 and then printed out in the next line 
 System.out.println("x = " + x); 
 int x; 
 x = 10; 
 System.out.println("x = " + x); 
 System.out.println("ShadowApp.x = " +
 ShadowApp.x); 
 } 
}

