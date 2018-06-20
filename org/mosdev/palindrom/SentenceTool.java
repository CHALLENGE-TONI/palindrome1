package org.mosdev.palindrom;

import java.io.*;

public class SentenceTool {

    private int size;
    private String[] sentences;
    private int currentIndex;

    public SentenceTool(String fileName) {
        this.currentIndex = 0;
        String inputString = "";
        File file = new File(fileName);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

            br.close();
            inputString = sb.toString();

            this.sentences = inputString.split("[!?.]");
            this.size = this.sentences.length;
        } catch (IOException ex) {
            System.err.println(ex.toString());
        }
    }

    public int getSize() {
        return size;
    }

    public String nextSentence() {
        return sentences[currentIndex++];
    }

    public boolean hasNextSentence() {
        return currentIndex < size - 1;
    }

    public int getCurrentLineNumber() {
        return currentIndex;
    }
}
