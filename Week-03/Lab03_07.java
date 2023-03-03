/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pisol
 */
import java.util.*;

public class Lab03_07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ood = 0, even = 0, number = sc.nextInt();
        while (number != -1) {
            if (number % 2 == 0) {
                even += 1;
            } else {
                ood += 1;
            }
            number = sc.nextInt();
        }
        System.out.println("Odd number = " + ood + " and Even number = " + even);
    }
}
