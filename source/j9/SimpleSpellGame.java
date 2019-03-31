package j9;

import java.util.*;

class SimpleSpellGame {
    
    public static void main(String[] args) {
        
        // Replace with list of spelling words.
        String[] list = {"one", "two", "three"};
        
        ArrayList<SimpleWord> words = new ArrayList<SimpleWord>();
        for (String element : list) {
            SimpleWord word = new SimpleWord();
            word.setSpelling(element);
            words.add(word);
        }
        
        // Create HashMap to store number of guesses for each word.
        HashMap<String, Integer> numGuesses = new HashMap<String, Integer>();
        
        // GameHelper to help with getting user input.
        GameHelper helper = new GameHelper();
        
        // Repeat until no more words in ArrayList.
        boolean wordsRemaining = true;
        while (wordsRemaining) {
            
            // Randomly select word from ArrayList.
            int randomNum = (int) (Math.random() * words.size());
            SimpleWord wordToGuess = words.get(randomNum);
            
            // Prompt user for a guess. Check guess against correct spelling.
            String spelled = wordToGuess.getSpelling();
            String userInput = helper.getUserInput(("Spell the word " + spelled));
            String result = wordToGuess.checkSpelling(userInput);
            
            // Remove correctly spelled word from ArrayList and store numOfGuesses.
            if (result.equals("correct")) {
                numGuesses.put(spelled, wordToGuess.getNumGuesses());
                words.remove(wordToGuess);
                System.out.println("You are correct.");
            } else {
                System.out.println("You are incorrect.");
            }
            
            if (words.isEmpty()) {
                wordsRemaining = false;
            }
        } // end while
        
        // Print user stats.
        System.out.println("Number of attempts: " + numGuesses);
        
    } // end method
} // end class