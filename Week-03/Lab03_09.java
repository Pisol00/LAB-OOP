/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pisol
 */
import java.util.*;

public class Lab03_09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i % 5 == 0) {
                System.out.println(" ");
            } else {
                System.out.print("|");
            }
        }
    }

}
