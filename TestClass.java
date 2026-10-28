import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


/**
 * This file is used for testing your code. You can ignore the entire file during your development
 * You can click the button next to TestClass to test your code.
 *
 * This is also how we are going to grade your work! Of course, there will be more test cases
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestClass {
    
    private static ByteArrayOutputStream out;
    @BeforeAll
    public static void setup() {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }


    @Test
    @Order(3)
    void testGetName3() {
        Player p = new Player("Kevin");
        assertTrue(p.getName().equals("Kevin"));
    }


    @Test
    void testGetScore() {
        Player p = new Player("Tmp");
        p.moveToPile( new Card[] {new Card(10)} , 1);
        assert(p.getScore() == 3);
    }


    @Test
    void testDealCard() {
        Player p = new Player("Tmp");
        p.dealCard(new Card(4));
        p.dealCard(new Card(5));

        assert(p.getHandCard(0).getNumber() == 4);
        assert(p.getHandCard(1).getNumber() == 5);
    }

    @Test
    void testDealCard2() {
        Player p = new Player("Tmp");
        p.dealCard(new Card(4));
        p.dealCard(new Card(7));
        p.dealCard(new Card(5));

        assert(p.getHandCard(0).getNumber() == 4);
        assert(p.getHandCard(1).getNumber() == 5);
        assert(p.getHandCard(2).getNumber() == 7);
    }

    @Test
    void testTakeCard() throws Exception {
        Player p = new Player("tmp");
        Card[] cards = {new Card(4), new Card(6), new Card(8), null, null, null};
        p.moveToPile(cards, 3);
        out.flush();
        out.reset();
        p.printPile();
        String pile = out.toString().trim();
        assertTrue(pile.contains("4(1)"));
        assertTrue(pile.contains("6(1)"));
        assertTrue(pile.contains("8(1)"));
        assertEquals(pile.length(), 12);
    }

    @Test
    void testTakeCard2() throws Exception {
        Player p = new Player("tmp");
        Card[] cards = {new Card(4), new Card(6), new Card(8), null, null, null};
        p.moveToPile(cards, 3);
        assertArrayEquals(cards, new Card[6]);
    }

    @Test
    void testTakeCard3() throws Exception {
        Player p = new Player("tmp");
        Card[] cards = {new Card(4), new Card(6), new Card(8), null, null, null};
        Card[] cards2 = {new Card(1), new Card(12), new Card(14), null, null, null};
        p.moveToPile(cards, 3);
        p.moveToPile(cards2, 3);
        out.flush();
        out.reset();
        p.printPile();
        String pile = out.toString().trim();
        assertTrue(pile.contains("4(1)"));
        assertTrue(pile.contains("6(1)"));
        assertTrue(pile.contains("8(1)"));
        assertTrue(pile.contains("1(1)"));
        assertTrue(pile.contains("12(1)"));
        assertTrue(pile.contains("14(1)"));
        assertEquals(pile.length(), 26);
    }

}
