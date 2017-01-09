/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me;

/**
 *
 * @author dell
 */
import java.util.Scanner;
public class carpoolsaving {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        int totalmiles;//total miles driven per day
        int cost;//cost per gallon of gasoline
        int averagemiles;//average miles per gallon
        int fees;//parking fee per day
        int tolls;//tolls per day
        int dailydrivingcost;
        
        System.out.println("CALCULATES YOUR DAILY DRIVING COST");
        System.out.println();
        System.out.println();
        
        System.out.println("Enter total miles driven per day: ");
        totalmiles = input.nextInt();
        
        System.out.println("Enter cost per gallon of gasoline: "); 
        cost = input.nextInt();
        
        System.out.println("Enter average miles per gallon: ");
        averagemiles = input.nextInt();
        
        System.out.println("Enter parking fee per day: ");
        fees = input.nextInt();
        
        System.out.println("Enter tolls per day: ");
        tolls = input.nextInt();
        
        dailydrivingcost = (totalmiles/averagemiles)*cost;
        
        System.out.printf("your cost per day of driving is %s%n: ", dailydrivingcost);
        
        
    }
    
}
