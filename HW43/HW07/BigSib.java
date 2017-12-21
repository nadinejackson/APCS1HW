//Nadine Jackson
//APCS1 pd02
//HW07 -- On the Origins of a Big Sib
//2017-09-26

public class BigSib {
    public BigSib(){
	helloMsg = "A very dry hello to you";//setting a default just in case
    }
    public BigSib(String hello){//overloaded constructor
	helloMsg = hello;//at birth, the method can set the helloMsg to whatever is specified
    }
    public String helloMsg; //a variable we can use later, made it public
    public void setHelloMsg( String newMsg ){ //we've got a message as an input
	helloMsg = newMsg; //and now we change the variable from before
    }
    public String greet(String name) { //will output a string like before
	return(helloMsg+", "+name); //accepts a variable and uses the one defined above, too
    }
}
