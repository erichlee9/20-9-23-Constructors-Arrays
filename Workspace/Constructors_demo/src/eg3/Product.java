package eg3;

public class Product {
	
	private String id;
	private String name;
	private double rating;
	private double cost;
	
	public Product(String id, String name, double d, double cost) {
		this.id = id;
		this.name = name;
		this.rating = d;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", rating=" + rating + ", cost=" + cost + "]";
	}
	
	
	

}
