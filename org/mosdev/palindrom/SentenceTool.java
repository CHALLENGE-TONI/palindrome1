package org.mosdev.palindrom;

import java.io.*;

// Load sentences from text file
public class SentenceTool {

    private int size;   Contains array length after loading file.
    private String[] sentences; // Array with sentences
    private int currentIndex;  // index for nextSentence()

    // Constructor
    public SentenceTool(String fileName) {
        this.currentIndex = 0;
        String inputString = "";
        
        // Loading sentences from file
        File file = new File(fileName);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

            // Close file
            br.close();
            
            // Get input from StringBuilder
            inputString = sb.toString();

            // Split to array by checking for !?.
            this.sentences = inputString.split("[!?.]");
            
            // Save size in variable size. Note, possible were to get the length from array to, without this variable!
            this.size = this.sentences.length;
        } catch (IOException ex) {
            // Error by, file not exists etc.
            System.err.println(ex.toString());
        }
    }

    // Returns size from sentences array
    public int getSize() {
        return size;
    }

    // Get next Sentences and increment cursor index.
    public String nextSentence() {
        return sentences[currentIndex++];
    }

    // Returns true, when cursor index is smaler than array length - 1
    public boolean hasNextSentence() {
        return currentIndex < size - 1;
    }

    // Returns cursor index (Index +1, because first line were 0
    public int getCurrentLineNumber() {
        return currentIndex + 1;
    }
}
