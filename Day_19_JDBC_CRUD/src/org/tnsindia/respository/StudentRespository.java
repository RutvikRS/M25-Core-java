package org.tnsindia.respository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.tnsindia.entities.Student;

public interface StudentRespository {
	
	//abstract method
	public abstract int create(String query,Student student);
	public abstract int update(String query,Student student);
	public abstract int delete(String query);//deletion
	public abstract ResultSet retrive(String query);
	Statement createstatement();
	PreparedStatement createPrepareStatement(String query);
	

}