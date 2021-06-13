package generic.testmaximum;

public class GenericMaximum
{
	static Integer maxInteger;
	static Float maxFloat;
	
	/**
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 * Finding max integer using compareTo() method.
	 */
	public static int maximumInteger(Integer a, Integer b, Integer c)
	{
		maxInteger = a;
		
		if(b.compareTo(maxInteger) > 0)
		{
			maxInteger = b;
		}
		if(c.compareTo(maxInteger) > 0)
		{
			maxInteger = c;
		}
		return maxInteger;
	}
	
	/**
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 * Finding max Float value using compareTo() method.
	 */
	public static Float maximumFloat(Float a, Float b, Float c)
	{
		maxFloat = a;
		
		if(b.compareTo(maxFloat) > 0)
		{
			maxFloat = b;
		}
		if(c.compareTo(maxFloat) > 0)
		{
			maxFloat = c;
		}
		return maxFloat;
	}
	
	
	/**
	 * @param args
	 * Passing integer and float value to function.
	 * Calling functions.
	 * printing the maximum number as a result.
	 */
	public static void main(String[] args)
	{
		Integer intNumeOne = 15, intNumTwo = 55, intNumThree = 24;
		Float floatNumOne = 218.13f, floatNumTwo = 555.453f, floatNumThree = 999.999f;  
		
		maximumInteger(intNumeOne, intNumTwo, intNumThree);
		System.out.println("Maximum amoungst : " + intNumeOne + " " + intNumTwo + " " + intNumThree + " is : " + maxInteger + "\n");
		
		maximumFloat(floatNumOne, floatNumTwo, floatNumThree);
		System.out.println("Maximum amoungst : " + floatNumOne + " " + floatNumTwo + " " + floatNumThree + " is : " + maxFloat);
	}
}
