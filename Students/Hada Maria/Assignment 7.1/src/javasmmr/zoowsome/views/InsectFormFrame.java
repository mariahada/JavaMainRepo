package javasmmr.zoowsome.views;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

@SuppressWarnings("serial")
public class InsectFormFrame extends ZooFrame {

	private JLabel uniLabel;

	private JTextField nameField, dangerPercField;
	private JTextField legsField, maintCostField;

	private JRadioButton canFlyRadio, takenCareOfRadio, isDangerousRadio;

	public JButton submitButton = new JButton();

	public InsectFormFrame(String title) {
		super(title);

		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel();
		contentPanel.add(panel);

		JPanel pan = new JPanel();
		contentPanel.add(pan);

		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);

		uniLabel = new JLabel("Name: ");
		slPanel.putConstraint(SpringLayout.NORTH, uniLabel, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, uniLabel, 0, SpringLayout.WEST, pan);
		pan.add(uniLabel);

		uniLabel = new JLabel("Danger percentage: ");
		slPanel.putConstraint(SpringLayout.NORTH, uniLabel, 100, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, uniLabel, 0, SpringLayout.WEST, pan);
		pan.add(uniLabel);

		uniLabel = new JLabel("Number of legs: ");
		slPanel.putConstraint(SpringLayout.NORTH, uniLabel, 135, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, uniLabel, 0, SpringLayout.WEST, pan);
		pan.add(uniLabel);

		uniLabel = new JLabel("Maintenance cost: ");
		slPanel.putConstraint(SpringLayout.NORTH, uniLabel, 170, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, uniLabel, 0, SpringLayout.WEST, pan);
		pan.add(uniLabel);

		uniLabel = new JLabel("Taken care of: ");
		slPanel.putConstraint(SpringLayout.NORTH, uniLabel, 205, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, uniLabel, 0, SpringLayout.WEST, pan);
		pan.add(uniLabel);

		uniLabel = new JLabel("Is dangerous: ");
		slPanel.putConstraint(SpringLayout.NORTH, uniLabel, 240, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, uniLabel, 0, SpringLayout.WEST, pan);
		pan.add(uniLabel);

		uniLabel = new JLabel("Can fly: ");
		slPanel.putConstraint(SpringLayout.NORTH, uniLabel, 275, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, uniLabel, 0, SpringLayout.WEST, pan);
		pan.add(uniLabel);

		JPanel rightPanel = new JPanel();
		contentPanel.add(rightPanel);
		setVisible(true);

		rightPanel.setLayout(slPanel);

		nameField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH, nameField, 65, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, nameField, 0, SpringLayout.WEST, rightPanel);
		rightPanel.add(nameField);

		dangerPercField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH, dangerPercField, 100, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, dangerPercField, 0, SpringLayout.WEST, rightPanel);
		rightPanel.add(dangerPercField);

		legsField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH, legsField, 135, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, legsField, 0, SpringLayout.WEST, rightPanel);
		rightPanel.add(legsField);

		maintCostField = new JTextField(10);
		slPanel.putConstraint(SpringLayout.NORTH, maintCostField, 170, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, maintCostField, 0, SpringLayout.WEST, rightPanel);
		rightPanel.add(maintCostField);

		takenCareOfRadio = new JRadioButton();
		slPanel.putConstraint(SpringLayout.NORTH, takenCareOfRadio, 205, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, takenCareOfRadio, 45, SpringLayout.WEST, rightPanel);
		takenCareOfRadio.setToolTipText("Check if the animal is taken care of.");
		rightPanel.add(takenCareOfRadio);

		isDangerousRadio = new JRadioButton();
		slPanel.putConstraint(SpringLayout.NORTH, isDangerousRadio, 240, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, isDangerousRadio, 45, SpringLayout.WEST, rightPanel);
		isDangerousRadio.setToolTipText("Check if the animal is Dangerous.");
		rightPanel.add(isDangerousRadio);

		canFlyRadio = new JRadioButton();
		slPanel.putConstraint(SpringLayout.NORTH, canFlyRadio, 275, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, canFlyRadio, 45, SpringLayout.WEST, rightPanel);
		canFlyRadio.setToolTipText("Check if the animal can fly.");
		rightPanel.add(canFlyRadio);

		submitButton = new JButton("SUBMIT");
		slPanel.putConstraint(SpringLayout.NORTH, submitButton, 310, SpringLayout.NORTH, rightPanel);
		slPanel.putConstraint(SpringLayout.WEST, submitButton, 100, SpringLayout.WEST, rightPanel);
		submitButton.setToolTipText("Click to submit the form");
		pan.add(submitButton);

	}

	public String theName() {
		return nameField.getText();
	}

	public double theDangerPercent() {
		try {
			Double.parseDouble(dangerPercField.getText());
		} catch (NumberFormatException ex) {
			return -1;
		}
		return Double.parseDouble(dangerPercField.getText());
	}

	public int theNumberOfLegs() {
		try {
			Integer.parseInt(legsField.getText());
		} catch (NumberFormatException ex) {
			return -1;
		}
		return Integer.parseInt(legsField.getText());
	}

	public double theMaintenanceCost() {
		try {
			Double.parseDouble(maintCostField.getText());
		} catch (NumberFormatException ex) {
			return -1;
		}
		return Double.parseDouble(maintCostField.getText());
	}

	public boolean takenCareOf() {
		if (takenCareOfRadio.isSelected())
			return true;
		else
			return false;
	}

	public boolean isDangerous() {
		if (isDangerousRadio.isSelected())
			return true;
		else
			return false;
	}

	public boolean canFly() {
		if (canFlyRadio.isSelected())
			return true;
		else
			return false;
	}
}
