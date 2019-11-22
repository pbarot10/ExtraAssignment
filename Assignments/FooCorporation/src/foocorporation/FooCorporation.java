
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foocorporation;

import java.util.Scanner;

/**
 *
 */
public class FooCorporation {
    static String name;
    static int n,hoursWorked;
    static double basePay;
    static double total;

    public static void main(String[] args) {

        FooCorporationEmployees fb=new FooCorporationEmployees(name,basePay,hoursWorked);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of Employee:");
        n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter name of Employee:"+i);
            sc.nextLine();
            name=sc.nextLine();
            System.out.println("Enter base Pay of Employee:"+i);
            basePay=sc.nextDouble();
            System.out.println("Enter Hours Worked of Employee:"+i);
            hoursWorked=sc.nextInt();
            fb.totalPay(basePay, hoursWorked);


        }


    }

}
