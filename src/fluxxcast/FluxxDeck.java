package fluxxcast;

import java.util.Stack;


public class FluxxDeck
{
    Stack<Card> drawPile;
    Stack<Card> discardPile;
    
    public FluxxDeck()
    {
        drawPile = new Stack<>();
        
        // Should get all of the card enums and add them.
        Card[] temp = Card.values();
        for (Card c : temp)
        {
            drawPile.add(c);
        }
        
        discardPile = new Stack<>();
    }
    
    public Card draw()
    {
        // If draw pile is empty, reshuffle
        // discard pile into draw pile.
        if (drawPile.empty())
        {
            drawPile = discardPile;
            discardPile.clear();
            shuffle();
        }
        
        return drawPile.pop();
    }
    
    public void discardCard(Card discard)
    {
        discardPile.push(discard);
    }
    
    public void shuffle()
    {
        Card[] tempArray;
        tempArray = (Card[])drawPile.toArray();
        
        // Fisher–Yates shuffle algorithm.
        for (int i = tempArray.length - 1; i >= 1; i--)
        {
            int rand = (int)(Math.random() * i + .5);
            Card temp = tempArray[i];
            tempArray[i] = tempArray[rand];
            tempArray[rand] = temp;
        }
    }
}
