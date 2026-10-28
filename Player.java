import java.util.Scanner;

public class Player {
    /**
     * The cards held on a player hand
     */
    private Card[] hand;
    /**
     * The number of card held by the player. This variable should be maintained
     * to match array hand.
     */
    private int handCount;
    /**
     * A dynamic array that holds the score pile.
     */
    private Card[] pile;
    /**
     * The name of the player
     */
    private String name;
    /**
     * Other constructor that specify the name of the player.
     * 
     * You need to initialize your data member properly.
     */
    public Player(String name) {
        //TODO

    }


    /**
     * Getter of name
     * 
     * @return - the name of the player
     */
    public String getName() {
        //TODO
    }

    /**
     * This method is called when a player is required to take the card from a stack
     * to his score pile. The variable pile should be treated as a dynamic array so
     * that the array will auto-resize to hold enough number of cards. The length of
     * pile should properly record the total number of cards taken by a player.
     * 
     * Important: at the end of this method, you should also help removing all cards
     * from the parameter array "cards".
     * 
     * @param cards - an array of cards taken from a stack
     * @param count - number of cards taken from the stack
     */
    public void moveToPile(Card[] cards, int count) {
        //TODO
    }


    /**
     * Do not change this method. This method has no use other than relaying
     * request in this assignment. It has more functions in the next assignment.
     */
    public int pickStackToCollect(Card[][] stacks) {
        return pickStackToCollect();
    }
    /**
     * Ask the player to select a stack to collect. The stack number must be 
     * between 0 to 3. If the player enters an invalid number, you should keep asking
     * the player to enter a valid number.
     */
    private int pickStackToCollect() {
        //TODO
    }

    /**
     * To print the score pile. This method has been completed for you
     * 
     * You don't need to modify it and you should not modify it.
     */
    public void printPile() {
        for (Card c : pile) {
            c.print();
        }
        System.out.println();
    }

    /**
     * This is a getter of hand's card. This method has been completed for you
     * We will use this method to test your code. 
     * 
     * You don't need to modify it and you should not modify it.
     * @param index - the index of card to take
     * @return - the card from the hand or null
     */
    public Card getHandCard(int index) {
        if (index < 0 || index >= handCount) 
            return null;
        return hand[index];
    }


    /**
     * This method prompts a human player to play a card. It first print
     * all cards on his hand. Then the player will need to select a card
     * to play by entering the value of the card.
     * 
     * After playing a card, the card should be removed from the hand.
     * The handcount should be updated accordingly. 
     * 
     * If a player enters an invalid card, you should keep asking the 
     * player to enter a valid card.
     * 
     * The order of the cards on the hand should be maintained after 
     * a card is played. i.e., if the player has cards 1, 2, 3, 4, 5 
     * and he plays card 3, the order of the cards on the hand should 
     * be 1, 2, 4, 5. NOT i, 2, null, 4, 5.
     * 
     * 
     * @return - the card to play
     */
    public Card playCard() {
        //TODO
    }


    /**
     * Deal a card to a player. This should add a card to the variable hand and
     * update the variable handCount. During this method, you do not need to resize
     * the array. You can assume that a player will be dealt with at most 10 cards.
     * That is, the method will only be called 10 times on a player.
     * 
     * After each call of this method, the hand should be sorted properly according
     * to the number of the card.
     * 
     * @param card - a card to be dealt
     */
    public void dealCard(Card card) {
        //TODO
   }

    /**
     * Get the score of the player by counting the total number of Bull Head in the
     * score pile.
     * 
     * @return - score, 0 or a positive integer
     */
    public int getScore() {
        //TODO
    }


    /**
     * Given Print hand
     * Don't change this method
     *
     */
    private void printHand() {
        System.out.println("----------" + name + "'s Hand----------");
        for (int i = 0; i < handCount; i++) {
            hand[i].print();
            System.out.print("\t");
            if (i % 5 == 4 || i == handCount - 1)
                System.out.println();
        }

    }



}
