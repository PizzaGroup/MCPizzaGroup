package springbootmcpizza.mcpizza;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String pizzaName;
    private String toping;
    private Date date;
    private double basePrice;
    private double tax;


}
