package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener
{
    JButton next;
    JRadioButton r1,r2, m1,m2, m3;
    JTextField textName , textFName, textEmail, textAdd, textCity,textPin, textState;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4=(ran.nextLong() % 9000)+ 1000L;
    String first =" "+Math.abs(first4);

    SignUp()
    {
        super("APPLICATION FORM");

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO."+ first);
        label1.setBounds(250,20,600,30);
        label1.setFont(new Font("Raleway",Font.BOLD,28));
        add(label1);

        JLabel label2 = new JLabel("Page1");
        label2.setFont(new Font("Ralway",Font.BOLD,20));
        label2.setBounds(430,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(390,90,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,18));
        labelName.setBounds(100,130,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setBounds(300,130,400,25);
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway",Font.BOLD,18));
        labelfName.setBounds(100,170,200,30);
        add(labelfName);

        textFName = new JTextField();
        textFName.setBounds(300,170,400,25);
        textFName.setFont(new Font("Raleway",Font.BOLD,14));
        add(textFName);

        JLabel DOB =new JLabel("Date Of Birth :");
        DOB.setFont(new Font("Raleway",Font.BOLD,18));
        DOB.setBounds(100,270,200,25);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,270,400,25);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender :");
        labelG.setFont(new Font("Raleway",Font.BOLD,18));
        labelG.setBounds(100,220,200,25);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,220,60,25);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,220,90,25);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email Address :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,18));
        labelEmail.setBounds(100,320,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setBounds(300,320,400,25);
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        add(textEmail);

        JLabel labelMs = new JLabel("Married Status :");
        labelMs.setFont(new Font("Raleway",Font.BOLD,18));
        labelMs.setBounds(100,370,200,30);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,370,100,25);
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(450,370,100,25);
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(635,370,100,25);
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,18));
        labelAdd.setBounds(100,420,200,30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setBounds(300,420,400,25);
        textAdd.setFont(new Font("Raleway",Font.BOLD,14));
        add(textAdd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway",Font.BOLD,18));
        labelCity.setBounds(100,470,200,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setBounds(300,470,400,25);
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        add(textCity);

        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway",Font.BOLD,18));
        labelPin.setBounds(100,520,200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setBounds(300,520,400,25);
        textPin.setFont(new Font("Raleway",Font.BOLD,14));
        add(textPin);

        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("Raleway",Font.BOLD,18));
        labelState.setBounds(100,570,200,30);
        add(labelState);

        textState = new JTextField();
        textState.setBounds(300,570,400,25);
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(620, 600, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 750);
        setLocation(200, 10);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String formno = first;
        String name =textName.getText();
        String fname = textName.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected())
        {
            gender="Male";
        } else if (r2.isSelected()) {
            gender="Female";
        }
        String email = textEmail.getText();
        String marital =null;
        if (m1.isSelected())
        {
            marital="Married";
        } else if (m2.isSelected()) {
            marital="Unmarried";
        } else if (m3.isSelected()) {
            marital="Other";
        }

        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();

        try{
            if(textName.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                Con con1 = new Con();
                String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args)
    {
        new SignUp();
    }
}
