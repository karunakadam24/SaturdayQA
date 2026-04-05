package encapsulation;

public class CubeSqureNo {
	private int num;
	private int square;
	private int num2;
	private int cube;

	public void setNum(int num) {

		int square = num * num;

		this.num = num;
		this.square = square;
	}

	public int getNum() {
		return square;
	}

	public void setNum2(int num2) {
		int cube = num2 * num2 * num2;
		this.num2 = num2;
		this.cube = cube;
	}

	public int getNum2() {
		return cube;
	}

}
