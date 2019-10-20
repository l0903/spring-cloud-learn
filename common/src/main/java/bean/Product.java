package bean;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
    private int productId;
    private String productName;
    private double price;
}
