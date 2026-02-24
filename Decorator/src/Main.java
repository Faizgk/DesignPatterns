public class Main {
    public static void main(String[] args) {

        Character characterA = new SwordMasteryDecorator(new SuperPunchDecorator(new CharacterA()));

        System.out.println(characterA.getAbilities());

    }
}