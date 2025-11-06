package advance_java;
class student{
	private String name;
	private int age;
	
	public void setname(String n,int a) {
		this.name=n;
		this.age=a;
	}
	public String getname() {
		return name;
	}
	public int getage() {
		return age;
	}
}
public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student st=new student();
		st.setname("Dinesh", 22);
		System.out.println("name:"+st.getname());
		System.out.println("age:"+st.getage());
	}

}
