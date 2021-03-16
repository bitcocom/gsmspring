package kr.gsm.model;
// JDBC->myBatis
import java.sql.*;
public class MemberDAO {
   private Connection conn;  // DB연결객체
   private PreparedStatement ps;  //SQL전송객체
   private ResultSet rs; // 결과집합을담는객체
   // 연결동작
   public void getConnect() {
	    String url="jdbc:mysql://localhost:3306/mysql";
	    String user="root";
	    String password="12345";
	    // 드라이버클래스를 메모리에 로딩 :com.mysql.jdbc.Driver	    
	    try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
   }   
   // 저장동작
}
