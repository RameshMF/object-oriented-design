package com.ramesh.ood.principles.openclosed.bad;

import java.sql.Connection;

public interface IConnectionProvider {
	public Connection mysqlConnection();
	public Connection msServerConnection();
	public Connection h2Connection();
	// if we need to support other database like oracle , we need to change this class
}
