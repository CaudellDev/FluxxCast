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
    
    public Card playCard()
    {
        int selectedCard = 0;
        Card temp = hand.get(selectedCard);
        hand.remove(selectedCard);
        return temp;
    }
    
    public void draw(Card card)
    {
        hand.add(card);
    }
    
    public Card[] discard()
    {
        return null;
    }
    
    public LinkedList<Card> getTable()
    {
        return table;
    }
    
    public LinkedList<Card> getHand()
    {
        return hand;
    }
    
    public LinkedList<Card> getKeepers()
    {
        LinkedList<Card> result = new LinkedList<>();
        
        // Loop throught the table, adding only Keeper
        // cards to the result array.
        for (int i = 0; i < table.size(); i++)
        {
            FluxxCard tempCard = new FluxxCard(table.get(i));
            if (tempCard.getCardType() == CardType.KEEPER);
            {
                result.add(tempCard.getEnumCard());
            }
        }
        
        return result;
    }
    
    public LinkedList<Card> getCreepers()
    {
        LinkedList<Card> result = new LinkedList<>();
        
        // Loop throught the table, adding only Creeper
        // cards to the result array.
        for (int i = 0; i < table.size(); i++)
        {
            FluxxCard tempCard = new FluxxCard(table.get(i));
            if (tempCard.getCardType() == CardType.CREEPER);
            {
                result.add(tempCard.getEnumCard());
            }
        }
        
        return result;
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
    
    @Override
    public String toString()
    {
        String result = "";
        
        result += name;
        
        
        return result;
    }
}
