import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Table {
    /**
     * Total number of player. Use this variable whenever possible
     */
    private final int NUM_OF_PLAYERS;
    /**
     * Total number of cards used in this game. Use this variable whenever possible
     */
    public static final int TOTAL_NUMBER_OF_CARD = 104;
    /**
     * Total number of turns in the game. Use this variable whenever possible
     */
    public static final int TOTAL_NUMBER_OF_TURN = 10;


    /**
     * The four stacks of cards on the table.
     */
    private Card[][] stacks = new Card[4][6];
    /**
     * This number of cards of each stack on the table. For example, if the variable
     * stacks stores
     * -------------------------
     * | 0 | 10 13 14 -- -- -- |
     * | 1 | 12 45 -- -- -- -- |
     * | 2 | 51 55 67 77 88 90 |
     * | 3 | 42 -- -- -- -- -- |
     * -------------------------
     * 
     * stacksCount should be {3, 2, 6, 1}.
     * 
     * You are responsible to maintain the data consistency.
     */
    private final int[] stacksCount = new int[4];
    /**
     * The array of players
     */
    private final Player[] players;
    /**
     * Name of players
     */
    private final String[] NAMES = { "Kevin", "Mandel", "Rachel", "SparePlayer 1", "SparePlayer 2" }; //in case you want to try more than 3 players

    /**
     * Default constructor
     * 
     * In the constructor, you should perform the following tasks:
     * 
     * 1. Initialize cards for play. You should construct enough number of cards
     * to play. These cards should be unique (i.e., no two cards share the same
     * number). The value of card must be between 1 to 104. The number of bullHead
     * printed on each card can be referred to the rule.
     * 
     * 2. Initialize player. The name of the players should follows the variable NAMES
     * 
     * 3. Deal randomly 10 cards to each player. A card can only be dealt to one
     * player. That is, no two players can have the same card.
     * 
     * 4. Deal a card on each stack. The card dealt on the stack should not be dealt
     * to any player. Card dealt on each stack should also be unique (no two stack
     * have the same card).
     *
     * @param numOfPlayers - the number of players in the game. Normally 3 to 5 players.
     *
     */
    public Table(int numOfPlayers) {
        if (numOfPlayers < 3 || numOfPlayers > 5) {
            throw new IllegalArgumentException("Number of players must be between 3 and 5.");
        }
        //TODO
    }

    /**
     * This method is to find the correct stack that a card should be added to
     * according to the rule.
     * It should return the stack among which top-card of that stack is the largest
     * of those smaller than
     * the card to be placed. (If the rule sounds complicate to you, please refer to
     * the game video.)
     * 
     * In case the card to be place is smaller than the top cards of all stacks,
     * return -1.
     * 
     * @param card - the card to be placed
     * @return the index of stack (0,1,2,3) that the card should be place or -1 if
     *         the card is smaller than all top cards
     */
    public int findStackToAdd(Card card) {
        //TODO
    }

    /**
     * To print the stacks on the table. Please refer to the demo program for the
     * format.
     * Within each stack, the card should be printed in ascending order, left to
     * right.
     * 
     * This method has been completed for you. Don't change it
     */
    public void print() {
        System.out.println("----------Table----------");
        for (int i = 0; i < 4; i++) {
            System.out.print("Stack " + i + ":");
            for (int j = 0; j < stacksCount[i]; j++) 
                stacks[i][j].print();
            System.out.println();
        }
        System.out.println("-------------------------");
    }

    /**
     * This method is the main logic of the game. You should create a loop for 10
     * times (running 10 rounds). In each round all players will need to play a
     * card. These cards will be placed to the stacks from small to large according
     * to the rule of the game.
     * 
     * In case a player plays a card smaller than all top cards, he will be
     * selecting one of the stack of cards and take them to his/her own score pile.
     *
     * This method has been completed for you. Don't change it
     */
    public void runApp() {
        for (int turn = 0; turn < 10; turn++) {
            actionForEachTurn();
        }
        System.out.println("\n\nGame Over. Final Result:");
        for (Player p : players) {
            System.out.println(p.getName() + " has a score of " + p.getScore());
            p.printPile();
        }
    }

    /**
     * This method is to perform the action of each turn. In each turn, all players will
     * play a card. These cards will be placed to the stacks from small to large according
     * to the rule of the game.
     *
     * In case a player plays a card smaller than all top cards, he will be
     * selecting one of the stack of cards and take them to his/her own score pile.
     *
     * Please refer to the demo programme for the details of the action of each turn.
     */
    private void actionForEachTurn() {
        //TODO
    }

    /**
     * Program main. Don't change
     * 
     * @param args - no use.
     */
    public static void main(String[] args) {
        new Table(3).runApp();
    }

 
}
