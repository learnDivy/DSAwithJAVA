import java.util.* ;
public class OOPS  { 


    public static void main (String args[]) {
    Pen p1 = new Pen() ; //Created new oBJECT 
    try(Scanner Sc = new Scanner (System.in)) {
        System.out.println("Type the line you wanna print") ;
    p1.color = Sc.nextLine() ;
    System.out.println("Type the number") ;
    p1.tip = Sc.nextInt() ;
    System.out.println("The Results are") ;
    System.out.println(p1.color) ;
    System.out.println(p1.tip) ;

}}


}
class Pen {
    String color ; 
    int tip ; 

    void setColor(String newColor) {
        color  = newColor ;
    }
    void setTip(int newtip) {
        tip = newtip ;
    }
}

class Student {
    String name ; 
    int age ; 
    float percentage ; 

   
}
