import config.FactoryConfiguration;
import entity.Customer;
import entity.Order;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();

//        Customer customer = new Customer();
//        customer.setId("C001");
//        customer.setName("Lahiru");
//
//        List<Order> orders = new ArrayList<>();
//        Order order1 = new Order();
//        order1.setId("O001");
//        order1.setDate(new Date(2025-02-03));
//        order1.setCustomer(customer);
//
//        Order order2 = new Order();
//        order2.setId("O002");
//        order2.setDate(new Date(2025-02-03));
//        order2.setCustomer(customer);
//
//        orders.add(order1);
//        orders.add(order2);
//
//        customer.setOrders(orders);
//
//        Transaction transaction = session.beginTransaction();
//        session.save(customer);
//        transaction.commit();

        Customer customer = session.get(Customer.class, "C001");
        System.out.println(customer.getName());
        session.close();
    }
}
