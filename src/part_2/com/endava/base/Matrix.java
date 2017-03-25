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

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public void createMatrix(int rows, int columns){
        int randomNumber;
        boolean numberIsNotUnique = true;
        boolean innerFlag;
        for(int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                while(numberIsNotUnique) {
                    randomNumber = (int) (Math.random() * (columns * rows) + 1);
                    innerFlag = this.checkIfNumberIsUnique(randomNumber);
                    if(innerFlag) {
                        matrix[i][j] = randomNumber;
                        numberIsNotUnique = false;
                    }
                }
                numberIsNotUnique = true;
            }
        }
    }

    public boolean checkIfNumberIsUnique(int number) {
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


    public void printMatrix(){
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
                this.matrix[i][j] = 0;
            }
        }
    }
}
