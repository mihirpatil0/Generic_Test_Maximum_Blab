package generic.testmaximum;

public class GenericMaximum
{
	static Integer maxInteger;
	static Float maxFloat;
	static String maxString;
	
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
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 * Finding max String value using compareTo() method.
	 */
	public static String maximumString(String a, String b, String c)
	{
		maxString = a;
		
		if(b.compareTo(maxString) > 0)
		{
			maxString = b;
		}
		if(c.compareTo(maxString) > 0)
		{
			maxString = c;
		}
		return maxString;
	}
	
	
	/**
	 * @param args
	 * Passing integer, float and String value to function.
	 * Calling functions.
	 * printing the maximum number as a result.
	 */
	public static void main(String[] args)
	{
		Integer intNumeOne = 15, intNumTwo = 55, intNumThree = 24;
		Float floatNumOne = 218.13f, floatNumTwo = 555.453f, floatNumThree = 999.999f;
		String stringOne = "Apple", stringTwo = "Peach", stringThree = "Banana";
		
		maximumInteger(intNumeOne, intNumTwo, intNumThree);
		System.out.println("Maximum amoungst : " + intNumeOne + " " + intNumTwo + " " + intNumThree + " is : " + maxInteger + "\n");
		
		maximumFloat(floatNumOne, floatNumTwo, floatNumThree);
		System.out.println("Maximum amoungst : " + floatNumOne + " " + floatNumTwo + " " + floatNumThree + " is : " + maxFloat + "\n");
		
		maximumString(stringOne, stringTwo, stringThree);
		System.out.println("Maximum amoungst : " + stringOne + " " + stringTwo + " " + stringThree + " is : " + maxString);
	}
}
