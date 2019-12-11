package volodymyr.task1;

public class EmployeeHour implements Salary{

	@Override
	public void Salary() {
		int hourOfMounth = 165;
		int payOfHour = 45;
		double hourSalary = payOfHour*hourOfMounth;
		System.out.println("An employee with an hourly wage " + hourSalary);
	}
	
	
//ЗПфакт = ТСГОД × ГОДвідпрац,
//де ТСГОД — годинна тарифна ставка;
//ГОДвідпрац — кількість фактично відпрацьованих годин.
	
}
