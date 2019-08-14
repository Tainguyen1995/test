package khoa;

import java.util.Date;

public class Order {
	private int id;
	private String Description;
	private String dateOrder;
	
	public Order(int id, String description, String dateOrder) {
		this.id = id;
		Description = description;
		this.dateOrder = dateOrder;
	}

	@Override
	public String toString() {
		return "id: "+id+", "+ "Description: "+Description;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order test = new Order(1, "more milk", "23/07/2019");
		System.out.println(test);

	}

}
