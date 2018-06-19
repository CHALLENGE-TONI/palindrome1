ENGLISH
 A palindrome is a string of letters which, read backwards, is exactly the same as read forward (e.g., Otto, mount, shelf shelf).
It is mainly distinguished between the word palindromes (see above) and sentence palindromes. Examples of sentence palindromes (punctuation and special characters are not used):
Never lay rape next to asparagus! Erika fires only unfaithful fakirs. A man, a plan, a canal - Panama! Madam, I'm Adam.
Create the class PalindromeTest with the following public interface:
//test if text is a senctence palindrome
public static boolean isPalindrome (String text)
The isPalindrome method recursively determines whether the text passed as a parameter is a palindrome. It only depends on letters, i. punctuation marks, special characters, numbers, spaces and capitalization are not to be observed
By means of the class SentenceTool a text from a text file should be read in and saved as a list of sentences. A sentence is completed by a dot, a call sign or a question mark.
public class SentenceTool {
//constructor: reads a textfile with given filename
// and creates a list of all sentences in this textfile public SentenceTool (String fileName)
//returns the number of sentences in this sentence list public int size()
//returns the next sentence
//returns null if there is no more sentence public String nextSentence();
//test if there exists a next sentence public boolean hasNextSentence();
}
The demo program PalindromeDemo tests the correct functionality of the classes and methods specified above, in which various text files are analyzed. That a text file is broken down into individual sentences and each sentence is to be tested. All sentences that are a palindrome are output in the original version (with punctuation, spaces).
Can you also consider the following extension (can also be implemented): for each sentence is also the line number in which it begins to save. This can be used, for example, to be able to specify the line number when outputting palindromes so that they can be found more quickly in the original text.
The demo program PalindromeDemo tests the correct functionality of the classes and methods specified above, in which various text files are analyzed. That a text file is broken
 down into individual sentences and each sentence is to be tested. All sentences that are a palindrome are output in the original version (with punctuation, spaces).
Can you also consider the following extension (can also be implemented): for each sentence is also the line number in which it begins to save. This can be used, for example, to be able to specify the line number when outputting palindromes so that they can be found more quickly in the original text.


DEUTSCH
Ein Palindrom ist eine Buchstabenfolge, welche rückwärts gelesen genau gleich lautet wie vorwärts gelesen (z. B. Otto, Reittier, Regalnebenlager).
Es wird vor allem zwischen Wortpalindromen (siehe oben) und Satzpalindromen unterschieden. Beispiele für Satzpalindrome (Satz- und Sonderzeichen werden nicht verwendet):
Nie leg Raps neben Spargel ein!
Erika feuert nur untreue Fakire.
A man, a plan, a canal – Panama!
Madam, I'm Adam.
ErstelledieKlassePalindromeTestmitfolgende öffentlicheSchnittstelle:
//test if text is a senctence palindrome
public static boolean isPalindrome (String text)
Die Methode isPalindrome soll rekursiv feststellen, ob der als Parameter übergebene text ein Palindrom ist. Dabei kommt es nur auf Buchstaben an, d.h. satzzeichen, sonderzeichen, Ziffern, Leerzeichen und Groß-/Kleinschreibung sind nicht zu besachten.
  Mittels der Klasse SentenceTool soll ein Text aus einer Textdatei eingelesen und als Liste von Sätzen gespeichert werden. Ein Satz wird durch einen Punkt, ein Rufzeichen oder ein Fragezeichen abgeschlossen.
public class SentenceTool {
//constructor: reads a textfile with given filename
// and creates a list of all sentences in this textfile public SentenceTool (String fileName)
//returns the number of sentences in this sentence list public int size()
//returns the next sentence
//returns null if there is no more sentence public String nextSentence();
//test if there exists a next sentence public boolean hasNextSentence();
}

Mit dem Demoprogramm PalindromeDemo ist die richtige funktionalität oben angegebener Klassen und Methoden zu testen, in dem verschiedene Textdateien analysiert werden. D.h. eine Textdatei wird in einzelne Sätze zerlegt und jeder Satz ist zu testen. Alle Sätze, welche ein Palindrom sind, werden in der Originalfassung (mit Satzzeichen, Leerzeichen) ausgegeben.
Kannst du Überlegen auch folgende Erweiterung (kann auch implementiert werden): zu jedem Satz ist auch die Zeilennummer, in welcher er beginnt, zu speichern. Dies kann etwa genutzt werden, um bei der Ausgabe von Palindromen auch die Zeilennummer angeben zu können, damit sie schneller im Originaltext zu finden sind.
