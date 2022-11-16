import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
      System.out.print("-----過去-----");
      System.out.print("名前：");
      String firstName = scanner.next();
      System.out.print("名字：");
      String lastName = scanner.next();
      System.out.print("年齢：");
      int age = scanner.nextInt();
      System.out.print("身長(m)：");
      double height = scanner.nextDouble();
      System.out.print("体重(kg)：");
      double weight = scanner.nextDouble();

      
      Past past = new Past();
      past.setFname(firstName);
      past.setLname(lastName);
      past.setHeight(height);
      past.setWeight(weight);
      past.setAge(age);
      past.Bmi();

      System.out.print("-----現在-----");
      System.out.print("身長(m)：");
      double nowHeight = scanner.nextDouble();
      System.out.print("体重(kg)：");
      double nowWeight = scanner.nextDouble();

      Present present = new Present();
      present.setFname(firstName);
      present.setLname(lastName);
      present.setHeight(nowHeight);
      present.setWeight(nowWeight);
      present.setAge(age);
      present.Bmi();
    
  }
}