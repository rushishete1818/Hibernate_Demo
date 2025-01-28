import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Samsung {
     
	@Id
	int empid;
	String name;
	int salary;
	public Samsung() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Samsung(int empid, String name, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Samsung [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
