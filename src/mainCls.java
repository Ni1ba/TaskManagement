import javax.swing.*;

public class mainCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame a = new JFrame("example");
		
		JButton buttonNewGame = new JButton("New Game");
		JButton buttonExit = new JButton("Exit");
		
		buttonNewGame.setBounds(320,90,150,20);
		buttonExit.setBounds(320,400,150,20);

		a.add(buttonNewGame);
		a.add(buttonExit);
		
		a.setSize(800,640);
		a.setLayout(null);
		a.setVisible(true);
	}

}
