package Programming_by_Contract;

public class Try_Exercise {

    static boolean iwillNotCheat = true;
    static boolean iwillWin = true;

    public static void main(String[] args) throws Exception {

        //Precondition
        assert iwillNotCheat == true: "Sorry";

        enterCompetition();

        //Post Condition
        assert iwillWin == true: "Bummer";
        
    }

    static void enterCompetition() {

        iwillWin = false;
    }
}
