package entity;

import jakarta.persistence.*;
import lombok.*;

import jakarta.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="customer_table")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToOne
    @JoinColumn(name="nic_name")
    private IDCard idCard;
}
