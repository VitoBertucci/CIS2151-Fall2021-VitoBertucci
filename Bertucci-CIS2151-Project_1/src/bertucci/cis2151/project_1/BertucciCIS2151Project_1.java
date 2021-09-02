package bertucci.cis2151.project_1;
import java.util.Scanner;

public class BertucciCIS2151Project_1 {
    public static void main(String[] args) {
        //create scanner obj
        Scanner kb = new Scanner(System.in);

        //loop for user prompt to run twice and create two different objects
        int i = 0;
        while(i < 2) {

            //prompt user and store responses
            System.out.println("Enter Name:");
            String userName = kb.nextLine();
            System.out.println("Enter FoodType:");
            String userFoodType = kb.nextLine();
            System.out.println("Enter URL:");
            String userURL = kb.nextLine();

            if (i == 0) {
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
            }

            if (i == 1) {
                //create new second restaurant object using non-default constructor
                FastFoodAndSnack restaurantAgain = new FastFoodAndSnack(userName, userFoodType, userURL);

                //display using the display method
                System.out.println("----using display method----");
                restaurantAgain.display();
            }
            
            i++;
        }
        System.out.println("Thank you, session ended.");
    }
}
