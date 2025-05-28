# Project Name
DSA & ALGI

## Description
Core logic for inventory management within an ERP, ensuring stock accuracy via transactional updates and real-time data integration with product repositories.

## Technologies
[Java, Spring Boot, SQL, React]

## Code Snippet
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


