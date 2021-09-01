/**
Part 1:
 -Create Class FastFoodAndSnack that has following data:
     -Restaurant name
     -Type of food restaurant is famous for (burgers, pizza, ice cream)
     -URL for the menu (enter and store without https://)
 -Should be default and non-default constructor
 -Should be set and get methods
 -Should be diplay method to display output on console in this format:
     ***************
     Name: BurgerKing
     Food Type: Burgers
     URL: https://bk.com/menu
     ***************

 Part 2:
 -Write a test application to use the FastFoodAndSnack class.
 -It will use the scanner to request information from a user
 -It will
    -prompt the user to enter the name of a fast food restaurant
    -prompt the user to enter the most popular food
    -prompt the user to enter the URL
 -It will call the default constructor to create a new object of the FastFoodAndSnack class.
 -It will call the set methods to assign   the user values to the object
 -It will call each get method to print out the data
 -It will call the display method
 -It will create another object using the non-default constructor.
 -It will call the display method to display all data of the second object.
 -It will print a “session ended” message.

 -Example URLs:
 https://order.baskinrobbins.com/categories 
 https://www.kfc.com/menu
 https://www.mrsfields.com/categories/cookies
 https://littlecaesars.com/en-us/menu/
 https://www.mcdonalds.com/us/en-us/full-menu.html
 https://www.bk.com/menu
 https://www.pizzahut.com
 https://www.papajohns.com/order/menu
 https://www.subway.com/en-US/Menu
*/

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

        //create restaurant object with user inputs and set attributes
        FastFoodAndSnack restaurant = new FastFoodAndSnack(userName, userFoodType, userURL);
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
    }
    
}
