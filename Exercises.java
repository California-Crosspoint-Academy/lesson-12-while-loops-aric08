import java.util.Scanner;
public class Exercises {
    public static void main(String[] args) {

        // 1 while
        int a=0;
        while(a<5){a++;}

        // 2 do-while
        int b=0;
        do{b++;}while(b<5);

        // 3 for->while
        int k=1,p=0,m=97;
        while(m<=195){
            k=k*k+3*m;
            p=p+m+1;
            m++;
        }
        System.out.println("3 k="+k+", p="+p);

        // 4 for->do-while
        int v=2;
        double q=1;
        do{
            k=k*k+3*v;
            q=Math.sqrt(q+v+1);
            v*=3;
        }while(v<=195);
        System.out.println("4 k="+k+", q="+q);

        // 5 loop control expression !done
        boolean done=false;
        int i=2;
        while(!done){
            if(i<1)done=true;
            i--;
        }

        // 6 error: do; should not have ;
        i=2; done=false;
        do{
            if(i<1)done=true;
            i--;
        }while(!done);

        //// missing 7,8,9

        // 10 nested loop
        int i1=0,j1;
        while(i1<=3){
            for(j1=0;j1<=2;j1++){
                System.out.print(i1+","+j1+" ");
            }
            i1++;
        }
        System.out.println();

        //// missing 11,12

        // 13 output
        double m2=92.801;
        int j2=0;
        do{
            j2=j2+2;
            if(j2>-100)continue;
            m2+=3;
        }while(j2<6);
        System.out.println("13 m2="+m2);

        // 14 do-while user input
        Scanner sc=new Scanner(System.in);
        int num;
        do{
            System.out.print("Enter integer 0 to quit: ");
            num=sc.nextInt();
            if(num!=0)System.out.println("Squared: "+(num*num));
        }while(num!=0);
        sc.close();
    }
}
