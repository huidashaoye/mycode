package com.itheima.util;


import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3p0Utils {
	private static DataSource ds=new ComboPooledDataSource();

	/**
	 * 获取连接
	 * @return
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		return ds.getConnection();
	}

	/**
	 *
	 * @return
	 */
	public static DataSource getDataSource() {
		return ds;
	}

}
