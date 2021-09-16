
import java.util.Scanner; 
class complexno //creating a class
{
    float real,imag;
    complexno() //default comstructor;
    {
        real = 0;
        imag = 0;
    }
    complexno(float c1,float c2)//parametrized constructor;
    {
        this.real=c1;
        this.imag = c2;
        System.out.println(real+"+"+imag+"i");

    }
    Scanner sc = new Scanner(System.in);//Scanner object for taking input
    void getdat()//method to input the complex number 
    {
        System.out.println("Enter the real part of complex number :");
        real = sc.nextFloat();//Take input for real part
        System.out.println("\nEnter the imaginary part of complex number :");
        imag = sc.nextFloat();//Take input for real part

    }
    void display()//method to input the display complex number 
    {
        System.out.println("\nThe real part of complex number :"+"\n"+real);
        System.out.println("\n The imaginary part of complex number :"+"\n"+imag);
        System.out.println("\n The complex number is :"+real+"+"+imag+"i");
    }
    void addition(complexno obj1,complexno obj2)//method to add 2 complex number 
    {
       real = obj1.real+obj2.real;
       imag = obj1.imag +obj2.imag;
       System.out.println("\nComplex number addition is :"+real+"+"+imag+"i");
    }
    void subtraction(complexno obj1,complexno obj2)//method to subtract 2 complex number 
    {
       real = obj1.real+obj2.real;
       imag = obj1.imag +obj2.imag;
       System.out.println("\nComplex number subtraction is :"+real+"+"+imag+"i");
    }
    void multiplication(complexno obj1,complexno obj2)//method to multiply 2 complex number 
    {
       real = (obj1.real * obj2.real) - (obj1.imag * obj2.imag);
       imag = (obj1.real * obj2.real) + (obj1.imag * obj2.imag);
       System.out.println("\nComplex number multiplication is :"+real+"+"+imag+"i");
    }
    void division(complexno co1,complexno co2)//method to division 2 complex number 
    {
        real = co1.real*co2.real+co1.imag*co2.imag;
        imag = co1.real*co2.real-co1.imag*co2.imag;
        System.out.println("\nComplex number division is :"+real+"+"+imag+"i");
     }
}
public class Complex //main class
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  //creating a scanner object
        int choice;
        complexno cobj = new complexno();  //Object -an instance(member) of java class 
        complexno co1 = new complexno();   //-creating 3 objects
        complexno co2 = new complexno(); 
        co1.getdat();    //calling the function to get input 
        System.out.println("\nThe first complex number is :");
        co1.display();  //calling display function to show the complex number
        co2.getdat();   //here calling again for 2nd complex no
        System.out.println("\nThe second complex number is :");
        co2.display();  //calling to display 2nd complex no
        do{//using do while loop until user presses 5 for exiting loop
            System.out.println("\nEnter your choice :");//Asking user their choice 
            System.out.println("\n1.)Addition :");
            System.out.println("\nSubtraction:");
            System.out.println("\nMultiplication :");
            System.out.println("\nDivision :");
            System.out.println("\nEXIT");
            choice = sc.nextInt();
            switch(choice)//using switch case for simplicity as per user choice
            {
                case 1:
                cobj.addition(co1,co2);
                break;
                case 2:
                cobj.subtraction(co1,co2);
                break;
                case 3:
                cobj.multiplication(co1,co2);
                break;
                case 4:
                cobj.division(co1,co2);
                break;
                case 5:
                break;
            }


        }
        while(choice!=5); //loop breaks when user chooses a choice as 5
        }
}
