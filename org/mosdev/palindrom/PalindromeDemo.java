package org.mosdev.palindrom;

public class PalindromeDemo {

    public static void main(String[] args) {
        SentenceTool sentenceTool = new SentenceTool("D:\\Temp\\extradoc.txt");

        while (sentenceTool.hasNextSentence()) {
            String rawInput = sentenceTool.nextSentence();
            if (PalindromTest.isPalindrome(rawInput)) {
                System.out.println(sentenceTool.getCurrentLineNumber() + " " + rawInput);
            }
        }
    }
}
