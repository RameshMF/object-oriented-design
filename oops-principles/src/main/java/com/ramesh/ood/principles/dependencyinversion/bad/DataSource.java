package com.ramesh.ood.principles.dependencyinversion.bad;

import java.sql.Connection;

/**
 * Datasource interface
 *
 */
public interface DataSource {
	void createConnection(DatabaseConfig config);
	Connection getConnection();
	
}
