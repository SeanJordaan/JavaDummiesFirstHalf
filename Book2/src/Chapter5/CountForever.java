/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter5;

/**
 *
 * @author Sean
 */
//loop that will run forever and crash my computer
public class CountForever {

    public static void main(String[] args) {
        int number = 2;
        while (true) {
            System.out.print(number + " ");
            number += 2;
        }
    }
}
