import  java.util.*;

class  Hello{
    public static void main(String[] args) {
        System.out.println("Addition multiplication division substration:");
        int a =10,b=20,c=30,d=40;
        a=b+c;
        b=a*c;
        c=a-b;
        d=a/b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


        System.out.println("String concatination:\n");
        String s1= "Pramod";
        String s2="Idgicloude";
        System.out.println("Concatinated String is:");
        System.out.println(s1+s2);


        System.out.println("Creating An integer arrays:");

        int arr[]= new int[10];
        System.out.println("Integetr array:");
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }


        System.out.println("Useing input from User:");
        System.out.println("Enter your Chhoice:");
        System.out.println("1.Addition\n 2.Substration \n3. Multiplication \n4.Division:\n5.ArryCreation\n6.Multiplication");
        Scanner sc= new Scanner(System.in);
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter values od a and b");
                int add1= sc.nextInt();
                int add2= sc.nextInt();
                int add=add1+add2;
                System.out.println("Additon="+add);
                break;
            case 2:
                System.out.println("Enter vaules of a and b");
                int sub1= sc.nextInt();
                int sub2= sc.nextInt();
                int sub=sub1-sub2;
                System.out.println("Substraction="+sub);
                break;
            case 3:
                System.out.println("Enter value of a and b");
                int mu1= sc.nextInt();
                int mu2=sc.nextInt();
                int mul=mu1*mu2;
                System.out.println("Multiplication="+mul);
                break;
            case 4:
                System.out.println("Enter value of a and b:");
                int di1= sc.nextInt();
                int di2=sc.nextInt();
                int div=di1/di2;
                System.out.println("Division:"+div);
                break;
            case 5:
                System.out.println("Enter a array value you want to perint:");
                int ar= sc.nextInt();
                System.out.println("Enter the size of array");
                int size=sc.nextInt();
                for(int i=ar;i<=size;i++)
                {
                    System.out.println(i);
                }
                break;
            case 6:
                System.out.println("Multiplication table:");
                System.out.println("Enter A number which you want to print thr=e multiplication table:");
                int n=sc.nextInt();
                for(int i=1;i<=10;i++)
                {
                    System.out.println(n*i);
                }
                break;


            default:
                System.out.println("Enter valid case:");
                break;
        }






    }
}