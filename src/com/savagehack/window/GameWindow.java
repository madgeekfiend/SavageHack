package com.savagehack.window;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
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
	private final JLabel lblCommand = new JLabel("Command");
	private final JTextField txtCommand = new JTextField();
	private final JLabel lblAgility = new JLabel("Agility:");
	private final JLabel lblAgilityStat = new JLabel("1d4");
	private final JLabel lblSmarts = new JLabel("Smarts:");
	private final JLabel lblSmartsStat = new JLabel("1d4");
	private final JLabel lblSpirit = new JLabel("Spirit");
	private final JLabel lblSpiritStat = new JLabel("1d4");
	private final JLabel lblStrength = new JLabel("Strength");
	private final JLabel lblStrengthStat = new JLabel("1d4");
	private final JLabel lblVigor = new JLabel("Vigor:");
	private final JLabel lblVigorStat = new JLabel("1d4");
	
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
		splitPanePlayer.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
		splitPanePlayer.setLeftComponent( characterControlPanel );
		GridBagLayout gbl_characterControlPanel = new GridBagLayout();
		gbl_characterControlPanel.columnWidths = new int[]{114, 47};
		gbl_characterControlPanel.rowHeights = new int[]{20, 0, 0, 0, 0, 0, 0, 0};
		gbl_characterControlPanel.columnWeights = new double[]{1.0, 0.0};
		gbl_characterControlPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		characterControlPanel.setLayout(gbl_characterControlPanel);
		
		GridBagConstraints gbc_lblCommand_1 = new GridBagConstraints();
		gbc_lblCommand_1.anchor = GridBagConstraints.WEST;
		gbc_lblCommand_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblCommand_1.gridx = 0;
		gbc_lblCommand_1.gridy = 0;
		
		GridBagConstraints gbc_txtCommand = new GridBagConstraints();
		gbc_txtCommand.gridwidth = 2;
		gbc_txtCommand.anchor = GridBagConstraints.NORTHWEST;
		gbc_txtCommand.insets = new Insets(0, 0, 5, 0);
		gbc_txtCommand.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCommand.gridx = 0;
		gbc_txtCommand.gridy = 1;
		
		GridBagConstraints gbc_lblAgility_1 = new GridBagConstraints();
		gbc_lblAgility_1.anchor = GridBagConstraints.WEST;
		gbc_lblAgility_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblAgility_1.gridx = 0;
		gbc_lblAgility_1.gridy = 2;
		gbc_lblCommand_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblCommand_1.gridx = 0;
		gbc_lblCommand_1.gridy = 0;
		characterControlPanel.add(lblCommand, gbc_lblCommand_1);
		
		GridBagConstraints gbc_lblAgilityStat_1 = new GridBagConstraints();
		gbc_lblAgilityStat_1.anchor = GridBagConstraints.WEST;
		gbc_lblAgilityStat_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblAgilityStat_1.gridx = 0;
		gbc_lblAgilityStat_1.gridy = 3;
		
		GridBagConstraints gbc_lblSmarts_1 = new GridBagConstraints();
		gbc_lblSmarts_1.anchor = GridBagConstraints.WEST;
		gbc_lblSmarts_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblSmarts_1.gridx = 0;
		gbc_lblSmarts_1.gridy = 4;
		
		GridBagConstraints gbc_lblSmartsStat_1 = new GridBagConstraints();
		gbc_lblSmartsStat_1.anchor = GridBagConstraints.WEST;
		gbc_lblSmartsStat_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblSmartsStat_1.gridx = 0;
		gbc_lblSmartsStat_1.gridy = 5;
		
		GridBagConstraints gbc_lblSpirit_1 = new GridBagConstraints();
		gbc_lblSpirit_1.anchor = GridBagConstraints.WEST;
		gbc_lblSpirit_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblSpirit_1.gridx = 0;
		gbc_lblSpirit_1.gridy = 6;
		
		GridBagConstraints gbc_lblSpiritStat_1 = new GridBagConstraints();
		gbc_lblSpiritStat_1.anchor = GridBagConstraints.WEST;
		gbc_lblSpiritStat_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblSpiritStat_1.gridx = 0;
		gbc_lblSpiritStat_1.gridy = 7;
		
		GridBagConstraints gbc_lblStrength_1 = new GridBagConstraints();
		gbc_lblStrength_1.anchor = GridBagConstraints.WEST;
		gbc_lblStrength_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblStrength_1.gridx = 0;
		gbc_lblStrength_1.gridy = 8;
		
		GridBagConstraints gbc_lblStrengthStat_1 = new GridBagConstraints();
		gbc_lblStrengthStat_1.anchor = GridBagConstraints.WEST;
		gbc_lblStrengthStat_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblStrengthStat_1.gridx = 0;
		gbc_lblStrengthStat_1.gridy = 9;
		
		GridBagConstraints gbc_lblVigor_1 = new GridBagConstraints();
		gbc_lblVigor_1.anchor = GridBagConstraints.WEST;
		gbc_lblVigor_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblVigor_1.gridx = 0;
		gbc_lblVigor_1.gridy = 10;
		
		GridBagConstraints gbc_lblVigorStat_1 = new GridBagConstraints();
		gbc_lblVigorStat_1.anchor = GridBagConstraints.WEST;
		gbc_lblVigorStat_1.gridx = 0;
		gbc_lblVigorStat_1.gridy = 11;
		txtCommand.setColumns(20);
		gbc_txtCommand.insets = new Insets(0, 0, 5, 5);
		gbc_txtCommand.gridx = 0;
		gbc_txtCommand.gridy = 1;
		characterControlPanel.add(txtCommand, gbc_txtCommand);
		
		// Let's add a keyboard listener for the text command
		txtCommand.addKeyListener( new KeyListener() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				if ( key == KeyEvent.VK_ENTER )
				{
					logPane.setText( "ENTER KEY PRESSED AND COMMAND: " + txtCommand.getText() + " PROCESSED");
					// Reset command window and focus
					txtCommand.setText("");
					txtCommand.selectAll();
				}
				
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});

		gbc_lblAgility_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblAgility_1.gridx = 0;
		gbc_lblAgility_1.gridy = 2;
		characterControlPanel.add(lblAgility, gbc_lblAgility_1);

		gbc_lblAgilityStat_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblAgilityStat_1.gridx = 1;
		gbc_lblAgilityStat_1.gridy = 2;
		characterControlPanel.add(lblAgilityStat, gbc_lblAgilityStat_1);

		gbc_lblSmarts_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblSmarts_1.gridx = 0;
		gbc_lblSmarts_1.gridy = 3;
		characterControlPanel.add(lblSmarts, gbc_lblSmarts_1);

		gbc_lblSmartsStat_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblSmartsStat_1.gridx = 1;
		gbc_lblSmartsStat_1.gridy = 3;
		characterControlPanel.add(lblSmartsStat, gbc_lblSmartsStat_1);

		gbc_lblSpirit_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblSpirit_1.gridx = 0;
		gbc_lblSpirit_1.gridy = 4;
		characterControlPanel.add(lblSpirit, gbc_lblSpirit_1);

		gbc_lblSpiritStat_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblSpiritStat_1.gridx = 1;
		gbc_lblSpiritStat_1.gridy = 4;
		characterControlPanel.add(lblSpiritStat, gbc_lblSpiritStat_1);

		gbc_lblStrength_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblStrength_1.gridx = 0;
		gbc_lblStrength_1.gridy = 5;
		characterControlPanel.add(lblStrength, gbc_lblStrength_1);

		gbc_lblStrengthStat_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblStrengthStat_1.gridx = 1;
		gbc_lblStrengthStat_1.gridy = 5;
		characterControlPanel.add(lblStrengthStat, gbc_lblStrengthStat_1);

		gbc_lblVigor_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblVigor_1.gridx = 0;
		gbc_lblVigor_1.gridy = 6;
		characterControlPanel.add(lblVigor, gbc_lblVigor_1);
		gbc_lblVigorStat_1.gridx = 1;
		gbc_lblVigorStat_1.gridy = 6;
		characterControlPanel.add(lblVigorStat, gbc_lblVigorStat_1);
		//splitPanePlayer.setBottomComponent( logPane );
		//splitPanePlayer.setDividerLocation( 350 );
			
		JScrollPane scrollPane = new JScrollPane( ASCIIMap );	
		// Now let's add some stuff
		GridBagConstraints gbc_splitPane = new GridBagConstraints();
		gbc_splitPane.fill = GridBagConstraints.BOTH;
		gbc_splitPane.gridx = 0;
		gbc_splitPane.gridy = 0;
		splitPane.setOrientation( JSplitPane.VERTICAL_SPLIT );
		splitPanePlayer.setRightComponent( scrollPane );
		splitPane.setTopComponent( splitPanePlayer );
		splitPane.setBottomComponent( logPane );
		splitPane.setDividerLocation( 600 );
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
