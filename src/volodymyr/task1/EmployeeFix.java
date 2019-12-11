package volodymyr.task1;

public class EmployeeFix implements Salary{

	@Override
	public void Salary() {
		
		int fix = 7000;
		int hour = 165;
		double fixSelery = ((fix/12)+fix)-hour;
		System.out.println("An employee with a fixed monthly salary "+ fixSelery);
		
	}

	
	
}
