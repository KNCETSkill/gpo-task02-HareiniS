import java.util.Scanner;
public class AttendanceStatusEvaluator{
  public static void main (String[]args){
    Scanner c=new Scanner(System.in);
    int a = c.nextInt();
    if(a>90){
      System.out.println("Excellent");
      if(a>=60 && a<=85){
        System.out.println("Satisfactory");
      }
    }
    else{
      System.out.println("Poor");
    }
    
  }
}
