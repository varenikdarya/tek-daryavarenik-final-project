package tek.bdd.utility;

public class RandomGenerator {
    public static String emailGenerator(String name){
        int randomNumber = (int) (Math.random()*10000);
        return name + randomNumber + "@gmail.com";
    }
    public static String userNameGenerator(String name){
        int randomNumber = (int) (Math.random()*10000);
        return name + randomNumber;
}
}
