public class Main {
    public static void main(String[] args) {


        //TheDepartment theDepartment = new TheDepartment(); //wont work

        TheDepartment theDepartment = TheDepartment.getInstance();
        TheDepartment theDepartment2 = TheDepartment.getInstance();

        System.out.println(theDepartment == theDepartment2); //should print true

    }
}