package service;

public class GameMessages {

    public void printGameStarted() {
        System.out.println("Игра началась");
    }

    public void printNumberOfMatches(int numberOfMatches) {
        System.out.println("На столе осталось " + numberOfMatches + " спичек.");
    }

}
