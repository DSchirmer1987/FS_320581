package datenbank_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	private Connection db_conn;
	private String db_server;
	private String db_database;
	private String db_host;
	
	public Database(String server, String host, String database, String user, String password) {
		this.db_server = server;
		this.db_database = database;
		this.db_host = host;
		/*
		 * Arbeiten mit JDBC - Java DataBase Connection
		 * 
		 * JDBC String aufbauen.
		 * Schema: jdbc:servertyp://ip/database
		 */
		String jdbc = "jdbc:" + server + "://" + host + "/" + database;
		
		/*
		 * Aufbau der Datenbankverbindung über einen DriverManager
		 * DriverManager lädt den Treiber für die Verbindung.
		 */
		try {
			this.db_conn = DriverManager.getConnection(jdbc, user, password);
			if(this.db_conn != null) {
				System.out.println("Verbindung hergestellt");
			} else {
				System.out.println("Verbindung fehlgeschlagen");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Daten aus Datenbank holen
	 * 
	 * SQL-Befehl:
	 * SELECT * FROM employees
	 */
	
	
	/*
	 * Daten in Datenbank schreiben
	 * 
	 * SQL-Befehl:
	 * INSERT INTO employees(Liste der Attribute)
	 */
}
