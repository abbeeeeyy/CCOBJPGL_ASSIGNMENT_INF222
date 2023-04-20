package Programming_by_Contract;

public class Exercise1 {

    static boolean iWillBehave = true;
    static boolean iWillGraduate = true;

    public static void main(String[] args) throws Exception {

        assert iWillBehave == true: "Papagalitan ako ni mama";

        College();

        assert iWillGraduate == true: "Di ako makakapunta ng Japan";
    }

    static void College() {

        iWillGraduate = false;
        System.out.println("Yay or Nay ?");
    }

    
    
}
