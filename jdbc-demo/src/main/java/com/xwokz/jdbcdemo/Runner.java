package com.xwokz.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

												
public class Runner {

	public static void main(String[] args) {
		
		movieDAO dao=new movieDAO();
//	moviename();
//	updatemovie();
//	deletemovie();
//	dao.getNameByMovieID();
//	dao.getAll();
	dao.getLanguageAndBudgetByMovieName(movieName);
	}

	private static void moviename() {
		

		Scanner sc= new Scanner(System.in);
		System.out.println("insert movie id");
		int id=sc.nextInt();
		System.out.println("enter movie name");
		String name=sc.next();
		System.out.println("Enter rating");
		double rate=sc.nextDouble();
		System.out.println("enter language ");
		String language=sc.next();
		System.out.println("enter budget");
		long budget=sc.nextLong();
		
		
		sc.close();
		
		
		Connection connection=null;
		Statement statement=null;
		
		
		try {
			// Step1
			//Load and register the driver 
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class loaded");
			
			// Step2
			//Create Connection(Establish connection with MySQL Server)
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","root");
					 System.out.println("Connection Created");

		//Step 3
			 // Create platform/environment to execute the queries
			 statement =connection.createStatement();
			 System.out.println("Statement Created");
			 
			 //Execute the query
			 statement.execute("INSERT INTO movie VALUES ("+id+",'"+name+"',"+rate+",'"+language+"',"+budget+")");
		
		}	catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
		finally {
			//Step 6
			//Close the costly resources
			try {
				if(statement !=null)
					statement.close();
				if(connection !=null)
					connection.close();
			}
			catch (Exception e2) {
			e2.printStackTrace();
			}
			
				}
	}

	
	private static void updatemovie() {
		

		Scanner sc1= new Scanner(System.in);
		
		System.out.println("enter movie name to update");
		String name=sc1.next();
		System.out.println("Enter rating to update");
		double rate=sc1.nextDouble();
		System.out.println("enter language to update");
		String language=sc1.next();
		System.out.println("enter budget to update");
		long budget=sc1.nextLong();
		System.out.println(" enter a id to update all the details");
		int id=sc1.nextInt();
		
		sc1.close();
		
		
		Connection connection=null;
		Statement statement=null;
		
		
		try {
			
			
			// Step2
			//Create Connection(Establish connection with MySQL Server)
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","root");
					 System.out.println("Connection Created");

		//Step 3
			 // Create platform/environment to execute the queries
			 statement =connection.createStatement();
			 System.out.println("Statement Created");
			 
			 //Execute the query
			 statement.execute("UPDATE movie SET name=('"+name+"'),rating=("+rate+"),language=('"+language+"'),budget=("+budget+") where id=("+id+")");
	       System.out.println("Succesfully updated");
		}	catch (SQLException e) {
			e.printStackTrace();

		}
		finally {
			//Step 6
			//Close the costly resources
			try {
				if(statement !=null)
					statement.close();
				if(connection !=null)
					connection.close();
			}
			catch (Exception e2) {
			e2.printStackTrace();
			}
		}
	}

private static void deletemovie() {
	

	Scanner sc= new Scanner(System.in);
	System.out.println("enter id to delete the all details");
	int id=sc.nextInt();
	
	
	Connection connection=null;
	Statement statement=null;
	
	
	try {
		
		
		// Step2
		//Create Connection(Establish connection with MySQL Server)
		 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","root");
				 System.out.println("Connection Created");

	//Step 3
		 // Create platform/environment to execute the queries
		 statement =connection.createStatement();
		 System.out.println("Statement Created");
		 
		 //Execute the query
		 statement.execute("DELETE FROM movie where id=("+id+")");
       System.out.println("Succesfully deleted");
	}	catch (SQLException e) {
		e.printStackTrace();

	}
	finally {
		//Step 6
		//Close the costly resources
		try {
			if(statement !=null)
				statement.close();
			if(connection !=null)
				connection.close();
		}
		catch (Exception e2) {
		e2.printStackTrace();
		}
	}
}
}



