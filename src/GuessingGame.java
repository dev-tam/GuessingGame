import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPanel;

public class GuessingGame extends JFrame {
	private JTextField txtGuess;
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
		btnGuess.setBounds(166, 156, 117, 25);
		getContentPane().add(btnGuess);
		
		JLabel lblOutput = new JLabel("Enter a number above and click Guess!");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setBounds(73, 212, 302, 25);
		getContentPane().add(lblOutput);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
