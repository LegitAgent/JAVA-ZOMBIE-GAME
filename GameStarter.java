
/**
 * Creates the class for game canvas. It extends from the JComponent class.
 * */
public class GameStarter {

    /**
     * Creates the game frame and connects to the GameServer
     */
    public static void main(String[] args) {
        System.setProperty("sun.java2d.uiScale", "1.0");
        GameFrame frame = new GameFrame();
        frame.connectToServer();
        frame.setUpGUI();
    }
}
