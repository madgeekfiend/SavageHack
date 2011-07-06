package com.savagehack.window;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextPane;

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
	private final JSplitPane splitPane = new JSplitPane();
	private final JSplitPane splitPanePlayer = new JSplitPane();
	private final JTextPane ASCIIMap = new JTextPane();
	
	public GameWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("SavageHack");
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{244, 0};
		gridBagLayout.rowHeights = new int[]{0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0};
		getContentPane().setLayout(gridBagLayout);		
		
		characterControlPanel.setBorder( BorderFactory.createTitledBorder("Player") );
		logPane.setEditable(false);
		splitPanePlayer.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPanePlayer.setTopComponent( characterControlPanel );
		splitPanePlayer.setBottomComponent( logPane );
		splitPanePlayer.setDividerLocation( 350 );
			
		JScrollPane scrollPane = new JScrollPane( ASCIIMap );	
		// Now let's add some stuff
		GridBagConstraints gbc_splitPane = new GridBagConstraints();
		gbc_splitPane.fill = GridBagConstraints.BOTH;
		gbc_splitPane.gridx = 0;
		gbc_splitPane.gridy = 0;
		splitPane.setRightComponent( scrollPane );
		splitPane.setLeftComponent( splitPanePlayer );
		//splitPane.setDividerLocation(200);
		getContentPane().add(splitPane, gbc_splitPane);
		
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
