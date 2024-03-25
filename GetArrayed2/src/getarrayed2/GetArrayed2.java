/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package getarrayed2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class GetArrayed2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        
        for(int e = 0; e < dataPoints.length; e++)
        {
            dataPoints[e] = rnd.nextInt(100) + 1;
        }
        for(int e = 0; e < dataPoints.length; e++)
        {
            System.out.println(dataPoints[e]);
        }
        for(int e = 0; e < dataPoints.length; e++)
        {
            System.out.printf("|");
        }
    public static int sum(int values[])
    {
        int[] dataPoints = new int[100];
        int sum = dataPoints[0];
        for(int e = 0; e < dataPoints.length; e++)
        {
            sum = sum + dataPoints[e];
            System.out.println("The sum of the data is " + sum);           
        }
        int ave = sum/dataPoints.length;
        System.out.println("The average of the data is " + ave);
        System.out.println("");
    }
        
        
       
    public static int occuranceScan(int values[], int target)
    {
        Scanner in = new Scanner(System.in);
        int[] dataPoints = new int[100];
         System.out.println("Pick a number from 1-100");
        int input = 0;
        input = in.nextInt();
        in.nextLine();
        boolean foundInput = false;
        for(int e = 0; e < dataPoints.length; e++)
            if(dataPoints[e] == input)
            {
                System.out.println("Your input: " + input + "has been found at: " + e);
            }
        if(!foundInput)
        {
            System.out.println("Input not found.");
        }
    }
        
    public static int min(int values[])
    {
        int[] dataPoints = new int[100];
        int min = dataPoints[0];
        for(int e = 0; e < dataPoints.length; e++)
        {
            if(min > dataPoints[e])
            {
                min = dataPoints[e];
            }
        }
        System.out.println("The min is: " + min); 
    }
    public static int max(int values[])
    {
        int[] dataPoints = new int[100];
         int max = dataPoints[0];
        for(int e = 0; e < dataPoints.length; e++)
        {
            if(max > dataPoints[e])
            {
                max = dataPoints[e];
            }
        }
        System.out.println("The max is: " + max);
    }    
    }
    
}
