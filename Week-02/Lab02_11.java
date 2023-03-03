/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pisol
 */
import java.util.*;

public class Lab02_11 {

    public static void main(String[] args) {
        double salary = 0, bonus = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert your name: ");
        String name = sc.nextLine();
        System.out.print("Please insert your age : ");
        int age = sc.nextInt();
        System.out.print("Please insert number of working days : ");
        int numDay1 = sc.nextInt();
        System.out.print("Please insert number of absent days : ");
        int numDay2 = sc.nextInt();
        System.out.print("Please insert your body weight : ");
        double weight = sc.nextDouble();
        if (21 <= age && age <= 30) {
            salary = (numDay1 * 300) - (numDay2 * 50);
            if (10 <= weight && 60 >= weight) {
                bonus = salary + 5000;
            } else if (61 <= weight && 90 <= weight) {
                bonus = salary + (5000 - ((weight - 60) * 10));
            } else if (weight > 90) {
                bonus = 0;
            }
        } else if (31 <= age && age <= 40) {
            salary = (numDay1 * 500) - (numDay2 * 50);
            if (10 <= weight && 60 >= weight) {
                bonus = salary + 5000;
            } else if (61 <= weight && 90 <= weight) {
                bonus = salary + (5000 - ((weight - 60) * 10));
            }
        } else if (41 <= age && age <= 50) {
            salary = (numDay1 * 1000) - (numDay2 * 25);
            if (10 <= weight && 60 >= weight) {
                bonus = salary + 5000;
            } else if (61 <= weight && 90 <= weight) {
                bonus = salary + (5000 - ((weight - 60) * 10));
            }
        } else if (51 <= age && age <= 60) {
            salary = (numDay1 * 3000);
            if (10 <= weight && 60 >= weight) {
                bonus = salary + 5000;
            } else if (61 <= weight && 90 <= weight) {
                bonus = salary + (5000 - ((weight - 60) * 10));
            }
        }
        System.out.println("Hi, " + name);
        System.out.println("Your salary is " + salary + " Baht");
        System.out.println("Your salary and bonus is " + bonus + " Baht");

    }
}
    