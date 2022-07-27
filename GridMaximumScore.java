import java.util.Arrays;

public class GridMaximumScore {
    public static void main(String[] args) {
        int arr[][] =new int[][]{{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        int sum = InitialSum(arr);
        for(int i=0;i<arr.length;i++){
            int [ ][ ] clone = new int[arr.length][];
            for(int j = 0; j < arr.length; j++)
            clone[j] =  arr[j].clone();
            clone[i]=FlipNumbers(clone[i]);
            int result = InitialSum(clone);
            sum = Math.max(sum, result);
        }

        for(int j=0;j<arr[0].length;j++){
            int [ ][ ] clone = new int[arr.length][];
            for(int k = 0; k < arr.length; k++)
            clone[k] =  arr[k].clone();
            UpdateColumn(clone,j);
            int[][] check = clone;
            int result = InitialSum(clone);
            sum = Math.max(sum, result);
        }

        System.out.println(sum);    

    }

    private static void UpdateColumn(int[][] grid,int col) {
        for(int i=0;i<grid[0].length-1;i++){
            grid[i][col] = grid[i][col] == 1 ? 0 :1; 
        }
    }

    public static int InitialSum(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            int n = grid[i].length-1;
            for (int j = 0; j < grid[i].length; j++) {
                int colVal = grid[i][j];
                sum += colVal * (1 << n);
                n--;
            }
        }
        return sum;
    }

    public static int[] FlipNumbers(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i] == 1? 0:1;
        }
        return arr;
    }
    // private static int EmptyMovesSum(List<List<Integer>> grid) {
    // int max=0,sum=0;
    // for(int i=0;i< grid.size();i++){
    // int n = grid.get(i).size()-1;
    // for(int j=0; j < grid.get(i).size();j++){
    // int colVal= grid.get(i).get(j);
    // sum+= colVal * (1 << n);
    // n--;
    // }
    // }
    // return sum;
    // }

    // private static int RowsMovesSum(List<List<Integer>> grid) {
    // int max=0;
    // for(int i=0;i< grid.size();i++){
    // int sum=0;
    // int n = grid.get(i).size()-1;
    // for(int j=0; j < grid.get(i).size();j++){
    // int colVal= grid.get(i).get(j);
    // colVal= (colVal == 1 ? 0 : 1);
    // sum+= (colVal) * (1 << n);
    // n--;
    // }
    // max=Math.max(max, sum);
    // }
    // return max;
    // }
}
