Projectdetails:[
  {
codeSnippet: 
`@Service
public class InventoryService {
    @Autowired
    private ProductRepository productRepo;

    @Transactional
    public StockLevel updateStock(
        String productId, int change) {
      Product product = productRepo
        .findById(productId)
        .orElseThrow(); 
      product.adjustStock(change);
      productRepo.save(product);
      // Logger.info("Stock updated...");
      return product.getStockLevel();
    }
}`,
Technologies:[Java,React,Spring boot,SQL]
]



# DSA Problems and My Solutions📚

 **Data Structures and Algorithms (DSA)** repository!

This project is a personal initiative to:
- Sharpen my problem-solving skills.
- Build a strong foundation in data structures and algorithms.
- Prepare for coding interviews and high-impact software engineering roles.
- Document my thought process, learnings, and optimizations along the way.


![LeetCode Stats](https://leetcard.jacoblin.cool/neo124?theme=dark&font=Noto%20Serif%20Bengali&ext=activity)
