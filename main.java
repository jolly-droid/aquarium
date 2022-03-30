public class main {

    private static int numberOfFish  = 0;

    public static void main(String[] args) {
        startGUI();
    }
/*
we start the gui where the user can select the number of fish and the mode.
normal mode is 0
party mode is 1
 */
    private static void startGUI(){
        new aquariumGUI();
    }

}
