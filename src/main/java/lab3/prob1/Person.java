package lab3.prob1;

/*

	Converting PersonWithJob into a Job object and removing the inheritance then by implementing composition
	I was able to implement a better equals method inside the Person object.

 */
public class Person {

	private String name;
	private Job job;

	public Person(String name, Job job) {
		this.name = name;
		this.job = job;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof Person)) return false;
		Person p = (Person)aPerson;
		Boolean isEquals = this.name.equals(p.name) && this.job == p.job || (this.job != null && this.job.equals(p.job));

		return isEquals;
	}

	public static void main(String[] args) {
		
	}

}
