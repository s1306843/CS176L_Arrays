package labproject2.prob1;

public class WeeklyTemps 
{
	
	public double getMax(double [] tempsArray)
	{
		double maxTemp = tempsArray[0];
		
		for(int a = 0; a < tempsArray.length; a++)
		{
			if(maxTemp <= tempsArray[a])
			{
				maxTemp = tempsArray[a];
			}
		}
		return maxTemp;
	}
	public double getMin(double[] tempsArray)
	{
		double minTemp = tempsArray[0];
		
		for(int b = 0; b < tempsArray.length; b++)
		{
			if(minTemp >= tempsArray[b])
			{
				minTemp = tempsArray[b];
			}
		}
		return minTemp;
	}
	public double getAverage(double[] tempsArray)
	{
		double averageTemp = 0;
		for(int c = 0; c < tempsArray.length; c++)
		{
			averageTemp = averageTemp + tempsArray[c];
		}
		averageTemp = (averageTemp/tempsArray.length);
		return averageTemp;
	}
	public String getRangeStr(double[] tempsArray)
	{
		double minTemp = getMin(tempsArray);
		double maxTemp = getMax(tempsArray);
		String tempRange = String.format("%.1f - %.1f", minTemp, maxTemp);
		return tempRange;
	}
	public int getExtreme(double[] tempsArray)
	{
		int extremeTemp = 0;
		for(double x : tempsArray)
		{
			if(x >= 95 || x <= 5)
			{
				extremeTemp = extremeTemp + 1;
			}
		}
		return extremeTemp;
	}
	
}





