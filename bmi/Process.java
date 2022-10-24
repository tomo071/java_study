class Process {

  public static int count = 0;

  public String firstName;
  public String middleName;
  public String lastName;
  public int age;
  public double height;
  public double weight;

  Process(String firstName,String lastName,int age,double height,double weight){
    count = count + 1;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  Process(String firstName, String middleName, String lastName,int age,double height,double weight){
    count = count + 1;
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public void Fullname(){
    if(this.middleName == "なし"){
      System.out.println("こんにちは"+this.firstName+" "+this.lastName+"さん");
    }else{
      System.out.println("こんにちは"+this.firstName+this.middleName+this.lastName+"さん");
    }
  }

  public void Bmi(){
    double bmi = this.weight/(this.height*2);
    double health = this.height*2*22;
    double terget = this.weight - health;
    System.out.println("あなたのBMIは"+bmi+"です");
    System.out.println("適正体重は"+health+"です");
    if (terget>0){
      System.out.println("適正体重より"+terget+"高いです");
    }else{
      System.out.println("適正体重より"+terget+"高いです");
    }
  }

}
