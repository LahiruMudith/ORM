package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
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
