package generic.testmaximum;

public class GenericMaximum<G extends Comparable<G>>
{
	G valueOne, valueTwo, valueThree;
	
	/**
	 * @param valueOne
	 * @param valueTwo
	 * @param valueThree
	 * Initializing variables.
	 */
	public GenericMaximum(G valueOne, G valueTwo, G valueThree)
	{
		this.valueOne = valueOne;
		this.valueTwo = valueTwo;
		this.valueThree = valueThree;
	}
	
	public G maximumValue() 
	{
		return GenericMaximum.maximumValue(valueOne, valueTwo, valueThree);
	}
	
	/**
	 * @param <G>
	 * @param valueOne
	 * @param valueTwo
	 * @param valueThree
	 * @return
	 * Comparing all types of values using generic with compareTo method.
	 */
	public static <G extends Comparable>G maximumValue(G valueOne, G valueTwo, G valueThree)
	{
		G maxValue = valueOne;
		
		if(valueTwo.compareTo(maxValue) > 0)
		{
			maxValue = valueTwo;
		}
		if(valueThree.compareTo(maxValue) > 0)
		{
			maxValue = valueThree;
		}
		outputMaximum(valueOne, valueTwo, valueThree, maxValue);
		return maxValue;
	}
	
	/**
	 * @param <E>
	 * @param valueOne
	 * @param valueTwo
	 * @param valueThree
	 * @param maxValue
	 * Printing the maximum value. 
	 */
	public static <E>void outputMaximum(E valueOne, E valueTwo, E valueThree, E maxValue)
	{
		System.out.println("Maximum amoungst : " + valueOne + " " + valueTwo + " " + valueThree + " is : " + maxValue);
	}
	
	/**
	 * @param args
	 * passing different type of values to function.
	 * calling function.
	 */
	public static void main(String[] args)
	{
		Integer intNumeOne = 15, intNumTwo = 55, intNumThree = 24;
		Float floatNumOne = 218.13f, floatNumTwo = 555.453f, floatNumThree = 999.999f;
		String stringOne = "Apple", stringTwo = "Peach", stringThree = "Banana";
		
		new GenericMaximum(intNumeOne, intNumTwo, intNumThree).maximumValue();
		new GenericMaximum(floatNumOne, floatNumTwo, floatNumThree).maximumValue();
		new GenericMaximum(stringOne, stringTwo, stringThree).maximumValue();
	}
}
