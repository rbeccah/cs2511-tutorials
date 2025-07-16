package thrones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import thrones.characters.Dragon;
import thrones.characters.King;
import thrones.characters.Queen;
import thrones.characters.metal.MetalDragon;
import thrones.characters.plastic.PlasticQueen;
import thrones.characters.wood.WoodKing;
import thrones.decorators.ChainMailDecorator;
import thrones.factories.CharacterFactory;
import thrones.factories.MetalFactory;
import thrones.factories.PlasticFactory;
import thrones.factories.WoodFactory;

/**
 * Plays the game with a command line interface.
 * 
 * @author Nick Patrikeos
 */
public class Game {
    private List<Character> characters = new ArrayList<Character>();
    private int dimension;
    // CharacterFactory

    public Game(int dimension) {
        this.dimension = dimension;
    }

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

    public int getDimension() {
        return dimension;
    }

    public static void main(String[] args) {
        Game game = new Game(10);

        CharacterFactory metalCharacterFactory = new MetalFactory(game.getDimension());
        CharacterFactory woodCharacterFactory = new WoodFactory(game.getDimension(), 2);
        CharacterFactory plastiCharacterFactory = new PlasticFactory(game.getDimension(), 2);

        King k = woodCharacterFactory.createKing();
        game.addCharacter(k);

        Dragon d = metalCharacterFactory.createDragon();
        // Wrap the chain mail around the dragon
        ChainMailDecorator cm = new ChainMailDecorator(d);
        game.addCharacter(cm);

        Queen q = plastiCharacterFactory.createQueen();
        game.addCharacter(q);

        game.play();
    }
}
