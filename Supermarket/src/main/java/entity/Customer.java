package entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
//@Data
@Getter
@Setter
@Entity
@Table(name="customer")
public class Customer {
    @Id
    @Column(name = "customer_id")
    private String id;

    private String name;
    private String nic;
    private String email;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<Order> orders;
}
