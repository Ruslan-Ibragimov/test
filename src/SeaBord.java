public class SeaBord {
    String[][] field = new String[][]{
            {".",".",".",".",".",".",".",".",".","."},
            {".",".",".",".",".",".",".",".",".","."},
            {".",".",".",".",".",".",".",".",".","."},
            {".",".",".",".",".",".",".",".",".","."},
            {".",".",".",".",".",".",".",".",".","."},
            {".",".",".",".",".",".",".",".",".","."},
            {".",".",".",".",".",".",".",".",".","."},
            {".",".",".",".",".",".",".",".",".","."},
            {".",".",".",".",".",".",".",".",".","."},
            {".",".",".",".",".",".",".",".",".","."}
    };

    public String[][] getField(){
        String[][] result = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (field[i][j].equals("X"))
                    result[i][j] = "x";
                else
                    result[i][j] = field[i][j];
            }
        }
        return result;
    }

    public void shoot(int line, int column, String issue){
        switch (issue) {
            case "m":
                field[line][column] = "#";
                break;
            case "h":
                field[line][column] = "X";
                break;
            case "d":
                field[line][column] = "X";
                destroyed(line,column);
                break;
        }
    }

    public void destroyed(int line, int column){
        int[][] marks = new int[][]{
                {line - 1, column}, {line + 1, column},
                {line - 1, column - 1}, {line - 1, column + 1},
                {line, column - 1}, {line, column + 1},
                {line + 1, column - 1}, {line + 1, column + 1},
        };
        for (int[] m : marks) {
            if (m[0] >= 0 && m[0] <= 9 && m[1] >= 0 && m[1] <= 9 && field[m[0]][m[1]].equals(".")) {
                field[m[0]][m[1]] = "#";
            }
        }
        field[line][column] = "x";
        for (int[] m : marks) {
            if (m[0] >= 0 && m[0] <= 9 && m[1] >= 0 && m[1] <= 9 && field[m[0]][m[1]].equals("X")) {
                destroyed(m[0],m[1]);
            }
        }
    }
    public String check(int line, int column){
        if (field[line][column].equals("X"))
            return "x";
        return field[line][column];
    }
}
