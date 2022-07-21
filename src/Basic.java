import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  //      System.out.print("Example");
 /*

       System.out.print("Demo     dklasklfnadfdnf  2895y3568y3589   kbmd");
  */
        System.out.println("Demo");
        System.out.println("Demo");
        char a  ='c';
        System.out.println(a);
        a = 's';
        System.out.println(a);
        String name = "      Kamlesh";
        System.out.println(name);
        int age = 78;
        System.out.println(age);
        double d  = 5.6;
        System.out.println(d);
        float f = 5f;
        System.out.println(f);
        boolean isTrue = true;
        System.out.println(isTrue);
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf('s'));
        System.out.println(name.concat("Kamlesh"));
        System.out.println(name+name);
        System.out.println("My name is "+name);
        System.out.println(name.trim());


        System.out.println("Enter your name :- ");
        name = scanner.next();
//        name = scanner.nextLine();




        System.out.println(name);


        System.out.println("Enter your age ");

        age  = scanner.nextInt();

        System.out.println(age);
        int ph  = 1234567890;
        System.out.println(ph);

    }
}
