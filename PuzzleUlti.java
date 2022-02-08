import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

public class PuzzleUlti {

    public int[] getTenRolls() {
        Random ranMachine = new Random();
        int[] rolls = new int[10];
        
        for (int i = 0; i < rolls.length; i++){
            rolls[i] = ranMachine.nextInt(21) + 1;
        }

        return rolls;   

    }

    public char getRandomLetter() {
        Random ranMachine = new Random();
        char ranLetter = 'a';

        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        ranLetter = letters[ranMachine.nextInt(letters.length)];
        
        return ranLetter;

    }

    public String generatePassword(int charactersLength) {

        String ranString = "";

        for (int i= 0; i < charactersLength; i++){
            ranString += getRandomLetter();
        }

        return ranString;
    }

    public String[] getNewPasswordSet(int length) {

        String[] ranPass; 
        ranPass = new String[length];

        for (int i = 0; i < length; i++) {
            ranPass[i] = generatePassword(8);
        }

        return ranPass;

    }

}
