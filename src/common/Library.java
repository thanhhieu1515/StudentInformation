
package common;


import java.util.Scanner;

public class Library {
	Scanner sc = new Scanner(System.in);

	public String getValue(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}

	public int getIntForMenu(String msg, int m, int n) {
		int a = -1;
		while (true) {
			System.out.print(msg);
			try {
				a = Integer.parseInt(sc.nextLine());
				if (a >= m && a <= n) {
					break;
				}
			} catch (Exception e) {
				System.out.println("Please enter a number between " + m + " and " + n);
			}
		}
		return a;
	}

	public int getInteger(String msg) {
		int a = -1;
		while (true) {
			System.out.println(msg);
			try {
				a = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Only input number");
				continue;
			}
			break;
		}
		return a;
	}

	
	
	public boolean checkInputYN() {
        while (true) {
            String result = sc.nextLine();
            if (result.length() == 1 && result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.length() == 1 && result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Re-input.");
        }
    }
}
