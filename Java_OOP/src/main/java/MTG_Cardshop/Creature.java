package MTG_Cardshop;

public class Creature extends Card implements Cadastro{
    private String creatureType;
    private String  stats;

    @Override
    public void register(String cardType) {
        super.cardType=cardType;
        System.out.println("Input this card converted mana cost: ");
        super.manaCost=Integer.parseInt(sc.nextLine());
        System.out.println("Input this card name: ");
        super.name=sc.nextLine();
        System.out.println("Type the name of this card color: ");
        super.color=sc.nextLine();
        System.out.println("Input the card text: ");
        super.text=sc.nextLine();
        System.out.println("Type this cards creature type: ");
        this.creatureType=sc.nextLine();
        System.out.println("Type this creature attack and power ex(12/12): ");
        this.stats=sc.nextLine();
    }

    @Override
    public String toString() {
        return "Creature{" +
                "manaCost=" + manaCost +
                ", name='" + name + '\'' +
                ", cardType='" + cardType + '\'' +
                ", text='" + text + '\'' +
                ", color='" + color + '\'' +
                ", creatureType='" + creatureType + '\'' +
                ", stats='" + stats + '\'' +
                '}';
    }
}
