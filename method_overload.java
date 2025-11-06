package advance_java;



class shape{
	int shape(int l,int b) {
		return l*b;
	}
	float shape(float r) {
		return (float) (3.14*r*2);
	}
	String shape() {
		
		return "NILL>>>>>>>";
	}
	int shape(int a,int b,int c) {
		return a+b+c;
	}
	
}
public class method_overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape sh=new shape();
		System.out.println(sh.shape(1,2,3));
		System.out.println(sh.shape(34,20));
		System.out.println(sh.shape(3));
		System.out.println(sh.shape());
	}

}
