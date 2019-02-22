
public class TextFormater {

	public String format(String text, int n) {
		StringBuilder formatedText = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			for (int j = 0; j < n; j++) {
				formatedText.append(text.charAt(i));
			}
			formatedText.append("\n");
		}
		return formatedText.toString();
	}
}