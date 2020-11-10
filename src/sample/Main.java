package sample;


import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


import static java.lang.Math.random;

public class Main  {



    public static void main(String[] args) throws Exception{
     /**   File file = new File("C:/Projects_training/Connection/TestJava/src/sample/city.txt");
        Scanner scan = new Scanner(new FileInputStream(file));
        while(scan.hasNext()){

            System.out.println(scan.next());
        }

        List<String> arrayList = Arrays.asList("sam","willams","java","robert");


        arrayList.stream().filter(name -> !name.equalsIgnoreCase("sam")).reduce()
                   .forEach(System.out::println);
        /*int[] i = {1,52,44,5,46};
        char[] cset = {'s','d'};
        Predicate<Integer> p = v->v>10;
        Predicate<Integer> p2 = v->v%2 == 0;
        Supplier<String> str = ()-> {
                                  return String.valueOf( (int) (Math.random() * 1000000));
                                   };
         System.out.println("test result"+p2.negate().test(10));
        for (int s:i) {
            if(p2.negate().test(s))
            {
                System.out.println(s);
            }


        }
        System.out.println(str.get());*/
        //Runnable r = ()->{for(int i=0;i<10;i++){System.out.println("Child");}};
        //Thread t = new Thread(r);
        //r.run();
       // t.start();**/

        System.out.println("Hello-world-java");

    }

}
