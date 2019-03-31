package j9;

public class SimpleWord {
    
    private String correctSpelling;
    private int numOfGuesses = 0;
    
    public SimpleWord(String spelling) {
        correctSpelling = spelling;
    } // close constructor
    
    public String getSpelling() {
        return correctSpelling;
    }
    
    public String checkSpelling(String userGuess) {
        numOfGuesses++;
        boolean correctResponse = userGuess.equals(correctSpelling);
        String result;
        
        if (correctResponse) {
            result = "correct";
        } else {
            result = "incorrect";
        }
        
        return result;
        
    } // close method
    
    public int getNumGuesses() {
        return numOfGuesses;
    } // close method
    
} // close class