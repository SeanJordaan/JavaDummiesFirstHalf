/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2;

/**
 *
 * @author Sean
 */
public class ScopeApp { //block of code starts here 
static int x; //x is a class veriable 
 public static void main(String[] args)
 {
 x = 5;
 System.out.println("main: x = " + x);
 myMethod();
 }
 public static void myMethod()
 {
 int y;
 y = 10; //is a local veriable 
 if (y == x + 5)
 {
 int z;
 z = 15;  //z is a local veriable that is declared and initialized 
 System.out.println("myMethod: z = " + z);
 } //the scope of z starts at line 24 and ends here line 28 
 System.out.println("myMethod: x = " + x);
 System.out.println("myMethod: y = " + y);
 } 
    
} //and ends here 
//you can not use a local veriable before it is declared 

