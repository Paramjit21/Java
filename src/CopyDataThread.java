package LabWork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread extends Thread {
	public void run()
	{
		try
		{
			FileReader fr = new FileReader("/home/elena/eclipse-workspace/StringFileHandling/src/com/NewFile.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fos = new FileWriter("/home/elena/eclipse-workspace/StringFileHandling/src/com/target.txt");
			BufferedWriter bor = new BufferedWriter(fos);
			String str =  "";
			while((str = br.readLine()) != null)
			{
				String[] word = str.split(" ");
				for(int i = 0; i<word.length;i++)
				{
					fos.write(word[i]);
					if(i%10 == 0)
					{
						System.out.println("Ten Character copied");
						Thread.sleep(5000);
						
					}
				}
				
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyDataThread cp = new CopyDataThread();
		cp.start();
		

	}

}
