public class SuperPunchDecorator extends  Decorator {
    public SuperPunchDecorator(Character character) {
        super(character);
    }
    @Override
    public String getAbilities() {
        return character.getAbilities()+", Super Punch";
    }
}
