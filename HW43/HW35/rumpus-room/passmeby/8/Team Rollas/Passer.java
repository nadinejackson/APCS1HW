public class Passer {
    public int save;
    public static void changer(int[] a) {
	a[2] = 2;
    }
    public static void changer(int a) {
	a += 1;
    }
    public static void main(String[] args) {
	int[] s = {1,3,0};
	System.out.println("Array s = {1,3,0};");
	System.out.println("s[2]");
	System.out.println(s[2]);
	changer(s);
	System.out.println("s[2] after changer is ran");
	System.out.println(s[2]);

	Passer b = new Passer();
	b.save = 5;
	System.out.println("Created Passer b, b.save = 5");
	changer(b.save);
	System.out.println("b.save after changer is ran");
	System.out.println(b.save);
    }
}
