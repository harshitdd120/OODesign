package concurrency.threadsafecollections;

import java.util.List;



public interface ProductDAO {
	
	public Product save(Product toBeSaved);
	public Product findById(int id);
	public List<Product> findAll();
	public void deleteById(int id);

}
