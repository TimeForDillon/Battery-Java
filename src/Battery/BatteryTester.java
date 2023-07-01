package Battery;
/**
 * A class to test the Battery class.
 */
public class BatteryTester
{
	public static void main(String[] args)
	{
		Battery AA = new Battery(3000.0);
		AA.drain(250);
		System.out.println(AA.getRemainingCapacity());
		AA.charge();
		System.out.println(AA.getRemainingCapacity());
	}
}

/*
Output:
2750.0
3000.0

Expected:
2750.0
3000.0
*/
