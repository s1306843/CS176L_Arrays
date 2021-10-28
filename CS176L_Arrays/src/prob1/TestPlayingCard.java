package labproject4.prob1;

/**
 * Your name: Connor Przelomski
 * 
 * Construct 52 PlayingCards and add them to a deck.
 * 
 * **NOTE**: Read all comments below thoroughly.
 */

public class TestPlayingCard
{
    public static void main(String[] args)
    {
        // 1 - Construct an array of 52 PlayingCard objects called deck.

    	String[][] DeckOfCards = new String[14][5];
    	PlayingCard Pack = new PlayingCard(0,0);
    	
        // 2 - Construct the 52 PlayingCards in a standard deck of cards
        //     (https://en.wikipedia.org/wiki/Standard_52-card_deck)
        //     and add them to the deck. You must use a loop (or
        //     nested loops).
    	//value: 1-13
    	//suit: 1-4
    	// 3 - Display the value and suit of every PlayingCard in the deck.
        //     You must use a loops
        	
    	for(int i = 1; i <= 13; i++)
    	{
    		for (int j = 1; j <= 4; j++)
    		{
    			Pack.setValue(i);
    			Pack.setSuit(j);
    			DeckOfCards[i][j] = Pack.toString();	
    			System.out.print(DeckOfCards[i][j] + "\t \t \t");
    			
    		}
    		System.out.println();
    		
    	}      
    }
}
