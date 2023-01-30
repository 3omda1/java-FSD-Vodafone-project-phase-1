import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Welcome.welcomeMessage();

        Scanner read = new Scanner(System.in);
        int option ;
        do {
            Menu.mainMenu();
            option=read.nextInt();

            switch (option) {
                case 1:

                    File folder = new File("/home/ahmedemad");

                    File[] files = folder.listFiles();

                    // sort the files in ascending order by name
                    Arrays.sort(files, Comparator.comparing(File::getName));

                    // print the sorted list of files
                    for (File file : files) {
                        System.out.println(file.getName());
                    }
                    break;
                case 2:
                    System.out.println("you selected two");
                    break;
                case 3:
                    System.out.println("you selected three");
                    break;
                case 4:
                    System.out.println("you selected four");
                    break;
                case 5:
                    System.out.println("See you :)");
                    break;


            }
            if (option > 5 || option < 1){
                System.out.println("\n" +"Invalid option" + "\n");
            }

        } while (option > 5 || option < 1);


    }
}

class Welcome {
    public static void welcomeMessage() {

        System.out.println("Welcome to LockedMe.com Project ");
        System.out.println("Developed by Ahmed EamdEldin :) \n");
//        System.out.println("Enter your directory");
//        Scanner read = new Scanner(System.in);
//        String dir = read.nextLine();

//        System.out.println("Your current working directory is " + dir + "\n");
    }

}

class Menu {
    public static void mainMenu() {
        System.out.println("Please select one of the following");
        System.out.println("1 - List files");
        System.out.println("2 - Delete file");
        System.out.println("3 - Search between files");
        System.out.println("4 - Change directory");
        System.out.println("5 - Exit");
    }


}

