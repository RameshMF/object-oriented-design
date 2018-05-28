package com.ramesh.ood.principles.dependencyinversion.good;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class MySQLDataSource implements DataSource {

	private MysqlDataSource dataSource;

	@Override
	public void createConnection(DatabaseConfig databaseConfig) {
		dataSource = new MysqlDataSource();
		dataSource.setUrl(databaseConfig.getUrl());
		dataSource.setUser(databaseConfig.getUserName());
		dataSource.setPassword(databaseConfig.getPassword());
	}

	@Override
	public Connection getConnection() {
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
