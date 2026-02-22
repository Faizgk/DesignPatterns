public class TheDepartment {

    private static TheDepartment theDepartment;
    private TheDepartment(){
        System.out.println("constructor called");
    }
    synchronized public static TheDepartment getInstance(){
        if(theDepartment == null){
            theDepartment  = new TheDepartment();
        }
        return  theDepartment;
    }

}
