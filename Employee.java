package khoa;

public class Employee {
	private String name;
	private int year;
	private double salary;
	private String address;
	
	public Employee(String name, int year, double salary, String address) {
		this.name = name;
		this.year = year;
		this.salary = salary;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return name+","+year+","+salary+","+address;
	}

	public static void main(String[] args) {
		Employee test = new Employee("Khoa", 1996, 420, "Binh Duong");
		System.out.println(test);
	}

}
