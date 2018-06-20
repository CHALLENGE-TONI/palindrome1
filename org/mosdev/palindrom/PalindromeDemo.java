package org.mosdev.palindrom;

public class PalindromeDemo {

    public static void main(String[] args) {
        // Create an instance of SentenceTool. Paramether is set to inputfile
        SentenceTool sentenceTool = new SentenceTool("D:\\Temp\\extradoc.txt");

        // Loop, while sentenceTool has content in array
        while (sentenceTool.hasNextSentence()) {
            // Save rawInput
            String rawInput = sentenceTool.nextSentence();
            
            // Is Palindrom?
            if (PalindromTest.isPalindrome(rawInput)) {
                // Yes, output lineNumber and Raw Sentence without ?!., because by splitting it were removed.
                System.out.println(sentenceTool.getCurrentLineNumber() + " " + rawInput);
            }
        }
    }
}
