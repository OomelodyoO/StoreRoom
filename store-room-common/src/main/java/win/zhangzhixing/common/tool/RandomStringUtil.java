package win.zhangzhixing.common.tool;

import java.util.Random;

public class RandomStringUtil {
    private static final Random random = new Random();
    private static final String CHARS = "abcdefghijkmnpqrstuvwxyzABCDEFGHJKLMNPQRSTUVWXYZ23456789";
    private static final String NUM_CHARS = "1234567890";

    public static String generate(int length, boolean onlyNumber, boolean caseSensitive) {
        StringBuilder token = new StringBuilder(length);
        String genChars = onlyNumber ? NUM_CHARS : CHARS;
        for (int i = 0; i < length; i++) {
            token.append(genChars.charAt(random.nextInt(genChars.length())));
        }
        return caseSensitive ? token.toString() : token.toString().toUpperCase();
    }
}
