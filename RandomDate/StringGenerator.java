package RandomDate;

import java.util.Random;

public class StringGenerator {
	private static final String ALPHA = "AaBbCcDcEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";

	public static String generateString(int minLen, int maxLen) {
		if (minLen > maxLen)
			throw new IllegalArgumentException("Min. Length > Max. Length!");
		Random rnd = new Random();
		int len = rnd.nextInt(maxLen - minLen + 1) + minLen;
		char[] str = new char[len];
		for (int i = 0; i < len; i++) {
			str[i] = ALPHA.charAt(rnd.nextInt(ALPHA.length()));
		}
		return new String(str);
	}
}
