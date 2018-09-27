import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import cs.au.dk.Submit;


public class RunSubmit {

	public static void main(String[] args) throws IOException {
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));
		System.out.print("TaskID: ");
		String taskId = reader.readLine();
		System.out.print("Username: ");
		String username = reader.readLine();
		System.out.print("Password: ");
		String password = reader.readLine();
		cs.au.dk.Submit.submit(taskId,username,password);
	}

}