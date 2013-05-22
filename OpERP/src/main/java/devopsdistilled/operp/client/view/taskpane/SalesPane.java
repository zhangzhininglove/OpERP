package devopsdistilled.operp.client.view.taskpane;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import devopsdistilled.operp.client.view.MainWindow;
import devopsdistilled.operp.client.view.taskpane.iface.TaskPane;

public class SalesPane implements TaskPane {

	private JPanel pane;

	@Override
	public String toString() {
		return "Sales";
	}

	@Override
	public void makeCurrentWorkingTaskPane() {
		pane = new JPanel();
		pane.add(new JLabel("From Sales Pane"));
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				MainWindow.getInstance().setTaskPane(pane);

			}
		});
	}
}