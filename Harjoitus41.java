import java.util.*;
import java.util.ArrayList;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Harjoitus41 implements ProgressCounterInterface {

private Harjoitus41Thread thread;
ArrayList<Harjoitus41Thread> threads = new ArrayList<Harjoitus41Thread>();

  public static void main(String[] args) {
    Harjoitus41 ohjelma = new Harjoitus41();
    ohjelma.aloitaohjelma();
    }
    public void aloitaohjelma() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type START:");

    String command = "";
    while (!command.equals("STOP")){
    command = scanner.nextLine();

    if (command.equals("START")) {
      thread = new Harjoitus41Thread();
      thread.start();
      threads.add(thread);
      //thread.identifier = "THREAD -" + threads.size();
      thread.counter = this;
    }
  }
}
@Override
public void ProgressCounter(final String Message) {
  //System.out.println("On progress: "+ Progress +"%");
}
}
