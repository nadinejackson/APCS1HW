public class Passer {
    public static int add1(int num) {
	num += 1;
	return num;
    }

    public static int arrAdd1(int[] arr, int pos) {
	arr[pos] = arr[pos] + 1;
	return arr[pos];

    }
    public static void main(String[] args) {
	//===int===
	int num = 53;
	System.out.println(num);
	add1(num);
	System.out.println(num);
	//=====Arrays======
	int[] arr = new int[3];
	arr[0] = 1;
	arr[1] = 2;
	arr[2] = 3;
	System.out.println(arr);
	System.out.println(arr[0]);
	arrAdd1(arr, 0);
	System.out.println(arr);
	System.out.println(arr[0]);
	//primitives are passed by value
	//Everything else (Arrays) are passed by reference
	
    }








}
