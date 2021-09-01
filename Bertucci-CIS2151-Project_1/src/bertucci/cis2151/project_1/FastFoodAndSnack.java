package bertucci.cis2151.project_1;

public class FastFoodAndSnack {
    //attributes
    private String name;
    private String foodType;
    private String URL;

    //default constructor
    public FastFoodAndSnack () {
        name = "";
        foodType = "";
        URL = "";
    }

    //non-default constuctor 
    public FastFoodAndSnack (String inputName, String inputFoodType, String inputURL) {
        name = inputName;
        foodType = inputFoodType;
        URL = inputURL;
    }

    //methods
    public String getName () {
        return name;
    }
    public String getFoodType () {
        return foodType;
    }
    public String getURL () {
        return URL;
    }
    public String display () {

        return "final product";
    }
}
