import java.util.* ; 
public class Patterns {
  public static void main(String[] args) {
     try (Scanner Sc = new Scanner(System.in)) {
        System.out.println("Type the size of Pattern");
        int n = Sc.nextInt() ;
        pattern1(n);
        System.out.println("");
        System.out.println("");
        System.out.println("");

        pattern2(n);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        pattern3(n);
         System.out.println("");
        System.out.println("");

        pattern4(n);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        pattern5(n);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        pattern6(n);
     }
}
public static void pattern1(int n) {
   for(int i = 0 ; i < n+1  ; i++ ){
      for(int j = 0 ; j < i ; j++) {
        System.out.print(" * ");
      }
      System.out.println(" ") ;
    }
  }

public static void pattern2(int n ) { 
  for(int i = 0 ; i <= n ;  i++) {
    for(int j = 0 ; j < n-i ; j++) {
    System.out.print(" * ");

    }
        System.out.println("");
  }
}


public static void pattern3(int n )  {
for(int i = 0 ; i <= n ; i++) {
  for(int j = 0 ; j <= n ; j++) {
    if(i==n||j==n||i==0|j==0) {
      System.out.print(" * ");}
    else{
      System.out.print("   ");
  }
}
     System.out.println("");
     for(int j = 0 ; j <=i ; j++) {
     System.out.print("*"  );}
}
}

public static void pattern4(int n) {
    // 1. TOP HALF OF THE BUTTERFLY
    for (int i = 1; i <= n; i++) {
        // Left stars
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        // Middle spaces
        for (int j = 1; j <= 2 * (n - i); j++) {
            System.out.print(" ");
        }
        // Right stars
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println(); // Move to the next row
    }

    // 2. BOTTOM HALF OF THE BUTTERFLY
    for (int i = n; i >= 1; i--) {
        // Left stars
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        // Middle spaces
        for (int j = 1; j <= 2 * (n - i); j++) {
            System.out.print(" ");
        }
        // Right stars
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println(); // Move to the next row
    }
}

public static void pattern5(int n) {
    // 1. UPPER PART OF THE HEART (The two bumps)
    // We start from n/2 to get the proper height for the arches
    for (int i = n / 2; i <= n; i += 2) {
        
        // Left space before the first bump
        for (int j = 1; j < n - i; j += 2) {
            System.out.print(" ");
        }

        // First bump stars
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }

        // Space between the two bumps
        for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }

        // Second bump stars
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }

        System.out.println();
    }

    // 2. LOWER PART OF THE HEART (The inverted triangle)
    for (int i = n; i >= 1; i--) {
        // Spaces to create the inward slope
        for (int j = i; j < n; j++) {
            System.out.print(" ");
        }

        // Stars for the body and point
        for (int j = 1; j <= (i * 2) - 1; j++) {
            System.out.print("*");
        }

        System.out.println();
    }
}
 
public static void pattern6(int n) {
    for(int i = 0 ; i < n ; i++) {
        for(int j = 0 ; j < n ; j++) {
            if(i==0||i==n||j==0||j==n) {
                System.out.print("*");
            }
            else {System.out.print(" ");}
        }
        System.out.println("");
    }
 }
}
