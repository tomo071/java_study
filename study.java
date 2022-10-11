import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("苗字：");
    String fName = scanner.next();
    System.out.print("名前：");
    String lName = scanner.next();
    System.out.print("年齢は：");
    
    String name = fullName(fName, lName);
    
    printData(name, 25);
    
  }

  public static void printData(String name, int age) {
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
  }

  public static String fullName(String firstName,String lastName){
    return firstName + " " + lastName;
  }
  
}
