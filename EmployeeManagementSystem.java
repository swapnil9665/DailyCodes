import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Employee {
    String name, id, department;

    Employee(String name, String id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Dept: " + department;
    }
}

public class EmployeeManagementSystem extends JFrame implements ActionListener {
    ArrayList<Employee> employees = new ArrayList<>();

    JTextField nameField, idField, deptField;
    JTextField deleteIdField, updateIdField, updateNameField, updateDeptField;
    JTextArea displayArea;

    EmployeeManagementSystem() {
        setTitle("Employee Management System");
        setSize(600, 650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Top Panel - Form
        JPanel formPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        formPanel.setBorder(BorderFactory.createTitledBorder("Add Employee"));

        formPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        formPanel.add(nameField);

        formPanel.add(new JLabel("ID:"));
        idField = new JTextField();
        formPanel.add(idField);

        formPanel.add(new JLabel("Department:"));
        deptField = new JTextField();
        formPanel.add(deptField);

        JButton addButton = new JButton("Add Employee");
        addButton.addActionListener(this);
        formPanel.add(addButton);

        JButton viewButton = new JButton("View All");
        viewButton.addActionListener(e -> displayEmployees());
        formPanel.add(viewButton);

        add(formPanel, BorderLayout.NORTH);

        // Center Panel - Display Area
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Employee List"));
        add(scrollPane, BorderLayout.CENTER);

        // Bottom Panel - Delete + Update
        JPanel bottomPanel = new JPanel(new GridLayout(2, 1));

        // Delete Panel
        JPanel deletePanel = new JPanel(new FlowLayout());
        deletePanel.setBorder(BorderFactory.createTitledBorder("Delete Employee"));

        deletePanel.add(new JLabel("Enter ID to Delete:"));
        deleteIdField = new JTextField(10);
        deletePanel.add(deleteIdField);

        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(e -> deleteEmployee());
        deletePanel.add(deleteButton);

        bottomPanel.add(deletePanel);

        // Update Panel
        JPanel updatePanel = new JPanel(new GridLayout(2, 4, 5, 5));
        updatePanel.setBorder(BorderFactory.createTitledBorder("Update Employee"));

        updatePanel.add(new JLabel("ID to Update:"));
        updateIdField = new JTextField();
        updatePanel.add(updateIdField);

        updatePanel.add(new JLabel("New Name:"));
        updateNameField = new JTextField();
        updatePanel.add(updateNameField);

        updatePanel.add(new JLabel("New Department:"));
        updateDeptField = new JTextField();
        updatePanel.add(updateDeptField);

        JButton updateButton = new JButton("Update");
        updateButton.addActionListener(e -> updateEmployee());
        updatePanel.add(updateButton);

        bottomPanel.add(updatePanel);

        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    // Add employee
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText().trim();
        String id = idField.getText().trim();
        String dept = deptField.getText().trim();

        if (!name.isEmpty() && !id.isEmpty() && !dept.isEmpty()) {
            employees.add(new Employee(name, id, dept));
            JOptionPane.showMessageDialog(this, "Employee added successfully.");
            nameField.setText("");
            idField.setText("");
            deptField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Please fill all fields.");
        }
    }

    // Display all employees
    private void displayEmployees() {
        StringBuilder sb = new StringBuilder();
        for (Employee emp : employees) {
            sb.append(emp.toString()).append("\n");
        }
        displayArea.setText(sb.toString());
    }

    // Delete employee by ID
    private void deleteEmployee() {
        String id = deleteIdField.getText().trim();
        boolean removed = employees.removeIf(emp -> emp.id.equals(id));

        if (removed) {
            JOptionPane.showMessageDialog(this, "Employee removed.");
        } else {
            JOptionPane.showMessageDialog(this, "Employee ID not found.");
        }
        deleteIdField.setText("");
        displayEmployees();
    }

    // Update employee by ID
    private void updateEmployee() {
        String id = updateIdField.getText().trim();
        String newName = updateNameField.getText().trim();
        String newDept = updateDeptField.getText().trim();

        boolean updated = false;

        for (Employee emp : employees) {
            if (emp.id.equals(id)) {
                if (!newName.isEmpty()) emp.name = newName;
                if (!newDept.isEmpty()) emp.department = newDept;
                updated = true;
                break;
            }
        }

        if (updated) {
            JOptionPane.showMessageDialog(this, "Employee updated.");
        } else {
            JOptionPane.showMessageDialog(this, "Employee ID not found.");
        }

        updateIdField.setText("");
        updateNameField.setText("");
        updateDeptField.setText("");
        displayEmployees();
    }

    public static void main(String[] args) {
        new EmployeeManagementSystem();
    }
}
