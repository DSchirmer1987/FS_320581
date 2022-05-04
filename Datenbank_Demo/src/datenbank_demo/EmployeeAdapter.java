package datenbank_demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeAdapter {
	
	/***
	 * Erzeugt die Tabelle für die Employees.
	 * 
	 * SQL-Befehl: Create Table
	 */
	public static void init(Connection db_conn) {
		String sql = "CREATE TABLE IF NOT EXISTS employees" + 
					 "(id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," + 
					 "first_name VARCHAR(50)," +
					 "last_name VARCHAR(100)," +
					 "salary DECIMAL(10,2)" +
					 ")";
		try {
			// Statement zum vorbereiten des SQL Befehles
			Statement statement = db_conn.createStatement();
			// executeUpdate - Senden/Ausführen des SQL-Befehles
			statement.executeUpdate(sql);
			System.out.println("Tabelle erfolgreich erstellt.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/***
	 * SQL-Befehl: SELECT
	 * @param db_conn
	 */
	public static Employee loadEmployee(Connection db_conn, int id) {
		Employee employee = null;
		String sql = "SELECT * FROM Employees WHERE id = " + id;
		// SELECT * FROM Employees WHERE ID = 10;
		// SELECT * FROM Employees WHERE ID = 10; DROP Table buchhaltung;
		// Dank PreparedStatement:
		// SELECT * FROM Employees WHERE ID = 10 &usp523& DROP Table buchhaltung;
		try {
			PreparedStatement statement = db_conn.prepareStatement(sql);
			ResultSet results = statement.executeQuery();
			while(results.next()) {
				employee = new Employee(results.getInt("id"), 
										results.getString("first_name"), 
										results.getString("last_name"), 
										results.getDouble("salary")
										);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return employee;
	}
	
	/***
	 * SQL-Befehl: INSERT INTO
	 * @param db_conn
	 */
	public static void saveEmployee(Connection db_conn, Employee employee) {
		String sql = "INSERT INTO employees (first_name, last_name, salary) VALUES (?, ?, ?)";
		
		// PreparedStatement - Zum vorbereiten eines SQL-Befehles. Nötig um zum Beispiel werte zuzuweisen 
		//  				   oder um schadhafte SQL-Injections zu erschweren.
		try {
			PreparedStatement statement = db_conn.prepareStatement(sql);
			// Befüllen der Values mit aktuellen Werten
			statement.setString(1, employee.getFirst_name());
			statement.setString(2, employee.getLast_name());
			statement.setDouble(3, employee.getSalary());
			
			// Eine Integer zum speichern der Anzahl der betroffenen Zeilen - Bei Insert sollte das 1 sein.
			int rowsAffected = statement.executeUpdate();
			System.out.println("Zeilen betroffen: " + rowsAffected);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/***
	 * SQL-Befehl: SELECT
	 * @param db_conn
	 */
	public static ArrayList<Employee> loadEmployees(Connection db_conn) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		String sql = "SELECT * FROM Employees";
		try {
			PreparedStatement statement = db_conn.prepareStatement(sql);
			ResultSet results = statement.executeQuery();
			while(results.next()) {
				Employee employee = new Employee(results.getInt("id"), 
						results.getString("first_name"), 
						results.getString("last_name"), 
						results.getDouble("salary")
						);
				employees.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}
	
	public static void updateEmployee(Connection db_conn, Employee employee) {
		String sql = "UPDATE Employees SET first_name = ?, last_name = ?, salary = ? WHERE id = ?";
		try {
			PreparedStatement statement = db_conn.prepareStatement(sql);
			statement.setString(1, employee.getFirst_name());
			statement.setString(2, employee.getLast_name());
			statement.setDouble(3, employee.getSalary());
			statement.setInt(4, employee.getEmployee_id());
			
			int rowsAffected = statement.executeUpdate();
			System.out.println("Zeilen betroffen: " + rowsAffected);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void loadDynamic(Connection db_conn, String where, String...colums) {
		String sql = "SELECT * FROM Employees" + where;
		if(colums.length == 0) {
			sql = "SELECT * FROM Employees" + where;
		} else {
			sql = "SELECT ";
			for(String column: colums) {
				sql += column + ", ";
			}
			sql += "FROM Employees" + where;
		}
	}
}
