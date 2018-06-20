package org.mosdev.palindrom;

public class PalindromTest {

    public static boolean isPalindrome (String text) {
        String preparedText = text.trim().toLowerCase().replace(",", "").replace(" ", "").replace("-", "").replace("â€“", "").replace("ã¤", "ä");
        boolean result = true;

        for (int index = 0; index < preparedText.length(); index ++) {
            char left = preparedText.charAt(index);
            char right = preparedText.charAt(preparedText.length() - index - 1);

            if (left != right) {
                result = false;
                break;
            }
        }

        return result;
    }
}
