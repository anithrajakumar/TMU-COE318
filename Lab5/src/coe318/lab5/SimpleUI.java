package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
        System.out.println("House Holds:");
        System.out.println(game.getHouseCards());
        System.out.println("You Hold:");
        System.out.println(game.getYourCards());
    }

  @Override
    public boolean hitMe() {
        //Asking to see if the player will want another card
        System.out.print("Another card?(y/n): ");        
        // Checking to see if they saying yes or noy
        if(user.nextLine().equals("y") || user.nextLine().equals("Y")){
            return true;
        } 
        return false;
        
        
    }

  @Override
    public void gameOver() {
        //creating temp variables for easier use
        int playerScore, houseScore;
        System.out.println("\nGAME OVER!!");
        this.display();
        
        playerScore = game.score(game.getYourCards());
        houseScore = game.score(game.getHouseCards());
        System.out.println("Your Score: " + playerScore + ", House Score: " + houseScore);
        
        if(playerScore > 21){
            System.out.println("You Lose!");
        } else if(playerScore == houseScore){
            System.out.println("You Lose!");
        } else if(playerScore < 21 && houseScore > 21){
            System.out.println("You Win!");
        } else if(playerScore < 21 && houseScore < 21 && playerScore > houseScore){
            System.out.println("You Win!");
        }
        
    }

}