import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    Scanner in = new Scanner(System.in);
    ArrayList<LoanItem> theseLoanItems = new ArrayList<>();


    public static void main(String[] args) {
        Program program = new Program();
        program.startProgram();
    }
    public void startProgram(){
        String userInput;
        System.out.println("Welcome to the library.");
        boolean gameFlag = true;
        while (gameFlag){
            System.out.println("If you wish to add a book or video, type add. " +
                    "If you wish to exit, type exit. To review your order, type review.");
            userInput = in.nextLine();
            if (userInput.equals("add")){
                renting();
            }else if (userInput.equals("review")){
                int counterLoop = 1;
                for (LoanItem i: theseLoanItems){
                    System.out.println("Item " + counterLoop + ":");
                    if (i instanceof Video){
                        System.out.println("Type: Video. \nTitle: " + i.getTitle() + "\n");
                        counterLoop++;
                    }else if (i instanceof Book){
                        System.out.println("Type: Book. \nTitle: " + i.getTitle() + "\n");
                        counterLoop++;
                    }
                }
            }else if (userInput.equals("exit")){
                gameFlag = false;

            } else{
                System.out.println("Wrong input, try again.");
            }


        }

    }

    public void renting(){
        String userInput;
        System.out.println("Press v for video or b for book.");
        userInput = in.nextLine();
        if (userInput.equals("v")){
            System.out.println("Whats the title of the video?");
            userInput = in.nextLine();
            LoanItem currentVideo = new Video(userInput);
            theseLoanItems.add(currentVideo);
            System.out.println("Video has been added!");
        }else if (userInput.equals("b")){
            System.out.println("Whats the title of the book?");
            userInput = in.nextLine();
            LoanItem currentBook = new Book(userInput);
            theseLoanItems.add(currentBook);
            System.out.println("Book has been added!");

        }else{
            System.out.println("Didnt detect v or b input. Try again.");
            renting();
        }
    }
}
