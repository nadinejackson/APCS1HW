//Kathleen Wong, Benjamin Shapiro, Aidan Griffin
//Team : The CocaCola Company
//APCS1 pd1
//HW35 -- A Rising Tide of Knowledge Lifts All Thinkers
// 2017-11-17

public class Passer{

    public static double foo(int b){
        b = b + 5;
    return (double) b;
    }
    
    public static void main(String[] args){
    int a = 3;
    System.out.println(a);//returns 3
    foo(a);
    System.out.println(a);//returns 3
    }
}
