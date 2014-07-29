package fluxxcast;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class FluxxPlayer
{
    String name;
    private LinkedList<Card> hand;
    private LinkedList<Card> table;
    
    public FluxxPlayer(String name)
    {
        this.name = name;
        hand = new LinkedList<>();
        table = new LinkedList<>();
    }
    
    public void addToTable(Card enumCard)
    {
        table.add(enumCard);
    }
    
    public void addToTable(Card[] enumCards)
    {
        for (int i = 0; i < enumCards.length; i++)
        {
            table.add(enumCards[i]);
        }
    }
    
    public LinkedList<Card> getTable()
    {
        return table;
    }
    
    public Card playCard()
    {
        int selectedCard = 0;
        Card temp = hand.get(selectedCard);
        hand.remove(selectedCard);
        return temp;
    }
    
    public Card[] discard()
    {
        return null;
    }
    
    public void draw(Card card)
    {
        hand.add(card);
    }
    
    @Override
    public String toString()
    {
        String result = "";
        
        result += name;
        
        
        return result;
    }
}
