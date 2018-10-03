import java.util.*;

public class Harjoitus23Thread extends Thread {

  public String identifier = "";
  private boolean running = true;

  @Override
  public void run() {
    try{
		while (running) {
        System.out.println("Tiisu, We want more!");
        sleep(5000);
      }
    }
    catch(Exception e) {
      e.printStackTrace();
    }
	  System.out.println("Thread stopped.");
    System.out.println("Master, give your command!");

    }
	public void stopThread() {
	running = false;
  }
}
