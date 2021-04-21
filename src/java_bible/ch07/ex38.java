package java_bible.ch07;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex38 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!");
			}
		});
		
	}
}
