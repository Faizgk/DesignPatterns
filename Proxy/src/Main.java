import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Image image = null;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("==============================");
            System.out.println("1. load image");
            System.out.println("2. show image name");
            System.out.println("3. display image");
            System.out.println("press any other number to exit");
            System.out.println("==============================");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if(choice == 1){
                System.out.println("enter filename");
                image = new ProxyImage(scanner.nextLine());

            } else if (choice == 2) {
                System.out.println("file name is "+ image.getFileName());

            } else if (choice == 3) {
                image.display();

            } else {
                System.exit(1);
            }
        }



    }
}