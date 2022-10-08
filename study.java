class Main {
  public static void main(String[] args) {
    status("国語",70);
    status("算数",60);
    status("理科",40);
  }
  public static void status(String subject,int score) {
    if (score >= 50 ){
      System.out.println(subject +"の点数は"+score+"です");
      System.out.println("平均点以下です");
    }
    else{
      System.out.println(subject +"の点数は"+score+"です");
      System.out.println("平均点以上です");
    }
  }
}