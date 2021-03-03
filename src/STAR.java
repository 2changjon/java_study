
public class STAR {

	public static void main(String[] args) {
	
		int j=4;
		
		for(int i=1; i<=7; i++) {
			for(int k=1; k<=4; k++) {
				if (k < j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			if (i < 4) {
				j--;
			}else {
				j++;
			}
			System.out.println();
		}
	}

}
