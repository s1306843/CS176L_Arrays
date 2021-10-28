package labproject4.prob1;
import java.util.ArrayList;
public class TestPlayingCardArray 
{
	public static void main(String[] args) 
	{
		ArrayList<String> DeckOfCards = new ArrayList<>();
		PlayingCard CardSet = new PlayingCard(0,0);

    	for(int i = 1; i <= 13; i++)
    	{
    		for(int j = 1; j < 5; j++)
    		{
    			CardSet.setSuit(j);
    			CardSet.setValue(i);
    			DeckOfCards.add(CardSet.toString());
    			System.out.print(CardSet.toString() + "\t \t \t");
    		}
    		System.out.println();
    	}
	}

}
