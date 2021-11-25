package service;

public class ComputerLogic {

    public int makeMove(int numberOfMatches) {
        if (numberOfMatches == 20) {
            numberOfMatches -= 3;
            return numberOfMatches;
        }
        return numberOfMatches;
    }

}
