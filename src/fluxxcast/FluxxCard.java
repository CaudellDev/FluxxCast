package fluxxcast;

enum CardType
{
    NO_CARD,
    KEEPER,
    CREEPER,
    ACTION,
    NEW_RULE,
    GOAL,
}

enum Card
{
    NO_CARD,
    TAXES, // Creepers
    WAR,
    RADIO_POTATO,
    DEATH,
    BRAIN, // Keepers
    BREAD,
    CHOCOLATE,
    COOKIES,
    COSMOS,
    DREAM,
    LOVE,
    MILK,
    MONEY,
    MOON,
    PEACE,
    ROCKET,
    SLEEP,
    SUN,
    TELEV,
    TIME,
    TOASER,
    EYE,
    PARTY,
    TEN_CARDS, // Goals
    FIVE_KEEPERS,
    ALL_NEED_LOVE,
    APPLIANCES,
    BAKED_GOODS,
    BED_TIME,
    BRAIN_NO_TV,
    CHOCO_COOKIES,
    CHOCO_MILK,
    DEATH_CHOCO,
    DREAMLAND,
    HEARTS_MINDS,
    HIPPY,
    MILK_COOKIES,
    NIGHT_DAY,
    PEACE_NO_WAR,
    ROCKET_SCIENCE,
    ROCKET_MOON,
    SQUISH_CHOCO,
    TIME_IS_MONEY,
    TOAST,
    WAR_DEATH,
    WINNING_LOTTERY,
    MIND_EYE,
    DOUGH,
    ALL_IS_CERTAIN,
    INTER_SPACECRAFT,
    STAR_GAZING,
    PARTY_SNACKS,
    JACKPOT,        // Actions
    DISCARD_DRAW,
    DRAW2_USE,
    DRAW3_PLAY2,
    EVERY_GETS1,
    EXCHANGE_KEEPERS,
    LETS_DO_THAT_AGAIN,
    LETS_SIMPLIFY,
    NO_LIMITS,
    ROTATE_HANDS,
    RULES_RESET,
    TAKE_ANOTHER_TURN,
    TAXATION,
    TRADE_HANDS,
    TRASH_NEW_RULE,
    USE_WHAT_YOU_TAKE,
    CREEPER_SWEEPER,
    TRASH_SOMETHING,
    STEAL_SOMETIHNG,
    MIX_IT_UP,
    TODAYS_SPECIAL,
    ITS_TRASH_DAY,
    DRAW2, // Rules
    DRAW3,
    DRAW4,
    DRAW5,
    PLAY2,
    PLAY3,
    PLAY4,
    PLAY_ALL,
    HAND_LIMIT0,
    HAND_LIMIT1,
    HAND_LIMIT2,
    KEEPER_LIMIT2,
    KEEPER_LIMIT3,
    KEEPER_LIMIT4,
    DOUBLE_AGENDA,
    FIRST_PLAY_RANDOM,
    NO_HAND_BONUS,
    POOR_BONUS,
    RICH_BONUS,
    INFLATION,
    PARTY_BONUS,
    GET_ON_WITH_IT,
    SILVER_LINING,
    YOU_NEED_POTATO,
};

/*
 * Cards is going to be used in the game mostly.
 * They will be converted to FluxxCards when more info
 * is needed about the card. This saves memory, as Enums
 * store less information.
 */

public class FluxxCard
{
    private String name;
    private String description;
    private Card enumCard;
    private CardType type;
    
    public FluxxCard(Card card)
    {
        getCard(card);
    }
    
    public FluxxCard(String name, String description, CardType type)
    {
        this.name = name;
        this.description = description;
        this.type = type;
    }
    
    public Card getEnumCard()
    {
        return enumCard;
    }
    
    public CardType getCardType()
    {
        return type;
    }
    
    public FluxxCard getCard(Card enumCard)
    {
        FluxxCard fluxxCard;
        
        this.enumCard = enumCard;
        description = "";
        switch (enumCard)
        {
          case NO_CARD: // Placeholder
              name = "";
              type = CardType.NO_CARD;
              break;
          case TAXES: // Creepers
              name = "Taxes";
              type = CardType.CREEPER;
              break;
          case WAR:
              name = "War";
              type = CardType.CREEPER;
              break;
          case RADIO_POTATO:
              name = "Radioactive Potato";
              type = CardType.CREEPER;
              break;
          case DEATH:
              name = "Death";
              type = CardType.CREEPER;
              break;
          case BRAIN: // Keepers
              name = "Brain";
              type = CardType.KEEPER;
              break;
          case BREAD:
              name = "Bread";
              type = CardType.KEEPER;
              break;
          case CHOCOLATE:
              name = "Chocolate";
              type = CardType.KEEPER;
              break;
          case COOKIES:
              name = "Cookies";
              type = CardType.KEEPER;
              break;
          case COSMOS:
              name = "Cosmos";
              type = CardType.KEEPER;
          case DREAM:
          case LOVE:
          case MILK:
          case MONEY:
          case MOON:
          case PEACE:
          case ROCKET:
          case SLEEP:
          case SUN:
          case TELEV:
          case TIME:
          case TOASER:
          case EYE:
          case PARTY:
              break;
          case TEN_CARDS: // Goals
              name = "10 Cards";
              type = CardType.GOAL;
          case FIVE_KEEPERS:
          case ALL_NEED_LOVE:
          case APPLIANCES:
          case BAKED_GOODS:
          case BED_TIME:
          case BRAIN_NO_TV:
          case CHOCO_COOKIES:
          case CHOCO_MILK:
          case DEATH_CHOCO:
          case DREAMLAND:
          case HEARTS_MINDS:
          case HIPPY:
          case MILK_COOKIES:
          case NIGHT_DAY:
          case PEACE_NO_WAR:
          case ROCKET_SCIENCE:
          case ROCKET_MOON:
          case SQUISH_CHOCO:
          case TIME_IS_MONEY:
          case TOAST:
          case WAR_DEATH:
          case WINNING_LOTTERY:
          case MIND_EYE:
          case DOUGH:
          case ALL_IS_CERTAIN:
          case INTER_SPACECRAFT:
          case STAR_GAZING:
          case PARTY_SNACKS:
              break;
          case JACKPOT:        // Actions
              name = "Jackpot!";
              type = CardType.ACTION;
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
              break;
          case DRAW2: // Rules
              name = "Draw 2";
              type = CardType.NEW_RULE;
          case DRAW3:
          case DRAW4:
          case DRAW5:
          case PLAY2:
          case PLAY3:
          case PLAY4:
          case PLAY_ALL:
          case HAND_LIMIT0:
          case HAND_LIMIT1:
          case HAND_LIMIT2:
          case KEEPER_LIMIT2:
          case KEEPER_LIMIT3:
          case KEEPER_LIMIT4:
          case DOUBLE_AGENDA:
          case FIRST_PLAY_RANDOM:
          case NO_HAND_BONUS:
          case POOR_BONUS:
          case RICH_BONUS:
          case INFLATION:
          case PARTY_BONUS:
          case GET_ON_WITH_IT:
          case SILVER_LINING:
          case YOU_NEED_POTATO:
          default:
        }
        
        return new FluxxCard(name, description, type);
    }
    
    public CardType getEnumType(Card enumCard)
    {
        return getCard(enumCard).getCardType();
    }
    
    

    /**
     * 
     * @param goal:
     * @param player:
     * @param inflation
     * @return 
     */
    public boolean meetsGoalConditions(Card goal, FluxxPlayer player, int inflation)
    {
        return meetsGoalConditions(getCard(enumCard), player, inflation);
    }
    
    /**
     * 
     * @param goal
     * @param player
     * @param inflation
     * @return 
     */
    public boolean meetsGoalConditions(FluxxCard goal, FluxxPlayer player, int inflation)
    {
        // Double check to see if goal is actually a goal.
        if (goal.type != CardType.GOAL)
        {
            return false;
        }
        
        switch (goal.getEnumCard())
        {
          case TEN_CARDS:
          case FIVE_KEEPERS:
          case ALL_NEED_LOVE:
          case APPLIANCES:
          case BAKED_GOODS:
          case BED_TIME:
          case BRAIN_NO_TV:
          case CHOCO_COOKIES:
          case CHOCO_MILK:
          case DEATH_CHOCO:
          case DREAMLAND:
          case HEARTS_MINDS:
          case HIPPY:
          case MILK_COOKIES:
          case NIGHT_DAY:
          case PEACE_NO_WAR:
          case ROCKET_SCIENCE:
          case ROCKET_MOON:
          case SQUISH_CHOCO:
          case TIME_IS_MONEY:
          case TOAST:
          case WAR_DEATH:
          case WINNING_LOTTERY:
          case MIND_EYE:
          case DOUGH:
          case ALL_IS_CERTAIN:
          case INTER_SPACECRAFT:
          case STAR_GAZING:
          case PARTY_SNACKS:
              break;
        }
        
        return false;
    }
    
    public String getTypeDescript(CardType type)
    {
        switch (type)
        {
            case ACTION:
                return "To play this card, do whatever it says, then place it on the discard pile.";
            case CREEPER:
                return "You cannot hold this card, but must place it face up in front of you as soon as you get it. If you drew it, immediately draw another card to replace it.";
            case GOAL:
                return "To play this card, place it face up in the center of the table. Discard the previous Goal, if any.";
            case KEEPER:
                return "To play this card, place it face up on the table in front of you.";
            case NEW_RULE:
            default:
                return "To play this card, place it face up in the center of the table. New rules take effect instantly.";
        }
    }
}
