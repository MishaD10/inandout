import java.util.Scanner;
import java.util.Random;

public class Main {
    static String[] goodBye = {"bye", "goodbye", "see you", "later", "thanks", "thank you", "thank", "thx","ok","okay"};
    static String[] burgerKeywords = {"hungry", "food", "menu", "burgers", "burger", "protein style", "animal style", "3x3", "4x4", "flying dutchman", "grilled cheese"};
    static String[] comboKeywords = {"combo","combos","cmbo","cbo","secret menu"};
    static String[] friesKeywords = {"fries", "well-done fries", "animal style fries", "cheese fries", "fresh-cut fries"};
    static String[] drinksKeywords = {"drinks", "drink", "milkshakes", "coffee", "hot cocoa", "milkshake","dri"};
    static String[] greetingKeywords = {"hi", "hello", "hey", "greetings","hoi","HII","wsp","wassup"};
    static String[] locationKeywords = {"location", "address", "where are you", "where is the restaurant", "where"};
    static String[] hoursKeywords = {"hours", "when do you open", "when do you close", "what are your hours", "when","open times","open","close"};
    static String[] beverageKeywords = {"beverage", "soda", "iced tea", "lemonade", "softdrinks","coke"};
    static String[] randomResponses = {
        "I'm not sure what you mean! Could you try asking something else?",
        "Oops! I didn't quite catch that. Can you clarify?",
        "Sorry, I can only answer In and Out related questions!",
        "Hmm, I didn't quite get that. Can you ask something else?",
        "Could you explain what you mean a bit more clearly?"
    };
    static int unclearInputCount = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to In-N-Out Burger! How can I assist you today?");
        
        
        Food hamburgercombo = new Food("Hamburger Combo - Hamburger, Fries, Med Drink", 8.89, "combo");
        Food cheeseburgercombo = new Food("Cheeseburger Combo - Cheeseburger, Fries, Med Drink", 9.29, "combo");
        Food doubleDoublecombo = new Food("Double Double Combo - Double Double, Fries, Med Drink", 11.09, "combo");
        Food milkshake = new Food("Milkshake", 3.99, "drink"); 
        Food coke = new Food("Coke", 2.45, "beverage");
        Food cherrycoke = new Food("Cherry Coke", 2.45, "beverage");
        Food dietcoke = new Food("Diet Coke", 2.45, "beverage");
        Food sevenup = new Food("Seven Up", 2.45, "beverage");
        Food drpepper = new Food("Dr Pepper", 2.45, "beverage");
        Food rootbeer = new Food("Root Beer", 2.45, "beverage");
        Food icedtea = new Food("Iced Tea", 2.45, "beverage");
        Food pinklem = new Food("Pink Lemonade", 2.45, "beverage");
        Food litepinklem = new Food("Lite Pink Lemonade", 2.45, "beverage");
        Food hotcocoa = new Food("Hot Cocoa", 2.25, "drink");
        Food coffee = new Food("Coffee", 1.35, "drink");
        Food milk = new Food("Milk", 0.99, "drink");
        Food cheeseburger = new Food("Cheeseburger",4.19,"burger");
        Food hamburger = new Food("Hamburger",3.69,"burger");
        Food doubledouble = new Food("Double double",5.89,"burger");
        Food threebythree = new Food("3x3",8.49,"burger");
        Food fourbyfour = new Food("4x4",10.99,"burger");
        Food animalstyl = new Food("Animal Style French Fries",5.19,"fries");
        Food fries = new Food(" French Fries",2.79,"fries");


        while (true) {
            String userInput = in.nextLine().toLowerCase();

            
            if (checkGoodbye(userInput)) {
                System.out.println("Goodbye! Enjoy your meal!");
                break; 
            }
           
            else if (checkGreeting(userInput)) {
                System.out.println("Hello! How can I assist you today?");
            }
            
            else if (checkMenuItem(userInput, locationKeywords)) {
                System.out.println("Our nearest In-N-Out Burger is located at 6015 Johnson Drive, Pleasanton, California!");
            }
           
            else if (checkMenuItem(userInput, hoursKeywords)) {
                System.out.println("Our hours are from 10:30 AM to 1:30 AM, every day!");
            }
    
        
            else if (userInput.contains("milkshake")) {
                System.out.println("I'm glad I could help! You've selected the Milkshake - $3.99.");
            }
            else if (userInput.contains("Hamburger combo")) {
                System.out.println("I'm glad I could help! You've selected the Hamburger combo - $8.89.");
            }
            else if (userInput.contains("Cheeseburger Combo")) {
                System.out.println("I'm glad I could help! You've selected the Cheeseburger Combo - $9.29.");
            }
            else if (userInput.contains("double double combo")) {
                System.out.println("I'm glad I could help! You've selected the Double-Double Combo - $11.09.");
            }
            else if (userInput.contains("coke")) {
                System.out.println("I'm glad I could help! You've selected a coke - $2.45.");

            }
            else if (userInput.contains("diet coke")) {
                System.out.println("I'm glad I could help! You've selected the Diet Coke- $2.45.");
            }
            else if (userInput.contains("cherry coke")) {
                System.out.println("I'm glad I could help! You've selected the Cherry Coke- $2.45.");
        
            }
            else if (userInput.contains("Seven up")) {
                System.out.println("I'm glad I could help! You've selected the Seven Up- $2.45.");
            }
            else if (userInput.contains("dr pepper")) {
                System.out.println("I'm glad I could help! You've selected the Dr.Pepper- $2.45.");
            }
            else if (userInput.contains("root beer")) {
                System.out.println("I'm glad I could help! You've selected the Root Beer- $2.45.");
            }
            else if (userInput.contains("iced tea")) {
                System.out.println("I'm glad I could help! You've selected the Iced Tea- $2.45.");
            }
            else if (userInput.contains("pink lemonade")) {
                System.out.println("I'm glad I could help! You've selected the Pink Lemonade- $2.45.");
            }
            else if (userInput.contains("lite pink lemonade")) {
                System.out.println("I'm glad I could help! You've selected the Lite Pink Lemonade- $2.45.");
            }
            else if (userInput.contains(" hot cocoa")) {
                System.out.println("I'm glad I could help! You've selected the Hot Cocoa- $2.25.");
            }
            else if (userInput.contains("coffee")) {
                System.out.println("I'm glad I could help! You've selected the Coffee - $1.35.");
            }
            else if (userInput.contains("milk")) {
                System.out.println("I'm glad I could help! You've selected the Milk - $0.99");
            }
            else if (userInput.contains("cheeseburger")) {
                System.out.println("I'm glad I could help! You've selected the Cheeseburger - $4.19");
            }
            else if (userInput.contains("double double")) {
                System.out.println("I'm glad I could help! You've selected the Double Double - $5.89");
            }
            else if (userInput.contains("hamburger")) {
                System.out.println("I'm glad I could help! You've selected the Hamburger - $3.69");
            }
            else if (userInput.contains("3x3")) {
                System.out.println("I'm glad I could help! You've selected the 3x3 - $8.49");
            }
            else if (userInput.contains("4x4")) {
                System.out.println("I'm glad I could help! You've selected the 4x4 - $10.99");
            }
            else if (userInput.contains("animal style")) {
                System.out.println("I'm glad I could help! You've selected the Animal Style Fries - $5.19");
            }
            else if (userInput.contains("french fries")) {
                System.out.println("I'm glad I could help! You've selected the French Fries - $2.79");
            }
        
            else if (checkMenuItem(userInput, comboKeywords)) {
                handleMenuResponse("combo", hamburgercombo, cheeseburgercombo, doubleDoublecombo);
            }
            else if (checkMenuItem(userInput, burgerKeywords)) {
                handleMenuResponse("burger",cheeseburger,hamburger,doubledouble,threebythree,fourbyfour);
            }
            // Then check for general drink keywords
            else if (checkMenuItem(userInput, drinksKeywords)) {
                handleMenuResponse("drinks", milkshake, hotcocoa, coffee, milk);
            }
            else if (checkMenuItem(userInput, beverageKeywords)) {
                handleMenuResponse("beverages", coke, cherrycoke, dietcoke, sevenup, drpepper, rootbeer, icedtea, pinklem, litepinklem);
            }
            // Check for Fries
            else if (checkMenuItem(userInput, friesKeywords)) {
                handleMenuResponse("fries", fries, animalstyl);
            }
            // Handle unclear input
            else {
                System.out.println(getRandomResponse());
                unclearInputCount++;
                if (unclearInputCount == 3) {
                    surpriseFeature();
                    unclearInputCount = 0;
                }
            }
        }
    }

   
    public static boolean checkGoodbye(String input) {
        for (String goodbye : goodBye) {
            if (input.contains(goodbye)) {
                return true;
            }
        }
        return false;
    }

    
    public static boolean checkGreeting(String input) {
        for (String greeting : greetingKeywords) {
            if (input.contains(greeting)) {
                return true;
            }
        }
        return false;
    }

    
    public static boolean checkMenuItem(String input, String[] keywords) {
        for (String keyword : keywords) {
            if (input.contains(keyword)) {
                return true;
            }
        }
        return false;
    }

   
    public static void handleMenuResponse(String category, Food... foods) {
        switch (category) {
            case "burger":
                System.out.println("We have the following burgers available:");
                for (Food food : foods) {
                    food.displayInfo();
                }
                break;
                case "combo":
                System.out.println("We have the following combos available:");
                for (Food food : foods) {
                    food.displayInfo();
                }
                break;
            case "fries":
                System.out.println("We have the following fries options available:");
                break;
            case "drinks":
                System.out.println("We have a variety of drinks, including milkshakes, coffee etc, or let me know if you'd like to look at the sodas:");
                for (Food food : foods) {
                    if (food != null) {
                        food.displayInfo();
                    }
                }
                break;
            case "beverages":
                System.out.println("Beverage Size/Prices: SM:$1.90 MED:$2.05 LG:$2.45");
                for (Food food : foods) {
                    if (food != null) {
                        food.displayInfo();
                    }
                }
                break;
        }
    }


    public static String getRandomResponse() {
        Random random = new Random();
        return randomResponses[random.nextInt(randomResponses.length)];
    }

    
    public static void surpriseFeature() {
        System.out.println("Did you know? The first In-N-Out location opened in 1948 in Baldwin Park, California!");
    }

    static class Food {
        String name;
        double price;
        String category;
    
        public Food(String name, double price, String category) {
            this.name = name;
            this.price = price;
            this.category = category;
        }
    
        public void displayInfo() {
            System.out.println(name + " - $" + price);
        }
    }
    }