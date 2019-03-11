import java.util.Scanner;
class DaysofMonth
{
  public static void main(String[] args) {
    String month ;
    int year;
    System.out.println("Enter Month:");
    Scanner sc = new Scanner(System.in);
    month = sc.nextLine();
    System.out.println("Enter Year:");
    year = sc.nextInt();
    switch(month)
    {
      case "January": System.out.println("31");
                      break;
      case "Febraury": if(year % 4 == 0)
                        {
                          System.out.println("29");
                          break;
                        }
                      System.out.println("28");
                      break;
      case "March": System.out.println("31");
                      break;
      case "April": System.out.println("30");
                      break;
      case "May": System.out.println("31");
                      break;
      case "June": System.out.println("30");
                      break;
      case "July": System.out.println("31");
                      break;
      case "August": System.out.println("31");
                      break;
      case "September": System.out.println("30");
                      break;
      case "October": System.out.println("31");
                      break;
      case "November": System.out.println("30");
                      break;
      case "December": System.out.println("31");
                      break;
    }
}
}
