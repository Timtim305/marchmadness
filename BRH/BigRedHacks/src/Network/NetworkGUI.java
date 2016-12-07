package Network;

import java.awt.*;
import javax.swing.*;

public class NetworkGUI extends JFrame {

	private static final long serialVersionUID = -5624404136485946868L;

	String userWord = "";
	String userWord2 = "";
	JTextField userInput;
	JTextField userInput2;

	public NetworkGUI() {
		JFrame jf = new JFrame("Method to the Madness");
		JPanel panel = new JPanel();

		panel.setLayout(new GridBagLayout());
		JLabel jl = new JLabel("");
		JLabel jl2 = new JLabel("    vs.    ");
		JButton jButton = new JButton("Submit");
		userInput = new JTextField("", 11);
		userInput.setSize(25, 50);
		userInput2 = new JTextField("", 11);
		jButton.addActionListener((e) -> {
			try {
				submitAction();
			} catch (Throwable e1) {
				e1.printStackTrace();
			}
		});

		jf.setSize(500, 500);

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel.add(jl);
		panel.add(userInput);
		jl2.setFont(new Font("Cambria", Font.ITALIC, 20));
		panel.add(jl2);
		panel.add(userInput2);
		jButton.setFont(new Font("Cambria", Font.BOLD, 17));
		panel.add(jButton);

		jf.add(panel);

		jf.setVisible(true);
	}

	private void submitAction() throws Throwable {

		userWord = userInput.getText();
		userWord2 = userInput2.getText();
		Driver.initializeTeams();

		if (Driver.teams.containsKey(userWord) && Driver.teams.containsKey(userWord2)) {
			double[] input = new double[11];
			for (int i = 0; i < 11; i++) {
				input[i] = Driver.teams.get(userWord)[i] - Driver.teams.get(userWord2)[i];
			}
			double[] answer = Driver.getOutput(input);

			if (answer[0] < .5) {
				JOptionPane.showMessageDialog(null, userWord2 + " will beat " + userWord + ".");

			} else {
				JOptionPane.showMessageDialog(null, userWord2 + " will lose to " + userWord + ".");
			}
		}

		else {
			JOptionPane.showMessageDialog(null, "Invalid input");
		}
	}

	public static void main(String[] args) {
		NetworkGUI network = new NetworkGUI();

	}

}
