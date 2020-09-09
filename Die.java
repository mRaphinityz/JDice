// Chapter 4 Game Zone exercise 1 (page 227)

public class Die 
{
	// data field variables for this class
	private int dieValue;
	private final int HIGHEST_DIE_VALUE = 6;
	private final int LOWEST_DIE_VALUE = 1;

	// constructor for this class
	public Die()
	{
		dieValue = (int)(Math.random() * HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
	}

	// accessor (getter) method for objects of this class
	public int getDieValue()
	{
		return dieValue;
	}
}