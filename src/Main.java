import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Random random = new Random();
        String person = "\uD83E\uDDD9";
        String monster = "\uD83E\uDDDF";
        String castle = "\uD83C\uDFF0";
        String leftBlock = " | ";
        String rightBlock = " | ";
        String wall = "+ —— + —— + —— + —— + —— +";
        int personLive = 3;
        int sizeBoard = 5;
        int personX;
        int personY;
        int step = 0;
        int castleY = 1;
        int countMonster = sizeBoard * sizeBoard - sizeBoard - 1;  //потом менять
        int castleX = 1 + random.nextInt(sizeBoard);
        String[][] board = new String [sizeBoard][sizeBoard];
        for (int y = 1; y <= sizeBoard; y++) {
            for (int x = 1; x <= sizeBoard; x++) {
                board[y - 1][x - 1] = "  ";
            }
        }


        personX = 1;
        personY = sizeBoard;
        for (int i = 0; i < countMonster; i++) {
            board[random.nextInt(sizeBoard - 1)][random.nextInt(sizeBoard)] = monster;
        }
        board[castleY - 1][castleX - 1] = castle;
        board[castleY - 1][castleX - 1] = castle;
        board[personY - 1][personX - 1] = person;


        System.out.println("Привет! Ты готов начать играть в игру? (Напиши: ДА или НЕТ)");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        System.out.println("Ваш ответ:\t" + answer);

        switch (answer) {
            case "ДА", "y": {
                System.out.println("Начинаем играть");
                System.out.println("Выберит сложность игры (от 0 до 5):");
                int difficultGame = scanner.nextInt();
                System.out.println("Выбранная сложность:\t" + difficultGame);

                while (true) {
                //           вывод на экран игрового
                    for (String[] row : board) {
                        System.out.println(wall);
                        for (String col : row) {
                            System.out.print(leftBlock);
                            System.out.print(col);
                        }
                        System.out.println(rightBlock);
                    }
                    System.out.println(wall);
                 //                     вывод на экран игрового
                    System.out.println("Введите куда будет ходить персонаж (ход возможен только по вертикали и горизонтали на одну клетку)");
                    System.out.println("Координаты персонажа - (x: " + personX + ", y: " + personY + ")");
                    for (int i = 0; i < countMonster; i++) {
                        board[random.nextInt(sizeBoard - 1)][random.nextInt(sizeBoard)] = monster;
                    }
                    board[castleY - 1][castleX - 1] = castle;

                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    if (x != personX && y != personY) {
                        System.out.println("Некорректный ход");
                    } else if (Math.abs(x - personX) == 1 || Math.abs(y - personY) == 1) {
                        if (board[y - 1][x - 1].equals("  ")) {
                            board[personY - 1][personX - 1] = "  ";
                            personX = x;
                            personY = y;
                            step++;
                            board[personY - 1][personX - 1] = person;

                            System.out.println(
                                    "Ход корректный; новые координаты: "
                                            + personX + ", " + personY
                                            + "\nХод номер: " + step
                            );
                        } else if (board[y - 1][ x - 1].equals(castle)) {
                            System.out.println("Вы прошли игру!");
                            break;
                        } else {
                            System.out.println("Решите задачу.");
                        }
                    } else {
                        System.out.println("Координаты не изменены");
                    }

                    if (personLive <= 0) {
                        break;
                    }
                }

                if (personLive <= 0) {
                    System.out.println("Закончились жизни. Итог: ...");
                }

            } break;
            case "НЕТ":
                System.out.println("Жаль, приходи еще!");
                break;
            default:
                System.out.println("Данные введены некорректно");

        }
    }
}