package encapsulation;

public class mainclass {
	public static void main(String[] args) {
		
	

		ReverseNoEncapsulation rev = new ReverseNoEncapsulation ();
		rev.setNum(1234);
		System.out.println("reverse number =" + rev.getNum());
		PrimeNoEncapsulation prime = new PrimeNoEncapsulation();
		prime.setNum(23);
		System.out.println(prime.getNum());
		CubeSqureNo cs = new CubeSqureNo ();
		cs.setNum(5);
		cs.setNum2(3);
		System.out.println("square of num = "+  cs.getNum());
		System.out.println("cube of num =" + cs.getNum2());
}
	}
