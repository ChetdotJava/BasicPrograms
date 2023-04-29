import java.util.Scanner;
class Question01_Student{
    /*Question:01 Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign
    the value of roll_no as '2' and that of name as "John" by creating an object of the class Student. */
    String name;
    int roll_no;
    Question01_Student(String nam, int r){
    name = nam; roll_no = r;
    }
    void display(){
        System.out.print("name= "+name+"\n"+"Roll no.= "+roll_no);
    }
}

class Question02_Triangle{
    /*Question:02 Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
    creating a class named 'Triangle' without any parameter in its constructor. */
    int s1,s2,s3;
    public int perimeter(){
        int perimeter = s1 + s2 + s3;
        return perimeter;
    }
    public int area(){
        int area = s1 * s2 * s3;
        return area;
    }
     
}

class Question03_Area{
    /*Question:03 Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its constructor and having a method named 'returnArea'which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard. */
    int length, breadth; 
    Question03_Area(int l, int b){
        length = l; breadth = b;
    }
    public void returnArea(){
        int area = length * breadth;
        System.out.println("Area= "+area);
    }
}

class Question04_Complex{
    /*Question:04 Print the sum, difference and product of two complex numbers by creating a class named
    'Complex' with separate methods for each operation whose real and imaginary parts are
    entered by user. */
    int real; char imaginary;
    Question04_Complex(int r, char i){
        real = r; imaginary = i;
    }
    public void add(){
        System.out.println("Addition= "+real+"+"+imaginary);
    }
        
    public void sub(){
            System.out.println("Subtraction= "+real+"-"+imaginary);
        }
    public void mul(){
        System.out.println("Multiplication= "+real+imaginary);
    }
    }

class Question05_Employee{
    /*Question:05 Write a program that would print the information (name, year of joining, salary, address) of three
    employees by creating a class named 'Employee'. The output should be as follows: (in the form of a table) */
    String name,address;
    int yearOfJoining;
    float salary;
    Question05_Employee(String n, int yoj, String ad, float sal){
        name =n; yearOfJoining = yoj; address = ad; salary = sal;
    }
    public void display(){
        System.out.println(name+"     "+yearOfJoining+"                "+salary+"     "+address);
    }
}



public class PW_Assignment07{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Question01_Student stu = new Question01_Student("John",2);
        stu.display();

        Question02_Triangle tri = new Question02_Triangle();
        tri.s1 = 3; tri.s2 = 4; tri.s3 = 5;
        System.out.println("Perimeter= "+tri.perimeter());
        System.out.println("Area= "+tri.area());
        
        System.out.print("enter length= ");
        int l = s.nextInt();
        System.out.print("enter breadth= ");
        int b = s.nextInt();
        Question03_Area ar = new Question03_Area(l,b);
        ar.returnArea();

        System.out.print("Enter real part: ");
        int realPart = s.nextInt();
        System.out.print("Enter imaginary part: ");
        char imaginaryPart = s.next().charAt(0);
        Question04_Complex com = new Question04_Complex(realPart, imaginaryPart);
        com.add(); com.sub(); com.mul();
        
        System.out.println("Name      Year of joining     Salary      Address");
        Question05_Employee emp1 = new Question05_Employee("Robert",1994 , "64C- WallsStreet", 10000);
        emp1.display();
        Question05_Employee emp2 = new Question05_Employee("Sam",2000 , "68D- WallsStreet", 11000);
        emp2.display();
        Question05_Employee emp3 = new Question05_Employee("John",1999 , "26B- WallsStreet", 12000);
        emp3.display();
        s.close();
        
    }

}
