import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String person = "\uD83E\uDDD9";
        String monster = "\uD83E\uDDDF";

        int personLive = 3;
        int sizeBoard = 5;
        int personX;
        int personY;
        int step = 0;

        personX = 1 + sizeBoard / 2;
        personY = 1 + sizeBoard / 2;
        // \n, \t - спец символ
        String gamingField = "+ —— + —— + —— + —— + —— +\n"
                + "|    |    |    |    |    |\n"
                + "+ —— + —— + —— + —— + —— +\n"
                + "|    |    |    |    |    |\n"
                + "+ —— + —— + —— + —— + —— +\n"
                + "|    |    | " + monster + " |    |    |\n"
                + "+ —— + —— + —— + —— + —— +\n"
                + "|    |    |    |    |    |\n"
                + "+ —— + —— + —— + —— + —— +\n"
                + "| " + person + " |    |    |    |    |\n"
                + "+ —— + —— + —— + —— + —— +";

        System.out.println("Привет! Ты готов начать играть в игру? (Напиши: ДА или НЕТ)");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        System.out.println("Ваш ответ:\t" + answer);

        int x;
        if (answer.equals("ДА")) {
            System.out.println("Начинаем играть");

            System.out.println("Введите куда будет ходить персонаж (ход возможен только по вертикали и горизонтали на одну клетку)");
            System.out.println("Координаты персонажа - (x: " + personX + ", y: " + personY + ")");

            x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x != personX){
                if (y != personY) {
                    System.out.println("Некорректный ход");
                }
            }
        } else if (answer.equals("НЕТ")) {
            System.out.println("Почему ты не захотел со мной играть? :(");
        } else {
            System.out.println("гагагагага");

        }


    }
}