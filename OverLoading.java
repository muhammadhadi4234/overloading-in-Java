package lab6;

public class OverLoading {
       
	int sum (int [] numbers) 
	{
		int total = 0;
		for (int num : numbers) 
		{
			total+=num;
		}
		return total;
	}
	
	String sum (String[] strings) 
	{
		StringBuilder concatenated = new StringBuilder();
		for (String str : strings) 
		{
			concatenated.append(str);
		}
		return concatenated.toString();
	}
	
	String sum (char[] chars)
	{
		StringBuilder concatenated = new StringBuilder();
		for (char c : chars) 
		{
			concatenated.append(c);
		}
		return concatenated.toString();
	}
	
	double sum(double [] numbers)
	{ 
		double total =0.0;
		for (double num : numbers) 
		{
			total += num;
		}
		return total;
	}
}
