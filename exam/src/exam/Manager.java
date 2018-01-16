package exam;

public class Manager extends Employee{
	public Manager(int name){
		super();
		super.amount=amount+5000;
	}
	public void print(){
		System.out.println(name+amount);
	}

}
