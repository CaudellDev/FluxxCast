/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fluxxcast;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Tyler
 */
public class FluxxGame
{
    // Prints to the console what's going on.
    private boolean debug;
    
    private FluxxDeck deck;
    private Card goal;
    private Card goal2; // Only used with Double Agenda.
    private LinkedList<Card> rules;
    private Queue<FluxxPlayer> players;
    
    private FluxxPlayer currPlayer;
    private int cardsUsed;
    public final static int noLimit = -1;
    
    // To handle the ever-changing rules.
    private int shuffleCount;
    private int playCount; // Play all == 200 count.
    private int drawCount;
    private int handLimit;
    private int keeperLimit;
    private int inflation;
    private boolean silverLining;
    private boolean poorBonus;
    private boolean richBonus;
    private boolean partyBonus;
    private boolean noHandBonus;
    private boolean firstPlayRnd;
    private boolean getOnWithIt;
    private boolean doubleAgenda;
    private boolean needBakedPotato;
    
    public FluxxGame(String[] playerNames)
    {
        init(); // Initialize all the values.
        deck.shuffle();
        
        // Make all the players.
        FluxxPlayer[] temp = new FluxxPlayer[playerNames.length];
        for (int i = 0; i < playerNames.length; i++)
        {
            temp[i] = new FluxxPlayer(playerNames[i]);
        }
        
        // Draw cards and give them to each player.
        for (int c = 0; c < 7; c++)
        {
            for (FluxxPlayer temp1 : temp)
            {
                temp1.draw(deck.draw());
            }
        }
        
        for (int i = 0; i < playerNames.length; i++)
        {
            players.add(temp[i]);
        }
        
        currPlayer = players.poll();
    }
    
    public boolean isWinner()
    {
        if (goal == Card.TEN_CARDS || goal2 == Card.TEN_CARDS)
        {
            // Get hand sizes.
        }
        
        if (goal == Card.FIVE_KEEPERS || goal2 == Card.FIVE_KEEPERS)
        {
            // Get table sizes.
        }
        
        return false;
    }
    
    /**
     * This method initiates the start of currPlayers turn.
     * 
     */
    public void doTurn()
    {
        // Announce players turn.
        
        // Get all the cards needed.
        Card[] drawed = new Card[drawCount + inflation];
        for (int i = 0; i < (drawCount + inflation); i++)
        {
            drawed[i] = deck.draw();
        }
        
        // Loop though and resolve all the card the player selects.
        // Should still work if playCount changes at all.
        for (int played = 0; played <= playCount; played++)
        {
            Card selectedCard = currPlayer.playCard();
            resolveCard(selectedCard);
            
            // Do something else?
        }
        
        
    }
    
    public void resolveCard(Card card)
    {
        resolveCard(new FluxxCard(card));
    }
    
    /**
     * Sorts out cards, and sends them to their coorosponding helper function, to get resolved.
     * 
     * @param card 
     */
    public void resolveCard(FluxxCard card)
    {
        // Add a class method to return the CardType,
        // instead of making a new object.
        switch (card.getCardType())
        {
            case ACTION:
                doAction(card.getEnumCard());
                break;
            case CREEPER:
                doCreeper(card.getEnumCard());
                break;
            case GOAL:
                doGoal(card.getEnumCard());
                break;
            case KEEPER:
                doKeeper(card.getEnumCard());
                break;
            case NEW_RULE:
                doNewRule(card.getEnumCard());
                break;
            case NO_CARD:
            default:
        }
    }
    
    private void doAction(Card card)
    {
        switch (card)
        {
            case JACKPOT:
                for (int i = 3; i > 0; i--)
                {
                    currPlayer.draw(deck.draw());
                }
            case DISCARD_DRAW:
            case DRAW2_USE:
            case DRAW3_PLAY2:
            case EVERY_GETS1:
            case EXCHANGE_KEEPERS:
            case LETS_DO_THAT_AGAIN:
            case LETS_SIMPLIFY:
            case NO_LIMITS:
            case ROTATE_HANDS:
            case RULES_RESET:
            case TAKE_ANOTHER_TURN:
            case TAXATION:
            case TRADE_HANDS:
            case TRASH_NEW_RULE:
            case USE_WHAT_YOU_TAKE:
            case CREEPER_SWEEPER:
            case TRASH_SOMETHING:
            case STEAL_SOMETIHNG:
            case MIX_IT_UP:
            case TODAYS_SPECIAL:
            case ITS_TRASH_DAY:
            default:
                break;
        }
    }
    
    private void doCreeper(Card card) {}
    private void doGoal(Card card) {}
    private void doKeeper(Card card) {}
    private void doNewRule(Card card) {}
    
    private void init()
    {
        deck = new FluxxDeck();
        goal = Card.NO_CARD;
        goal2 = Card.NO_CARD;
        rules = new LinkedList<>();
        players = new LinkedList<>();
        
        players = new LinkedList<>();
        currPlayer = null;
        cardsUsed = 0;
        
        shuffleCount = 1;
        playCount = 1;
        drawCount = 1;
        handLimit = noLimit;
        keeperLimit = noLimit;
        inflation = 0;
        silverLining = false;
        poorBonus = false;
        richBonus = false;
        partyBonus = false;
        noHandBonus = false;
        firstPlayRnd = false;
        getOnWithIt = false;
        doubleAgenda = false;
        needBakedPotato = false;
    }
}
