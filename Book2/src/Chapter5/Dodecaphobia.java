/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter5;

/**
 *
 * @author Sean
 */
public class Dodecaphobia {

    public static void main(String[] args) {
        int number = 2;
        while (number <= 20) {
            if (number == 12) // if it reaches this number it will break out of the loop 
            {
                break;
            }
            System.out.print(number + " ");
            number += 2;
        }
        System.out.println();
    }
}
