import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPanel;

public class GuessingGame extends JFrame {
	private JTextField textField;
	public GuessingGame() {
		getContentPane().setLayout(null);
		
		JLabel lblHighLowGuessing = new JLabel("jTam's High Low Guessing Game");
		lblHighLowGuessing.setFont(new Font("Dialog", Font.BOLD, 16));
		lblHighLowGuessing.setBounds(0, 33, 448, 25);
		lblHighLowGuessing.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblHighLowGuessing);
		
		JPanel panel = new JPanel();
		panel.setBounds(37, 91, 374, 38);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblGuessANumber = new JLabel("Guess a number between 1 and 100:");
		lblGuessANumber.setBounds(12, 12, 258, 15);
		panel.add(lblGuessANumber);
		lblGuessANumber.setHorizontalAlignment(SwingConstants.RIGHT);
		
		textField = new JTextField();
		textField.setBounds(278, 10, 85, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnGuess = new JButton("Guess!");
		btnGuess.setBounds(166, 162, 117, 25);
		getContentPane().add(btnGuess);
		
		JLabel lblNewLabel = new JLabel("Enter a number above and click Guess!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(73, 220, 302, 15);
		getContentPane().add(lblNewLabel);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
