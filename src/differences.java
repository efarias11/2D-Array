public class differences {
    public static void main(String[] args) throws Exception {
        double[][] grades = {{83.1, 85.6, 87.3, 86.6},
                             {85.1, 84.5, 89.2, 87.2},
                             {82.2, 88.4, 88.1, 85.3}};
        double sum = 0;
        double avg = 0;
        double high = 0;
        double low = 100; // set low to 100, because nothing can be higher than 100 (if 0 avg will always be 0)
        int highindex = 0;
        int lowindex = 0;

        for(int i=0; i<grades.length; i++){ // goes through the rows (unkown value) first 
            for(int j=0; j<grades[i].length; j++){ // goes though columns (unkown value) next
                sum += grades[i][j];
            }
            avg = sum/grades[i].length; // finds the average of the current row 
            System.out.println("Section "+(i+1)+ " average = "+avg);
            
            if(avg < low){
                low = avg;
                lowindex = i+1;
            }
               
            if(high<avg){
                high = avg;
                highindex = i+1;
            }
            
            
            avg = 0; 
            sum = 0;
        }
    System.out.println("Section "+lowindex+" had the lowest average: "+ low); 
    System.out.println("Section "+highindex+" had the highest average: "+ high);
    }
}
