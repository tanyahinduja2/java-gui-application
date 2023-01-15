import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Message implements ActionListener {
   JButton button;
   JLabel label, img;
   JFrame frame = new JFrame("Booking Confirmation");

   Message() {
      Color mycolor = new Color(135,206,235);
      frame.getContentPane().setBackground(mycolor);
      frame.setSize(700, 600);
      label = new JLabel("");
      JLabel l1 = new JLabel("Your Booking has been Confirmed.");
      l1.setBounds(220, 20, 240, 50);
      frame.add(l1);
      JLabel l2 = new JLabel("THANK YOU !!");
      l2.setBounds(280, 35, 200, 80);
      frame.add(l2);
      img = new JLabel();
      img.setIcon(new ImageIcon("train.jpg"));
      Dimension size = img.getPreferredSize();
      img.setBounds(80, 100, size.width, size.height);
      frame.add(img);
      button = new JButton("Go to Home");
      button.setBounds(250, 500, 150, 30);
      button.addActionListener(this);
      frame.add(button);
      label.setBounds(120, 280, 150, 30);
      frame.add(label);
      frame.setVisible(true);
      frame.setLayout(null);
   }

   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == button) {
         frame.dispose();
         new form();
      }
   }
}

class BookTicket implements ActionListener {
   JComboBox c1, c2, t, coa, d, m, y, t_ime;
   JLabel title, source, destination, number, train, coach, time, date, month, year;
   JTextField number_of_tickets;
   JButton button;
   JButton cancel;
   JFrame f1 = new JFrame();

   BookTicket() {
      Color mycolor = new Color(135,206,235);
      f1.getContentPane().setBackground(mycolor);
      f1.setTitle("Book Your Ticket");
      f1.setBounds(0, 0, 1320, 800);
      button = new JButton("Confirm Ticket");
      cancel = new JButton("Cancel");
      title = new JLabel("Book Your Ticket : ");
      f1.add(title);
      title.setLocation(540, 40);
      title.setSize(300, 30);
      title.setFont(new Font("Verdana", Font.PLAIN, 20));
      source = new JLabel("Source : ");
      destination = new JLabel("Destination : ");
      f1.add(source);
      f1.add(destination);
      source.setSize(100, 30);
      destination.setSize(100, 30);
      source.setLocation(340, 120);
      destination.setLocation(640, 120);
      String cities1[] = { "Select", "Mumbai", "Delhi", "Bangalore", "Chennai" };
      String cities2[] = { "Select", "Jaipur", "Ahmedabad", "Kolkata", "Hyderabad" };
      String trains[] = { "Select", "Rajdhani Express", "Duronto Express", "Jan Shatabdi Express",
            "Vande Bharat Express" };
      String coaches[] = { "Select", "First Class AC", "Two-Tier AC", "Three-Tier AC", "Chair Car AC",
            "Sleeper Class (Non-AC)" };
      c1 = new JComboBox(cities1);
      c2 = new JComboBox(cities2);
      f1.add(c1);
      f1.add(c2);
      c1.setSize(100, 30);
      c2.setSize(100, 30);
      c1.setLocation(460, 120);
      c2.setLocation(780, 120);
      train = new JLabel("Select your train : ");
      f1.add(train);
      train.setSize(200, 30);
      train.setLocation(420, 200);
      t = new JComboBox(trains);
      f1.add(t);
      t.setSize(200, 30);
      t.setLocation(620, 200);
      coa = new JComboBox(coaches);
      coach = new JLabel("Select your coach : ");
      coach.setSize(200, 30);
      coach.setLocation(420, 280);
      f1.add(coach);
      coa.setSize(200, 30);
      coa.setLocation(620, 280);
      f1.add(coa);
      number = new JLabel("Number of Tickets : ");
      number.setSize(200, 30);
      number.setLocation(420, 360);
      f1.add(number);
      number_of_tickets = new JTextField();
      number_of_tickets.setSize(200, 30);
      number_of_tickets.setLocation(620, 360);
      f1.add(number_of_tickets);
      String dates[] = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
      String months[] = { "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December" };
      String years[] = { "2022", "2023" };
      String ti[] = { "Select", "9:25", "11:10", "13:05", "14:00", "16:50", "17:30", "18:45", "22:20" };
      date = new JLabel("Date : ");
      month = new JLabel("Month : ");
      year = new JLabel("Year : ");
      d = new JComboBox(dates);
      m = new JComboBox(months);
      y = new JComboBox(years);
      date.setSize(100, 30);
      month.setSize(100, 30);
      year.setSize(100, 30);
      d.setSize(60, 30);
      m.setSize(60, 30);
      y.setSize(60, 30);
      d.setLocation(420, 440);
      m.setLocation(620, 440);
      y.setLocation(820, 440);
      date.setLocation(340, 440);
      month.setLocation(540, 440);
      year.setLocation(740, 440);
      f1.add(date);
      f1.add(month);
      f1.add(year);
      f1.add(d);
      f1.add(m);
      f1.add(y);
      time = new JLabel("Select the time : ");
      time.setSize(200, 30);
      time.setLocation(420, 520);
      f1.add(time);
      t_ime = new JComboBox(ti);
      t_ime.setSize(200, 30);
      t_ime.setLocation(620, 520);
      f1.add(t_ime);
      button.setBounds(420,585,180,30);
      button.addActionListener(this);
      f1.add(button);
      cancel.setSize(180, 30);
      cancel.setLocation(620, 585);
      cancel.addActionListener(this);
      f1.add(cancel);
      f1.setLayout(null);
      f1.setVisible(true);
   }

   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == button) {
         f1.dispose();
         new Message();
      }
      else if (e.getSource() == cancel) {
         String def = "";
         number_of_tickets.setText(def);
         c1.setSelectedItem("Select");
         c2.setSelectedItem("Select");
         t.setSelectedItem("Select");
         coa.setSelectedItem("Select");
         d.setSelectedItem("1");
         m.setSelectedItem("January");
         y.setSelectedItem("2022");
         t_ime.setSelectedItem("Select");
      }
   }
}

class form implements ActionListener {
   JButton button;
   JButton button1;
   JLabel label;
   Checkbox checkBox1, checkBox2;
   JFrame frame = new JFrame("Train Ticket Booking");

   form() {
      Color mycolor = new Color(135,206,235);
      frame.getContentPane().setBackground(mycolor);
      frame.setSize(500, 400);
      button = new JButton("Book Ticket");
      button1 = new JButton("Cancel");
      label = new JLabel("");
      JLabel l5 = new JLabel("WELCOME !!");
      l5.setBounds(200, 10, 150, 30);
      frame.add(l5);
      JLabel l1 = new JLabel("Full Name");
      JTextField t1 = new JTextField("");
      l1.setBounds(50, 50, 100, 30);
      t1.setBounds(150, 50, 180, 30);
      frame.add(l1);
      frame.add(t1);
      JLabel l2 = new JLabel("Email");
      JTextField t2 = new JTextField("");
      l2.setBounds(50, 100, 50, 30);
      t2.setBounds(150, 100, 180, 30);
      frame.add(l2);
      frame.add(t2);
      JLabel l3 = new JLabel("Phone number");
      JTextField t3 = new JTextField("");
      l3.setBounds(50, 150, 100, 30);
      t3.setBounds(150, 150, 180, 30);
      frame.add(l3);
      frame.add(t3);
      JLabel l4 = new JLabel("Gender");
      l4.setBounds(50, 200, 100, 30);
      frame.add(l4);
      Checkbox checkBox1 = new Checkbox("Male");
      checkBox1.setBounds(150, 200, 50, 50);
      Checkbox checkBox2 = new Checkbox("Female");
      checkBox2.setBounds(250, 200, 80, 50);
      frame.add(checkBox1);
      frame.add(checkBox2);
      button.setBounds(100, 250, 150, 30);
      button1.setBounds(300, 250, 80, 30);
      button.addActionListener(this);
      button1.addActionListener(this);
      frame.add(button);
      frame.add(button1);
      label.setBounds(175, 280, 150, 30);
      frame.add(label);
      frame.setLayout(null);
      frame.setVisible(true);
   }

   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == button) {
         frame.dispose();
         new BookTicket();
      } 
      else if (e.getSource() == button1)
         frame.dispose();
   }
}

public class mpr {
   public static void main(String args[]) {
      new form();
   }
}