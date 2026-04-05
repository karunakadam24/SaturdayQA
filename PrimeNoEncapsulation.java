package encapsulation;

public class PrimeNoEncapsulation {
	private int num;
	private int count;

	public void setNum(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				count++;
			}

		}
		this.num = num;
		this.count = count;

	}

	public int getNum() {
		if (count == 2) {
			System.out.println("Prime number ="  +num);

		} else {
			System.out.println("not Prime No =" + num);
		}
		return num;

	}

}
