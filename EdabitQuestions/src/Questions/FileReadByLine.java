package Questions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReadByLine {

	public static void main(String[] args){
		
		
		BufferedReader br;
		try {
			
			FileReader fr= new FileReader("src/Questions/wordCount");
			br = new BufferedReader(fr);
			
				String line=br.readLine();
				int count=0;
				while(line!=null)
				{
					System.out.println(line);
					
					count=count+line.split(" ").length;
					
					System.out.println(Arrays.toString(line.split(" ")));
					
					line=br.readLine();
				}
				
				System.out.println("Total words in the document: "+ count);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
			
		
		
	}

}
