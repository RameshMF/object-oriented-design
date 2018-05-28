package com.ramesh.ood.principles.dependencyinversion.bad;

/**
 * A customer POJO that represents the data that will be read from the data source.
 *
 */
public class Customer {

  private int id;
  private String firstName;
  private String lastName;

  /**
   * Creates an instance of customer.
   */
  public Customer(final int id, final String firstName, final String lastName) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public int getId() {
    return id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return "Customer{" + "id=" + getId() + ", firstName='" + getFirstName() + '\'' + ", lastName='"
        + getLastName() + '\'' + '}';
  }

  @Override
  public boolean equals(final Object that) {
    boolean isEqual = false;
    if (this == that) {
      isEqual = true;
    } else if (that != null && getClass() == that.getClass()) {
      final Customer customer = (Customer) that;
      if (getId() == customer.getId()) {
        isEqual = true;
      }
    }
    return isEqual;
  }

  @Override
  public int hashCode() {
    return getId();
  }
}
