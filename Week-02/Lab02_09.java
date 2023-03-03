/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pisol
 */
import java.util.*;

public class Lab02_09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        if (salary > 50000.0) {
            System.out.println(salary * 0.1);
        } else {
            System.out.println(salary * 0.05);
        }
    }
}
