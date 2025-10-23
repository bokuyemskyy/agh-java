import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) { 
        Sentence sentence1 = new Sentence(" We watched flowers from  the window  of  the boat. ");
        System.out.println("Sentence is: \"" + sentence1.getSentence() + "\"");
        System.out.println("Count of \"the\": " + sentence1.countWordInstances("the"));
        System.out.println("Count of \"flowers\": " + sentence1.countWordInstances("flowers"));
        System.out.println("Count of \" \": " + sentence1.countWordInstances(" "));
        System.out.println("Count of words via words number (before): " + sentence1.getWordsNumber());
        System.out.println("Counting words: " + sentence1.countWords());
        System.out.println("Count of words via words number (after): " + sentence1.getWordsNumber());
        
        System.out.println("===============================");
        sentence1 = new Sentence("Angel fell from the sky.");
        System.out.println("New sentence is: \"" + sentence1.getSentence() + "\"");
        System.out.println("Vowel counts are: \"" + Arrays.toString(sentence1.countVowels()) + "\"");
        sentence1 = new Sentence("");
        System.out.println("New sentence is: \"" + sentence1.getSentence() + "\"");
        System.out.println("Vowel counts are: \"" + Arrays.toString(sentence1.countVowels()) + "\"");
    }
}
