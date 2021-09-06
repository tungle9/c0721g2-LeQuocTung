package _03_array_and_method.excercise;

public class PlusArray {
    public static void main(String[] args) {
        int []a = {1,2,3,4,5};
        int []b = {6,5,4};
        int temp = a.length + b.length;
        int []ab = new int[temp];
        for ( int i = 0 ; i < a.length;i++){
            ab[i] = a[i] ;
        }
        for ( int i = a.length ; i < ab.length;i++){
            ab[i] = b[i - a.length];
        }
        for(int i = 0 ; i < ab.length;i++){
            System.out.print(ab[i]+"\t");
        }
    }
}
