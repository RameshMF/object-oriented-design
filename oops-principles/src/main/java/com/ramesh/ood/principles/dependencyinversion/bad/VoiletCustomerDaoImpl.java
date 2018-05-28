package com.ramesh.ood.principles.dependencyinversion.bad;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * VoiletCustomerDaoImpl class violet the dependency injection principle and
 * have hard dependency with MySQLDataSource instance . It depends on
 * MySQLDataSource that has created using new keyword.
 * 
 * If customerDaoImpl class wants to support Oracle database 
 * then we need to change this for Oracle database configuration.
 *
 */
public class VoiletCustomerDaoImpl implements CustomerDao {

	//Hard dependency with MySQLDataSource instance
	private DataSource dataSource = new MySQLDataSource();

	private Connection getConnection() throws SQLException {
		return this.dataSource.getConnection();
	}

	private DataSource getDataSource() throws SQLException {
		return this.dataSource;
	}
	
	private Customer createCustomer(ResultSet resultSet) throws SQLException {
		return new Customer(resultSet.getInt("ID"), resultSet.getString("first_name"),
				resultSet.getString("last_name"));
	}

	@Override
	public Customer getById(int id) throws Exception {
		try {
			Connection connection = getConnection();
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM CUSTOMERS WHERE ID = ?");
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				return createCustomer(resultSet);
			} else {
				return null;
			}
		} catch (SQLException ex) {
			throw new Exception(ex.getMessage(), ex);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean add(Customer customer) throws Exception {

		try {
			Connection connection = getConnection();
			PreparedStatement statement = connection.prepareStatement("INSERT INTO CUSTOMERS VALUES (?,?,?)");
			statement.setInt(1, customer.getId());
			statement.setString(2, customer.getFirstName());
			statement.setString(3, customer.getLastName());
			statement.execute();
			return true;
		} catch (SQLException ex) {
			throw new Exception(ex.getMessage(), ex);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean update(Customer customer) throws Exception {
		try {
			Connection connection = getConnection();
			PreparedStatement statement = connection
					.prepareStatement("UPDATE CUSTOMERS SET first_name = ?, last_name = ? WHERE ID = ?");
			statement.setString(1, customer.getFirstName());
			statement.setString(2, customer.getLastName());
			statement.setInt(3, customer.getId());
			return statement.executeUpdate() > 0;
		} catch (SQLException ex) {
			throw new Exception(ex.getMessage(), ex);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean delete(Customer customer) throws Exception {
		try {
			Connection connection = getConnection();
			PreparedStatement statement = connection.prepareStatement("DELETE FROM CUSTOMERS WHERE ID = ?");
			statement.setInt(1, customer.getId());
			return statement.executeUpdate() > 0;
		} catch (SQLException ex) {
			throw new Exception(ex.getMessage(), ex);
		}
	}

}
