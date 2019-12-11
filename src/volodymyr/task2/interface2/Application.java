package volodymyr.task2.interface2;

public class Application {

	public static void main(String[] args) {
		
		MyCalculator mc = new MyCalculator(25, -3);
		System.out.println(mc.Add());
		System.out.println(mc.Subtract());
		System.out.println(mc.Increase());
		System.out.println(mc.Share());
	}

}
