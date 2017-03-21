package part_2.com.endava.base;

/**
 * Created by sbogdanschi on 21/03/2017.
 */
public class Matrix {
    private int[][] matrix;
    private int columns;
    private int rows;

    public Matrix() {
        initMatrix(3, 3);
        createMatrix(3, 3);
    }

    public Matrix(int rows, int columns) {
        this.columns = columns;
        this.rows = rows;
        matrix = new int[rows][columns];
        this.initMatrix(rows, columns);
        this.createMatrix(rows, columns);
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void createMatrix(int rows, int columns){
        int tmp;
        boolean outerFlag = true;
        boolean innerFlag = true;
        for(int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                while(outerFlag) {
                    tmp = (int) (Math.random() * (columns * rows) + 1);
                    innerFlag = this.checkNum(tmp);
                    if(innerFlag) {
                        matrix[i][j] = tmp;
                        outerFlag = false;
                    }
                }
                outerFlag = true;
            }
        }
    }

    public boolean checkNum(int number) {
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                if(number == this.matrix[i][j]){
                    return false;
                } else if(number != this.matrix[i][j]) {
                    continue;
                }
            }
        }
        return true;
    }


    public void print(){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                if(j != columns - 1)
                    System.out.print(this.matrix[i][j] + " ");
                else {
                    System.out.print(this.matrix[i][j] + "\n");
                }
            }
        }
    }

    public void initMatrix(int rows, int columns){
        for( int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                this.matrix[i][j] = -1;
            }
        }
    }
}
