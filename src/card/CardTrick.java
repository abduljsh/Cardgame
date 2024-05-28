/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        String[]suits = {"Hearts","Diamonds","Clubs","Spades"};
        Random rand = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            int value = rand.nextInt(13)+1;
            String suit = suits[rand.nextInt(4)];
            magicHand[i] = new Card(value, suit);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick A Card Value:");
        int userValue = scanner.nextInt();
        System.out.print("Pick A Suit: ");
        String usersuit = scanner.next();
        
        Card userCard = new Card(userValue, usersuit);
        boolean found = false;

        //insert code to ask the user for Card value and suit, create their card
        for (Card card: magicHand){
            if(card.equals(userCard)){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("yay! The card is in the magic hand !!");
            
        }else{
            System.out.println("Oops, the card is not in the magic hand!!");
        }
// and search magicHand here
        
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    
}
class Card{
    private int value;
    private String suit;
    
    public Card(int value, String suit){
        this.value = value;
        this.suit = suit;
    }
    public int getValue(){
        return value;
    }
    public String getSuit(){
        return suit;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this==obj)return true;
        if(obj==null||getClass()!=obj.getClass())return false;
        Card card = (Card) obj;
        
        if(value!=card.value)return false;
        return suit!=null? suit.equals(card.suit):card.suit==null;
    }
}
