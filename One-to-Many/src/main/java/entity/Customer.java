package entity;

import jakarta.persistence.*;
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

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<Order> orderList;//because customer is many
}
