package com.ramesh.ood.principles.dependencyinversion.good;

import java.sql.Connection;
import java.sql.SQLException;

import org.h2.jdbcx.JdbcDataSource;

public class H2DataSource implements DataSource {

	private JdbcDataSource dataSource;
	
	@Override
	public void createConnection(DatabaseConfig databaseConfig) {
		dataSource = new JdbcDataSource();
		dataSource.setURL(databaseConfig.getUrl());
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
