# Data Structures and Algorithms
A personal initiative to sharpen problem-solving skills, strengthen core understanding of data structures and algorithms, and prepare for coding interviews and top-tier software engineering roles. This repository documents thought processes, key learnings, and optimizations as part of a continuous growth journey

Technologies: [Java, Spring Boot, React, SQL]

```java
@Service
public class InventoryService {
    @Autowired
    private ProductRepository productRepo;

    @Transactional
    public StockLevel updateStock(String productId, int change) {
        Product product = productRepo.findById(productId).orElseThrow();
        product.adjustStock(change);
        productRepo.save(product);
        return product.getStockLevel();
    }
}
```

![LeetCode Stats](https://leetcard.jacoblin.cool/neo124?theme=dark&font=Noto%20Serif%20Bengali&ext=activity)
