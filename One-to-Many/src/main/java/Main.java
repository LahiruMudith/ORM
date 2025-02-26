import config.FactoryConfiguration;
import entity.Customer;
import entity.Order;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();

        Customer customer = new Customer();
        customer.setName("Iresh");

        List<Order> orders = new ArrayList<>();
        Order order1 = new Order();
        order1.setOrderDate("2025-02-03");
        order1.setCustomer(customer);

        Order order2 = new Order();
        order2.setOrderDate("2025-02-07");
        order2.setCustomer(customer);

        orders.add(order1);
        orders.add(order2);

        customer.setOrderList(orders);

        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();
//        Session session = FactoryConfiguration.getInstance().getSession();
//        session.close();
    }
}
