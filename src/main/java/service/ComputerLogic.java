package service;

public class ComputerLogic {

    public int makeMove(int numberOfMatches, int playersChoice) {
        int selectingComputer = 0;
        int lastMatch = 0;

        GameMessages gameMessages = new GameMessages();

        if (numberOfMatches == 1) {
            gameMessages.printTheLastMatchComputer();
            lastMatch = 1;
        }

        if (numberOfMatches == 20 && playersChoice == 0) {
            selectingComputer = 3;
            return selectingComputer;
        }

        selectingComputer = 4 - playersChoice;

        return selectingComputer;
    }

}
