package encapsulation;

public class mainclass {
	public static void main(String[] args) {
		
	
//	person per= new person();
//	per.setAge(24);
//	per.setName("Karuna Kadam");
//	System.out.println("age = "+ per.getAge());
//	System.out.println("Name =" + per.getName());
//	
//BankAcc bank = new BankAcc();
//bank.setDeposit(3000);
//bank.setWidraw(1500);
//System.out.println("Deposited =" + bank.getDeposit());
//System.out.println ("widraw money =" + bank.getWidraw());
//System.out.println("chake balance =" + bank.chake());
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