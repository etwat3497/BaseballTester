/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sportstester;

import java.util.Scanner;

/**
 *
 * @author etwat3497
 */
public class BaseballTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declare variables and create a scanner object
        Scanner input = new Scanner(System.in);
        int numWins, numLosses, numTies;
        
        //Create a new baseball team object called team
        BaseballTeam team;
        
        //Get user input for the number of wins, losses, and ties
        System.out.println("How many wins does the baseball team have?");
        numWins = Integer.parseInt(input.nextLine());
        
        System.out.println("How many losses does the baseball team have?");
        numLosses = Integer.parseInt(input.nextLine());
        
        System.out.println("How many ties does the baseball team have?");
        numTies = Integer.parseInt(input.nextLine());
        
        //Instantiate a new team object with 3 parameters
        team = new BaseballTeam(numWins,numLosses,numTies);
        
        //Display the wins, losses, and ties the team has
        System.out.println("The team has "+team.getWins()+" wins.");
        System.out.println("The team has "+team.getLosses()+" losses.");
        System.out.println("The team has "+team.getTies()+" ties.");
        
        //Calculate the overall points
        team.overallPoints();
        //Display the overall points
        System.out.println("The team has "+team.getPoints()+" points.");
    }
    
}
