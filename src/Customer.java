import java.util.stream.*;
import java.util.*;


public class Customer {
	private String name;
	private int points;
	//Constructor and standard getters

	public Customer(String name, int points)
	{
		this.name = name;
		this.points = points;
	}

	public Customer()
	{

	}

	public String getName()
	{
		return name;
	}
	public int getPoints()
	{
		return points;
	}


	public List<Customer> getCustomersByPoints()
	{
		Customer john = new Customer("John P.", 15);
		Customer sarah = new Customer("Sarah M.", 200);
		Customer charles = new Customer("Charles B.", 150);
		Customer mary = new Customer("Mary T.", 1);

		List<Customer> customers = Arrays.asList(john, sarah, charles, mary);
		//please extract the customer with points = 150

		return customers.stream().filter(s -> s.getPoints() == 150).collect(Collectors.toList());
	}

	public static void main(String s[])
	{
		Customer c = new Customer();
		System.out.println(c.getCustomersByPoints());
	}
}



