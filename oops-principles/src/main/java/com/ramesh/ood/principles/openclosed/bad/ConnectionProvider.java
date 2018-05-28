package com.ramesh.ood.principles.openclosed.bad;

import java.sql.Connection;

public class ConnectionProvider implements IConnectionProvider{

	public Connection mysqlConnection() {
		// establish connection to MySQL database
		return null;
	}

	public Connection msServerConnection() {
		// TODO establish connection to ms-server database
		return null;
	}

	public Connection h2Connection() {
		// establish connection to h2 database
		return null;
	}

	// if we need to support other database like oracle , we need to change this class
}
