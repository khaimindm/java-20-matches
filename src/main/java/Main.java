import service.ComputerLogic;
import service.GameMessages;

public class Main {

    //int numberOfMatches = 20;

    public static void main(String[] args) {
        int numberOfMatches = 20;
        GameMessages gameMessages = new GameMessages();
        ComputerLogic computerLogic = new ComputerLogic();

        gameMessages.printGameStarted();
        gameMessages.printNumberOfMatches(numberOfMatches);
        computerLogic.makeMove(numberOfMatches);

    }

}
