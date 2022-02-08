import java.util.Arrays;

public class PuzzleJava {
    public static void main(String[] args) {
        PuzzleUlti puzzle = new PuzzleUlti();

        for (int i =0; i < puzzle.getTenRolls().length; i++){
            System.out.println(puzzle.getTenRolls()[i]);
        }

        System.out.println(puzzle.getRandomLetter());

        System.out.println(puzzle.generatePassword(8));

        System.out.println(Arrays.toString(puzzle.getNewPasswordSet(10)));
    }
}