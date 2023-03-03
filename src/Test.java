import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();
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
        int i = 0;
        while (i == 0) {
            System.out.println(menu);
            int answer = sc.nextInt();
            switch (answer) {
                case 1:
                    if (list.size() < 11) {
                        System.out.println("Which type of Shape \n 1.Circle \n 2.Rectangle ");
                        int response = sc.nextInt();
                        if (response == 1) {
                            Circle circle = new Circle();
                            list.add(circle);
                        } else if (response == 2) {
                            Rectangle rec = new Rectangle();
                            list.add(rec);
                        }
                    } else{
                        System.out.println("You have reached the max limit");
                        i = 1;}
                    break;
                case 2:
                    if (list.size() != 0) {
                        System.out.println("For which object (Enter an integer)");
                        int response1 = sc.nextInt();
                        if (response1 < list.size()+1) {
                            System.out.println("Enter the xcoordinate for the origin");
                            double xor = sc.nextDouble();
                            System.out.println("Enter the ycoordinate for the origin");
                            double yor = sc.nextDouble();
                            Shape s = list.get(response1-1);
                            s.setorigin(xor, yor);
                        }
                        else
                            System.out.println("The object does not exist");
                    } else
                        System.out.println("Please make an object first");
                    break;
                case 3:
                    System.out.println("For which object (Enter an integer)");
                    int response2 = sc.nextInt();
                    if (list.size() != 0) {
                        if (response2 < list.size()+1) {
                            if (list.get(response2-1) instanceof Circle) {
                                System.out.println("Enter the radius: ");
                                double rad = sc.nextDouble();
                                ((Circle) list.get(response2)).setRadius(rad);
                            } else if (list.get(response2-1) instanceof Rectangle) {
                                System.out.println("Enter the length for the object");
                                double length = sc.nextDouble();
                                System.out.println("Enter the width for the object");
                                double width = sc.nextDouble();
                                ((Rectangle) list.get(response2-1)).setDimensions(length, width);}}
                        else
                            System.out.println("The object does not exist");   }
                    else
                        System.out.println("Please make an object first");
                    break;
                case 4:
                    if (list.size() != 0) {
                        System.out.println("For which object (Enter an integer)");
                        int response4 = sc.nextInt();
                        if (response4 < list.size()+1) {
                            list.get(response4-1).toString();}
                        else
                            System.out.println("The object does not exist");}
                    else
                        System.out.println("Please make an object first");
                    break;
                case 5:
                    if (list.size() != 0) {
                        System.out.println("which object is to be moved (Enter an integer)");
                        int response5 = sc.nextInt();
                        if (response5 < list.size()+1) {
                            System.out.println("Enter the delta x");
                            double xmove = sc.nextDouble();
                            System.out.println("Enter the delta y ");
                            double ymove = sc.nextDouble();
                            list.get(response5-1).move(xmove, ymove);}
                        else
                            System.out.println("The object does not exist");}
                    else
                        System.out.println("Please make an object first");
                    break;
                case 6:
                    if (list.size() != 0) {
                        System.out.println("First object (Enter an integer)");
                        int response6 = sc.nextInt();
                        System.out.println("Second object (Enter an integer)");
                        int response6_1 = sc.nextInt();
                        if (response6 < list.size()+1 && response6_1 < list.size()+1 ) {
                            System.out.println("The distance between the tow entered shapes is "+list.get(response6-1).distance(list.get(response6_1-1)));
                            }
                        else
                            System.out.println("The object does not exist");}
                    else
                        System.out.println("Please make an object first");
                    break;
                case 7:
                    if (list.size() != 0) {
                        System.out.println("For which object (Enter an integer)");
                        int response7 = sc.nextInt();
                            Shape s = list.get(response7-1);
                            s = null;}
                    else
                        System.out.println("Please make an object first");
                    break;
                case 8:
                    if (list.size() != 0) {
                        for (int j = 0; j <= list.size(); j++) {
                            System.out.println("The state of the object is " + list.get(j).toString()) ;}}
                    else
                        System.out.println("Please make an object first");
                    break;
                case 9:
                    i = 1;
                    break;
            }
        }
    }
}