package org.mosdev.palindrom;

public class PalindromTest {

    // Returns true, when text is a palindrome
    public static boolean isPalindrome (String text) {
        // Remove all spaces, .?! and other chars from String. Note: replaceAll with regex were better
        String preparedText = text.trim().toLowerCase().replace(",", "").replace(" ", "").replace("-", "").replace("â€“", "").replace("ã¤", "ä");
        
        // Set result as true
        boolean result = true;

        // Loop the whole perparedText and check left and right char at index position
        for (int index = 0; index < preparedText.length(); index ++) {            
            char left = preparedText.charAt(index); // start from left side of String
            char right = preparedText.charAt(preparedText.length() - index - 1); // start from left side of String, subtract index and subtract -1, because when index is 0, and you try to get char at last position it is out of bounce!

            // Is left char and right char equal?
            if (left != right) {
                // No
                result = false;
                // Don't finish the loop
                break;
            }
        }

        return result;
    }
}
