package PastPaperQuestions;

public class October2021P42Q1 {

	public static void main(String[] args) {
		
		System.out.println("10 and 15");
		System.out.println(IterativeUnknown (10,15));

		System.out.println("10 and 10");
		System.out.println(Unknown (10,10));
		
		System.out.println("15 and 15");
		System.out.println(Unknown (15,10));
	}
	
	public static int Unknown (int x, int y) {
		
		if (x < y) {
			System.out.println(x + y);
			return (Unknown(x+1, y) * 2);
		} else if (x == y) return 1;
		else {
			System.out.println(x + y);
			return (Unknown(x-1,y)/2);
		}
		
	}
	
	public static int IterativeUnknown (int x, int y) {
		
		int total = 0;
		
		if (x == y) return 1;
		else if (x < y) {
			do {
				x++;
				total = x + 1 + y;
				System.out.println(total);
			} while (x != y);
			return total;
		} else return 0;
		
	}

}
