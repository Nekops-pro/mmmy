package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.pojo.registpojo;
import com.tools.BaseDao;

public class UserDao {
		public registpojo finduser(String userId) {
			Connection conn= null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			registpojo result = null;
			try {
				conn = BaseDao.getConnection();//获取连接
				String sql = "select * from bbs_project "
						+ "where userId=?";
				ps = conn.prepareStatement(sql);//创建执行块
				rs = BaseDao.query(ps, new Object[] {userId});// 调用BaseDao的查询方法
				if(rs.next()) {
					
					result = new registpojo(rs.getString("userId")
							);
				}
			} catch (Exception e) {e.printStackTrace();
			} finally {
				try {
					BaseDao.close(conn, ps, rs);
				} catch (Exception e2) {e2.printStackTrace();}
			}
			return result;
		}
}
