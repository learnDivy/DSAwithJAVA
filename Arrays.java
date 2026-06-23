import java.util.* ;

public class Arrays {
    public static void main (String[] args) {
        System.out.println("New Array of Light ");
        try(Scanner Sc = new Scanner (System.in)){
            
             System.out.println("Enter the Size of the Array  : ");
            int n = Sc.nextInt() ; 
            System.out.println("Enter the Arrya Numbers : ");
            int[] arr = new int[n] ; 
            
            for(int i = 0 ; i < n ; i++) {
                arr[i] = Sc.nextInt() ; 
            }
            int c = 0 ; 
              for(int i = 0 ; i < n ; i++) {
              System.out.print(arr[i] + "  "); 
               c += arr[i] ;
            }
             System.out.println("The total of the array is  " + c);
            
        }
    }
    
}
