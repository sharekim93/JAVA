package score;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ScoreController {
	ScoreModel dto = new ScoreModel();
	ScoreGUI view = new ScoreGUI();
	ArrayList<ScoreModel> std = new ArrayList<>();
	
	void input(ScoreModel dto) {
		
		std.add(dto);
	}
	
	void show(ScoreModel dto) {
		if(dto.getName()==null) {JOptionPane.showMessageDialog(null, "아이디를 입력하세요");}
		for(int i=0;i<std.size();i++) {
			if(dto.getName().equals(std.get(i).getName())) {
				view.text[0].setText(std.get(i).getName());
				view.text[1].setText(""+std.get(i).getJava());
				view.text[2].setText(""+std.get(i).getJsp());
				view.text[3].setText(""+std.get(i).getSpring());
				view.text[4].setText(""+std.get(i).getProject());
			}
		}
	}	

}
