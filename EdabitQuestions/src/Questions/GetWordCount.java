package Questions;

public class GetWordCount {

	public static void main(String[] args) {
		System.out.println(countWords("ser ere rtrgtr fdfd rgrg dcdfdf dfdf dffd!"));

	}
	
	public static int countWords(String s)
	{
		int counter=0;
		counter=s.split(" ").length;
		
		return counter;
	}

}
