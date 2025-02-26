package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="orders")
public class Order {
    @Id
    @Column(name = "order_id")
    private String id;

    private Date date;

    @ManyToOne
    @JoinColumn(name = "cus_id")
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private List<OrderDetails> orderDetailsList;
}
