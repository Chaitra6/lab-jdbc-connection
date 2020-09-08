package controller;

import java.sql.Connection;

import utility.ConnectionManager;


public class Main {
	public static void main(String args[]) throws Exception {
		
		Connection conn = null;	
		ConnectionManager cm = new ConnectionManager();
		conn = cm.getConnection();
		
		if(conn!=null) {
			System.out.println("Connection Established.");
		}
		else {
			System.out.println("Check your Connection");
		}
		
		
	}
}
