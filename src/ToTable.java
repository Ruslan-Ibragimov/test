public class ToTable {
    int[] data;
    int x;
    int y;
    int counter = 0;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    public int[][] resize(){
        int[][] table = new int[x][y];
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                table[i][j] = data[counter];
                counter++;
            }
        }
        return table;
    }
}
