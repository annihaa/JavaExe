import java.util.*;

public class Harjoitus23 {

  public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
  boolean isInterrupted = false;
  System.out.println("Master, give your command!");
  Harjoitus23Thread thread = new Harjoitus23Thread();

  String command = "";
  while (!command.equals("STOP")) {
  command = scanner.nextLine();

  if (command.equals("START")) {
	System.out.println("Starting thread...");
	thread.start();
    }

  else if(command.equals("STOP")) {
    thread.stopThread();
     }

  else if(command.equals("INTERRUPT")) {
    thread.interrupt();
  }
  }
}
}
