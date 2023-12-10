public class magic {
    public static void main(String[] args) throws Exception{
        int[][] arr = {{7,12,1,14},
                       {2, 13,8,11},
                       {16,3,10,5},
                       {9,6,15,4}};
                       
        int[] rows = new int[4];
        int[] columns = new int[4];
        int diag1 = 0;
        int diag2 = 0;
        
        for(int i =0; i<arr.length; i++){ // rows 
            for(int j=0; j<arr[i].length; j++){ // columns
                rows[i]+=arr[i][j];
                // columns[i]+=arr[j][i]; can just have one nested loop and find the sum of rows and columns 
            }
        System.out.println("The sum of row "+(i+1)+" is: "+rows[i]);
        }
        for(int i =0; i<arr[0].length; i++){ // rows 
            for(int j=0; j<arr.length; j++){ // columns
                columns[i]+=arr[j][i]; 
            }
        System.out.println("The sum of columns "+(i+1)+" is: "+columns[i]);
        
    }
        int j=arr.length-1; // starts it at column (0,#)
        for(int i = 0; i<arr.length; i++){
            diag1 += arr[i][i];
            diag2 += arr[i][j];
            j--;
        }
        System.out.println("The sum of diagonal 1 is: "+diag1);
        System.out.println("The sum of diagonal 2 is: "+diag2);
    }
// 1):
/* 
ch[0][0] = '?'
ch[0][1] = 'e'
ch[0][2] = 'M'
ch[0][3] = '0'
ch[1][0] = '0'
ch[1][1] = '?'
ch[1][2] = '5'
ch[1][3] = 'H'
*/
// 2) e
// 3):
/*
list[0] = 22
list[1] = -1
list[2] = 0
list[3] = 18
list[4] = 6
list[5] = -4
list[6] = 5
list[7] = 1
 */
// 4) a
// 5) yes, the first line creates an array that establishes its size and filled with variables
//    while the second array uses the length of the first array to create an array with the same size.
}
