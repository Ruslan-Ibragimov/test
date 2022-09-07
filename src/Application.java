import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {
    public static void main(String[] args) {
        /*
        String text = "Regular Expressions or Regex is an API for defining String patterns that can be used for searching, manipulating and editing a text. It is widely used to define a constraint on strings such as a password. Regular Expressions are provided under java.util.regex package.";
        Pattern pattern = Pattern.compile("\\bs\\w*?s\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Found match\n" + text.substring(start, end) + "\nfrom " + start + " to " + (end - 1));
        }

        Balance balance = new Balance();
        balance.addLeft(1);
        balance.addRight(0);
        System.out.println(balance.getSituation());

        Bell bell = new Bell();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();

        Payer p = new Payer("Ibragimov", "Ruslan", "SaintP", "Hog6255");
        System.out.println( p.toString() );

        Dog dog = new Dog("Bobik", 2);
        System.out.println(dog.getAge());
        System.out.println(dog.getName());
        System.out.println(dog.bark());
        dog.setAge(3);
        dog.setName("Graf");
        System.out.println(dog.getAge());
        System.out.println(dog.getName());
        System.out.println(dog.bark());

        Programmer prgm = new Programmer("Ruslan", "AnyLogic");
        System.out.println(prgm.getPosition());
        prgm.work();
        System.out.println(prgm.getPosition());
        prgm.work();
        System.out.println(prgm.getPosition());
        prgm.work();
        System.out.println(prgm.getPosition());
        prgm.work();
        System.out.println(prgm.getPosition());
        prgm.work();
        System.out.println(prgm.getPosition());
        prgm.work();
        System.out.println(prgm.getPosition());



        LimitingRectangle r = new LimitingRectangle(new int[][] {{5,3},{-1,-3},{0,500},{3,-5}});
        System.out.println(r.getWidth() + " " + r.getHeight());
        System.out.println(r.getBorders());

        Separator s = new Separator(new int[] {1,2,3,7,8,275,774,5,9,22});
        System.out.println(Arrays.toString(s.odd()));
        System.out.println(Arrays.toString(s.even()));


        ToTable a = new ToTable(new int[] {1, 2, 3, 4, 5, 6}, 2, 3);
        int[][] arr = a.resize();
        System.out.println(Arrays.deepToString(arr));

        ToLine b = new ToLine(new int[][] {{5, 2}, {33, 4}, {543, 6}});
        System.out.println(Arrays.toString(b.resize()));



        Mage m = new Mage("Ruslan", 88, 200, "ice");
        Mage m1 = new Mage("Ilyana", 88, 199, "fire");
        System.out.println(m.fight(m1));

         */
//        TicTacToe board = new TicTacToe();
//        System.out.println(board.checkGame());
//        printField(board);
//        System.out.println(board.makeMove(1, 1));
//        printField(board);
//        System.out.println(board.makeMove(1, 1));
//        printField(board);
//        System.out.println(board.makeMove(1, 3));
//        printField(board);
//        System.out.println(board.makeMove(2, 2));
//
//        System.out.println(board.makeMove(2, 1));
//        printField(board);
//        System.out.println(board.makeMove(2, 3));
//        System.out.println(board.makeMove(3, 2));
//        System.out.println(board.makeMove(3, 1));
//        System.out.println(board.makeMove(3, 3));
//        printField(board);
//        System.out.println(board.checkGame());
//        System.out.println(board.makeMove(1, 2));
//        System.out.println(board.makeMove(2, 2));
//        printField(board);
//        System.out.println(board.makeMove(1, 2));
//        printField(board);
//        System.out.println(board.makeMove(1, 2));
//        printField(board);
//        System.out.println(board.makeMove(2, 3));
//        printField(board);
//        System.out.println(board.makeMove(3, 3));
//        printField(board);
//        System.out.println(board.makeMove(1, 3));
//        printField(board);
//    }
//
//    public static void printField(TicTacToe board){
//        System.out.println(Arrays.toString(board.getField()[0]) + "\n"
//                + Arrays.toString(board.getField()[1]) + "\n"
//                + Arrays.toString(board.getField()[2]));

        SeaBord board = new SeaBord();
//        board.shoot(0, 0, "m");
//        board.shoot(2, 0, "h");
        board.shoot(6, 9, "h");
        board.shoot(5, 5, "d");
        for (int i = 0; i < board.getField().length; i++) {
            for (int j = 0; j < board.getField()[0].length; j++) {
                System.out.print(board.getField()[i][j] + " ");
            }
            System.out.println();
        }
    }
}


