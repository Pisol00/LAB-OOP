/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pisol
 */
import java.util.*;

public class Lab02_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0, money = sc.nextInt();
        char bank = sc.next().charAt(0);
        if (bank == 'A') {
            total = money * 1.015;
        } else if (bank == 'B') {
            total = money * 1.02;
        } else if (bank == 'C') {
            total = money * 1.015;
        } else if (bank == 'X') {
            total = money * 1.05;
        }
        System.out.println("Your total money in one year =" + total);
    }

}
