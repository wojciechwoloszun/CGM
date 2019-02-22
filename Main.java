import java.util.Scanner;

public class Main {
	
	private static final int NUMBER_OF_COLUMNS =2;

	public static void main(String[] args) {
		String text = readTextFromConsole();
		displayTextInColumns(text,NUMBER_OF_COLUMNS);
		
	}

	private static String readTextFromConsole() {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		scanner.close();
		return text;
	}

	private static void displayTextInColumns(String text,int n) {
		TextFormater textFormater = new TextFormater();
		String str = textFormater.format(text, n);
		System.out.print(str);
	}

}