package labproject3.prob1;

import java.util.Random;

public class SumOfDice
{
	int firstRoll;
	int secondRoll;
	int total;
	
	int[] diceSums = new int[12]; 
	
	public void diceRolls()
	{
		for(int a = 0; a < 100; a++)
		{
			
		firstRoll = (int)(Math.random()*6)+1;
		secondRoll = (int)(Math.random()*6)+1;
		
		total = firstRoll + secondRoll -1;
		diceSums[total] = diceSums[total]+1;
		
		}
		System.out.println("SUM OF DICE     OCCURENCES" );
		System.out.println("-----------     ----------" );
		
		for( int a = 1; a < diceSums.length; a++)
		{
			System.out.println(a + 1 + " \t\t" + diceSums[a]);
		}
		
	}
	public void freqChart()
	{
		System.out.println("Dice Sums: (100 rolls)" );
		System.out.println("----------------------");
		
		for( int a = 1; a < diceSums.length; a++)
		{
			System.out.print(a + 1 + ": ");
			
			for(int b = 0; b < diceSums[a]; b++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}

}
