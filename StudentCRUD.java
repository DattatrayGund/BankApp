package JdbcSqlConnection.JdbcSqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentCRUD {
	
	public int insertStudent(Student s)
	{
		int check =0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
			String sql = "insert into student values(?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, s.getId());
			pst.setString(2, s.getName());
			pst.setString(3, s.getCity());
			check = pst.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
		
	}
	
	public int deleteStudent(int id)
	{
		int check =0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
			String sql = "delete from student where id=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, id);
		
			check = pst.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
		
	}
	
	public int updateStudent(Student s)
	{
		int check =0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
			String sql = "update student set name=?,city=? where id=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(3, s.getId());
			pst.setString(1, s.getName());
			pst.setString(2, s.getCity());
			check = pst.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	
	public Student displayStudent(int id)
	{
		Student s = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
			String sql = "select * from student where id=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				s = new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setCity(rs.getString(3));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
		
	}
	
	
	public List<Student> displayAllStudent()
	{
		List<Student> list = new ArrayList<Student>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
			String sql = "select * from student";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				Student s = new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setCity(rs.getString(3));
				list.add(s);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list; 
		
	}
	
	
	
	
	
}
