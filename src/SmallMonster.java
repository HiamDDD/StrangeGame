import java.util.Scanner;
import java.util.Random;

public class SmallMonster extends Monster  {
    SmallMonster (int sizeBoard) {
        super (sizeBoard);

        setImage("\uD83D\uDC7A");
    }
    @Override
    public boolean taskMonster  (int difficultGame) {
        if (difficultGame == 1){
            return  taskMonster();
        } else {

            System.out.println("Решите задачу:");

            Random random = new Random();

            int a = random.nextInt(10 * (difficultGame - 1), 10 * difficultGame);
            int x = random.nextInt(10 * (difficultGame - 1), 10 * difficultGame);
            int b = -a * x;

            System.out.println(a + " * x + " + b + " = 0");

            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();

            if (answer == x) {
                System.out.println("Верно! Ты победил монстра");
                return true;
            } else {
                System.out.println("Ты проиграл эту битву!");
                return false;
            }
        }
    }

    public boolean taskMonster () {
        return super.taskMonster(1);
    }
}
