/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter5;

/**
 *
 * @author Sean
 */
public class Dodecaphobia3 {

    public static void main(String[] args) {
        int number = 0;
        while (number < 20) {
            number += 2;
            if (number == 12) //line 18 and 19 is the continue loop and will continue after the number is reached that we want to skip 
            {
                continue;
            }
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
