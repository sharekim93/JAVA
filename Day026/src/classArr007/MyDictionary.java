package classArr007;

class MyDictionary {
	static int dno_count = 0;	// 해당 번호를 자동으로 카운트 하는 static 변수
	static int trueAnswer = 0; 	// 맞춘 답변 개수를 카운트하는 static 변수
	private int dno;			// 각 해당 번호
	private String word;		// 단어
	private char userAnswer;	// 사용자가 맞춘 O, X 둘 중 하나 저장
	
	MyDictionary(){super();}
	MyDictionary(String word){
		this();this.word=word;
		
	}
	@Override
	public String toString() {
		return "MyDictionary [dno=" + dno + ", word=" + word + ", userAnswer=" + userAnswer + "]";
	}
	public int getDno() {return dno;}
	public String getWord() {return word;}
	public char getUserAnswer() {return userAnswer;}
	
	public void setDno(int dno) {this.dno = dno;}
	public void setWord(String word) {this.word = word;}
	public void setUserAnswer(char userAnswer) {this.userAnswer = userAnswer;}
	
}
