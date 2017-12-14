//Contributors: Maggie Zhao, Susan Lin, Victor Lin

public class Passer{
    public static void method(int x){
		x += 3;
    }

    public static void method2(String x){
		x += "asdasdasdasdads";
    }

    public static void printArray(double[] x){
		for(double y: x){
			System.out.println(y);
		}
    }

    public static void method3(double []x){
		for(int i = 0;i<x.length;i++){
			x[i] = i + 100.0;
		}
    }
    
    public static void main (String []args){
		int a = 3;
		System.out.println(a);
		method(a);
		System.out.println(a);
		
		String b = "hello";
		System.out.println(b);
		method2(b);
		System.out.println(b);
		
		double[] array = {2.0,1.6,3.56,6.4};
		printArray(array);
		method3(array);
		printArray(array);
    }
}
