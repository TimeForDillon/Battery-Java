package Battery;
/**
 * A battery with a capacity of charge.
 */
public class Battery 
{
	double capacity;
	double originalCapacity;
	
	/**
	 * Constructs a Battery with the given capacity
	 * @param capacity capacity of battery
	 */
	public Battery(double capacity)
	{
		this.capacity = capacity;
		originalCapacity = capacity;
	}
	
	/**
	 * Drains the capacity of the Battery by the given amount.
	 * @param amount amount of capacity lost
	 */
	public void drain(double amount)
	{
		capacity -= amount;
	}
	
	/**
	 * Charges the Battery to its original capacity. 
	 */
	public void charge()
	{
		capacity = originalCapacity;
	}
	
	/**
	 * Gets the remaining capacity of the battery. 
	 * @return remaining capacity of charge
	 */
	public double getRemainingCapacity()
	{
		return capacity;
	}
	
}
