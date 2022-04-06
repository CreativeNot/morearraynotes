import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        //array lists
        ArrayList<String> names = new ArrayList<>();

        /**
         * object wrapper classes
         * object class is same as primitive with capital letter
         * double is Double
         * exceptions:
         * char is Character
         * int is Integer
         */

        names.add("Tom");
        names.add("Jerry");
        names.add("Dick");

        names.add(2, "Poppy");

        System.out.println(names);
        System.out.println("The size is: " + names.size());

        //in an array length is how much space is using, array lists auto adds spots

        ArrayList<Double> salaries = new ArrayList<>();

        salaries.add(123.14);
        salaries.add(125.12);
        salaries.add(9942.32);
        salaries.add(1231.23);

        System.out.println(salaries);

        ArrayList<Integer> favNums = new ArrayList<>();

        favNums.add(1);
        favNums.add(4);
        favNums.add(6);
        favNums.add(32);

        System.out.println(favNums);

        for (double d:salaries) //unboxing the array, e.g. listing out all elements in the array
        {
            System.out.println(d);
        }

        for (int dex = 0; dex < salaries.size(); dex++)
        {
            System.out.println(salaries.get(dex));
        }
        //code to sum the array and calc the avg
        double sumSalaries = 0;
        double average = 0;

        for (double d:salaries)
        {
            sumSalaries += d;
        }
        System.out.println();
        System.out.println("The sum is: " + sumSalaries);

        average = sumSalaries / salaries.size();
        System.out.println("The average is: " + average);

        int sumFavs = 0;
        double avgFav = 0;

        for (int x:favNums)
        {
            sumFavs += x;
        }
        System.out.println("The sum is: " + sumFavs );
        avgFav = sumFavs / favNums.size();
        System.out.println("The average is: " + avgFav);

    }
}
