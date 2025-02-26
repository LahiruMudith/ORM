package entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.Fetch;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="customer")
//inverse side(forign key sender)
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// how to generate id//
    private int id;
    private String name;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    /*             **Data Fetching**
    EAGER - load all the data from the database
    LAZY - load data only when it is needed
    */

    /*
    Customer customer1 = sesion.load(Customer.class,1) - LAZY loading
    customer.getName() - LAZY loading - run get name quary
    customer.getId() - LAZY loading - after get name...run get id quary
    */

    /*
    Customer customer2 = sesion.get(Customer.class,1) - EAGER loading
    customer.getName()
    customer.getId() - no need to run another quary
    */

    private List<Order> orderList;//because customer is many
}
