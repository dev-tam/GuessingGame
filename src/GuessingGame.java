import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessingGame extends JFrame {
	private JTextField txtGuess;	// text field for the user's guess
	private JLabel lblOutput;		// label for too high/low output
	private int theNumber;			// the number we're trying to guess 
	
	public void checkGuess() {		// method/function to check high or too low
		// get the user's guess
		String guessText = txtGuess.getText();
		String message = "";
		
		// check the guess for too high/low 
		int guess = Integer.parseInt(guessText);
		
		// too high
		if(guess > theNumber) {
			message = guess + " was too high. Guess again!";
			lblOutput.setText(message);
		}
		// too low
		else if(guess < theNumber) {
			message = guess + " was too low. Guess again!";
			lblOutput.setText(message);
		}
		else {
			message = guess + " was right! You win! let's play again";
			lblOutput.setText(message);
		}
	}
	
	public void newGame() {		// new random number 1..100
		theNumber = (int)(Math.random() * 100+1);
	}
	
	public GuessingGame() {
		getContentPane().setLayout(null);
		
		JLabel lblHighLowGuessing = new JLabel("jTam's High Low Guessing Game");
		lblHighLowGuessing.setFont(new Font("Dialog", Font.BOLD, 16));
		lblHighLowGuessing.setBounds(0, 31, 448, 25);
		lblHighLowGuessing.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblHighLowGuessing);
		
		JPanel panel = new JPanel();
		panel.setBounds(37, 87, 374, 38);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblGuessANumber = new JLabel("Guess a number between 1 and 100:");
		lblGuessANumber.setBounds(12, 12, 258, 15);
		panel.add(lblGuessANumber);
		lblGuessANumber.setHorizontalAlignment(SwingConstants.RIGHT);
		
		txtGuess = new JTextField();
		txtGuess.setBounds(278, 10, 85, 19);
		panel.add(txtGuess);
		txtGuess.setColumns(10);
		
		JButton btnGuess = new JButton("Guess!");
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		btnGuess.setBounds(166, 156, 117, 25);
		getContentPane().add(btnGuess);
		
		lblOutput = new JLabel("Enter a number above and click Guess!");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setBounds(73, 212, 302, 25);
		getContentPane().add(lblOutput);
	}

	public static void main(String[] args) {
		
		GuessingGame theGame = new GuessingGame();
		theGame.newGame();
		theGame.setSize(new Dimension(430, 330));
		theGame.setVisible(true);

	}
}
