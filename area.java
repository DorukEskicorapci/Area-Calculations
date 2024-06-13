import java.util.Scanner;

public class area {

    
    public static int areacalculator(int number){
        Scanner input = new Scanner(System.in);
        

        switch (number) {
            
            case 1:
                System.out.print("Enter side length: ");
                int side1 = input.nextInt();

                    while (side1 <= 0){
                        System.out.println("Value must be positive");
                        System.out.println();
                        System.out.print("Enter side length: ");
                        side1 = input.nextInt();
                    }

                System.out.println();
                System.out.println("Area = " + square(side1) + " br^2");
                break;
            
            case 2:
                System.out.print("Enter first side length: ");
                side1 = input.nextInt();
                System.out.print("Enter second side length: ");
                int side2 = input.nextInt();


                while (side1 <= 0 || side2 <= 0){
                    System.out.println("Value must be positive");
                    System.out.println();
                    System.out.print("Enter first side length: ");
                    side1 = input.nextInt();
                    System.out.print("Enter second side length: ");
                    side2 = input.nextInt();
                }

               

                System.out.println();
                System.out.println("Area = " + rectangle(side1, side2) + " br^2");
                break;
            case 3:
                System.out.print("Enter base length: ");
                int base = input.nextInt();
                System.out.print("Enter height length: ");
                int height = input.nextInt();

                while (base <= 0 || height <= 0){
                    System.out.println("Value must be positive");
                    System.out.println();
                    System.out.print("Enter base length: ");
                    base = input.nextInt();
                    System.out.print("Enter height length: ");
                    height = input.nextInt();
                }

                System.out.println();
                System.out.println("Area = " + triangle(base, height) + " br^2");
                break;
            case 4:
                System.out.print("Enter the length of the radius: ");
                int radius = input.nextInt();
                System.out.print("Enter the height length: ");
                height = input.nextInt();

                while (radius <= 0 || height <= 0){
                    System.out.println("Value must be positive");
                    System.out.println();
                    System.out.print("Enter the length of the radius: ");
                    radius = input.nextInt();
                    System.out.print("Enter the height length: ");
                    height = input.nextInt();
                }

                System.out.println();
                System.out.println("Volume = " + cylinder(radius, height) + " br^3");
                break;

            case 5:
                System.out.print("Enter the length of the radius: ");
                radius = input.nextInt();

                while (radius <= 0){
                    System.out.println("Value must be positive");
                    System.out.println();
                    System.out.print("Enter the length of the radius: ");
                    radius = input.nextInt();                    
                }


                System.out.println();
                System.out.println("Area = " + circle(radius) + " br^2");
                break;
        
            default:
                System.out.print("Enter valid number: ");
                number = input.nextInt();
                areacalculator(number);
                break;
        }
        return 0;
    }

    public static int square(int side){
        int area = 0;

        area = side * side;

        return area;
    }

    public static int rectangle(int side1, int side2){
        int area = 0;

        area = side1 *  side2;

        return area;
    }
    
    
    public static double triangle(int taban, int yukseklik){
        double area = 0;

        double base1 = taban;
        double height1 = yukseklik;

        area = (double)((base1 *  height1) / 2);

        double rounding = Math.round(area*1000.0) / 1000.0;

        return rounding;
    }

    public static double cylinder(double radius, double height){
        double area = 0;

        
        area = ((2 * Math.PI * Math.pow(radius, 2)) + (2 * Math.PI * radius * height));

        
        double rounding = Math.round(area*1000.0) / 1000.0;

        return rounding;
    }

    public static double circle(int radius){
        double area = 0;
        
        area = (Math.PI * Math.pow(radius, 2));

        double rounding = Math.round(area*1000.0) / 1000.0;

        return rounding;
    }
    

    static void driver(){
        // \n\n 
        //cikis kacis dizisi
        
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Right Triangle");
        System.out.println("4. Cylinder");
        System.out.println("5. Circle");
        System.out.println();
        System.out.print("Which shape do you want to calculate?: ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();


        System.out.println();

        areacalculator(number);
        System.out.println("------------");
        System.out.println();
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println();
        System.out.print("Try again?: ");

        int check1 = input.nextInt();

        switch (check1) {
            case 1:
                System.out.println("==================");
                System.out.println();
                driver();
                break;
        
            default:
                break;
        }
    }
    
    public static void main(String[] args) {
        
        // ArrayList<Integer> tr = new ArrayList<Integer>();
        driver();


    }


}
