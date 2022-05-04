package datenbank_demo;

public class App {

	public static void main(String[] args) {
		Database db = new Database("sqlite", "src", "hr.db", null, null);
		EmployeeAdapter.init(db.getDb_conn());
		Employee employee = new Employee(0, "Max", "Mustermann", 2500.50);
		EmployeeAdapter.saveEmployee(db.getDb_conn(), employee);
		
		Employee employee_db = EmployeeAdapter.loadEmployee(db.getDb_conn(), 1);
		System.out.println(employee_db);
		
		employee_db.setSalary(7500.00);
		EmployeeAdapter.updateEmployee(db.getDb_conn(), employee_db);
	}

}