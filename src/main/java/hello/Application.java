package hello;


public class Application {

 public static void main(String[] args) {
  while (true) {
   System.out.println("Hello World");

   try {
    Thread.sleep(1000);
   } catch (InterruptedException e) {
    e.printStackTrace();
   }

  }
 }

}
