
/**
 * Card Class:
 * Create a Card Class that has two instance variables:  Rank and Suit
 * Rank is an int that will hold the rank of each card:  
 * 1-13 where Ace = 1, Jack = 11, King = 13.
 * Suit will be a string with one of the following (Heart, Diamond, Spade, Club)

 *
 * @author Sophia
 * @version 1108
 */
public class Card
{
    private int rank;
    private String suit;
    String[] Suit = new String[4];
    public Card Rank(Card card){
        for (int r = 0; r <= 13; r ++){
            rank = r;
        }
        return rank;
    }
    
    public Card Suit(Card card){
        for (int s = 0; s < 4; s++){
            Suit[0] = "Heart";
            Suit[1] = "Diamond";
            Suit[2] = "Spade";
            Suit[3] = "Club";
            suit = Suit[s];
        }
        return suit;
    }
    
    
    Card[][] card = (rank) + (suit);
    Card[][] deck = new Card[13][4];
}
