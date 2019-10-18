package Week4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * Building a simple graphics application using the swing library
 * 
 * @author CSC 143
 *
 */
public class FirstSwingApplication {
	// A random number generator
	private static Random rand = new Random();

	public static void main(String[] args) {
		// To start a Swing graphics application, follow the recommend approach
		// Use a thread to launch the graphics application
//		SwingUtilities.invokeLater(new Runnable() {
//			@Override
//			public void run() {
//				createGraphics();
//			}
//		});

		// The code above can be made more compact by using the lambda notation
		SwingUtilities.invokeLater(() -> createGraphics());
	}

	private static void createGraphics() {
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		// Terminate the program when closing the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Place a label at the top of the frame
		JLabel label = new JLabel("This is a label");
		label.setFont(new Font("Courier", Font.BOLD | Font.ITALIC, 35));
		JPanel northPanel = new JPanel();
		northPanel.setBackground(Color.WHITE);
		northPanel.add(label);
		frame.add(northPanel, BorderLayout.NORTH);

		// Place a button at the bottom of the frame
		JButton button = new JButton("Draw polygon");
		JPanel southPanel = new JPanel();
		southPanel.setBackground(Color.WHITE);
		southPanel.add(button);
		frame.add(southPanel, BorderLayout.SOUTH);

		// Place a panel in the center of the frame to
		// display a polygon
		JPanel drawingPanel = new JPanel() {
			protected void paintComponent(Graphics g) {
				// Good programming practice to paint the elements
				// of the JPanel in the correct order
				super.paintComponent(g);
				// Create a random polygon
				// number of vertices (between 5 and 15)
				int n = 5 + rand.nextInt(11);
				int[] x = new int[n];
				int[] y = new int[n];
				// coordinates of the vertices
				for (int i = 0; i < n; i++) {
					x[i] = rand.nextInt(this.getWidth());
					y[i] = rand.nextInt(this.getHeight());
				}
				// random color
				g.setColor(new Color(rand.nextInt()));
				g.fillPolygon(x, y, n);
				// update the label
				label.setText("Number of vertices = " + n);
			}
		};
		drawingPanel.setBackground(Color.WHITE);
		frame.add(drawingPanel); // placed at the center by default

		// Add a listener to the button that redraws the polygon whenever the button is
		// clicked
//		button.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				drawingPanel.repaint();
//			}
//		});
		// or with the lambda notation (shorter code)
		button.addActionListener((ActionEvent e) -> {drawingPanel.repaint();});

		frame.setVisible(true);
	}
}
