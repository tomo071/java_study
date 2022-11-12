class Process {

  private static int count = 0;

  private String firstName;
  private String lastName;
  private int age;
  private double height;
  private double weight;

  Process(String firstName,String lastName,int age,double height,double weight){
    count++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public void setFname(String firstName){
    this.firstName = firstName;
  }

  public void setLname(String lastName){
    this.lastName = lastName;
  }

  public int setAge(int age){
    return this.age;
  }

  public void setHeight(double height){
    this.height = height;
  }

  public void setWeight(double weight){
    this.weight = weight;
  }

  public String Fullname(){
    return this.firstName+" "+this.lastName;
  }

  public void Bmi(){
    double bmi = this.weight/(this.height*2);
    double health = this.height*2*22;
    double terget = this.weight - health;
    System.out.println(this.Fullname()+"さんの結果");
    System.out.println("あなたのBMIは"+bmi+"です");
    System.out.println("適正体重は"+health+"です");
    if (terget>0){
      System.out.println("適正体重より"+terget+"高いです");
    }else{
      System.out.println("適正体重より"+terget+"高いです");
    }
    System.out.println(Process.count+"名のデータを入力しました");
  }

}
