package Cat;

public class App {
    public static void main(String[] args) throws Exception {

        
        MunchkinCat myPet = new Pet();

        myPet.bark();
        System.out.println(myPet.mouth);
        System.out.println(myPet.eyeColor);
    }
}
