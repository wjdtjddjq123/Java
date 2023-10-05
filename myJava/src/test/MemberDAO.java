package model;
import java.sql.*;
import java.util.*;


public class MemberDAO {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String sql;
	
	public MemberDAO() {
		String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		Connection conn = null;
		
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, "scott", "1234");
		}

		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public MemberDO getMember(String id) {
		MemberDO member = null;
		this.sql = "select id, passws, to_char(regdate, 'YYYY-MM-DD HH24:MI:SS')as regdate ,grade"+ "from member where id = ? ";
		
		try {
			this.pstmt = conn.prepareStatement(sql);
			this.pstmt.setString(1, id);
			
			rs= this.pstmt.executeQuery();
			if(this.rs.next()) {
				member = new MemberDO();
				member.setId(this.rs.getString("id"));
				member.setPasswd(this.rs.getString("passwd"));
				member.setName(this.rs.getString("name"));
				member.setRegdate(this.rs.getString("regdate"));
				member.setGrade(this.rs.getInt("grade"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	
}
