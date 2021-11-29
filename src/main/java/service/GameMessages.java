package service;

public class GameMessages {

    public void printGameStarted() {
        System.out.println("Игра началась");
    }

    public void printNumberOfMatches(int numberOfMatches) {
        System.out.println("На столе осталось " + numberOfMatches + " спичек.");
    }

    public void printNumberOfMatchesSelectedByTheComputer(int selectingComputer) {
        System.out.println(" - Количество выбранных компьютером спичек = " + selectingComputer + ".");
    }

    public void printRequestToEnterTheNumberOfMatches() {
        System.out.print(" - Ход игрока. Введите количество спичек: ");
    }

    public void printRequestToEnterTheCorrectNumberOfMatches() {
        System.out.print(" - Введите количество спичек от 1 до 3: ");
    }

    public void printTheLastMatchPlayer() {
        System.out.println("Для игрока осталась последняя спичка. Игрок проиграл!");
    }

    public void printTheLastMatchComputer() {
        System.out.println("Для компьютера осталась последняя спичка. Компьютер проиграл!");
    }

}
