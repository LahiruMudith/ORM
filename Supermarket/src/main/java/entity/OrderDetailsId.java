package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class OrderDetailsId {
//    @Column(name = "order_id")
    private String orderId;

//    @Column(name = "item_id")
    private String itemId;
}
