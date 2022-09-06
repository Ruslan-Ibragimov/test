public class ToLine {
    int[][] data;
    int counter = 0;

    public ToLine(int[][] data) {
        this.data = data;
    }

    public int[] resize() {
        int[] line = new int[data.length * data[0].length];
            for (int[] datum : data) {
                for (int j = 0; j < data[0].length; j++) {
                    System.out.println(j);
                    line[counter] = datum[j];
                    counter++;
                }
            }

        return line;
    }
}
