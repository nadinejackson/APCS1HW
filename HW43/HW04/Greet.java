//Nadine Jackson
//APCS1 pd02
//HW04 -- A Classy Division of Labor
//2017-09-18
//public class Greet {
//    public static void main( String[] args){
//	System.out.println("No hablo queso");
//    }
//}
public class Greet {
    public static void greet( String name ){
	System.out.print("Why hello there, ");
	System.out.print(name);
	System.out.println(". How do you do?");
    }
    public static void main( String[] args ){
	greet("Marie Joseph Paul Yves Roch Gilbert du Motier, Marquis de Lafayette");
	greet("not Nadine the Bold");
	greet("three hardcoded persons of interest");
    }
}
/*This is similar to hello world in Scheme and Python because there is a way to say to print a line, I assume, with print ln. The differences seem to be with the way a function is structured (if it is a function at all). There is something called a class, which was not in either other coding language.*/ 
