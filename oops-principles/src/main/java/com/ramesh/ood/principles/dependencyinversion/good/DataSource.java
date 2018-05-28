package com.ramesh.ood.principles.dependencyinversion.good;

import java.sql.Connection;

/**
 * Datasource interface
 *
 */
public interface DataSource {
	void createConnection(DatabaseConfig config);
	Connection getConnection();
	
}
