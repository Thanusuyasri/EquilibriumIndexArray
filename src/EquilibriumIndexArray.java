import java.util.Scanner;

public class EquilibriumIndexArray {
    public static int equilibriumiIndexCount(int[] array)
    {
        int[] prefixSum= new int[array.length];
        prefixSum[0]=array[0];
        int min=Integer.MAX_VALUE;
        int count=0;
        for(int i=1;i<array.length;i++){
            prefixSum[i]=prefixSum[i-1]+array[i];
        }
        int n= prefixSum.length;
        for(int i=1;i<n;i++){
            if(prefixSum[i-1]==prefixSum[n-1]-prefixSum[i]){
                count++;
                if(min>i){
                    min=i;
                }
            }
        }
        if(count==0) {
            return -1;
        }
        else{
            return min;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }

        System.out.println(equilibriumiIndexCount(array));
    }
}
