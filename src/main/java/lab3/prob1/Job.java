package lab3.prob1;

public class Job {
	
	private double salary;
	
	public double getSalary() {
		return salary;
	}


	public Job(double salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object aPerson) {
		if (aPerson == null) return false;
		if(!(aPerson instanceof Job)) return false;
		Job p = (Job) aPerson;
		boolean isEqual = this.getSalary() == p.getSalary();
		return isEqual;
	}

	public static void main(String[] args) {
		Person p1 = new Person("Joe", null);
		Person p2 = new Person("Joe", null);

		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}


}
