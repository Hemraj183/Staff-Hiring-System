import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.util.ArrayList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class INGNepal {
    ArrayList<StaffHire> list = new ArrayList<StaffHire>();//making arrylist to store data
    JFrame frame;
    JPanel panel1, panel2;
    private JTextField tfVacancyNumber;
    private JTextField tfVacancyNumber1;
    private JTextField tfVacancyNumber3;
    private JTextField tfVacancyNumber4;
    private JTextField tfVacancyNumber5;
    private JTextField tfDesignation;
    private JTextField tfSalary;
    private JTextField tfWorkingHour;
    private JTextField tfJobType;
    private JTextField tfWagesPerHour;
    private JTextField tfShifts;
    private JTextField tfStaffName;
    private JTextField tfJoiningDate;
    private JTextField tfQualification;
    private JTextField tfAppointedBy;

    public  INGNepal() {
        initializeFrame();
        initializeMenu();
        initializeBody();
    }

    public void initializeFrame() {
        frame = new JFrame("INGNepal");//name of frame
        frame.setBounds(0,0, 800, 500);//(x,y, width, height)
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        panel1 = new JPanel();
        frame.add(panel1);
        panel1.setLayout(null);
        panel1.setBounds(0,20,800, 500);

    }

    public void initializeMenu() { 
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(0, 0, 800, 20);//(x,y, width, height)
        frame.getContentPane().add(menuBar);

        JMenu menuFile = new JMenu("File");
        menuBar.add(menuFile);

        JMenuItem menunitemNew = new JMenuItem("New File");
        menuFile.add(menunitemNew);
        menunitemNew.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    newfile();
                };
            });

        JMenuItem menunitemExit = new JMenuItem("Exit");
        menuFile.add(menunitemExit);
        menunitemExit.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    System.exit(0);
                };
            });

        JMenu menuAbout = new JMenu("About");
        menuBar.add(menuAbout);

        JMenuItem menuitemApp = new JMenuItem("App");
        menuAbout.add(menuitemApp);
        menuitemApp.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    JOptionPane.showMessageDialog(frame, "Version: 1.0", "App", JOptionPane.INFORMATION_MESSAGE);
                };
            });

        JMenuItem menuitemDeveloper = new JMenuItem("Developer");
        menuAbout.add(menuitemDeveloper);
        menuitemDeveloper.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    JOptionPane.showMessageDialog(frame, "Developed By: Hemaraj Dhakal", "Developer", JOptionPane.INFORMATION_MESSAGE);
                };
            });
    }

    public void newfile(){//code to make all the textfiled empty.
        try{
            tfVacancyNumber.setText(null);
            tfVacancyNumber1.setText(null);
            tfDesignation.setText(null);
            tfJobType.setText(null);
            tfSalary.setText(null);
            tfWorkingHour.setText(null);
            tfStaffName.setText(null);
            tfJoiningDate.setText(null);
            tfQualification.setText(null);
            tfAppointedBy.setText(null);
            tfVacancyNumber3.setText(null);
            tfVacancyNumber4.setText(null);
            tfVacancyNumber5.setText(null);
            tfWagesPerHour.setText(null);
            tfShifts.setText(null);

        }catch(NullPointerException e){

        }
    }

    public void initializeBody() {
        JLabel lbl0 = new JLabel("Full Time Staff Hire ");//(label name)
        lbl0.setBounds(320,0,110,25);//(x,y, width, height)
        panel1.add(lbl0);

        JLabel lbl = new JLabel("Vacancy Number: ");//(label name)
        lbl.setBounds(15,40,110,25);//(x,y, width, height)
        panel1.add(lbl);

        tfVacancyNumber = new JTextField();//(text field name)
        tfVacancyNumber.setBounds(150,40,200,25);//(x,y, width, height)
        panel1.add(tfVacancyNumber);

        JLabel lbl2 = new JLabel("Designation: ");//(label name)
        lbl2.setBounds(15,80,100,25);//(x,y, width, height)
        panel1.add(lbl2);

        tfDesignation = new JTextField();//(text field name)
        tfDesignation.setBounds(150,80,200,25);//(x,y, width, height)
        panel1.add(tfDesignation);

        JLabel lbl3 = new JLabel("Job Type: ");//(label name)
        lbl3.setBounds(15,120,100,25);//(x,y, width, height)
        panel1.add(lbl3);

        tfJobType = new JTextField();//(text field name)
        tfJobType.setBounds(150,120,200,25);//(x,y, width, height)
        panel1.add(tfJobType);

        JLabel lbl4 = new JLabel("Salary: ");//(label name)
        lbl4.setBounds(15,160,100,25);//(x,y, width, height)
        panel1.add(lbl4);

        tfSalary = new JTextField();//(text field name)
        tfSalary.setBounds(150,160,200,25);//(x,y, width, height)
        panel1.add(tfSalary);

        JLabel lbl5 = new JLabel("Working Hour: ");//(label name)
        lbl5.setBounds(15,200,130,25);//(x,y, width, height)
        panel1.add(lbl5);

        tfWorkingHour = new JTextField();//(text field name)
        tfWorkingHour.setBounds(150,200,200,25);//(x,y, width, height)
        panel1.add(tfWorkingHour);

        JLabel lbl6 = new JLabel("Vacancy Number: ");//(label name)
        lbl6.setBounds(400,40,110,25);//(x,y, width, height)
        panel1.add(lbl6);

        tfVacancyNumber1 = new JTextField();//(text field name)
        tfVacancyNumber1.setBounds(520,40,200,25);//(x,y, width, height)
        panel1.add(tfVacancyNumber1);

        JLabel lbl7 = new JLabel("Staff Name: ");//(label name)
        lbl7.setBounds(400,80,110,25);//(x,y, width, height)
        panel1.add(lbl7);

        tfStaffName = new JTextField();//(text field name)
        tfStaffName.setBounds(520,80,200,25);//(x,y, width, height)
        panel1.add(tfStaffName);

        JLabel lbl8 = new JLabel("Joining Date: ");//(label name)
        lbl8.setBounds(400,120,100,25);//(x,y, width, height)
        panel1.add(lbl8);

        tfJoiningDate = new JTextField();//(text field name)
        tfJoiningDate.setBounds(520,120,200,25);//(x,y, width, height)
        panel1.add(tfJoiningDate);

        JLabel lbl9 = new JLabel("Qualification: ");//(label name)
        lbl9.setBounds(400,160,100,25);//(x,y, width, height)
        panel1.add(lbl9);

        tfQualification = new JTextField();//(text field name)
        tfQualification.setBounds(520,160,200,25);//(x,y, width, height)
        panel1.add(tfQualification);

        JLabel lbl10 = new JLabel("Appointed By: ");//(label name)
        lbl10.setBounds(400,200,100,25);//(x,y, width, height)
        panel1.add(lbl10);

        tfAppointedBy = new JTextField();//(text field name)
        tfAppointedBy.setBounds(520,200,200,25);//(x,y, width, height)
        panel1.add(tfAppointedBy);

        JButton btnadd = new JButton();//code of button add
        btnadd.setText("ADD");
        btnadd.setBounds(15,250,90,25);//(x,y, width, height)
        panel1.add(btnadd);
        btnadd.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    add();
                };
            });

        JButton btnappoint = new JButton();//code of button appoint
        btnappoint.setText("Appoint");
        btnappoint.setBounds(500,250,100,25);//(x,y, width, height)
        panel1.add(btnappoint);
        btnappoint.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    appoint();
                };
            });

        JButton btndisplay = new JButton();//code of button display
        btndisplay.setText("Display");
        btndisplay.setBounds(280,250,90,25);//(x,y, width, height)
        panel1.add(btndisplay);
        btndisplay.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    display();  
                };
            });

        JButton btnclear = new JButton();//code of button clear
        btnclear.setText("Clear");
        btnclear.setBounds(15,300,90,25);//(x,y, width, height)
        panel1.add(btnclear);
        btnclear.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    clear(); 

                };
            });

        JButton btnparttime = new JButton();//code of btn part time staff hire
        btnparttime.setText("Part Time StaffHire");
        btnparttime.setBounds(250,300,160,25);//(x,y, width, height)
        panel1.add(btnparttime);
        btnparttime.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    partTime();

                };
            });

    }

    public void add(){ //code to add add vacncy number in arrylist
        String vacancyNumber =tfVacancyNumber.getText();
        String salary=tfSalary.getText();
        String workingHour=tfWorkingHour.getText();
        String designation=tfDesignation.getText();
        String jobType=tfJobType.getText();
        int i1=0;
        int i2=0;
        int i3=0;

        if(vacancyNumber.trim().equals("")||salary.trim().equals("")||workingHour.trim().equals("")||designation.trim().equals("")||jobType.trim().equals("")){
            JOptionPane.showMessageDialog(frame, "Please fill all the fields before submitting", "Error", 0);
        }else{
            try{
                i1 = Integer.parseInt(vacancyNumber);
                i2 = Integer.parseInt(salary);
                i3 = Integer.parseInt(workingHour);

            }catch(NumberFormatException NFE){
                JOptionPane.showMessageDialog(frame,"Please give valid input" ,"Result", 0);
                return;
            }
            for(StaffHire hire : list){
                if(hire instanceof FullTimeStaffHire){
                    FullTimeStaffHire FTSH=(FullTimeStaffHire) hire;
                    if(FTSH.getVacancyNumber()==i1){
                        JOptionPane.showMessageDialog(frame,"Vacancy already exists","Result", 0);
                        return;
                    }else{

                    }
                }       
            }
            FullTimeStaffHire ft =new FullTimeStaffHire(i1, i2,i3,designation,jobType);
            list.add(ft);
            JOptionPane.showMessageDialog(frame, "Succuessfully added.");

        }
    }

    public void appoint(){//code to appoint staff
        String vacancyNumber1 =tfVacancyNumber1.getText();
        String staffName=tfStaffName.getText();
        String joiningDate=tfJoiningDate.getText();
        String qualification =tfQualification.getText();
        String appointedBy=tfAppointedBy.getText();
        int vn=0;

        if(vacancyNumber1.trim().equals("")||staffName.trim().equals("")||joiningDate.trim().equals("")||qualification.trim().equals("")||appointedBy.trim().equals("")){
            JOptionPane.showMessageDialog(frame, "Please fill all the fields before submitting", "Error", 0);
        }else{
            try{
                vn = Integer.parseInt(vacancyNumber1);

            }catch(NumberFormatException NFE){
                JOptionPane.showMessageDialog(frame,"Please give valid input" ,"Result", 0);
                return;
            }
            boolean found=  false;
            for(int i= 0; i < list.size(); ++i){
                StaffHire hire = list.get(i);
                if(hire instanceof FullTimeStaffHire){
                    FullTimeStaffHire FTSH=(FullTimeStaffHire) hire;
                    if(FTSH.getVacancyNumber()==vn){
                        FTSH.hireFullTimeStaff(staffName,joiningDate,qualification,appointedBy);
                        JOptionPane.showMessageDialog(frame, "Succuessfully Hired.");
                        found=true;
                        break;

                    }
                }

            }
            if(!found){
                JOptionPane.showMessageDialog(frame,"Vacancy Number not found" ,"Result", 0);
            }
        }
    }

    public void clear(){//code of clear the text field of full time staff hire
        tfVacancyNumber.setText(null);
        tfVacancyNumber1.setText(null);
        tfDesignation.setText(null);
        tfJobType.setText(null);
        tfSalary.setText(null);
        tfWorkingHour.setText(null);
        tfStaffName.setText(null);
        tfJoiningDate.setText(null);
        tfQualification.setText(null);
        tfAppointedBy.setText(null);
    }

    public void display(){//code do display details of full time staff hire in terminal
        for(StaffHire hire: list){
            if(hire instanceof FullTimeStaffHire){
                FullTimeStaffHire FTSH = (FullTimeStaffHire) hire;
                FTSH.displayDetails();
            }
        }

    }

    public void partTime(){//making GUI of part time staff hire
        panel2 = new JPanel();
        frame.add(panel2);
        panel2.setLayout(null);
        panel2.setBounds(0,20,800, 500);
        panel1.setVisible(false);
        panel2.setVisible(true);

        JLabel lbl0 = new JLabel("Part Time Staff Hire ");//(label name)
        lbl0.setBounds(320,0,125,25);//(x,y, width, height)
        panel2.add(lbl0);

        JLabel lbl = new JLabel("Vacancy Number: ");//(label name)
        lbl.setBounds(15,40,110,25);//(x,y, width, height)
        panel2.add(lbl);

        tfVacancyNumber3 = new JTextField();//(text field name)
        tfVacancyNumber3.setBounds(150,40,200,25);//(x,y, width, height)
        panel2.add(tfVacancyNumber3);

        JLabel lbl2 = new JLabel("Designation: ");//(label name)
        lbl2.setBounds(15,80,100,25);//(x,y, width, height)
        panel2.add(lbl2);

        tfDesignation = new JTextField();//(text field name)
        tfDesignation.setBounds(150,80,200,25);//(x,y, width, height)
        panel2.add(tfDesignation);

        JLabel lbl3 = new JLabel("Job Type: ");//(label name)
        lbl3.setBounds(15,120,100,25);//(x,y, width, height)
        panel2.add(lbl3);

        tfJobType = new JTextField();//(text field name)
        tfJobType.setBounds(150,120,200,25);//(x,y, width, height)
        panel2.add(tfJobType);

        JLabel lbl4 = new JLabel("Working Hour PerDay: ");//(label name)
        lbl4.setBounds(15,160,200,25);//(x,y, width, height)
        panel2.add(lbl4);

        tfWorkingHour = new JTextField();//(text field name)
        tfWorkingHour.setBounds(150,160,200,25);//(x,y, width, height)
        panel2.add(tfWorkingHour);

        JLabel lbl5 = new JLabel("Wages Per Hour: ");//(label name)
        lbl5.setBounds(15,200,160,25);//(x,y, width, height)
        panel2.add(lbl5);

        tfWagesPerHour = new JTextField();//(text field name)
        tfWagesPerHour.setBounds(150,200,200,25);//(x,y, width, height)
        panel2.add(tfWagesPerHour);

        JLabel lbl6 = new JLabel("Shifts: ");//(label name)
        lbl6.setBounds(15,240,100,25);//(x,y, width, height)
        panel2.add(lbl6);

        tfShifts = new JTextField();//(text field name)
        tfShifts.setBounds(150,240,200,25);//(x,y, width, height)
        panel2.add(tfShifts);

        JLabel lbl7 = new JLabel("Vacancy Number: ");//(label name)
        lbl7.setBounds(400,40,120,25);//(x,y, width, height)
        panel2.add(lbl7);

        tfVacancyNumber4 = new JTextField();//(text field name)
        tfVacancyNumber4.setBounds(520,40,200,25);//(x,y, width, height)
        panel2.add(tfVacancyNumber4);

        JLabel lbl8 = new JLabel("Staff Name: ");//(label name)
        lbl8.setBounds(400,80,120,25);//(x,y, width, height)
        panel2.add(lbl8);

        tfStaffName = new JTextField();//(text field name)
        tfStaffName.setBounds(520,80,200,25);//(x,y, width, height)
        panel2.add(tfStaffName);

        JLabel lbl9 = new JLabel("Joining Date: ");//(label name)
        lbl9.setBounds(400,120,120,25);//(x,y, width, height)
        panel2.add(lbl9);

        tfJoiningDate = new JTextField();//(text field name)
        tfJoiningDate.setBounds(520,120,200,25);//(x,y, width, height)
        panel2.add(tfJoiningDate);

        JLabel lbl10 = new JLabel("Qualification: ");//(label name)
        lbl10.setBounds(400,160,120,25);//(x,y, width, height)
        panel2.add(lbl10);

        tfQualification = new JTextField();//(text field name)
        tfQualification.setBounds(520,160,200,25);//(x,y, width, height)
        panel2.add(tfQualification);

        JLabel lbl11 = new JLabel("Appointed By: ");//(label name)
        lbl11.setBounds(400,200,120,25);//(x,y, width, height)
        panel2.add(lbl11);

        tfAppointedBy = new JTextField();//(text field name)
        tfAppointedBy.setBounds(520,200,200,25);//(x,y, width, height)
        panel2.add(tfAppointedBy);

        JLabel lbl12 = new JLabel("Vacancy Number: ");//(label name)
        lbl12.setBounds(400,300,120,25);//(x,y, width, height)
        panel2.add(lbl12);

        tfVacancyNumber5 = new JTextField();//(text field name)
        tfVacancyNumber5.setBounds(520,300,200,25);//(x,y, width, height)
        panel2.add(tfVacancyNumber5);

        JButton btnadd1 = new JButton();//code to make add button
        btnadd1.setText("ADD");
        btnadd1.setBounds(15,300,90,25);//(x,y, width, height)
        panel2.add(btnadd1);
        btnadd1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    add1();
                };
            });

        JButton btnappoint1 = new JButton();//code to make appoint button
        btnappoint1.setText("Appoint");
        btnappoint1.setBounds(500,250,100,25);//(x,y, width, height)
        panel2.add(btnappoint1);
        btnappoint1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    appoint1();
                };
            });

        JButton btndisplay1 = new JButton();//code to make display button
        btndisplay1.setText("Display");
        btndisplay1.setBounds(300,300,90,25);//(x,y, width, height)
        panel2.add(btndisplay1);
        btndisplay1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    display1();
                };
            });

        JButton btnclear1 = new JButton();//code to make clear button
        btnclear1.setText("Clear");
        btnclear1.setBounds(15,350,90,25);//(x,y, width, height)
        panel2.add(btnclear1);
        btnclear1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    clear1();
                };
            });

        JButton btnterminate = new JButton();//code to make terminate button
        btnterminate.setText("Terminate");
        btnterminate.setBounds(600,350,90,25);//(x,y, width, height)
        panel2.add(btnterminate);
        btnterminate.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    terminate();
                };
            });

        JButton btnBack = new JButton("BACK");//code to make back button so that we can return from part time staff hire panel to full time staff hire panel
        btnBack.setBounds(300,350,90,25);//(x,y, width, height)
        panel2.add(btnBack);
        btnBack.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    panel2.setVisible(false);
                    panel1.setVisible(true);
                }
            });

    }

    public void add1(){//code to save vacancy number in arraylistof part time satff
        String vacancyNumber3 =tfVacancyNumber3.getText();
        String designation=tfDesignation.getText();
        String jobType=tfJobType.getText();
        String workingHour=tfWorkingHour.getText();
        String wagesPerHour=tfWagesPerHour.getText();
        String shifts=tfShifts.getText();

        int i0=0,i4=0,i5=0;

        if(vacancyNumber3.trim().equals("")||designation.trim().equals("")||wagesPerHour.trim().equals("")||jobType.trim().equals("")||shifts.trim().equals("")||workingHour.trim().equals("")){
            JOptionPane.showMessageDialog(frame, "Please fill all the fields before submitting", "Error", 0);
        }else{
            try{
                i0 = Integer.parseInt(vacancyNumber3);
                i4 = Integer.parseInt(workingHour);
                i5 = Integer.parseInt(wagesPerHour);

            }catch(NumberFormatException NFE){
                JOptionPane.showMessageDialog(frame,"Please give valid input" ,"Result", 0);
                return;
            }
            for(StaffHire hire : list){
                if(hire instanceof PartTimeStaffHire){
                    PartTimeStaffHire PTSH=(PartTimeStaffHire) hire;
                    if(PTSH.getVacancyNumber()==i0){
                        JOptionPane.showMessageDialog(frame,"Vacancy already exists","Result", 0);
                        return;
                    }else{

                    }
                }
            }
            PartTimeStaffHire pt =new PartTimeStaffHire(i0,designation,jobType, i4,i5,shifts);
            list.add(pt);
            JOptionPane.showMessageDialog(frame, "Succuessfully added.");
        }
    }

    public void appoint1(){//code to appoint parttime staff
        String vacancyNumber4 =tfVacancyNumber4.getText();
        String staffName=tfStaffName.getText();
        String joiningDate=tfJoiningDate.getText();
        String qualification =tfQualification.getText();
        String appointedBy=tfAppointedBy.getText();
        int i6;

        if(vacancyNumber4.trim().equals("")||staffName.trim().equals("")||joiningDate.trim().equals("")||qualification.trim().equals("")||appointedBy.trim().equals("")){
            JOptionPane.showMessageDialog(frame, "Please fill all the fields before submitting", "Error", 0);
        }else{
            try{
                i6 = Integer.parseInt(vacancyNumber4);
            }catch(NumberFormatException NFE){
                JOptionPane.showMessageDialog(frame,"Please give valid input" ,"Result", 0);
                return;

            }
            boolean found = false;
            for(int i= 0; i < list.size(); ++i){
                StaffHire hire = list.get(i);
                if(hire instanceof PartTimeStaffHire){
                    PartTimeStaffHire PTSH=(PartTimeStaffHire) hire;
                    if(PTSH.getVacancyNumber()==i6){
                        PTSH.hirePartTimeStaff(staffName,joiningDate,qualification,appointedBy);
                        JOptionPane.showMessageDialog(frame, "Succuessfully Hired.");
                        found=true;
                        break;

                    }
                }
            }
            if(!found){
                JOptionPane.showMessageDialog(frame,"Vacancy Number not found" ,"Result", 0);

            }
        }
    }  

    public void terminate(){//code to terminate to given vaccncy number from partime staff hire
        String vacancyNumber =tfVacancyNumber5.getText(); 
        int vn = 0;
        if(vacancyNumber.trim().equals("")){
            JOptionPane.showMessageDialog(frame, "Please fill all the fields before submitting", "Error", 0);
        }else{
            try{
                vn = Integer.parseInt(vacancyNumber);
            }catch(NumberFormatException NFE){
                JOptionPane.showMessageDialog(frame,"Please give valid input" ,"Result", 0);
                return;
            }

            boolean found =false;
            for(StaffHire hire: list){
                if(hire instanceof PartTimeStaffHire){
                    PartTimeStaffHire PTSH = (PartTimeStaffHire) hire;
                    if(PTSH.getVacancyNumber() ==vn){
                        PTSH.terminateStaff();
                        list.remove(hire);
                        JOptionPane.showMessageDialog(frame,"Staff is Terminated Sucessfully");
                        found = true;
                        return;

                    }
                }
            }
            if(!found){
                JOptionPane.showMessageDialog(frame,"Vacancy Number not found" ,"Result", 0);
            }
        }
    }

    public void clear1(){//code to clear the text field of part time staff hire
        tfVacancyNumber3.setText(null);
        tfVacancyNumber4.setText(null);
        tfVacancyNumber5.setText(null);
        tfDesignation.setText(null);
        tfJobType.setText(null);
        tfWorkingHour.setText(null);
        tfWagesPerHour.setText(null);
        tfShifts.setText(null);
        tfStaffName.setText(null);
        tfJoiningDate.setText(null);
        tfQualification.setText(null);
        tfAppointedBy.setText(null);
    }

    public void display1(){//code to display deatils of part time satff in terminal
        for(StaffHire hire: list){
            if(hire instanceof PartTimeStaffHire){
                PartTimeStaffHire PTSH = (PartTimeStaffHire) hire;
                PTSH.displayDetails();
            }
        }
    }

    public static void main(String [] args){
        new INGNepal().frame.setVisible(true);
    }
}

