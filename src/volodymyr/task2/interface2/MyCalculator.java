package volodymyr.task2.interface2;

import volodymyr.task2.interface1.Numerable;

public class MyCalculator implements Numerable{

	int one;
	int two;
	
	public MyCalculator(int one, int two) {
		super();
		this.one = one;
		this.two = two;
	}

	@Override
	public int Add() {
		System.out.print("Add result: "+one+" + "+two+" = " );
		return (one+two);
	}

	@Override
	public int Subtract() {
		System.out.print("Subtract result: "+one+" - "+two+" = " );
		return (one-two);
	}

	@Override
	public double Increase() {
		System.out.print("Increase result: "+one+" * "+two+" = " );
		return (one*two);
	}

	@Override
	public double Share() {
		System.out.print("Share result: "+one+" / "+two+" = " );
		return (one/two);
//		try {
//			return (one/two);
//		} catch (Exception e) {
//			System.out.println("fail / 0");
//		}
	}
	
}
