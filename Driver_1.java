package driver_1;

public class Driver_1 {
	public static void main(String[] args) {
		
		Employee emp[] = new Employee[100];
		
		Employee hold;
		
		int count =5;
		
		emp[0] = new Employee("Smith",53,56000);
		emp[1] = new Employee("Jones",20,34000);
		emp[2] = new Employee("Adams",30,55000);
		emp[3] = new Employee("Simms",45,50000);
		emp[4] = new Employee("Travis",60,60000);
		
		
		for(int pass = 1; pass < count; pass++) {
			for(int e = 0; e < count - 1; e++) {
				if(emp[e].getSalary() > emp[e + 1].getSalary()) {
					hold = emp[e];					//bubble sorting 
					emp[e] = emp[e + 1];
					emp[e + 1] = hold;
				}
			}
		}
		for(int i = 0; i < count ; i++)
			System.out.println(emp[i]);
		
		System.out.println();
		
		for(int i = 0 ; i < count ; i++)
			if(emp[i].getSalary() > 40000 && emp[i].getSalary() < 60000)
				System.out.println(emp[i].toString_1());
	}}

	class Employee{
		private String name;
		private int age;
		private double salary;
		public Employee(String n, int a, double s) {
			name = n; age = a; salary = s;
		}
		
		public String getName() {return name;}		
		public double getSalary() {return salary;}
		
		public String toString() {
			return "name: " + name + "	age: " + age + "		salary: " + salary;
		}
		public String toString_1() {
			return name + " has a salary between 40k and 60k." + "\n";
		}
}
