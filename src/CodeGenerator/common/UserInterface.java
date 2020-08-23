package CodeGenerator.common;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import java.awt.Canvas;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JPasswordField;

public class UserInterface extends JFrame 
{

	private JPanel contentPane;
	private JTextField TFDrillXLoc;
	private JTextField TFDrillYLoc;
	private JTextField TFDrillRValue;
	private JTextField TFDrillDepth;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textField_13;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JTextField textField_14;
	private JButton btnDrillEnd;
	private JButton btnDrillSave;
	private JTextArea DrillTextArea;
	private JTextArea FaceTextArea;
	private JTextField TFDrillX1;
	private JTextField TFDrillY1;
	private JTextField TFDepth1;
	private JTextField TFRVal1;
	private JTextField TFDrillX2;
	private JTextField TFDrillY2;
	private JTextField TFDepth2;
	private JTextField TFRVal2;
	private JTextField TFDrillX3;
	private JTextField TFDrillY3;
	private JTextField TFDepth3;
	private JTextField TFRVal3;
	private JTextField TFDrillX4;
	private JTextField TFDrillY4;
	private JTextField TFDepth4;
	private JTextField TFRVal4;
	private JTextField TFDrillX5;
	private JTextField TFDrillY5;
	private JTextField TFDepth5;
	private JTextField TFRVal5;
	private JTextField TFDrillX6;
	private JTextField TFDrillY6;
	private JTextField TFDepth6;
	private JTextField TFRVal6;
	private JTextField TFDrillProgName;
	private JTextField TFDrillToolNo;
	private JTextField TFDrillRPM;
	private JTextField TFDrillQ;
	private JButton btnAddLoc;
	private JButton btnClear;
	private JButton btnStart;
	private JButton btnAuto;
	private JButton btnDrillCycleEnd;
	private JButton btnDrillRotate;
	private int DLi;
	private JComboBox CBMetricScrew;
	private JComboBox CBInchScrew;
	private int blockNo = 1;
	private String DCycle;
	private int AutoDrillNo;
	private String[] AutoXLoc = new String[6];   //Auto Drill Cycle
	private String[] AutoYLoc = new String[6];   //Auto Drill Cycle
	private String[] AutoDepth = new String[6];  // Auto Drill Cycle
	private String[] AutoRValue = new String[6]; //Auto Drill Cycle
	private JButton btnClearTxt;
	private JButton btnAddDrillInfo;
	private JButton btnCenterDrill;
	private JButton btnPeckDrill;
	private JButton btnCBreakDrill;
	private JButton btnTap;
	private JButton btnSubmit;
	private JTextField PasswordField;
	private JTextField TFTapPitch;
	private boolean ADD = false;
	private JRadioButton RBAutoDepth;
	private JRadioButton rdbtnCdrill;
	private JRadioButton rdbtnCsink;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					UserInterface frame = new UserInterface();
					frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserInterface() 
	{

		initComponents();
		createEvents();

	}
   



	//////////////////////////////////////////////////////////////////////////////////
	//This method contains all the code for creating and initializing components
	/////////////////////////////////////////////////////////////////////////////////
	/**
	 * 
	 */
	/**
	 * 
	 */
	private void initComponents() 
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(UserInterface.class.getResource("/CodeGenerator/resources/gear.png")));
		setTitle("Code Generator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1346, 1053);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		
		

		
		/////////////////////////////////////////////////////////////////////////////////////
		//Panel
		////////////////////////////////////////////////////////////////////////////////////
		JPanel PassWord = new JPanel();
		contentPane.add(PassWord, "name_898178658060420");
		PassWord.setVisible(true);
		
		
		JPanel Home = new JPanel();
		contentPane.add(Home, "name_34709510749451");
		Home.setVisible(false);
		
		JPanel DrillAndTap = new JPanel();
		contentPane.add(DrillAndTap, "name_34712951904291");
		DrillAndTap.setVisible(false);
		
		JPanel Facing = new JPanel();
		contentPane.add(Facing, "name_34716213138407");
		Facing.setVisible(false);
		
		JPanel ThreadMill = new JPanel();
		contentPane.add(ThreadMill, "name_34719797098056");
		ThreadMill.setVisible(false);
		
		JLabel lblCaender = new JLabel("Calender");
		
		JButton btnLinkToPlanner = new JButton("Link To Planner");
		btnLinkToPlanner.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JLabel lblHome = new JLabel("Home");
		lblHome.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//if(PasswordField.getText().equalsIgnoreCase("Alan"))
				//{
					PassWord.setVisible(false);
					Home.setVisible(true);
				//}
			}
		});
		

		
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		PasswordField = new JTextField();
		PasswordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		PasswordField.setColumns(10);
		GroupLayout gl_PassWord = new GroupLayout(PassWord);
		gl_PassWord.setHorizontalGroup(
			gl_PassWord.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PassWord.createSequentialGroup()
					.addContainerGap()
					.addComponent(PasswordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSubmit)
					.addContainerGap(1064, Short.MAX_VALUE))
		);
		gl_PassWord.setVerticalGroup(
			gl_PassWord.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PassWord.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_PassWord.createParallelGroup(Alignment.BASELINE)
						.addComponent(PasswordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSubmit))
					.addContainerGap(955, Short.MAX_VALUE))
		);
		PassWord.setLayout(gl_PassWord);
		
		
		
		/////////////////////////////////////////////////////////////////////////////////////
		//Home Buttons
		////////////////////////////////////////////////////////////////////////////////////
		
		JButton btnDrillAndTap = new JButton("Drill and Tap");
		btnDrillAndTap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				DrillAndTap.setVisible(true);
				Home.setVisible(false);
			}
		});
		btnDrillAndTap.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnFacing = new JButton("Facing");
		btnFacing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Facing.setVisible(true);
				Home.setVisible(false);
			}
		});
		btnFacing.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		
		JButton btnNewButton = new JButton("Thread Mill");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				ThreadMill.setVisible(true);
				Home.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		GroupLayout gl_panel_11 = new GroupLayout(panel_11);
		gl_panel_11.setHorizontalGroup(
			gl_panel_11.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_11.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblHome, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnDrillAndTap)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnFacing, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton)
					.addContainerGap(45, Short.MAX_VALUE))
		);
		gl_panel_11.setVerticalGroup(
			gl_panel_11.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_11.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_11.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHome)
						.addComponent(btnDrillAndTap)
						.addComponent(btnFacing)
						.addComponent(btnNewButton))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_11.setLayout(gl_panel_11);
		GroupLayout gl_Home = new GroupLayout(Home);
		gl_Home.setHorizontalGroup(
			gl_Home.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Home.createSequentialGroup()
					.addGroup(gl_Home.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Home.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 516, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnLinkToPlanner))
						.addGroup(gl_Home.createSequentialGroup()
							.addGap(104)
							.addComponent(lblCaender)))
					.addContainerGap(610, Short.MAX_VALUE))
		);
		gl_Home.setVerticalGroup(
			gl_Home.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Home.createSequentialGroup()
					.addGroup(gl_Home.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Home.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(124)
							.addComponent(lblCaender))
						.addGroup(gl_Home.createSequentialGroup()
							.addGap(22)
							.addComponent(btnLinkToPlanner)))
					.addContainerGap(782, Short.MAX_VALUE))
		);
		Home.setLayout(gl_Home);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setViewportBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Program Text Editor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		
		
		
		GroupLayout gl_DrillAndTap = new GroupLayout(DrillAndTap);
		gl_DrillAndTap.setHorizontalGroup(
			gl_DrillAndTap.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_DrillAndTap.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_DrillAndTap.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_DrillAndTap.createSequentialGroup()
							.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_DrillAndTap.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_DrillAndTap.createSequentialGroup()
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 371, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
							.addGroup(gl_DrillAndTap.createSequentialGroup()
								.addGroup(gl_DrillAndTap.createParallelGroup(Alignment.TRAILING)
									.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
									.addComponent(panel_4, 0, 0, Short.MAX_VALUE))
								.addGap(7)
								.addGroup(gl_DrillAndTap.createParallelGroup(Alignment.LEADING)
									.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 479, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
								.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 407, GroupLayout.PREFERRED_SIZE)
								.addGap(50)))))
		);
		gl_DrillAndTap.setVerticalGroup(
			gl_DrillAndTap.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_DrillAndTap.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addGroup(gl_DrillAndTap.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
						.addGroup(gl_DrillAndTap.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 355, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_DrillAndTap.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 399, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Home.setVisible(true);
				DrillAndTap.setVisible(false);
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 18));
		

		/////////////////////////////////////////////////////////////////////////////////////
		//Drill and Tap Buttons
		////////////////////////////////////////////////////////////////////////////////////
		
		
		JLabel lblDrillAndTap = new JLabel("Drill and Tap");
		lblDrillAndTap.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnFacing_1 = new JButton("Facing");
		btnFacing_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Facing.setVisible(true);
				DrillAndTap.setVisible(false);
			}
		});
		btnFacing_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnThreadMill = new JButton("Thread Mill");
		btnThreadMill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ThreadMill.setVisible(true);
				DrillAndTap.setVisible(false);
			}
		});
		btnThreadMill.setFont(new Font("Tahoma", Font.BOLD, 18));
		GroupLayout gl_panel_10 = new GroupLayout(panel_10);
		gl_panel_10.setHorizontalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnHome)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblDrillAndTap, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnFacing_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnThreadMill)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_10.setVerticalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_10.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnHome)
						.addComponent(lblDrillAndTap)
						.addComponent(btnFacing_1)
						.addComponent(btnThreadMill))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_10.setLayout(gl_panel_10);
		

		
		JLabel lblNewLabel_3 = new JLabel("Program Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		TFDrillProgName = new JTextField();
		TFDrillProgName.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Tool No.");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		TFDrillToolNo = new JTextField();
		TFDrillToolNo.setColumns(10);
		
		JLabel lblRpm = new JLabel("RPM");
		lblRpm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		TFDrillRPM = new JTextField();
		TFDrillRPM.setColumns(10);
		
		JLabel lblDrillToolInfo = new JLabel("Drill Tool Info");
		lblDrillToolInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_6 = new JLabel("Tap Pitch");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		TFTapPitch = new JTextField();
		TFTapPitch.setColumns(10);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(12)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_6)
						.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_4.createSequentialGroup()
								.addGap(61)
								.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblNewLabel_4)
									.addComponent(lblRpm)))
							.addGroup(gl_panel_4.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblNewLabel_3))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDrillToolInfo)
						.addComponent(TFDrillRPM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TFDrillToolNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TFDrillProgName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TFTapPitch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(10)
					.addComponent(lblDrillToolInfo)
					.addGap(18)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(TFDrillProgName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING)
						.addComponent(TFDrillToolNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(TFDrillRPM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRpm))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6)
						.addComponent(TFTapPitch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
		
		DrillTextArea = new JTextArea();
		scrollPane_1.setViewportView(DrillTextArea);
		
		btnStart = new JButton("Program Start");

		btnStart.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		btnClear = new JButton("Clear Drill Locations");

		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		btnAddLoc = new JButton("Add Drill Info");

		btnAddLoc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		btnDrillCycleEnd = new JButton("Drill Cycle End");

		btnDrillCycleEnd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		btnDrillRotate = new JButton("Rotate");
		
		btnDrillRotate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		btnDrillEnd = new JButton("End Program");
		
		btnDrillEnd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		btnDrillSave = new JButton("save");
		
		btnDrillSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		btnAuto = new JButton("Auto");

		btnAuto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		btnClearTxt = new JButton("Clear TXT Editor");

		btnClearTxt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		btnAddDrillInfo = new JButton("Add Drill Tool Info");

		btnAddDrillInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		btnCenterDrill = new JButton("CenterDrill");


		btnCenterDrill.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		btnPeckDrill = new JButton("Peck Drill");

		btnPeckDrill.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		btnCBreakDrill = new JButton("C Break Drill");
		
		btnCBreakDrill.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		btnTap = new JButton("Tap");

		btnTap.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		rdbtnCdrill = new JRadioButton("CDrill");
		rdbtnCdrill.setSelected(true);
		rdbtnCdrill.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		rdbtnCsink = new JRadioButton("CSink");
		rdbtnCsink.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(btnClearTxt)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnClear))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(btnDrillCycleEnd)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnDrillEnd))
						.addComponent(btnAddLoc)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(btnAuto)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdbtnCdrill)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdbtnCsink))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(btnStart)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAddDrillInfo))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(btnCenterDrill)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnPeckDrill)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCBreakDrill)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnTap))
						.addComponent(btnDrillRotate)
						.addComponent(btnDrillSave))
					.addContainerGap(32, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnClearTxt)
						.addComponent(btnClear))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAddLoc)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAuto)
						.addComponent(rdbtnCdrill)
						.addComponent(rdbtnCsink))
					.addPreferredGap(ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnStart)
						.addComponent(btnAddDrillInfo))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(btnCenterDrill)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnDrillRotate))
						.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnPeckDrill)
							.addComponent(btnCBreakDrill)
							.addComponent(btnTap)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnDrillCycleEnd)
						.addComponent(btnDrillEnd))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDrillSave)
					.addGap(12))
		);
		panel_3.setLayout(gl_panel_3);
		
		JRadioButton rdbtnScrewHole = new JRadioButton("Screw Hole");
		buttonGroup_2.add(rdbtnScrewHole);
		rdbtnScrewHole.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JRadioButton rdbtnWaterline = new JRadioButton("Waterline");
		buttonGroup_2.add(rdbtnWaterline);
		rdbtnWaterline.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Clearance Hole");
		buttonGroup_2.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(rdbtnScrewHole)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnWaterline)
					.addGap(4)
					.addComponent(rdbtnNewRadioButton)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnScrewHole)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(rdbtnWaterline))
					.addContainerGap(38, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JLabel lblXLoc = new JLabel("X Loc");
		lblXLoc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		TFDrillXLoc = new JTextField();
		TFDrillXLoc.setColumns(10);
		
		JLabel lblYLoc = new JLabel("Y Loc");
		lblYLoc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		TFDrillYLoc = new JTextField();
		TFDrillYLoc.setColumns(10);
		
		JLabel lblDepth = new JLabel("R Value");
		lblDepth.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		TFDrillRValue = new JTextField();
		TFDrillRValue.setText(null);
		TFDrillRValue.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Drill Depth");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		TFDrillDepth = new JTextField();
		TFDrillDepth.setText(null);
		TFDrillDepth.setColumns(10);
		
		JLabel lblInchScrew = new JLabel("Inch Screw");
		lblInchScrew.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		//Combo boxes for Screw size -----------------------------------------------------------
		CBInchScrew = new JComboBox();
		CBInchScrew.setFont(new Font("Tahoma", Font.PLAIN, 16));
		CBInchScrew.setModel(new DefaultComboBoxModel(new String[] {"8-32", "10-32", "1/4-20", "5/16-18", "3/8-16", "1/2-13", "5/8-11", "3/4-10", "1\"-8", "1 1/4-7", "1 1/2-6", "1 3/4-4?", "2-4 1/2", "None"}));
		CBInchScrew.setSelectedIndex(13);
		
		JLabel lblMetricScrew = new JLabel("Metric Screw");
		lblMetricScrew.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		CBMetricScrew = new JComboBox();
		CBMetricScrew.setFont(new Font("Tahoma", Font.PLAIN, 16));
		CBMetricScrew.setModel(new DefaultComboBoxModel(new String[] {"M6", "M8", "M10", "M12", "M14", "M16", "M20", "M24", "M30", "None"}));
		CBMetricScrew.setSelectedIndex(9);
		
		JLabel lblNewLabel_5 = new JLabel("Q");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		TFDrillQ = new JTextField();
		TFDrillQ.setColumns(10);
		
		JLabel lblDrillCycleInfo = new JLabel("Drill Info");
		lblDrillCycleInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JRadioButton RBAutoDepth = new JRadioButton("AutoDepth");
		
		RBAutoDepth.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblXLoc)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(TFDrillXLoc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblYLoc)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(TFDrillYLoc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblDepth)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(TFDrillRValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(28)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel_5)
										.addComponent(lblNewLabel)
										.addComponent(lblMetricScrew)
										.addComponent(lblInchScrew))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(TFDrillQ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(TFDrillDepth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(CBMetricScrew, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(CBInchScrew, 0, 116, Short.MAX_VALUE)))
								.addComponent(RBAutoDepth))
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblDrillCycleInfo)
							.addGap(73))))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(26)
					.addComponent(lblDrillCycleInfo)
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(TFDrillXLoc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblXLoc))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(TFDrillYLoc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblYLoc))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(TFDrillRValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDepth))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(CBInchScrew, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblInchScrew))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(CBMetricScrew, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMetricScrew))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(TFDrillDepth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(TFDrillQ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5))
					.addGap(37)
					.addComponent(RBAutoDepth)
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		
		//List for Drill Values--------------------------------------------------------------
		
		JLabel lblNewLabel_1 = new JLabel("X Loc");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
				//Row 1 --------------------------------------------------------------------------------
				
				TFDrillX1 = new JTextField();
				TFDrillX1.setColumns(10);
		
		//Row 2 ------------------------------------------------------------------------------
		
		TFDrillX2 = new JTextField();
		TFDrillX2.setColumns(10);
		
		//Row 3 -----------------------------------------------------------------------------
		
		TFDrillX3 = new JTextField();
		TFDrillX3.setColumns(10);
		
		//Row 4 -----------------------------------------------------------------------------
		
		TFDrillX4 = new JTextField();
		TFDrillX4.setColumns(10);
		
		//Row 5 -----------------------------------------------------------------------------
		
		TFDrillX5 = new JTextField();
		TFDrillX5.setColumns(10);
		
		//Row 6 -----------------------------------------------------------------------------
		
		TFDrillX6 = new JTextField();
		TFDrillX6.setColumns(10);
		
		TFDrillY1 = new JTextField();
		TFDrillY1.setColumns(10);
		
		TFDrillY2 = new JTextField();
		TFDrillY2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Y Loc");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		TFDrillY3 = new JTextField();
		TFDrillY3.setColumns(10);
		
		TFDrillY4 = new JTextField();
		TFDrillY4.setColumns(10);
		
		TFDrillY5 = new JTextField();
		TFDrillY5.setColumns(10);
		
		TFDrillY6 = new JTextField();
		TFDrillY6.setColumns(10);
		
		TFDepth1 = new JTextField();
		TFDepth1.setColumns(10);
		
		JLabel lblDepth_1 = new JLabel("Depth");
		lblDepth_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		TFDepth2 = new JTextField();
		TFDepth2.setColumns(10);
		
		TFDepth3 = new JTextField();
		TFDepth3.setColumns(10);
		
		TFDepth4 = new JTextField();
		TFDepth4.setColumns(10);
		
		TFDepth5 = new JTextField();
		TFDepth5.setColumns(10);
		
		TFDepth6 = new JTextField();
		TFDepth6.setColumns(10);
		
		JLabel lblRValue = new JLabel("R Value");
		lblRValue.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		TFRVal1 = new JTextField();
		TFRVal1.setColumns(10);
		
		TFRVal2 = new JTextField();
		TFRVal2.setColumns(10);
		
		TFRVal3 = new JTextField();
		TFRVal3.setColumns(10);
		
		TFRVal4 = new JTextField();
		TFRVal4.setColumns(10);
		
		TFRVal5 = new JTextField();
		TFRVal5.setColumns(10);
		
		TFRVal6 = new JTextField();
		TFRVal6.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(38)
					.addComponent(lblNewLabel_1)
					.addGap(94)
					.addComponent(lblNewLabel_2)
					.addGap(84)
					.addComponent(lblDepth_1)
					.addPreferredGap(ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
					.addComponent(lblRValue)
					.addGap(48))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(TFDrillX1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TFDrillY1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TFDepth1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TFRVal1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(TFDrillX2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TFDrillY2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TFDepth2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TFRVal2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(TFDrillX3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TFDrillY3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TFDepth3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TFRVal3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(TFDrillX4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TFDrillY4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TFDepth4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TFRVal4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(TFDrillX5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TFDrillY5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TFDepth5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TFRVal5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(TFDrillX6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TFDrillY6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TFDepth6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(TFRVal6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(17, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2)
						.addComponent(lblDepth_1)
						.addComponent(lblRValue))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(TFDrillX1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TFDrillY1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TFDepth1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TFRVal1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(TFDrillX2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TFDrillY2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TFDepth2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TFRVal2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(TFDrillX3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TFDrillY3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TFDepth3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TFRVal3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(TFDrillX4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TFDrillY4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TFDepth4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TFRVal4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(TFDrillX5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TFDrillY5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TFRVal5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TFDepth5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(TFDrillX6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TFDrillY6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TFDepth6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TFRVal6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(33, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		DrillAndTap.setLayout(gl_DrillAndTap);
		/*
		btnSave.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)         //This is the code for saving the file
			{
				JFileChooser saver = new JFileChooser("./");
		        saver.setFileFilter(new Text_Filter());
		        int returnVal = saver.showSaveDialog(this);
		        File file = saver.getSelectedFile();
		        BufferedWriter writer = null;
		        if (returnVal == JFileChooser.APPROVE_OPTION)
		        {
		            try
		            {
		            writer = new BufferedWriter( new FileWriter( file.getName()+".txt"));
		            writer.write( message_output.getText());
		            writer.close( );
		            JOptionPane.showMessageDialog(this, "The Message was Saved Successfully!",
		                        "Success!", JOptionPane.INFORMATION_MESSAGE);
		            }
		            catch (IOException e)
		            {
		            JOptionPane.showMessageDialog(this, "The Text could not be Saved!",
		                        "Error!", JOptionPane.INFORMATION_MESSAGE);
		            }
		        }


			}
		});
		*/
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new TitledBorder(null, "Program Text Editor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JButton button = new JButton("Home");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			Home.setVisible(true);
			Facing.setVisible(false);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton button_4 = new JButton("Drill and Tap");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				DrillAndTap.setVisible(true);
				Facing.setVisible(false);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		

		/////////////////////////////////////////////////////////////////////////////////////
		//Facing Buttons
		////////////////////////////////////////////////////////////////////////////////////
		
		JLabel lblFacing = new JLabel("Facing");
		lblFacing.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton button_3 = new JButton("Thread Mill");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ThreadMill.setVisible(true);
				Facing.setVisible(false);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		GroupLayout gl_panel_12 = new GroupLayout(panel_12);
		gl_panel_12.setHorizontalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_12.createSequentialGroup()
					.addContainerGap()
					.addComponent(button)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblFacing, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_3)
					.addContainerGap(17, Short.MAX_VALUE))
		);
		gl_panel_12.setVerticalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_12.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_12.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_4)
						.addComponent(lblFacing)
						.addComponent(button_3)
						.addComponent(button))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_12.setLayout(gl_panel_12);
		GroupLayout gl_Facing = new GroupLayout(Facing);
		gl_Facing.setHorizontalGroup(
			gl_Facing.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_Facing.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Facing.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Facing.createSequentialGroup()
							.addGroup(gl_Facing.createParallelGroup(Alignment.LEADING, false)
								.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 260, Short.MAX_VALUE)
								.addComponent(panel_9, 0, 0, Short.MAX_VALUE))
							.addGroup(gl_Facing.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Facing.createSequentialGroup()
									.addGap(29)
									.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 636, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_Facing.createSequentialGroup()
									.addGap(50)
									.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 748, GroupLayout.PREFERRED_SIZE))))
						.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 377, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, 490, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(248, Short.MAX_VALUE))
		);
		gl_Facing.setVerticalGroup(
			gl_Facing.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Facing.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Facing.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_Facing.createSequentialGroup()
							.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Facing.createSequentialGroup()
							.addGap(8)
							.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(scrollPane)))
					.addGap(31)
					.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
					.addGap(106))
		);
		
		JLabel lblWorkplaneNo = new JLabel("Workplane No.");
		lblWorkplaneNo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		
		JLabel lblToolNumber = new JLabel("Tool Number");
		lblToolNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		GroupLayout gl_panel_9 = new GroupLayout(panel_9);
		gl_panel_9.setHorizontalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_9.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblToolNumber)
						.addComponent(lblWorkplaneNo))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(65, Short.MAX_VALUE))
		);
		gl_panel_9.setVerticalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_9.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblWorkplaneNo)
						.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_9.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblToolNumber)
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(143, Short.MAX_VALUE))
		);
		panel_9.setLayout(gl_panel_9);
		
		JLabel lblXlength = new JLabel("X-Length");
		lblXlength.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		JLabel lblYlength = new JLabel("Y-Length");
		lblYlength.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		JLabel lblFinZValue = new JLabel("Fin Z Value");
		lblFinZValue.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		JLabel lblStartZ = new JLabel("Stock");
		lblStartZ.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		JLabel lblCutDepth = new JLabel("Cut Depth");
		lblCutDepth.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		
		JLabel lblFinCutDepth = new JLabel("Fin Cut Depth");
		lblFinCutDepth.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		
		JRadioButton rdbtnInchCutter = new JRadioButton("3 Inch Cutter");
		rdbtnInchCutter.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JRadioButton rdbtnInchCutter_1 = new JRadioButton("4 Inch Cutter");
		rdbtnInchCutter_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JRadioButton rdbtnInchCutter_2 = new JRadioButton("6 Inch Cutter");
		rdbtnInchCutter_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GroupLayout gl_panel_8 = new GroupLayout(panel_8);
		gl_panel_8.setHorizontalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnInchCutter)
						.addComponent(rdbtnInchCutter_2)
						.addComponent(rdbtnInchCutter_1)
						.addGroup(gl_panel_8.createSequentialGroup()
							.addComponent(lblFinCutDepth)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_8.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel_8.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblXlength)
								.addComponent(lblStartZ)
								.addComponent(lblFinZValue)
								.addComponent(lblCutDepth)
								.addComponent(lblYlength))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(26))
		);
		gl_panel_8.setVerticalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_8.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblXlength)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_8.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblYlength)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_8.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFinZValue)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_8.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblStartZ)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_8.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCutDepth)
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_8.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFinCutDepth)
						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnInchCutter)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnInchCutter_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnInchCutter_2)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		panel_8.setLayout(gl_panel_8);
		
		JButton btnStart_1 = new JButton("Start");
		btnStart_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				FaceTextArea.setText("AAAAA");
			}
		});
		btnStart_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnRotate = new JButton("Add");
		btnRotate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				FaceTextArea.append("BBBB");
			}
		});
		btnRotate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnRotate_1 = new JButton("Rotate");
		btnRotate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//FaceTextArea.append();
			}
		});
		btnRotate_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnEndProgram = new JButton("End Program");
		btnEndProgram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//FaceTextArea.append(str);
			}
		});
		btnEndProgram.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnWrite_1 = new JButton("Write");
		btnWrite_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
						.addComponent(btnStart_1)
						.addGroup(gl_panel_7.createSequentialGroup()
							.addComponent(btnRotate)
							.addGap(7)
							.addComponent(btnRotate_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnEndProgram))
						.addGroup(gl_panel_7.createSequentialGroup()
							.addComponent(btnSave)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnWrite_1)))
					.addContainerGap(280, Short.MAX_VALUE))
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnStart_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnRotate)
						.addComponent(btnRotate_1)
						.addComponent(btnEndProgram))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSave)
						.addComponent(btnWrite_1))
					.addContainerGap(79, Short.MAX_VALUE))
		);
		panel_7.setLayout(gl_panel_7);
		
		FaceTextArea = new JTextArea();
		scrollPane.setViewportView(FaceTextArea);
		
		JRadioButton rdbtnMultipleBlocks = new JRadioButton("Multiple blocks");
		buttonGroup_1.add(rdbtnMultipleBlocks);
		rdbtnMultipleBlocks.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblGapBetween = new JLabel("Gap between");
		lblGapBetween.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel lblNumberOfBlocks = new JLabel("Number of blocks");
		lblNumberOfBlocks.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addGap(18)
					.addComponent(rdbtnMultipleBlocks)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblGapBetween)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNumberOfBlocks)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(52, Short.MAX_VALUE))
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGapBetween)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNumberOfBlocks)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnMultipleBlocks))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		panel_6.setLayout(gl_panel_6);
		
		JLabel lblPickup = new JLabel("Pickup");
		lblPickup.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("");
		buttonGroup.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("");
		buttonGroup.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("");
		buttonGroup.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("");
		buttonGroup.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("");
		buttonGroup.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("");
		buttonGroup.add(rdbtnNewRadioButton_7);
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(30)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
								.addComponent(rdbtnNewRadioButton_2)
								.addComponent(rdbtnNewRadioButton_5))
							.addGap(18)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_5.createSequentialGroup()
									.addComponent(rdbtnNewRadioButton_3)
									.addGap(18)
									.addComponent(rdbtnNewRadioButton_4))
								.addGroup(gl_panel_5.createSequentialGroup()
									.addComponent(rdbtnNewRadioButton_6)
									.addGap(18)
									.addComponent(rdbtnNewRadioButton_7))))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(61)
							.addComponent(lblPickup)))
					.addContainerGap(67, Short.MAX_VALUE))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblPickup)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
							.addComponent(rdbtnNewRadioButton_3)
							.addComponent(rdbtnNewRadioButton_4))
						.addComponent(rdbtnNewRadioButton_2))
					.addGap(18)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnNewRadioButton_6)
						.addComponent(rdbtnNewRadioButton_7)
						.addComponent(rdbtnNewRadioButton_5))
					.addContainerGap(22, Short.MAX_VALUE))
		);
		panel_5.setLayout(gl_panel_5);
		Facing.setLayout(gl_Facing);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JButton button_1 = new JButton("Home");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Home.setVisible(true);
				ThreadMill.setVisible(false);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton button_5 = new JButton("Drill and Tap");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				DrillAndTap.setVisible(true);
				ThreadMill.setVisible(false);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton button_2 = new JButton("Facing");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Facing.setVisible(true);
				ThreadMill.setVisible(false);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		///////////////////////////////////////////////////////////////////////////////////////////////
		//ThreadMilling Buttons
		//////////////////////////////////////////////////////////////////////////////////////////////
		

		
		JLabel lblThreadMill = new JLabel("Thread Mill");
		lblThreadMill.setFont(new Font("Tahoma", Font.BOLD, 18));
		GroupLayout gl_panel_13 = new GroupLayout(panel_13);
		gl_panel_13.setHorizontalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addContainerGap()
					.addComponent(button_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_5)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblThreadMill, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_panel_13.setVerticalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_13.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_1)
						.addComponent(button_5)
						.addComponent(button_2)
						.addComponent(lblThreadMill))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_13.setLayout(gl_panel_13);
		GroupLayout gl_ThreadMill = new GroupLayout(ThreadMill);
		gl_ThreadMill.setHorizontalGroup(
			gl_ThreadMill.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ThreadMill.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_13, GroupLayout.PREFERRED_SIZE, 490, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(816, Short.MAX_VALUE))
		);
		gl_ThreadMill.setVerticalGroup(
			gl_ThreadMill.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ThreadMill.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(926, Short.MAX_VALUE))
		);
		ThreadMill.setLayout(gl_ThreadMill);
		
	}
	
	/////////////////////////////////////////////////////////////////////////////////
	//This method contains all the code for creating events
	/////////////////////////////////////////////////////////////////////////////////


	private void createEvents() 
	{
		//Password---------------------------------------------------------------
		//Drill and Tap--------------------------------------------------------------------------
		
//		Definition of the DrillCycle Objects
//		public DrillCycle(String DrillS, String TPitch, String DRPM, String TRPM, String DFRate, String DD, String TD, String DTNo, String TTNo, int CycleD) 
//		DrillS = Drill Size, TPitch = Tap Pitch, DRPM = Drill RPM, TRPM = Tap RPM, DFRate = Drill Feed rate, TFRate = Tap FeedRate (Calculation),
//		DD = DrillDepth, TD = TapDepth, DTNo = Drill Tool No., TTNo = Tap Tool No., CycleD = Drilling Cycle Determiner, CBD = CounterBoreDepth

//              ObjectName                DrillS  //TPitch // DRPM // TRPM // DFRate // DD   //   TD   //  DTNo  //  TTNo  // CycleD // CBD   

        DrillCycle CD     = new DrillCycle(".125",  "1/32",  "1000",  "35",   "2.0",   ".05",    ".05",   "17",    "DoNotTap", 83,    ".01");
		DrillCycle NC6    = new DrillCycle(".106",  "1/32",  "1000",  "35",   "1.0",   ".75",    ".5",    "103",   "DoNotTap", 83,    ".01");
		DrillCycle NC8    = new DrillCycle(".140",  "1/32",  "1000",  "35",   "1.0",   ".75",    ".5",    "105",   "20",       83,    ".01");
		DrillCycle NC10   = new DrillCycle(".16",   "1/32",  "1000",  "35",   "1.25",  "1.00",   ".5",    "107",   "21",       83,    ".01");
		DrillCycle NC250  = new DrillCycle(".209",  "1/20",  "900",   "35",   "1.5",   "1.00",   ".63",   "204",   "22",       83,    ".01");
		DrillCycle NC312  = new DrillCycle(".265",  "1/18",  "800",   "35",   "1.5",   "1.00",   ".63",   "113",   "23",       83,    ".01");
		DrillCycle NC375  = new DrillCycle(".312",  "1/16",  "700",   "35",   "1.5",   "1.1",    ".750",  "116",   "24",       83,    ".01");
        DrillCycle NC438  = new DrillCycle(".368",  "1/14",  "650",   "35",   "1.5",   "1.2",    ".750",  "120",   "25",       83,    ".01");
		DrillCycle NC500  = new DrillCycle(".438",  "1/13",  "600",   "35",   "2.0",   "1.30",   "1.0",   "124",   "26",       83,    ".01");
        DrillCycle NC562  = new DrillCycle(".484",  "1/12",  "550",   "30",   "2.0",   "1.4",    "1.0",   "127",   "27",       87,    ".01");
		DrillCycle NC625  = new DrillCycle(".531",  "1/11",  "500",   "30",   "2.25",  "1.625",  "1.35",  "130",   "28",       87,    ".01");
		DrillCycle NC750  = new DrillCycle(".656",  "1/10",  "450",   "25",   "2.5",   "1.75",   "1.5",   "138",   "29",       87,    ".01");
        DrillCycle NC875  = new DrillCycle(".765",  "1/9",   "450",   "25",   "2.5",   "2.188",  "1.5",   "145",   "30",       87,    ".01");
		DrillCycle NC100  = new DrillCycle(".875",  "1/8",   "450",   "20",   "2.5",   "2.50",   "2.0",   "152",   "31",       87,    ".01");
        DrillCycle NC1125 = new DrillCycle(".984",  "1/7",   "400",   "20",   "2.5",   "2.80",   "2.1",   "159",   "32",       87,    ".01");
		DrillCycle NC1250 = new DrillCycle("1.125", "1/7",   "400",   "20",   "3.0",   "3.125",  "2.4",   "163",   "33",       87,    ".01");
        DrillCycle NC1375 = new DrillCycle("1.250", "1/6",   "400",   "20",   "3.0",   "3.438",  ".2.5",  "166",   "34",       87,    ".01");
		DrillCycle NC1500 = new DrillCycle("1.343", "1/6",   "400",   "20",   "3.0",   "3.75",   "3.00",  "167",   "35",       87,    ".01");
		DrillCycle NC1750 = new DrillCycle("1.562", "1/5",   "400",   "20",   "3.0",   "4.375",  "3.5",   "171",   "36",       87,    ".01");
        DrillCycle NC200  = new DrillCycle("1.781", "1/4.5", "400",   "20",   "3.0",   "5.0",    "4.0",   "176",   "37",       87,    ".01");
		DrillCycle NC2250 = new DrillCycle("2.031", "1/4.5", "400",   "20",   "3.0",   "5.625",  "4.5",   "181",   "38",       87,    ".01");
        DrillCycle M4     = new DrillCycle(".136",  ".7",    "1000",  "35",   "1.0",   ".75",    ".5",    "229",   "DoNotTap", 83,    ".01");
//      DrillCycle M4.5   = new DrillCycle(".152",  ".75",   "1000",  "35",   "1.0",   ".75",    ".5",    "224",   "DoNotTap", 83,    ".01");
        DrillCycle M5     = new DrillCycle(".171",  ".8",    "1000",  "35",   "1.5",   "1.0",    ".5",    "107",   "40",       83,    ".01");
		DrillCycle M6     = new DrillCycle(".203",  "1.0",   "1000",  "35",   "1.5",   "1.0",    ".5",    "109",   "41",       83,    ".01");
		DrillCycle M8     = new DrillCycle(".266",  "1.25",  "900",   "35",   "1.5",   "1.0",    ".75",   "113",   "42",       83,    ".01");
		DrillCycle M10    = new DrillCycle(".343",  "1.50",  "800",   "30",   "1.75",  "1.1",    ".75",   "118",   "43",       83,    ".01");
		DrillCycle M12    = new DrillCycle(".406",  "1.75",  "700",   "30",   "1.75",  "1.3",    "1.0",   "122",   "44",       83,    ".01");
		DrillCycle M14    = new DrillCycle(".484",  "2.0",   "600",   "30",   "2.0",   "1.3",    "1.0",   "127",   "45",       87,    ".01");
		DrillCycle M16    = new DrillCycle(".562",  "2.0",   "500",   "30",   "2.5",   "1.4",    "1.0",   "132",   "46",       87,    ".01");
		DrillCycle M20    = new DrillCycle(".687",  "2.5",   "450",   "25",   "2.5",   "1.75",   "1.40",  "140",   "48",       87,    ".01");
        DrillCycle M22    = new DrillCycle(".768",  "2.5",   "450",   "25",   "3.0",   "2.188",  "1.50",  "145",   "49",       87,    ".01");
		DrillCycle M24    = new DrillCycle(".827",  "3.0",   "450",   "20",   "3.0",   "2.50",   "1.75",  "149",   "50",       87,    ".01");
        DrillCycle M27    = new DrillCycle(".945",  "3.0",   "450",   "20",   "3.0",   "2.8",    "2.00",  "157",   "51",       87,    ".01");
		DrillCycle M30    = new DrillCycle("1.062", "3.5",   "400",   "20",   "3.0",   "3.0",    "2.25",  "162",   "52",       87,    ".01");
        DrillCycle M33    = new DrillCycle("1.156", "3.5",   "450",   "20",   "3.0",   "3.125",  "2.40",  "164",   "53",       87,    ".01");
        DrillCycle M36    = new DrillCycle("1.25",  "4.0",   "400",   "20",   "3.5",   "3.5",    "2.50",  "166",   "54",       87,    ".01");
        DrillCycle M39    = new DrillCycle("1.375", "4.0",   "400",   "20",   "3.5",   "3.75",   "2.75",  "168",   "55",       87,    ".01");
        DrillCycle M42    = new DrillCycle("1.50",  "4.5",   "400",   "20",   "3.5",   "4.0",    "3.0",   "170",   "56",       87,    ".01");
        DrillCycle M45    = new DrillCycle("1.625", "4.5",   "400",   "20",   "3.5",   "4.375",  "3.375", "172",   "57",       87,    ".01");
        DrillCycle M48    = new DrillCycle("1.718", "5.0",   "400",   "20",   "3.5",   "4.75",   "3.75",  "174",   "58",       87,    ".01");
        DrillCycle M52    = new DrillCycle("1.875", "5.0",   "350",   "20",   "3.5",   "5.0",    "4.0",   "178",   "59",       87,    ".01");
        DrillCycle M56    = new DrillCycle("2.0",   "5.5",   "350",   "20",   "3.5",   "5.5",    "4.0",   "180",   "DOnOtTap", 87,    ".01");
		

		
//		CBInchScrew.setModel(new DefaultComboBoxModel(new String[] {"8-32", "10-32", "1/4-20", "5/16-18", "3/8-16", "1/2-13", "5/8-11", "3/4-10", "1\"-8", "1 1/4-7", "1 1/2-6", "1 3/4-4?", "2-4 1/2", "None"}));
//		CBMetricScrew.setModel(new DefaultComboBoxModel(new String[] {"M6", "M8", "M10", "M12", "M14", "M16", "M20", "M24", "M30", "None"}));
		
		
//		DrillCycle M6 = new DrillCycle("1", "6");
		
		DLi = 1;
		btnAddLoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				

				if(DLi == 7)
				   {DLi = 6;}
				if(DLi == 1)
				{
				    TFDrillX1.setText(TFDrillXLoc.getText());
				      AutoXLoc[0] = TFDrillXLoc.getText();
				    TFDrillY1.setText(TFDrillYLoc.getText());
				      AutoYLoc[0] = TFDrillYLoc.getText();
				    TFDepth1.setText(TFDrillDepth.getText());
				      AutoDepth[0] = TFDrillDepth.getText();
				    TFRVal1.setText(TFDrillRValue.getText());
				      AutoRValue[0] = TFDrillRValue.getText();
				}
				if(DLi == 2)
				{ 
					TFDrillX2.setText(TFDrillXLoc.getText());
					  AutoXLoc[1] = TFDrillXLoc.getText();
					TFDrillY2.setText(TFDrillYLoc.getText());
					 AutoYLoc[1] = TFDrillYLoc.getText();
					TFDepth2.setText(TFDrillDepth.getText());
					  AutoDepth[1] = TFDrillDepth.getText();
				    TFRVal2.setText(TFDrillRValue.getText());
				      AutoRValue[1] = TFDrillRValue.getText();
				}
				if(DLi == 3)
				{
					TFDrillX3.setText(TFDrillXLoc.getText());
					  AutoXLoc[2] = TFDrillXLoc.getText();
					TFDrillY3.setText(TFDrillYLoc.getText());
					  AutoYLoc[2] = TFDrillYLoc.getText();
					TFDepth3.setText(TFDrillDepth.getText());
					  AutoDepth[2] = TFDrillDepth.getText();  
				    TFRVal3.setText(TFDrillRValue.getText());
				      AutoRValue[2] = TFDrillRValue.getText();
				}
				if(DLi == 4)
				{
					TFDrillX4.setText(TFDrillXLoc.getText());
					  AutoXLoc[3] = TFDrillXLoc.getText();
					TFDrillY4.setText(TFDrillYLoc.getText());
					  AutoYLoc[3] = TFDrillYLoc.getText();
					TFDepth4.setText(TFDrillDepth.getText());
					  AutoDepth[3] = TFDrillDepth.getText();
				    TFRVal4.setText(TFDrillRValue.getText());
				      AutoRValue[3] = TFDrillRValue.getText();
				}
				if(DLi == 5)
				{
					TFDrillX5.setText(TFDrillXLoc.getText());
					  AutoXLoc[4] = TFDrillXLoc.getText();
					TFDrillY5.setText(TFDrillYLoc.getText());
					  AutoYLoc[4] = TFDrillYLoc.getText();
					TFDepth5.setText(TFDrillDepth.getText());
					  AutoDepth[4] = TFDrillDepth.getText();
				    TFRVal5.setText(TFDrillRValue.getText());
				      AutoRValue[4] = TFDrillRValue.getText();
				}
				if(DLi == 6)
				{
					TFDrillX6.setText(TFDrillXLoc.getText());
					  AutoXLoc[5] = TFDrillXLoc.getText();
					TFDrillY6.setText(TFDrillYLoc.getText());
					  AutoYLoc[5] = TFDrillYLoc.getText();
					TFDepth6.setText(TFDrillDepth.getText());
					  AutoDepth[5] = TFDrillDepth.getText();
				    TFRVal6.setText(TFDrillRValue.getText());
				      AutoRValue[5] = TFDrillRValue.getText();
				}
				DLi++;
				  
				    
			}
		});
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				TFDrillX1.setText(null);
				TFDrillX2.setText(null);
				TFDrillX3.setText(null);
				TFDrillX4.setText(null);
				TFDrillX5.setText(null);
				TFDrillX6.setText(null);
				TFDrillY1.setText(null);
				TFDrillY2.setText(null);
				TFDrillY3.setText(null);
				TFDrillY4.setText(null);
				TFDrillY5.setText(null);
				TFDrillY6.setText(null);
				TFDepth1.setText(null);
				TFDepth2.setText(null);
				TFDepth3.setText(null);
				TFDepth4.setText(null);
				TFDepth5.setText(null);
				TFDepth6.setText(null);
				TFRVal1.setText(null);
				TFRVal2.setText(null);
				TFRVal3.setText(null);
				TFRVal4.setText(null);
				TFRVal5.setText(null);
				TFRVal6.setText(null);
				DLi = 1;
			}
		});
		
		btnClearTxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				DrillTextArea.setText(null);
				blockNo = 1;
			}
		});
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
//				%
//				N1G40 G90 !Drill

				DrillTextArea.setText("%");
				DrillTextArea.append(TFDrillProgName.getText());
				DrillTextArea.append("\nN1 G40 G90 !Drill");
//				DrillTextArea.append("\nN2 G0 T" + TFDrillToolNo.getText() + " D" + TFDrillToolNo.getText());
//				DrillTextArea.append("\nN3 S" + TFDrillRPM.getText() + " M3");
//				DrillTextArea.append("\nN4 W10");
			}
		});
		
		
		btnAuto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
//				This method runs the AutoDrill Methods
//				The objects used are Described as:
//				public DrillCycle(String DrillS, String TPitch, String RPM1, String FRate, String DD, String TD)
				
				String InchScrew = (String) CBInchScrew.getSelectedItem();
				String MetricScrew = (String) CBMetricScrew.getSelectedItem();
				//CBInchScrew 8-32, 10-32, 1/4-20, 5/16-18, 3/8-16, 1/2-13, 5/8-11, 3/4-10, 1"-8, 1 1/4-7, 1 1/2-6, 1 3/4-4?, 2-4 1/2, None

				
				if(InchScrew.equals("8-32") && MetricScrew.equals("None"))
				{CenterDrillTap(NC8);}
				if(InchScrew.equals("10-32") && MetricScrew.equals("None"))
				{CenterDrillTap(NC10);}
				if(InchScrew.equals("1/4-20") && MetricScrew.equals("None"))
				{CenterDrillTap(NC250);}
				if(InchScrew.equals("5/16-18") && MetricScrew.equals("None"))
				{CenterDrillTap(NC312);}
				if(InchScrew.equals("3/8-16") && MetricScrew.equals("None"))
				{CenterDrillTap(NC375);}
				if(InchScrew.equals("1/2-13") && MetricScrew.equals("None"))
				{CenterDrillTap(NC500);}
				if(InchScrew.equals("5/8-11") && MetricScrew.equals("None"))
				{CenterDrillTap(NC625);}
				if(InchScrew.equals("3/4-10") && MetricScrew.equals("None"))
				{CenterDrillTap(NC750);}
				if(InchScrew.equals("1\"-8") && MetricScrew.equals("None"))
				{CenterDrillTap(NC100);}
				if(InchScrew.equals("1 1/4-7") && MetricScrew.equals("None"))
				{CenterDrillTap(NC1250);}
				if(InchScrew.equals("1 1/2-6") && MetricScrew.equals("None"))
				{CenterDrillTap(NC1500);}
				if(InchScrew.equals("1 3/4-4?") && MetricScrew.equals("None"))
				{CenterDrillTap(NC1750);}
				if(InchScrew.equals("2-4 1/2") && MetricScrew.equals("None"))
				{CenterDrillTap(NC200);}
//				CBMetricScrew M6, M8, M10, M12, M14, M16, M20, M24, M30, None
				
				if(MetricScrew.equals("M6") && InchScrew.equals("None"))
				{CenterDrillTap(M6);}
				if(MetricScrew.equals("M8") && InchScrew.equals("None"))
				{CenterDrillTap(M8);}
				if(MetricScrew.equals("M10") && InchScrew.equals("None"))
				{CenterDrillTap(M10);}
				if(MetricScrew.equals("M12") && InchScrew.equals("None"))
				{CenterDrillTap(M12);}
				if(MetricScrew.equals("M14") && InchScrew.equals("None"))
				{CenterDrillTap(M14);}
				if(MetricScrew.equals("M16") && InchScrew.equals("None"))
				{CenterDrillTap(M16);}
				if(MetricScrew.equals("M20") && InchScrew.equals("None"))
				{CenterDrillTap(M20);}
				if(MetricScrew.equals("M24") && InchScrew.equals("None"))
				{CenterDrillTap(M24);}
				if(MetricScrew.equals("M30") && InchScrew.equals("None"))
				{CenterDrillTap(M30);}
				}
				catch(Exception e1)
				{JOptionPane.showMessageDialog(null, "Invalid Location");}

				
				
//				DrillTextArea.append(InchScrew);
//				Add This Code
//				%
//				N1G40 G90 !Drill
//				N2 G0 T124 D124
//				N3 S700 M3

			}
		});
		
		btnAddDrillInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				DrillTextArea.append("\nN2 G0 T" + TFDrillToolNo.getText() + " D" + TFDrillToolNo.getText());
				DrillTextArea.append("\nN3 S" + TFDrillRPM.getText() + " M3");
				DrillTextArea.append("\nN4 W10");	
			}
		});
		
		btnCenterDrill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String Cycle = "G81";
				ManDrillCycle(Cycle);
			}
		});
		
		btnPeckDrill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String Cycle = "G83";
				ManDrillCycle(Cycle);
			}
		});
		
		btnCBreakDrill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String Cycle = "G87";
				ManDrillCycle(Cycle);
			}
		});
		
		btnTap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String Cycle = "G84";
				ManDrillCycle(Cycle);
			}
		});
		
		btnDrillRotate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				DrillTextArea.append("\nN" + blockNo + " G11 ");
				blockNo++;
				DrillTextArea.append("\nN" + blockNo + " B90");
				blockNo++;
				DrillTextArea.append("\nN" + blockNo + " G10 ");
				blockNo++;
			}
		});
		
		btnDrillCycleEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				autoDrillCycleEnd();
			}
		});
		
		btnDrillEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				autoDrillEnd();
			}
		});
		

		btnDrillSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		



		
	}
	
	/////////////////////////////////////////////////////////////////////////////////////
    //AutoDrill Methods------------------------------------------------------------------
	////////////////////////////////////////////////////////////////////////////////////
	
	public void CenterDrillTap(DrillCycle DrillInfo)
	{
		String CD   = "CenterDrill";
		String CB   = "CounterBore";
		String Drill = "G81";
		String PDrill = "G83";
		String Tap = "G84";
		String CDrill = "G87";
		String TDrill = null;
		if(DrillInfo.getCycleD() == 81)
		{TDrill = Drill;}
		if(DrillInfo.getCycleD() == 83)
		{TDrill = PDrill;}
		if(DrillInfo.getCycleD() == 87)
		{TDrill = CDrill;}
//		%
//		N1G40 G90 !CenterDrill
		DrillTextArea.append("\n%");
		DrillTextArea.append("\nN" + blockNo + " G40 G90 ");
		blockNo++;
		if(rdbtnCdrill.isSelected())
		{
		autoDrillStart(DrillInfo, "17", CD);          //CenterDrill Cycle
		AutoDrillCycle(DrillInfo, CD);   //CenterDrill Cycle
		autoDrillCycleEnd();                //CenterDrill Cycle
		}
		autoDrillStart(DrillInfo, DrillInfo.getDTNo(), TDrill);          //Drill Cycle
		AutoDrillCycle(DrillInfo, TDrill);  //Drill Cycle
		autoDrillCycleEnd();                //Drill Cycle
		autoDrillStart(DrillInfo, DrillInfo.getTTNo(), Tap);          //Tap Cycle
		AutoDrillCycle(DrillInfo, Tap);     //Tap Cycle
		if(rdbtnCsink.isSelected())
		{
			autoDrillCycleEnd(); 
			autoDrillStart(DrillInfo, "2", CB);          //CounterSink Cycle
			AutoDrillCycle(DrillInfo, CB);   //CounterSink Cycle
		}
		autoDrillEnd(); 
	}

//	public DrillCycle(String DrillS, String TPitch, String DRPM, String TRPM, String DFRate, String DD, String TD, String DTNo, String TTNo, int CycleD)
	public void autoDrillStart(DrillCycle DrillInfo, String ToolNum, String Cycle) 
	{

//		N2 G0 T124 D124
//		N3 S700 M3
//		N4 W10
//		N5 X-16.25 Y6.125
//		N6 M8
//		N7 G0 W1
		if(Cycle.equals("CenterDrill") || Cycle.equals("CounterBore"))
        {
		DrillTextArea.append("\nN" + blockNo + " G0 " + " T" + ToolNum + " D" + ToolNum + " !" + Cycle);
		blockNo++;
		DrillTextArea.append("\nN" + blockNo + " S" + "1100" + " M3"); 
		blockNo++;
		DrillTextArea.append("\nN" + blockNo + " W10");
		blockNo++;
		DrillTextArea.append("\nN" + blockNo + " X" + AutoXLoc[0] + " Y" + AutoYLoc[0]);
		blockNo++;
		DrillTextArea.append("\nN" + blockNo + " M8");
		blockNo++;
		DrillTextArea.append("\nN" + blockNo + " G0 W1");
		blockNo++;	
        }
		else if(Cycle.equals("G84"))
        {
		DrillTextArea.append("\nN" + blockNo + " G0 " + " T" + ToolNum + " D" + ToolNum + " !Tap");
		blockNo++;
		DrillTextArea.append("\nN" + blockNo + " S" + DrillInfo.getTRPM() + " M3"); 
		blockNo++;
		DrillTextArea.append("\nN" + blockNo + " W10");
		blockNo++;
		DrillTextArea.append("\nN" + blockNo + " X" + AutoXLoc[0] + " Y" + AutoYLoc[0]);
		blockNo++;
		DrillTextArea.append("\nN" + blockNo + " M8");
		blockNo++;
		DrillTextArea.append("\nN" + blockNo + " G0 W1");
		blockNo++;	
        }
        else
        {
		DrillTextArea.append("\nN" + blockNo + " G0 " + " T" + ToolNum + " D" + ToolNum + " !Drill");
		blockNo++;
		DrillTextArea.append("\nN" + blockNo + " S" + DrillInfo.getDRPM() + " M3"); 
		blockNo++;
		DrillTextArea.append("\nN" + blockNo + " W10");
		blockNo++;
		DrillTextArea.append("\nN" + blockNo + " X" + AutoXLoc[0] + " Y" + AutoYLoc[0]);
		blockNo++;
		DrillTextArea.append("\nN" + blockNo + " M8");
		blockNo++;
		DrillTextArea.append("\nN" + blockNo + " G0 W1");
		blockNo++;	
        }
	}

//	public DrillCycle(String DrillS, String TPitch, String DRPM, String TRPM, String DFRate, String DD, String TD)
	public void AutoDrillCycle(DrillCycle DrillInfo, String Cycle) 
	{
//		N8 G83 Z-1.339 G99 P1 F5 Q.375 R.061
//		N20 G84 Z-1.0 G99 P1 F5 R.061 K=1/13
		AutoDrillNo = 1;
		
		int i = 0;
		String Q = "";
		String K = "";
		if(Cycle.equals("G83"))
		{Q = "Q.35";}
		if(Cycle.equals("G87"))
		{Q = "Q.1";}
		if(Cycle.equals("G84"))
		{K = "K=" + DrillInfo.getTapPitch();}
		if(Cycle.equals("CenterDrill"))
		{
		while(AutoDrillNo < DLi)
		{
			DrillTextArea.append("\nN" + blockNo + " " + "G81" + " X" + AutoXLoc[i] + " Y" + AutoYLoc[i] + " Z-.05" + " G99 P1 F5 " + Q + " R" + AutoRValue[i] + " " +K);
			AutoDrillNo++;
			blockNo++;
			i++;
		}
		}
		if(Cycle.equals("CounterBore"))
		{
		while(AutoDrillNo < DLi)
		{
			DrillTextArea.append("\nN" + blockNo + " " + "G81" + " X" + AutoXLoc[i] + " Y" + AutoYLoc[i] + " Z-" + DrillInfo.getCBD() + " G99 P1 F5 " + Q + " R" + AutoRValue[i] + " " +K);
			AutoDrillNo++;
			blockNo++;
			i++;
		}
		}
		if(Cycle.equals("G83") || Cycle.equals("G87"))
		{
		while(AutoDrillNo < DLi)
		{
			DrillTextArea.append("\nN" + blockNo + " " + Cycle + " X" + AutoXLoc[i] + " Y" + AutoYLoc[i] + " Z-" + DrillInfo.getDD() + " G99 P1 F5 " + Q + " R" + AutoRValue[i] + " " +K);
			AutoDrillNo++;
			blockNo++;
			i++;
		}
		}
		if(Cycle.equals("G84"))
		{
			while(AutoDrillNo < DLi)
			{
				DrillTextArea.append("\nN" + blockNo + " " + Cycle + " X" + AutoXLoc[i] + " Y" + AutoYLoc[i] + " Z-" + DrillInfo.getTD() + " G99 P1 F5 " + Q + " R" + AutoRValue[i] + " " +K);
				AutoDrillNo++;
				blockNo++;
				i++;
			}
		}
		

			
	}
	public void autoDrillCycleEnd() 
	{
//		N9 G80
//		N10 G0
//		N11 W10
//		N12 M9
//		N13 M0

		DrillTextArea.append("\nN" + blockNo + " G80");
		blockNo++;
		DrillTextArea.append("\nN" + blockNo + " G0");
		blockNo++;
		DrillTextArea.append("\nN" + blockNo + " W10");
		blockNo++;	
		DrillTextArea.append("\nN" + blockNo + " M9");
		blockNo++;	
		DrillTextArea.append("\nN" + blockNo + " M0");
		blockNo++;	
		DrillTextArea.append("\n");
	}
	public void autoDrillEnd() 
	{
//		N21 G80
//		N22 M9
//		N23 G0 W10
//		N24 M2
//		 %

		DrillTextArea.append("\nN" + blockNo + " G80");
		blockNo++;
		DrillTextArea.append("\nN" + blockNo + " G0 W10");
		blockNo++;	
		DrillTextArea.append("\nN" + blockNo + " M9");
		blockNo++;	
		DrillTextArea.append("\nN" + blockNo + " M2");
		blockNo++;	
		DrillTextArea.append("\n%");
		blockNo++;	
		
	}
	
	public void ManDrillCycle(String Cycle) 
	{
//		N8 G83 Z-1.339 G99 P1 F5 Q.375 R.061
//		N20 G84 Z-1.0 G99 P1 F5 R.061 K=1/13
		AutoDrillNo = 1;
		int i = 0;
		String Q = "";
		String K = "";
		if(Cycle.equals("G81"))
		{Q = "";}
		if(Cycle.equals("G81"))
		{Q = "";}
		if(Cycle.equals("G83") && TFDrillQ.getText().equals(""))
		{Q = "Q.35";}
		if(Cycle.equals("G87") && TFDrillQ.getText().equals(""))
		{Q = "Q.1";}
		if(Cycle.equals("G84"))
		{K = "K=" + TFTapPitch.getText();}
		if(!TFDrillQ.getText().equals(""))
			Q = "Q" + TFDrillQ.getText();
//		if(Cycle.equals("G84"))
//		{
		
		if(Cycle.equals("G83") || Cycle.equals("G87"))
		{
			while(AutoDrillNo < DLi)
			{
				DrillTextArea.append("\nN" + blockNo + " " + Cycle + " X" + AutoXLoc[i] + " Y" + AutoYLoc[i] + " Z-" + AutoDepth[i] + " G99 P1 F5 " + Q + " R" + AutoRValue[i] + " " +K);
				AutoDrillNo++;
				blockNo++;
				i++;
			}
		}
		if(Cycle.equals("G84"))
		{
			while(AutoDrillNo < DLi)
			{
				double TapDepth = Integer.parseInt(AutoDepth[i]);
				double TD = (TapDepth * .75);
				DrillTextArea.append("\nN" + blockNo + " " + Cycle + " X" + AutoXLoc[i] + " Y" + AutoYLoc[i] + " Z-" + TD + " G99 P1 F5 " + Q + " R" + AutoRValue[i] + " " +K);
				AutoDrillNo++;
				blockNo++;
				i++;
			}
		}

			
	}
}

