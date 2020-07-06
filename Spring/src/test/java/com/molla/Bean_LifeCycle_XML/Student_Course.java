package com.molla.Bean_LifeCycle_XML;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student_Course {

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
		// logger to see bean life cycle flow of work. 
		System.out.println("setting driver");
		
	}

	/*
	 * public void setUrl(String url) { this.url = url; }
	 */
	public void setUser(String user) {
		this.user = user;
		System.out.println("setting user");
	}

	public void setPassword(String password) {
		this.password = password;
		System.out.println("setting password");
	}
	
	
	@PostConstruct
	public void init() throws ClassNotFoundException, SQLException {
		createConnection();
		System.out.println("DataBase Connected");
	
	}
	
	public void createConnection() throws ClassNotFoundException, SQLException {
		//Load driver
				Class.forName(driver);
				// get connection
			 con=	DriverManager.getConnection(url,user,password);
				System.out.println("getting connection....");		
	}
	

	
	public void selectCourseInfo() throws ClassNotFoundException, SQLException {

		Statement stmt=con.createStatement();
		String select="SELECT * FROM Course";
	ResultSet result=stmt.executeQuery(select);
	
	while(result.next()) {
		System.out.println(result.getString("courseName")+" "+result.getString("courseDescription"));	
	}
	}
	
	public void seletStudentCourse() throws ClassNotFoundException, SQLException {
		
		Statement stmt=con.createStatement();
		String selectPhone= "SELECT * FROM Course";
		ResultSet result1=stmt.executeQuery(selectPhone);
		while(result1.next()) {
			System.out.println(result1.getString("courseName")+" ID is>>>  "+result1.getInt("studentId"));	
		}
		
		
	}
	public void closeConnection() throws SQLException {
		//do all the clean up job here
	System.out.println("closing the connection.....");
		con.close();
	}
	@PreDestroy
	public void destroy() throws SQLException {
		closeConnection();
	System.out.println("connection closed");	
	}
}
