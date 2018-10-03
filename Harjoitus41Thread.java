import java.util.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Harjoitus41Thread extends Thread {

  public String identifier = "";

//  private boolean running = true;
  private int Progress = 0;
  private int progressIdentifier = 0;
  public ProgressCounterInterface counter;
  Timestamp time = new Timestamp(System.currentTimeMillis());
  String dateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(time);

@Override
  public void run() {
    try{
		    while (Progress < 100) {
          if (counter != null) {
            Progress = Progress + 10;

            System.out.println(time + dateTime + "  Processing: " + Progress + "%");
          //  counter.ProgressCounter("Progress: " + Progress);
            sleep(3000);
        }
      }
    }
    catch(Exception e) {
      e.printStackTrace();
      }
      System.out.println("Completed.");
}
//public void stopThread() {
//running = false;
//}
}
