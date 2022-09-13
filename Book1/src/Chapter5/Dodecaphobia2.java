/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter5;

/**
 *
 * @author Sean
 */
public class Dodecaphobia2 {

    public static void main(String[] args) {
        int number = 2;
        while (true) {
            if (number == 12) //this braks the forever loop and lets it stop when it reaches 12 
            {
                break;
            }
            System.out.print(number + " ");
            number += 2;
        }
        System.out.println();
    }
}
