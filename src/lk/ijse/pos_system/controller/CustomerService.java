package lk.ijse.pos_system.controller;

import lk.ijse.pos_system.model.Customer;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerService {
    public boolean saveCustomer(Customer c) throws SQLException, ClassNotFoundException;
    public boolean updateCustomer(Customer c) throws SQLException, ClassNotFoundException;
    public boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException;
    public Customer getCustomer(String id) throws SQLException, ClassNotFoundException;
    public ArrayList<Customer> getAllCustomers() throws SQLException, ClassNotFoundException;
}
