package chap09;

import java.sql.*;

public class DeptSelect {

	public static void main(String[] args) {
		String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, "scott", "tiger");
			stmt = conn.createStatement();
			String sql = "select * from dept where deptno = 20";
			rs = stmt.executeQuery(sql);
			int deptno;
			String dname, loc;
			
			if(rs.next()) {
				deptno = rs.getInt("deptno");
				dname = rs.getString("dname");
				loc = rs.getString("loc");
				
				System.out.println("부서번호: " + deptno + ", 부서명: " + dname + ", 부서위치: " + loc);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
