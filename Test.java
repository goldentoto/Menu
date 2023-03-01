import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = """
                What would you like to do?\s
                 1. Create up to 10 Shape objects\s
                 2. Set origin for an object :
                 3. Set dimensions for an object\s
                 4. Display the current state of an object\s
                 5. Move an object\s
                 6. Compute the distance between any two Shapes\s
                 7. Destroy an object\s
                 8. List the state of all objects\s
                 9. Quit the program""";
        System.out.println(menu);
        String answer = sc.toString();
        switch (answer){
            case "1":
                System.out.println("Which type of Shape \n 1. Circle \n 2.Rectangle ");
                int response = sc.nextInt();
                if(response == 1) {
                    Circle myshape = new Circle() ;}
                else if (response == 2) {
                Rectangle myshape = new Rectangle();}
                else

            case "2":
                System.out.println("For which object (Enter an interger)");
                int response1 = sc.nextInt();

        }
    }
}