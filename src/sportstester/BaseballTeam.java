/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sportstester;

/**
 *
 * @author etwat3497
 */
public class BaseballTeam extends Sports implements Stats{
    //Declare private variables
    private int gamesWon, gamesLost, gamesTied;
    
    
    /**
     * Pre: int wins, losses, and ties
     * Post: void
     * Default constructor to set values for variables
     */
    public BaseballTeam(int won, int lost, int tied, String name){
        //Run superclass sports and set base variables
        super(name);
        gamesWon = won;
        gamesLost = lost;
        gamesTied = tied;
    }
    
    /**
     * Pre: Void
     * Post: int games won
     * Return the number of wins
     */
    public int getWins(){
        return(gamesWon);
    }
    
    /**
     * Pre: Void
     * Post: int games lost
     * Return the number of losses
     */
    public int getLosses(){
        return(gamesLost);
    }
    
    /**
     * Pre: Void
     * Post: int games tied
     * Return the number of ties
     */
    public int getTies(){
        return(gamesTied);
    }
    
    /**
     * Pre: Void
     * Post: void
     * Stats method from interface to calculate points
     */
    public void overallPoints(){
        points += gamesWon*2;
        points += gamesTied;
    }
    
    /**
     * Pre: Void
     * Post: int points
     * Return the number of points the team has
     */
    public int getPoints(){
        return(points);
    }
    
}
