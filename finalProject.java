import java.util.Scanner;

public class finalProject {
    public static void main(String[]args){
        System.out.println("Hello Welcome to the David's Food App.");
        System.out.println("Please create a password: ");

        Scanner scanPw= new Scanner(System.in);
        String password = scanPw.next();
        System.out.println("Your password is: " + password);

        System.out.println("Please enter your password: ");
        String pass = scanPw.next();

        while (!pass.equals(password)){
            System.out.println("This is not the right password. Please try again.");
            pass = scanPw.next();
        }

        System.out.println("Great!! Access Granted. Welcome to the David's Food App.");

        System.out.println("Are you hungry?? Yes or No?");
        Scanner scan = new Scanner(System.in);
        String ansQuest= scan.next();

        if(ansQuest.equals("yes")){
            System.out.println("Choose what you want to eat between pizza, burger, or fish? ");
            String ansQuest1 = scan.next();

            while (!ansQuest1.equals("pizza") && !ansQuest1.equals("burger") && !ansQuest1.equals("fish")) {
                System.out.println("Please choose only for 3 foods that we offer to you");
                ansQuest1 = scan.next();
            }

            if(ansQuest1.equals("pizza") || ansQuest1.equals("burger") || ansQuest1.equals("fish")){
                System.out.println("Do you want something to drink? Yes or No? ");
                String ansUser = scan.next();

                while (!ansUser.equals("yes") && !ansUser.equals("no")){
                    System.out.println("Wrong command. Please choose Yes or No.");
                    ansUser = scan.next();
                }

                if(ansUser.equals("yes")){
                    System.out.println("What do you want to drink between coke and juice?");
                    String drink = scan.next();

                    while (!drink.equals("coke") && !drink.equals("juice")){
                        System.out.println("Wrong command. Please try again.");
                        drink = scan.next();
                    }

                    if(drink.equals("coke") || drink.equals("juice")){
                        System.out.println("Great you have ordered " + ansQuest1 + " and " + drink);
                    }

                    System.out.println("Please confirm your password: ");
                    pass = scan.next();

                    while (!pass.equals(password)){
                        System.out.println("This is not the right password. Please try again.");
                        pass = scan.next();
                    }

                    System.out.println("Thank you. Your order is on its way.");
                }
                else{
                    System.out.println("You have ordered " +ansQuest1);
                    System.out.println("Please confirm your password: ");
                    pass = scan.next();

                    while (!pass.equals(password)){
                        System.out.println("This is not the right password. Please try again.");
                        pass = scan.next();
                    }

                    System.out.println("Thank you. Your order is on its way.");
                }
            }
        }
        else {
            System.out.println("Have a good day");
        }
    }
}
