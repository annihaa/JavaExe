
import java.util.Scanner;

public class NetworkLoader implements NetworkLoaderThread.ResultInterface{

	public static void main(String[] args) {
		//System.out.println("Network loader started");
		Scanner scanner = new Scanner(System.in);
		String URL = "";
		System.out.println("Give URL: ");
		URL = scanner.nextLine();

		if(!URL.equals("")){
		NetworkLoaderThread networkLoaderThread = new NetworkLoaderThread(URL);
		NetworkLoader dfe = new NetworkLoader();
		networkLoaderThread.setListener(dfe);
		networkLoaderThread.start();
}
}

@Override
public void threadProgress(String data){
	System.out.println(data);
}
}
