public class TicTacToe {
    private String[][] field = new String[][]{{"-","-","-"},{"-","-","-"},{"-","-","-"}};
    int movesNumber = 0;
    boolean finished = false;

    public void newGame(){
        field = new String[][]{{"-","-","-"},{"-","-","-"},{"-","-","-"}};
        movesNumber = 0;
        finished = false;
    }

    public String[][] getField(){
        return field;
    }

    public String makeMove(int x, int y){
        if (finished)
            return "Game was ended";
        if (!field[x - 1][y - 1].equals("-"))
            return String.format("Cell %d, %d is already occupied", x, y);
        field[x-1][y-1] = movesNumber % 2 == 0 ? "X" : "0";
        movesNumber++;
        if (movesNumber >= 5 && checkGame() != null){
            if (checkGame().equals("D")){
                finished = !finished;
                return "Draw";
            }
            finished = !finished;
            return "Player " + checkGame() + " won";
        }

        return "Move completed";
    }
    public String checkGame(){
        String result = null;
        String row;
        String column;
        int counter = 0;
        for (int i = 0; i < 3; i++){
            row = field[i][0];
            for (int j = 0; j < 3; j++){
                if (!row.equals(field[i][j])) {
                    continue;
                }
                else if (row.equals(field[i][j]) && counter == 2 && !row.equals("-")) {
                    return field[i][j];
                }
                counter++;
                row = field[i][j];
            }
            counter = 0;
        }
        for (int i = 0; i < 3; i++){
            column = field[0][i];
            for (int j = 0; j < 3; j++){
                if (!column.equals(field[j][i])) {
                    continue;
                }
                else if (column.equals(field[j][i]) && counter == 2 && !column.equals("-")) {
                    return field[j][i];
                }
                column = field[j][i];
                counter++;
            }
            counter = 0;
        }
        if ( (field[0][0].equals(field[1][1]) && field[1][1].equals(field[2][2]) && !field[1][1].equals("-"))
        || (field[0][2].equals(field[1][1]) && field[1][1].equals(field[2][0])) && !field[1][1].equals("-") )
            return field[1][1];
        if (movesNumber == 9)
            return "D";
        return result;
    }
}
