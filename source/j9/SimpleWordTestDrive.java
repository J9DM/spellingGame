package j9;

public class SimpleWordTestDrive {

    public static void main(String[] args) {
        String myWord = "test";
        SimpleWord word = new SimpleWord(myWord);
        
        // Get spelling word.
        String wordToGuess = word.getSpelling();
        System.out.println(("Spell the word: " + wordToGuess));
        
        // Make fake user guesses.
        String userInput;
        
        userInput = "badGuess";
        String result = word.checkSpelling(userInput);
        System.out.println(result);
        
        userInput = "test";
        result = word.checkSpelling(userInput);
        System.out.println(result);
        
        int numGuesses = word.getNumGuesses();
        
        System.out.println("Number of attempts: " + numGuesses);
        
    }
}