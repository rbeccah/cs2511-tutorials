package thrones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import thrones.decorator.ChainMail;
import thrones.decorator.Helmet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private List<Character> characters = new ArrayList<Character>();

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;

        for (Character character : characters) {
            System.out.print("Move " + character + " to: ");
            String[] line = scanner.nextLine().split(" ");
            x = Integer.parseInt(line[0]);
            y = Integer.parseInt(line[1]);

            MoveResult result = character.makeMove(x, y, characters);

            if (result.equals(MoveResult.SUCCESS)) {
                System.out.println("Success! Character is now " + character);
            } else if (result.equals(MoveResult.INVALID)) {
                System.out.println("Invalid move.");
            } else if (result.equals(MoveResult.ATTACK)) {
                System.out.println("Attacked another character.");
            }
        }

        scanner.close();
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public static void main(String[] args) {
        Game game = new Game();
        Character king = EntityFactory.createKing();
        Character queen = EntityFactory.createQueen();
        game.play();

        // TODO: Construct 1 Queen wearing Helmet and Chainmail using the Decorator Pattern
        Character helmetedKing = new Helmet(king);
        helmetedKing.damage(5);
        Character helmetedChainMailKing = new ChainMail(helmetedKing);
    }
}