
public class Doggo {

	public static void main(String[] args) {
		doggoInput(21);
	}
	
	public static void doggoInput(int input) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i * 10 + j != input - 1) {
					if (j == 0 && i != 1) {
						System.out.print(i * 10 + j + 1 + "st, ");
					} else if (j == 1 && i != 1) {
						System.out.print(i * 10 + j + 1 + "nd, ");
					} else if (j == 2 && i != 1) {
						System.out.print(i * 10 + j + 1 + "rd, ");
					} else if (i * 10 + j + 1 == 100) {
						System.out.print(i * 10 + j + 1 + "th");
					} else {
						System.out.print(i * 10 + j + 1 + "th, ");
					}
				}
			}
			System.out.println("");
		}
	}
}
