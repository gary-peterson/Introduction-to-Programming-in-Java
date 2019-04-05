
//BrilliantNumberTester.java

/*
Some testing/demo to help get started
Add your own as you wish. Work those objects.
*/

public class BrilliantNumberTester
{
	public static void println(Object o) { System.out.println(o.toString()); }

	public void test_isDivisibleBy()
	{
		println("\nTesting isDivisibleBy:");

		/*12 is divisible by 1, 2, 3, 4, 6, 12*/
		BrilliantNumber num = new BrilliantNumber(12);
		println("Testing BrilliantNumber: " + num);
		println("Expecting true for divisible by for these:  1, 2, 3, 4, 6, 12");
		for (int i=1; i<=12; i++)
			if (num.isDivisibleBy(i))
				println("YES, isDivisibleBy: " + i);

		/*11 is divisible by 1, 11*/
		num = new BrilliantNumber(11);
		println("\nTesting BrilliantNumber: " + num);
		println("Testing isDivisibleBy");
		println("Expecting true for divisible by for these:  1, 11");
		for (int i=1; i<=12; i++)
			if (num.isDivisibleBy(i))
				println("YES, isDivisibleBy: " + i);
	}

	public void test_isEven_isOdd()
	{
		println("\nTesting isEven, isOdd:");

		BrilliantNumber num = new BrilliantNumber(8098);
		println("" + num + " isEven: " + num.isEven());
		println("" + num + " isOdd: " + num.isOdd());
		num = new BrilliantNumber(8099);
		println("" + num + " isEven: " + num.isEven());
		println("" + num + " isOdd: " + num.isOdd());
		println("");
	}

	public void test_factorCount()
	{
		println("\nTesting factorCount:");

		for (int i=0; i<=30; i++) {
			BrilliantNumber num = new BrilliantNumber(i);
			println("" + num + " " + num.factorCount());
		}
	}

	public static void main(String[] args)
	{
		BrilliantNumberTester tester = new BrilliantNumberTester();
		tester.test_isDivisibleBy();
		tester.test_isEven_isOdd();
		tester.test_factorCount();
	}


}









