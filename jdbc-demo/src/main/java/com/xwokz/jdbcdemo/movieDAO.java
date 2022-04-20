package com.xwokz.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class movieDAO {
	public void getNameByMovieID() {

		String query="SELECT mv.name FROM movie mv WHERE id=3";
		
		
		Connection connection=null;
		java.sql.Statement statement=null;
		ResultSet resultset=null;
	
	try {
	connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","root");
	statement=connection.createStatement();
	
	//Step 5
	// Proccesing the result set
	resultset=statement.executeQuery(query);
	
	
	while(resultset.next()) {
		// String movieName=resultSet.getString("name");
		String movieName=resultset.getString(1);
		System.out.println("Movie Name :" +movieName);
		
	}
	}
	catch(Exception e) {
	  e.printStackTrace();
	}
	finally {
			try {
				if(connection!=null)
				connection.close();
				if(statement!=null)
					statement.close();
				if(resultset!=null)
					resultset.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}

	}
	public void getAll() {

		String query="SELECT* from movie ";
		
		
		Connection connection=null;
		java.sql.Statement statement=null;
		ResultSet resultset=null;
	
	try {
	connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","root");
	statement=connection.createStatement();
	
	//Step 5
	// Proccesing the result set
	resultset=statement.executeQuery(query);
	
	
	while(resultset.next()) {
		// String movieName=resultSet.getString("name");
		System.out.println("id :" +resultset.getInt("id"));
		System.out.println("name:" +resultset.getString("name"));
		System.out.println("rating:" +resultset.getDouble("rating"));
		System.out.println("language:" +resultset.getString("language"));
		System.out.println("budget:" +resultset.getLong("budget"));
	}
	}
	catch(Exception e) {
	  e.printStackTrace();
	}
	finally {
			try {
				if(connection!=null)
				connection.close();
				if(statement!=null)
					statement.close();
				if(resultset!=null)
					resultset.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}

	}
	public void getLanguageAndBudgetByMovieName(String movieName) {

		String query="SELECT language,budget FROM movie where name=  ('"+movieName+"')";
		
		
		Connection connection=null;
		java.sql.Statement statement=null;
		ResultSet resultset=null;
	
	try {
	connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","root");
	statement=connection.createStatement();
	
	//Step 5
	// Proccesing the result set
	resultset=statement.executeQuery(query);
	
	
	while(resultset.next()) {
		// String movieName=resultSet.getString("name");
		System.out.println("language:" +resultset.getString("language"));
		System.out.println("budget:" +resultset.getLong("budget"));
	}
	}
	catch(Exception e) {
	  e.printStackTrace();
	}
	finally {
			try {
				if(connection!=null)
				connection.close();
				if(statement!=null)
					statement.close();
				if(resultset!=null)
					resultset.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}

	}



}
