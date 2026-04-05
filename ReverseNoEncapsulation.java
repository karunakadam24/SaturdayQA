package encapsulation;

public class ReverseNoEncapsulation {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {

		int reverse = 0;
		int num2 = 0;
		while (num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
			num2 = reverse;
			this.num = num2;

		}

	}
}
