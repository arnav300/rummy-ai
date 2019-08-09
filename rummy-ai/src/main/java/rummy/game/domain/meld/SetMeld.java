package rummy.game.domain.meld;

import rummy.game.domain.meld.Meld;
import java.util.LinkedList;
import java.util.List;
import rummy.game.domain.Card;
import rummy.game.domain.Player;


public class SetMeld extends Meld {

    public SetMeld(Player player, LinkedList<Card> cards) {
        super(player, cards);
    }

    @Override
    public boolean isFull() {
        return super.getCards().size() == 4;
    }

    @Override
    public boolean layOffAllowed(Card card) {
        return (card.getValue() == super.getCards().getFirst().getValue()) && !isFull();
    }
    
    // FIRST CHECK IF ALLOWED !!!
    @Override
    public void layoff(Card card) {
        super.getCards().add(card);
    }

    @Override
    public String type() {
        return "set";
    }

}