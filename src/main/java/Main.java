import service.ComputerLogic;
import service.GameMessages;

import java.util.Scanner;

public class Main {

    int lastMatch = 0;
    int playersChoice = 0;
    int selectingComputer;

    public static void main(String[] args) {
        int numberOfMatches = 20;

        GameMessages gameMessages = new GameMessages();
        Main main = new Main();

        gameMessages.printGameStarted();
        main.gameLogic(numberOfMatches);

    }

    public void gameLogic(int numberOfMatches) {
        if (lastMatch == 1)
            return;

        GameMessages gameMessages = new GameMessages();
        ComputerLogic computerLogic = new ComputerLogic();
        Main main = new Main();

        gameMessages.printNumberOfMatches(numberOfMatches);
        selectingComputer = computerLogic.makeMove(numberOfMatches, playersChoice);
        gameMessages.printNumberOfMatchesSelectedByTheComputer(selectingComputer);
        numberOfMatches -= selectingComputer;
        gameMessages.printNumberOfMatches(numberOfMatches);

        if (numberOfMatches != 1){
            gameMessages.printRequestToEnterTheNumberOfMatches();
            playersChoice = main.acceptTheCorrectNumber();
        } else {
            gameMessages.printTheLastMatchPlayer();
            lastMatch = 1;
        }

        if (numberOfMatches != 1) {
            numberOfMatches -= playersChoice;
        }

        gameLogic(numberOfMatches);
    }

    public int acceptTheCorrectNumber() {
        int playersChoiceBeforeVerification;

        GameMessages gameMessagesAcceptTheCorrectNumber = new GameMessages();
        Scanner scanner = new Scanner(System.in);

        playersChoiceBeforeVerification = scanner.nextInt();

        if (0 < playersChoiceBeforeVerification && playersChoiceBeforeVerification < 4) {
            return playersChoiceBeforeVerification;
        } else {
            while (!(0 < playersChoiceBeforeVerification && playersChoiceBeforeVerification < 4)) {
                gameMessagesAcceptTheCorrectNumber.printRequestToEnterTheCorrectNumberOfMatches();
                playersChoiceBeforeVerification = scanner.nextInt();
            }

        }

        return playersChoiceBeforeVerification;
    }

}
