import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int h;
    Scanner wysoko =new Scanner(System.in);
    System.out.println("Podaj wysokość choinki");
    h = wysoko.nextInt();

    for(int i=1;i<=h;i++){
         for(int j=0;j<h-i;j++)System.out.print(" ");
            for (int j = 0; j<(i*2)-1; j++)System.out.print("*");
            System.out.println(" ");
      
    }
  }
}
  