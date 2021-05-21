import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Product
{
	private String name;
	private String brand;
	private Double price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<Product>();
		
		products.stream().sorted(Comparator.comparing(Product::getName)).collect(Collectors.toList());
		
		Map<String, List<Product>> map = products.stream().collect(Collectors.groupingBy(Product::getBrand));
		
		
	}
}