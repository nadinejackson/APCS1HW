//Nadine Jackson
//APCS1 pd2
//HW13 -- May ah Hahv S'maur, Please?
//2017-10-07

public class StatsDriver{
    public static void main(String[] args)
    {
	System.out.println("Now testing integer means:");
	System.out.println("--The average of 0 and 1 is:"); //0
	System.out.println(Stats.mean(0, 1));
	System.out.println("--The average of 2 and 6 is:"); //4
	System.out.println(Stats.mean(2, 6));
	System.out.println("--The average of 13 and 16 is:"); //14
	System.out.println(Stats.mean(13, 16));
	System.out.println("--The average of -40 and 25 is:"); //-7
	System.out.println(Stats.mean(-40, 25));

	System.out.println("\n\n||||||||||||||||||||||||||||||||\n\n");

	System.out.println("Now testing double means:");
	System.out.println("--The average of 0.0 and 1.0 is:"); //0.5
	System.out.println(Stats.mean(0.0, 1.0));
	System.out.println("--The average of 2.1 and -3.6 is:"); //-0.75
	System.out.println(Stats.mean(2.1, -3.6));
	System.out.println("--The average of 5.5 and 5.5 is:"); //5.5
	System.out.println(Stats.mean(5.5, 5.5));

	System.out.println("\n\n||||||||||||||||||||||||||||||||\n\n");

	System.out.println("Now testing integer maximums:");
	System.out.println("--The maximum of 0 and 1 is:"); //1
	System.out.println(Stats.max(0, 1));
	System.out.println("--The maximum of 2 and 2 is:"); //2
	System.out.println(Stats.max(2, 2));
	System.out.println("--The maximum of -3 and -15 is:"); //-3
	System.out.println(Stats.max(-3, -15));
	System.out.println("--The maximum of 20 and 1 is:"); //20
	System.out.println(Stats.max(20, 1));

	System.out.println("\n\n||||||||||||||||||||||||||||||||\n\n");
	
	System.out.println("Now testing double maximums:");
	System.out.println("--The maximum of 0.0 and 0.1 is:"); //0.1
	System.out.println(Stats.max(0.0, 0.1));
	System.out.println("--The maximum of 0.0 and 1.0 is:"); //1.0
	System.out.println(Stats.max(0.0, 1.0));
	System.out.println("--The maximum of 4.53 and 4.53 is:"); //4.53
	System.out.println(Stats.max(4.53, 4.53));
	System.out.println("--The maximum of 2.334 and 2.335 is:"); //2.335
	System.out.println(Stats.max(2.334, 2.335));

	System.out.println("\n\n||||||||||||||||||||||||||||||||\n\n");
	
	System.out.println("Now testing integer geometric means:");
	System.out.println("--The geometric mean of -2 and 5 is:"); //0 <--interesting
	System.out.println(Stats.geoMean(-2, 5));
	System.out.println("--The geometric mean of 3 and 3 is:"); //3
	System.out.println(Stats.geoMean(3, 3));
	System.out.println("--The geometric mean of 4 and 9 is:"); //6
	System.out.println(Stats.geoMean(4, 9));
	System.out.println("--The geometric mean of 8 and 17 is:"); //11
	System.out.println(Stats.geoMean(8, 17));

	System.out.println("\n\n||||||||||||||||||||||||||||||||\n\n");
	
	System.out.println("Now testing double geometric means:");
	System.out.println("--The geometric mean of 2.0 and 18.00 is:"); //6.0
	System.out.println(Stats.geoMean(2.0, 18.0));
	System.out.println("--The geometric mean of 25.0 and 36.0 is:"); //30.0
	System.out.println(Stats.geoMean(25.0, 36.0));
	System.out.println("--The geometric mean of 3.7 and 6.8 is:"); //5.015974481593981
	System.out.println(Stats.geoMean(3.7, 6.8));
	System.out.println("--The geometric mean of 0.0 and 1.0 is:"); //0.0
	System.out.println(Stats.geoMean(0.0, 1.0));
	       
	System.out.println("\n\nNEW STUFF NEW STUFF NEW STUFF NEW STUFF NEW STUFF NEW STUFF NEW STUFF NEW STUFF NEW STUFF NEW STUFF NEW STUFF NEW STUFF\n\n");
	System.out.println("Now testing integer maximums with three inputs:");
	System.out.println("--The maximum of 0, 1 and 1 is:"); //1
	System.out.println(Stats.max(0, 1, 1));
	System.out.println("--The maximum of 3, 2 and 1 is:"); //3
	System.out.println(Stats.max(3, 2, 1));
	System.out.println("--The maximum of -3, -16 and -15 is:"); //-3
	System.out.println(Stats.max(-3, -16, -15));
	System.out.println("--The maximum of 20, 0 and 31 is:"); //31
	System.out.println(Stats.max(20, 0, 31));

	System.out.println("\n\n||||||||||||||||||||||||||||||||\n\n");
	
	System.out.println("Now testing double maximums with three inputs:");
	System.out.println("--The maximum of 0.0, 0.01 and 0.1 is:"); //0.1
	System.out.println(Stats.max(0.0, 0.01, 0.1));
	System.out.println("--The maximum of 40.0, -2.2 and 1.0 is:"); //40.0
	System.out.println(Stats.max(40.0, -2.2, 1.0));
	System.out.println("--The maximum of 4.53, 3.2 and 4.53 is:"); //4.53
	System.out.println(Stats.max(4.53, 3.2, 4.53));
	System.out.println("--The maximum of 4.0, 5.0 and 3.0 is:"); //2.335
	System.out.println(Stats.max(4.0, 5.0, 3.0)); //5.0

	System.out.println("\n\n||||||||||||||||||||||||||||||||\n\n");
	
	System.out.println("Now testing integer geometric means with three inputs:");
	System.out.println("--The geometric mean of -2, 10 and 5 is:"); //0 <-interesting
	System.out.println(Stats.geoMean(-2, 10, 5));
	System.out.println("--The geometric mean of 3, 3 and -3 is:"); //0 <-interesting
	System.out.println(Stats.geoMean(3, 3, -3));
	System.out.println("--The geometric mean of 5, 7 and 9 is:"); //6
	System.out.println(Stats.geoMean(5, 7, 9));
	System.out.println("--The geometric mean of 1, 8 and 27 is:"); //5
	System.out.println(Stats.geoMean(1, 8, 27));

	System.out.println("\n\n||||||||||||||||||||||||||||||||\n\n");
	

	System.out.println("Now testing double geometric means with 3 inputs:");
	System.out.println("--The geometric mean of 2.0, 2.0 and 2.0 is:"); //2.0
	System.out.println(Stats.geoMean(2.0, 2.0, 2.0));
	System.out.println("--The geometric mean of 23.4, 36.2 and 36.0 is:"); //31.24225045171623
	System.out.println(Stats.geoMean(23.4, 36.2, 36.0));
	System.out.println("--The geometric mean of 1.01, 3.99 and 54.0 is:"); //6.0149103509352
	System.out.println(Stats.geoMean(1.01, 3.99, 54.0));
	System.out.println("--The geometric mean of 0.0, 23.5 and 9059050940.0 is:"); //0.0
	System.out.println(Stats.geoMean(0.0, 23.5, 9059050940.0));
    }
}
