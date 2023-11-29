package collectionPrograms;

import java.util.PriorityQueue;

public class PriorityQueueEx2 {

	public static void main(String[] args) {
		
		PriorityQueue<Employee> empQ = new PriorityQueue<Employee>();
		empQ.add(new Employee(201, "Sanjay", 60000.0));
		empQ.add(new Employee(12, "Kajol", 55170.0));
		empQ.add(new Employee(500, "Koushik", 800000.0));
		empQ.add(new Employee(423, "Shanthraj", 2000.0));
		empQ.add(new Employee(8, "Gaurav",25000.0));
		
		System.out.println(empQ);

	}

}
