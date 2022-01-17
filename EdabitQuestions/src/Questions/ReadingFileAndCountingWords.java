package Questions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFileAndCountingWords {

	public static void main(String[] args) {

		BufferedReader br=null;
		int wordCount=0;
		
		try {
			br = new BufferedReader(new FileReader("src/Questions/wordCount"));
		   String line= br.readLine();
		   
		   while(line!=null)
		   {
			   System.out.println(line);
			   wordCount= wordCount+line.split(" ").length;
			   line=br.readLine();
		   }
		   
		   System.out.println("Total word count in this paragraph : "+ wordCount);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("The path might be wrong");
		}
		 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("There might be a problem with reading file");
			}
		finally
		{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
	
	}

}
