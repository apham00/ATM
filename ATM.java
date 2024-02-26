import java.util.Scanner;

public class ATM {

    private static String[] testAccountNumbers = { "00000000", "00000001", "00000002" };
    private static String[] testPinNumbers = { "1234", "7777", "0243" };
    private static int[] testBalances = { 0, 100, -50 };
    
    public static void printDenominations (int wit_amount) {
    
        int[] bills = { 20, 10, 5, 1 };
        for (int i = 0; i < bills.length; i++) {
        System.out.println("");
        System.out.println("$" + bills[i] + "'s: " + wit_amount / bills[i]);
        wit_amount = wit_amount % bills[i];
        }
        return;
    }
    
    public static boolean withdraw(String acctNumber, int wit_amount) {

    boolean result = true;
        if (acctNumber.equals(testAccountNumbers[0])) {
               if (wit_amount < testBalances[0] && wit_amount > 0) { 
                  if (testBalances[0] > 0) {
                  testBalances[0]= testBalances[0] - wit_amount;
                  printDenominations(wit_amount);
                  System.out.println("");
                  System.out.println("Current Balance: " + testBalances[0]);
                  result = true;
                  } else if ( wit_amount > testBalances[0]) {
                  System.out.println("");
                  System.out.println("Unsuccessful Transaction");
                  result = false;
                  } else {
                  System.out.println("");
                  System.out.println("Unsuccessful Transaction");
                  result = false;
                  } 
               } else {
               System.out.println("");
               System.out.println("Unsuccessful Transaction");
               result = false;
               }
        } else if (acctNumber.equals(testAccountNumbers[1])) {
               if (wit_amount < testBalances[1] && wit_amount > 0) { 
                  if (testBalances[1] > 0) {
                  testBalances[1]= testBalances[1] - wit_amount;
                  printDenominations(wit_amount);
                  System.out.println("");
                  System.out.println("Current Balance: " + testBalances[1]);
                  result = true;
                  } else if (wit_amount > testBalances[1]) {
                  System.out.println("");
                  System.out.println("Unsuccessful Transaction");
                  result = false;
                  } else {
                  System.out.println("");
                  System.out.println("Unsuccessful Transaction");
                  result = false;
                  } 
               } else {
               System.out.println("");
               System.out.println("Unsuccessful Transaction");
               result = false;
               }
        } else if (acctNumber.equals(testAccountNumbers[2])) {
            if (wit_amount < testBalances[2] && wit_amount > 0) { 
                  if (testBalances[2] > 0) {
                  testBalances[2]= testBalances[2] - wit_amount;
                  printDenominations(wit_amount);
                  System.out.println("");
                  System.out.println("Current Balance: " + testBalances[2]);
                  result = true;
                  } else if (wit_amount > testBalances[2]) {
                  System.out.println("");
                  System.out.println("Unsuccessful Transaction");
                  result = false;
                  } else {
                  System.out.println("");
                  System.out.println("Unsuccessful Transaction");
                  result = false;
                  } 
               } else {
               System.out.println("");
               System.out.println("Unsuccessful Transaction");
               result = false;
               }
        } else {
              result = false;
          } 
            return result;
        }


    public static boolean deposit(String acctNumber, int dep_amount) {
     
        boolean result = true;
        
        if (acctNumber.equals(testAccountNumbers[0])) {
            if (dep_amount > 0) {
            testBalances[0] = testBalances[0] + dep_amount;
            System.out.println("");
            System.out.println("Current Balance: " + testBalances[0]);
            }else if (dep_amount <= 0){
            System.out.println("");
            System.out.println("Unsuccessful Transaction");
            result = false;
            } else {
            System.out.println("");
            System.out.println("Unsuccessful Transaction");
            result = false;
            }
        } else if (acctNumber.equals(testAccountNumbers[1])) {
            if (dep_amount > 0) {
            testBalances[1] = testBalances[1] + dep_amount;
            System.out.println("");
            System.out.println("Current Balance: " + testBalances[1]);
            }else if (dep_amount <= 0){
            System.out.println("");
            System.out.println("Unsuccessful Transaction");
            result = false;
            } else {
            System.out.println("");
            System.out.println("Unsuccessful Transaction");
            result = false;
            }
        } else if (acctNumber.equals(testAccountNumbers[2])) {
            if ( dep_amount > 0) {
            testBalances[2] = testBalances[2] + dep_amount;
            System.out.println("");
            System.out.println("Current Balance: " + testBalances[2]);
            }else if (dep_amount <= 0){
            System.out.println("");
            System.out.println("Unsuccessful Transaction");
            result = false;
            } else {
            System.out.println("");
            System.out.println("Unsuccessful Transaction");
            result = false;
            }
        } else {
              result = false;
          } 
        return result;
    }

    public static boolean doesAccountExist(String acctNumber) {

        boolean result = true;
        if (acctNumber.equals(testAccountNumbers[0])) {
            result = true;
        } else if (acctNumber.equals(testAccountNumbers[1])) {
            result = true;
        } else if (acctNumber.equals(testAccountNumbers[2])) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static boolean checkPin(String acctNumber, String pin) {

        boolean result = true;
        if (acctNumber.equals(testAccountNumbers[0]) && pin.equals(testPinNumbers[0])) {
            result = true;
        } else if (acctNumber.equals(testAccountNumbers[1]) && pin.equals(testPinNumbers[1])) {
            result = true;
        } else if (acctNumber.equals(testAccountNumbers[2]) && pin.equals(testPinNumbers[2])) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static void start() {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Big Money Banking");
        System.out.println("Enter account number: ");
        String acctNumber = userInput.nextLine();
        if (doesAccountExist(acctNumber) == true) {
            System.out.println("Enter your pin: ");
            String pin = userInput.nextLine();
               if (checkPin(acctNumber, pin) == true) {
               System.out.println("ATM:Machine ");
                  while (true) {
                  System.out.println("Please select an option:");
                  System.out.println("1. Withdraw");
                  System.out.println("2. Deposit");
                  System.out.println("3. Balance");
                  System.out.println("4. Exit");
                  int choice = userInput.nextInt();
                     switch (choice) {
                     case 1:
                     System.out.println(" ");
                     System.out.print("Enter the amount to be withdrawn:");
                     int wit_amount = userInput.nextInt();
                        if (withdraw(acctNumber, wit_amount) == true) {
                        System.out.println("Withdraw Successful!");
                        System.out.println("");
                     break;
                        } else {
                        System.out.println("Unsuccessful: Please Try Again!");
                        System.out.println("");
                        }
                     break;
                     case 2:
                     System.out.println(" ");
                     System.out.print("Enter the amount to be deposited:");
                     int dep_amount = userInput.nextInt();
                        if (deposit(acctNumber, dep_amount) == true) {
                        System.out.println("Deposit Successful!");
                        System.out.println("");
                     break;
                        } else {
                        System.out.println("Please Try Again!");
                        System.out.println("");
                        }
                        System.out.println("Choice:");
                     break;
                     case 3:
                        if (acctNumber.equals(testAccountNumbers[0])) {
                        System.out.println("");
                        System.out.println("Current Balance: " + testBalances[0]);
                        System.out.println("");
                        } else if (acctNumber.equals(testAccountNumbers[1])) {
                        System.out.println("");
                        System.out.println("Current Balance: " + testBalances[1]);
                        System.out.println("");
                        } else if (acctNumber.equals(testAccountNumbers[2])) {
                        System.out.println("");
                        System.out.println("Current Balance: " + testBalances[2]);
                        System.out.println("");
                        } else {
                        System.out.println("");
                        System.out.println("Unsuccessful Transaction");
                        System.out.println("");
                        }
                     break;
                     case 4:
                     System.out.println(" ");
                     System.out.println("Exiting ATM...");
                     System.exit(0);
                     }
                  }
               } else {
               System.out.println(" ");
               System.out.println("Pin Does Not Match!");
               System.out.println("Exiting...");
               System.exit(0);
               }
               
         } else {
         System.out.println(" ");
         System.out.println("Account Does Not Exist!");
         System.out.println("Exiting...");
         System.exit(0);
        }
        
        userInput.close();
    }

    public static void main(String[] args) {
        start();
    }
}