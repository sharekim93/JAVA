package classArr007;

class MyDictionaryShow {
	MyDictionaryShow(){super();}
	public void show(MyDictionary[] words) {
		System.out.println("=====================================");
		System.out.println(":::::::::::::::: DICTIONARY !");
		System.out.println("=====================================");
		System.out.println("NO\tANSWER\tWORD");
		for(int i=0;i<words.length;i++) {
			System.out.println("-----------------------------------");
			System.out.println(words[i].getDno()+"\t"+words[i].getUserAnswer()+"\t"+words[i].getWord());
		}
		System.out.println("정답 수 : "+MyDictionary.trueAnswer);
	}
}
