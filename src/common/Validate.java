
package common;

import java.util.Scanner;

public class Validate {
	Scanner sc = new Scanner(System.in);
	public int checkInputIntLimit(int min, int max) {
		while (true) {
			try {
				int result = Integer.parseInt(sc.nextLine());
				if (result < min || result > max) {
					throw new NumberFormatException();
				}
				return result;
			} catch (NumberFormatException ex) {
				System.err.println("Re-input");
			}
		}
	}

	public float checkInputFloat() {
		while (true) {
			try {
				float result = Float.parseFloat(sc.nextLine());
				return result;
			} catch (NumberFormatException ex) {
				System.err.println("Re-enter");
			}
			
		}
	}
	
	public  String checkInputString() {
        while (true) {
            String result = sc.nextLine();
            if (result.length() == 0) {
                System.err.println("Not empty.");
            } else {
                return result;
            }
        }
    }
}
