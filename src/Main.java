import org.w3c.dom.ls.LSOutput;
import java.time.*;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* OPGAVE 2.1
        double miles;
        double kilometers;
        System.out.println("enter miles:");
        miles = input.nextDouble();
        System.out.println(miles*1.6);
        */
        /*opgave 2.2
        double area;
        double height;
        double side;
        System.out.println("enter the length of a side of the base triangle");
        side = input.nextDouble();
        System.out.println("enter the height of the prism");
        height = input.nextDouble();
        area = ((Math.sqrt(3))/4)*(Math.pow(side,2));
        System.out.println("area is: " + area);
        System.out.println("Volume of the triangular prism: " + area * height);
        */
        /* opgave 2.3
        double meter;
        System.out.println("enter meter value to be converted to feet");
        meter = input.nextDouble();
        System.out.println(meter + " meter equates to: "+ meter*3.2786 +"feet");
         */
        /*opgave 2.6
        int number;
        System.out.println("type an integer between 0 and 1000");
        number = input.nextInt();
        int dig1;
        int dig2;
        int dig3;
        //hvis der står 476, så er resten 6 da 10 går lige op i 470
        dig1 = (number % 10);
        //hvis der står 476, så er resten 76, men for at få kun 7 så dividerer vi bare med 10, da 7.6 rundes ned til 7
        dig2 = (number % 100)/10;
        //hvis der står 476, så er resten 476, da det ikke går op, vi dividere med 100 så 4.76 rundes ned til 4
        dig3 = (number % 1000)/100;
        System.out.println("dig3= " + dig3 + " dig2= " + dig2 + " dig1= "+dig1);
        System.out.println("multiplikation of all digits= "+dig1*dig2*dig3);
         */
        /* opgave 2.7
        System.out.println("enter minutes:");
        float minutes = input.nextInt();
        float hours = 60; //hvor mange minuter i 1 time
        float days = 24; //hvor mange timer i 1 dag
        float year = 365; //hvor mange dage i 1 år
        float numberOfHours = minutes/hours;
        float numberOfDays = numberOfHours/days;
        float numberOfYears = numberOfDays/year;
        int yearsInt = (int) numberOfYears;
        float decimalsToDays = numberOfYears % yearsInt; //resten omregnes tilbage til dage vha modulo %
        float floatDays = decimalsToDays*year;
        int daysInt = (int) floatDays;
        System.out.println(minutes+" minutes is approx: "+yearsInt+" years and "+daysInt+" days");
         */
        /* opgave 2.21
        System.out.println("type in investment amount");
        double ia = input.nextDouble();
        System.out.println("type in monthly interest rate in percentage");
        double ir = input.nextDouble();
        System.out.println("type in number of years");
        double yr = input.nextDouble();
        System.out.println("Future value is: "+ia*(Math.pow((1+ir),yr)));
         */
    }
}
