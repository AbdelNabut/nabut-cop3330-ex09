package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        final double gallonCapacity = 350;
        int length, width;
        double squareFeet, requiredGallons;
        Scanner input = new Scanner(System.in);
        System.out.println( "What is the length of the room?" );
        length = input.nextInt();
        System.out.println( "What is the width of the room?" );
        width = input.nextInt();
        squareFeet = length * width;
        requiredGallons = Math.ceil(squareFeet/gallonCapacity);
        if(requiredGallons > 1)
            System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet.", (int) requiredGallons, (int) squareFeet);
        else
            System.out.printf("You will need to purchase %d gallon of paint to cover %d square feet.", (int) requiredGallons, (int) squareFeet);
    }
}
