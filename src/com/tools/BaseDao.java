package com.tools;
// 数据库底层类
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class BaseDao {
	// 加载数据库驱动
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {}
	}
	public final static String URL = "jdbc:mysql://localhost:3306/system_book?"
			+ "useUnicode=true&characterEncoding=utf-8";
	public final static String USER = "root";
	public final static String PASSWORD = "200031";
	/**
	 * 获取数据库连接
	 * @return 数据库连接
	 */
	public static Connection getConnection() throws SQLException{
		Connection conn = null;
		conn = DriverManager.getConnection(URL, USER, PASSWORD);
		return conn;
	}
	/**
	 * 关闭连接、执行块和结果集
	 * @param conn
	 * @param ps
	 * @param rs
	 * @throws SQLException
	 */
	public static void close(Connection conn,PreparedStatement ps,ResultSet rs) 
		throws SQLException{
		if(rs != null)
			rs.close();
		if(ps != null)
			ps.close();
		if(conn != null)
			conn.close();
	}
	/**
	 * 实现查询功能
	 * @param ps
	 * @param args
	 * @return
	 * @throws SQLException
	 */
	public static ResultSet query(PreparedStatement ps,Object[] args) 
			throws SQLException{
		if(args != null) {
			for(int i=0;i<args.length;i++) {
				ps.setObject(i+1, args[i]);
			}
		}
		return ps.executeQuery();
	}
	/**
	 * 实现增、删、改功能
	 * @param ps
	 * @param args
	 * @return
	 */
	public static int alter(PreparedStatement ps,Object[] args) 
			throws SQLException{
		if(args != null) {
			for(int i=0;i<args.length;i++) {
				ps.setObject(i+1, args[i]);
			}
		}
		return ps.executeUpdate();
	}
}













