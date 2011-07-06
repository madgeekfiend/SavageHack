package com.savagehack.window;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.ScrollPane;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * This is the main game window for SavageHack. A roguelike game that uses the
 * savage worlds explorer edition rule set. This code is hosted on GITHUB and can be
 * found at https://github.com/madgeekfiend/SavageHack.
 * 
 * This file is part of SavageHack.
 *
 * SavageHack is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SavageHack is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with SavageHack.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * @author Sam Contapay & Damon Jacobsen
 *
 */
public class GameWindow extends JFrame {

	private static final long serialVersionUID = 1327162934224304874L;
	JTextPane logPane = new JTextPane();
	JPanel characterControlPanel = new JPanel();
	private final JMenuBar menuBar = new JMenuBar();
	private final JMenu mnFile = new JMenu("File");
	private final JMenuItem mntmExit = new JMenuItem("Exit");
	
	public GameWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("SavageHack");
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{244, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{295, 100};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0};
		getContentPane().setLayout(gridBagLayout);		
		
		characterControlPanel.setBorder( BorderFactory.createTitledBorder("Player") );
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		getContentPane().add(characterControlPanel, gbc_panel);
				
		GridBagConstraints gbc_textPane = new GridBagConstraints();
		gbc_textPane.insets = new Insets(0, 0, 0, 5);
		gbc_textPane.fill = GridBagConstraints.BOTH;
		gbc_textPane.gridx = 0;
		gbc_textPane.gridy = 1;
		logPane.setEditable(false);
		getContentPane().add(logPane, gbc_textPane);
		
		ScrollPane scrollPane = new ScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 0;		
		getContentPane().add(scrollPane, gbc_scrollPane);
		
		setJMenuBar(menuBar);
		
		menuBar.add(mnFile);
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0); // Get the hell out of here
			}
		});
		
		mnFile.add(mntmExit);
		
		init();
	}
	
	/**
	 * Initialize the game window
	 */
	private void init() {
		logPane.setText("Starting Savage Hacks...");
	}
	
	public static void main(String[] args) {
		// Let's create a standard window to show the game object
		JFrame app = new GameWindow();
		app.setSize(1024, 768);
		app.setVisible( true );
	}
}
