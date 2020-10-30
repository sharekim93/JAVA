package classArr007;

public class ClassArr007 {

	public static void main(String[] args) {
		MyDictionary[] words = new MyDictionary[]
				{new MyDictionary("television"), new MyDictionary("computer"),
						new MyDictionary("mouse"), new MyDictionary("phone")};
		MyDictionaryQuestion question = new MyDictionaryQuestion();
		question.dicQuestion(words);
		
		MyDictionaryShow print = new MyDictionaryShow();
		print.show(words);

	}

}
