package classArr007;

import java.util.Scanner;

class MyDictionaryQuestion {
	// 생성자
	MyDictionaryQuestion() {
		super();
	}

	public void dicQuestion(MyDictionary[] words) {
		Scanner scanner = new Scanner(System.in);
		char temp[];

		for (int i = 0; i < words.length; i++) {
			temp = words[i].getWord().toCharArray();
			MyDictionary.dno_count++;
			words[i].setDno(MyDictionary.dno_count);

			for (int j = 0; j < words[i].getWord().length(); j++) {
				int random = (int) (Math.random() * (words[i].getWord().length() - 1));
				char mix = temp[j];
				temp[j] = temp[random];
				temp[random] = mix;
			}
			System.out.print("Q" + words[i].getDno() + ". ");
			for (int j = 0; j < temp.length; j++) {
				System.out.print(temp[j]);
			}
			System.out.print(" 의 정답을 입력하세요 > ");

			String word = scanner.nextLine();
			if (words[i].getWord().equals(word)) {
				System.out.println("맞았습니다.");
				words[i].setUserAnswer('O');
				MyDictionary.trueAnswer++;
			} else {
				System.out.println("틀렸습니다.");
				words[i].setUserAnswer('X');
			}
		}

	}


}
