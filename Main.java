import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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


                    Scanner scanner = new Scanner(System.in);
                    // ! Linux path

                    System.out.print("Enter the path for your desired directory: \n");
                    System.out.print("Please note that path has to be in linux based systems format \n");
                    String directory = scanner.nextLine();
                    Path path = Paths.get(directory);
                    if (Files.exists(path)) {
                        System.setProperty("user.dir", directory);
                        File dir = new File(System.getProperty("user.dir"));
                        String[] fileNames = dir.list();
                        Arrays.sort(fileNames);
                        for (String fileName : fileNames) {
                            System.out.println(fileName);
                        }
                    } else {
                        System.out.println("Directory does not exist");
                    }

                    break;
                case 2:
                    Scanner input = new Scanner(System.in);
                    System.out.print("Enter the file name: ");
                    String fileName2 = input.nextLine();

                    File file2 = new File(fileName2);
                    try {
                        if (file2.createNewFile()) {
                            System.out.println("File created: " + fileName2);
                        } else {
                            System.out.println("File already exists.");
                        }
                    } catch (Exception e) {
                        System.out.println("An error occurred.");
                    }
                    break;
                case 3:
                    Scanner readFile = new Scanner(System.in);
                    System.out.print("Enter file name: ");
                    String fileName3 = readFile.nextLine();

                    File file3 = new File(fileName3);
                    if (file3.exists() && file3.isFile()) {
                        if (file3.delete()) {
                            System.out.println("File deleted: " + fileName3);
                        } else {
                            System.out.println("Failed to delete file.");
                        }
                    } else {
                        System.out.println("File not found.");
                    }
                    break;
                case 4:
                    Scanner input4 = new Scanner(System.in);
                    System.out.print("Enter the file name: ");
                    String fileName4 = input4.nextLine();

                    File file4 = new File(fileName4);
                    if (file4.exists()) {
                        System.out.println("File found: " + fileName4);
                    } else {
                        System.out.println("File not found: " + fileName4);
                    }
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
        System.out.println("2 - Create file");
        System.out.println("3 - Delete file");
        System.out.println("4 - Search between files");
        System.out.println("5 - Exit");
    }


}

