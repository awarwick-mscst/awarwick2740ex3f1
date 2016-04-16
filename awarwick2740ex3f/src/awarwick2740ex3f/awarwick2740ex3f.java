package awarwick2740ex3f;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class awarwick2740ex3f extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField employeeIDTextField;
	private JTextField employeeNameTextField;
	private JTextField positionTextField;
	private JButton noArgBtn;
	private JList employeeList;
	private DefaultListModel employeeListModel;
	private JButton twoArgBtn;
	private JButton fourArgBtn;
	private JComboBox departmentComboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					awarwick2740ex3f frame = new awarwick2740ex3f();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public awarwick2740ex3f() {
		setTitle("AW Ex3F: Overloaded Constructors");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 411, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 376, 139);
		contentPane.add(scrollPane);
		
		employeeListModel = new DefaultListModel();
		employeeList = new JList(employeeListModel);
		scrollPane.setViewportView(employeeList);
		
		JLabel lblEmployeeId = new JLabel("Employee ID:");
		lblEmployeeId.setBounds(20, 164, 83, 14);
		contentPane.add(lblEmployeeId);
		
		JLabel lblEmployeeName = new JLabel("Employee name:");
		lblEmployeeName.setBounds(20, 189, 100, 14);
		contentPane.add(lblEmployeeName);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setBounds(20, 214, 83, 14);
		contentPane.add(lblDepartment);
		
		JLabel lblPosition = new JLabel("Position:");
		lblPosition.setBounds(20, 248, 70, 14);
		contentPane.add(lblPosition);
		
		employeeIDTextField = new JTextField();
		employeeIDTextField.setText("15");
		employeeIDTextField.setBounds(134, 161, 63, 20);
		contentPane.add(employeeIDTextField);
		employeeIDTextField.setColumns(10);
		
		employeeNameTextField = new JTextField();
		employeeNameTextField.setText("Aaron Warwick");
		employeeNameTextField.setBounds(134, 186, 122, 20);
		contentPane.add(employeeNameTextField);
		employeeNameTextField.setColumns(10);
		
		departmentComboBox = new JComboBox();
		departmentComboBox.setModel(new DefaultComboBoxModel(new String[] {"Business Office", "Human Resources", "Manufacturing", "Shipping", "Maintenance"}));
		departmentComboBox.setBounds(134, 214, 156, 20);
		contentPane.add(departmentComboBox);
		
		positionTextField = new JTextField();
		positionTextField.setText("Software Engineer");
		positionTextField.setBounds(134, 245, 122, 20);
		contentPane.add(positionTextField);
		positionTextField.setColumns(10);
		
		noArgBtn = new JButton("No Arg");
		noArgBtn.addActionListener(this);
		noArgBtn.setBounds(71, 276, 89, 23);
		contentPane.add(noArgBtn);
		
		twoArgBtn = new JButton("2 Arg");
		twoArgBtn.addActionListener(this);
		twoArgBtn.setBounds(170, 276, 89, 23);
		contentPane.add(twoArgBtn);
		
		fourArgBtn = new JButton("4 Arg");
		fourArgBtn.addActionListener(this);
		fourArgBtn.setBounds(269, 276, 89, 23);
		contentPane.add(fourArgBtn);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == fourArgBtn) {
			do_fourArgBtn_actionPerformed(arg0);
		}
		if (arg0.getSource() == twoArgBtn) {
			do_twoArgBtn_actionPerformed(arg0);
		}
		if (arg0.getSource() == noArgBtn) {
			do_noArgBtn_actionPerformed(arg0);
		}
	}
	protected void do_noArgBtn_actionPerformed(ActionEvent arg0) { // ----------------------- ex3f ---------------------
		// Call appropriate constructor
		Employee emp = new Employee();
		// Add employee to employeeListModel
		employeeListModel.addElement(emp.toString());
	}
	protected void do_twoArgBtn_actionPerformed(ActionEvent arg0) {
		// Get empID from empIdTextField, convert to int
		int empID = Integer.parseInt(employeeIDTextField.getText());
		String empName = employeeNameTextField.getText();
		Employee emp = new Employee(empName, empID);
		// call appropriate constructor
		// add employee to employeeListModel
		employeeListModel.addElement(emp.toString());
	}
	protected void do_fourArgBtn_actionPerformed(ActionEvent arg0) {
		// Get empID from empIDTextField, convert to int
		// Get selected string from deptComboBox:
		//    String dept = (String) deptComboBox.getSelectedItem();
		// Call appropriate constructor
		int empID = Integer.parseInt(employeeIDTextField.getText());
		String empName = employeeNameTextField.getText();
		String dept = (String) departmentComboBox.getSelectedItem();
		String position = positionTextField.getText();
		Employee emp = new Employee(empName, empID, dept, position);
		// Add employee to employeeListModel
		employeeListModel.addElement(emp.toString());
	}
}
