public class SwordMasteryDecorator extends Decorator{

    public SwordMasteryDecorator(Character character) {
        super(character);
    }

    @Override
    public String getAbilities() {
        return character.getAbilities() + ", Sword Mastery";
    }
}
