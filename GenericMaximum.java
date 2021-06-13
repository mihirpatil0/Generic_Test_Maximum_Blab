package generic.testmaximum;

public class GenericMaximum
{
static Integer max;
	
	/**
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 * Finding max integer using compareTo() method.
	 */
	public static int maximumInteger(Integer a, Integer b, Integer c)
	{
		max = a;
		
		if(b.compareTo(max) > 0)
		{
			max = b;
		}
		if(c.compareTo(max) > 0)
		{
			max = c;
		}
		return max;
	}
	
	
	/**
	 * @param args
	 * Passing integer value to function.
	 * Calling maximumInteger function.
	 * printing the maximum number as a result.
	 */
	public static void main(String[] args)
	{
		Integer intNumeOne = 15, intNumTwo = 55, intNumThree = 24;
		
		maximumInteger(intNumeOne, intNumTwo, intNumThree);
		System.out.println("Maximum amoungst : " + intNumeOne + " " + intNumTwo + " " + intNumThree + " is : " + max);
	}
}
