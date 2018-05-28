package com.ramesh.ood.principles.dependencyinversion.bad;

public interface CustomerDao {
	 /**
	   * @param id unique identifier of the customer.
	   * @return an optional with customer if a customer with unique identifier <code>id</code>
	   *     exists, empty optional otherwise.
	   * @throws Exception if any error occurs.
	   */
	  Customer getById(int id) throws Exception;

	  /**
	   * @param customer the customer to be added.
	   * @return true if customer is successfully added, false if customer already exists.
	   * @throws Exception if any error occurs.
	   */
	  boolean add(Customer customer) throws Exception;

	  /**
	   * @param customer the customer to be updated.
	   * @return true if customer exists and is successfully updated, false otherwise.
	   * @throws Exception if any error occurs.
	   */
	  boolean update(Customer customer) throws Exception;

	  /**
	   * @param customer the customer to be deleted.
	   * @return true if customer exists and is successfully deleted, false otherwise.
	   * @throws Exception if any error occurs.
	   */
	  boolean delete(Customer customer) throws Exception;
}
