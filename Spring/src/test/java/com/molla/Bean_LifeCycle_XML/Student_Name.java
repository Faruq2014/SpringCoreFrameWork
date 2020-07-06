package com.molla.Bean_LifeCycle_XML;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student_Name {

	private String driver;  // value is coming from bean file or property file
	private String url="jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;";
	// this url value is not formidable in xml file. 
	private String user;
	private String password;
	Connection con;
	
	
	// for private property, we need getter and setter method
	public String getDriver() {
		return driver;
	}

	/*
	 * public String getUrl() { return url; }
	 */
	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

	public void setDriver(String driver) {
		this.driver = driver;
		}

	/*
	 * public void setUrl(String url) { this.url = url; }
	 */
	public void setUser(String user) {
		this.user = user;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@PostConstruct
	public void init() throws ClassNotFoundException, SQLException {
		createConnection();
		}
	
	public void createConnection() throws ClassNotFoundException, SQLException {
		//Load driver
				Class.forName(driver);
				// get connection
			 con=	DriverManager.getConnection(url,user,password);
	}
	public void selectNameInfo() throws ClassNotFoundException, SQLException {

		Statement stmt=con.createStatement();
		String select="SELECT * FROM Students";
	ResultSet result=stmt.executeQuery(select);
	
	while(result.next()) {
		System.out.println(result.getString("firstname")+""+result.getString("lastname"));	
	}
	}
	
	public void seletPhone() throws ClassNotFoundException, SQLException {
		
		Statement stmt=con.createStatement();
		String selectPhone= "SELECT * FROM Students";
		ResultSet result1=stmt.executeQuery(selectPhone);
		while(result1.next()) {
			System.out.println(result1.getString("phone")+" ID is>>>  "+result1.getInt("studentId"));	
		}
		
		
	}
	public void closeConnection() throws SQLException {
			con.close();
	}
	@PreDestroy
	public void destroy() throws SQLException {
		closeConnection();

	}
}
