public class Sentence {
    private String sentence;
    private boolean countedWords = false;
    private int wordsNumber = 0;

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public int countWordInstances(String word) {
        int result = 0;
        
        if (sentence == null) return result; 
        if (word == null || word.isEmpty()) return result; 
        
        int left = sentence.indexOf(word);
        while(left >= 0) {
            result++;
            left = sentence.indexOf(word, left + 1);
        }
    
        return result;
    }

    public int countWords() {
        if ((this.sentence == null) || (this.sentence.isEmpty())) return 0;
        
        Sentence preprocessed = new Sentence(this.sentence.trim().replaceAll("( )+", " "));
        
        wordsNumber = preprocessed.countWordInstances(" ") + 1;
        countedWords = true;

        return wordsNumber;
    }

    public int[] countVowels() {
        int[] vowelCounts = new int[6];
        
        if ((this.sentence == null) || (this.sentence.isEmpty())) return vowelCounts;
        
        String preprocessed = this.sentence.toLowerCase();
    
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        
        for (int c = 0; c < preprocessed.length(); c++) {
            char charAt = preprocessed.charAt(c);

            for (int v = 0; v < vowels.length; v++) {
                if (charAt == vowels[v]) {
                    vowelCounts[v]++;
                    break;
                }
            }
        }
        
        return vowelCounts;
    }

    public int getWordsNumber() {
        if (!this.countedWords) {
            System.out.println("Words not counted!");
            return 0;
        }

        return this.wordsNumber;
    }

    public String getSentence() {
        return this.sentence;
    }
}
