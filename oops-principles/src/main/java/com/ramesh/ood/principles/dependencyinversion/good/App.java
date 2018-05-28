package com.ramesh.ood.principles.dependencyinversion.good;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class App {

	private final static String CREATE_SCHEMA_SQL = "CREATE TABLE `CUSTOMERS` (`id` INT(11) NULL DEFAULT NULL,`first_name` VARCHAR(50) NULL DEFAULT NULL,`last_name` VARCHAR(50) NULL DEFAULT NULL);";
	private final static String DELETE_SCHEMA_SQL = "DROP TABLE CUSTOMERS";
	private static DatabaseConfig config;

	public static void main(String[] args) throws Exception {

		config = new DatabaseConfig();
		config.setDriverClass("com.mysql.jdbc.Driver");
		config.setUrl("jdbc:mysql://localhost:3306/demo");
		config.setUserName("root");
		config.setPassword("root");
		DataSource dataSource = new MySQLDataSource();
		dataSource.createConnection(config);
		CustomerDao customerDao = new CustomerDaoImpl(dataSource);
		createSchema(dataSource);
		performOperationsUsing(customerDao);
		// deleteSchema(dataSource);

	}

	private static void deleteSchema(DataSource dataSource) throws SQLException {
		try (Connection connection = dataSource.getConnection(); Statement statement = connection.createStatement()) {
			statement.execute(DELETE_SCHEMA_SQL);
		}
	}

	private static void createSchema(DataSource dataSource) throws SQLException {
		try (Connection connection = dataSource.getConnection(); Statement statement = connection.createStatement()) {
			statement.execute(CREATE_SCHEMA_SQL);
		}
	}

	private static void addCustomers(CustomerDao customerDao) throws Exception {
		for (Customer customer : generateSampleCustomers()) {
			customerDao.add(customer);
		}
	}

	private static void performOperationsUsing(final CustomerDao customerDao) throws Exception {
		addCustomers(customerDao);
		final Customer customer = new Customer(4, "Dan", "Danson");
		customerDao.add(customer);
		customer.setFirstName("Daniel");
		customer.setLastName("Danielson");
		customerDao.update(customer);
	}

	/**
	 * Generate customers.
	 * 
	 * @return list of customers.
	 */
	public static List<Customer> generateSampleCustomers() {
		final Customer customer1 = new Customer(1, "Adam", "Adamson");
		final Customer customer2 = new Customer(2, "Bob", "Bobson");
		final Customer customer3 = new Customer(3, "Carl", "Carlson");
		final List<Customer> customers = new ArrayList<>();
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		return customers;
	}
}
