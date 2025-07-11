package coe318.lab5;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

public class BlackjackGame {

  private CardPile deck;
  private CardPile houseCards;
  private CardPile yourCards;
  private boolean houseDone;
  private boolean playerDone;
  private UserInterface ui;

  public BlackjackGame(UserInterface ui) {
    this.ui = ui;
    ui.setGame(this);
    deck = new CardPile();
    for (int i = 2; i < 15; i++) {
      for (int j = 0; j < 4; j++) {
        deck.add(new Card(i, j, true));
      }
    }
    houseCards = new CardPile();
    yourCards = new CardPile();
    houseDone = false;
    playerDone = false;
  }

  public void start() {
    Card c;
    c = deck.removeRandom();
    c.setFaceUp(false);
    getHouseCards().add(c);
    getHouseCards().add(deck.removeRandom());
    getYourCards().add(deck.removeRandom());
    getYourCards().add(deck.removeRandom());
    ui.display();
  }

  public void play() {
    while (!houseDone || !playerDone) {
      if (!houseDone) {
        if (score(getHouseCards()) <= 17) {
          getHouseCards().add(deck.removeRandom());
          ui.display();
        } else {
          houseDone = true;
        }
      }
      if (!playerDone) {
        if (ui.hitMe()) {
          getYourCards().add(deck.removeRandom());
          ui.display();
        } else {
          playerDone = true;
        }
      }
    }
  }

  public void end() {
    getHouseCards().getCards().get(0).setFaceUp(true);
    ui.gameOver();
  }

  /**
   * Determine the score of a pile of cards.
   *
   * @param p
   * @return the score
   */
  public int score(CardPile p) {
    //creating a temp list to hold the players cards
    ArrayList<Card> tempCards = p.getCards();
    //creating a temp variable to hold the sccore of the cards
    int tempScore = 0;
    //running through the list of cards
    for(int i = 0; i < tempCards.size(); i++){
        //Accordly assigning the score based on the rank
        switch(tempCards.get(i).getRank()){
            case 11:
                tempScore += 10;
                break;
            case 12:
                tempScore += 10;
                break;
            case 13:
                tempScore += 10;
                break;
            case 14:
                tempScore += 1;
                break;
            default:
                tempScore += tempCards.get(i).getRank();
        }        
    }
    //returning the final value of the score
    return tempScore;
  }

  /**
   * @return the houseCards
   */
  public CardPile getHouseCards() {
    return houseCards;
  }

  /**
   * @return the yourCards
   */
  public CardPile getYourCards() {
    return yourCards;
  }

  public static void main(String[] args) {
    BlackjackGame game = new BlackjackGame(new SimpleUI());
    game.start();
    game.play();
    game.end();
  }
}