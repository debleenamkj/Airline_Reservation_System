/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.acciojob.airline_reservation_system;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Debleena Mukherjee
 */
public class DBConn {
    public static Connection connection;
	
	public static Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost/airline_reservation_system","root","Password@123");
		return connection;
	}
}
