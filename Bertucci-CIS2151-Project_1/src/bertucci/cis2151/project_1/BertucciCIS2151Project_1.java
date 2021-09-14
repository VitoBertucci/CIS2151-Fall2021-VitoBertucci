package bertucci.cis2151.project_1;
import java.util.Scanner;

public class BertucciCIS2151Project_1 {
    public static void main(String[] args) {
        //create scanner obj
        Scanner kb = new Scanner(System.in);

        //prompt user and store responses
        System.out.println("Enter Name:");
        String userName = kb.nextLine();
        System.out.println("Enter FoodType:");
        String userFoodType = kb.nextLine();
        System.out.println("Enter URL:");
        String userURL = kb.nextLine();

        //create restaurant object with default constructor and set attributes with set methods
        FastFoodAndSnack restaurant = new FastFoodAndSnack();
        restaurant.setName(userName);
        restaurant.setFoodType(userFoodType);
        restaurant.setURL(userURL);

        //display using the display method
        System.out.println("----using display method----");
        restaurant.display();

        //display using get methods
        System.out.println("------using get methods-----");
        System.out.println("Name: " + restaurant.getName());
        System.out.println("Food Type: " + restaurant.getFoodType());
        System.out.println("URL: " + restaurant.getURL());
        System.out.println("---create another object----");

        //prompt user and store again for new restaurant object
        System.out.println("Enter Name:");
        userName = kb.nextLine();
        System.out.println("Enter FoodType:");
        userFoodType = kb.nextLine();
        System.out.println("Enter URL:");
        userURL = kb.nextLine();

        //create new second restaurant object using non-default constructor
        FastFoodAndSnack restaurantAgain = new FastFoodAndSnack(userName, userFoodType, userURL);

        //display using the display method
        System.out.println("----using display method----");
        restaurantAgain.display();

        //end session message
        System.out.println("Thank you, session ended.");
    }
}
