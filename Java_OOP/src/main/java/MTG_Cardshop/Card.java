package MTG_Cardshop;

import java.io.Serializable;

public abstract class Card {
    //todas as cartas de magic tem esses atributos, independente de qual tipo de carta ela seja
    protected int manaCost;
    protected String name;
    protected String cardType;
    protected String text;
    protected String color;

}
