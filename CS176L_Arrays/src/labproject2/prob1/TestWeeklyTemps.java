package labproject2.prob1;

public class TestWeeklyTemps 
{

	public static void main(String[] args) 
	{
		double[] temps = {7.8, 93.5, 78.98, 81.4, 23.0, 39, 23.1};
		
		WeeklyTemps week = new WeeklyTemps();
		
		System.out.println();
		
		System.out.println("   Weekly Temperature Data (degrees F):\n");
		
		System.out.printf("\tAverage:        %.1f", week.getAverage(temps));
		
		System.out.println();
		
		System.out.println("\tRange:          " + week.getRangeStr(temps));
		
		System.out.print("\tExtreme Temp Days: " + week.getExtreme(temps));
		

	}

}
