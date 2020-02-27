import javax.swing.*;
import javax.swing.SwingUtilities;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class NumberGame extends JFrame implements ActionListener, ItemListener {
  JButton zero;
  JButton first;
  JButton two;
  JButton three;
  JButton four;
  JButton five;
  JButton six;
  JButton seven;
  JButton eight;
  JButton nine;

  Checkbox plus;
  Checkbox minus;

  JLabel addition;
  JLabel subtraction;
  JLabel equals;

  Boolean empty;
  Boolean empty2;

  JTextArea FirstOne;
  JTextArea SecondOne;

  public NumberGame () {
    setLayout(null);

    FirstOne = new JTextArea();
    FirstOne.setBounds(150, 400, 50, 50);
    add(FirstOne);
    FirstOne.setBackground(Color.YELLOW);

    SecondOne = new JTextArea();
    SecondOne.setBounds(350, 400, 50, 50);
    add(SecondOne);
    SecondOne.setBackground(Color.YELLOW);

    zero = new JButton("0");
    zero.setBounds(10, 100, 60, 60);
    add(zero);
    zero.addActionListener(this);

    first = new JButton("1");
    first.setBounds(70, 100, 60, 60);
    add(first);
    first.addActionListener(this);

    two = new JButton("2");
    two.setBounds(120, 100, 60, 60);
    add(two);
    two.addActionListener(this);

    three = new JButton("3");
    three.setBounds(190, 100, 60, 60);
    add(three);
    three.addActionListener(this);

    four = new JButton("4");
    four.setBounds(250, 100, 60, 60);
    add(four);
    four.addActionListener(this);

    five = new JButton("5");
    five.setBounds(320, 100, 60, 60);
    add(five);
    five.addActionListener(this);

    six = new JButton("6");
    six.setBounds(400, 100, 60, 60);
    add(six);
    six.addActionListener(this);

    seven = new JButton("7");
    seven.setBounds(470, 100, 60, 60);
    add(seven);
    seven.addActionListener(this);

    eight = new JButton("8");
    eight.setBounds(540, 100, 60, 60);
    add(eight);
    eight.addActionListener(this);

    nine = new JButton("9");
    nine.setBounds(600, 100, 60, 60);
    add(nine);
    nine.addActionListener(this);

    plus = new Checkbox("+");
    plus.setBounds(250, 300, 60, 60);
    add(plus);
    plus.addItemListener(this);

    minus = new Checkbox("-");
    minus.setBounds(350, 300, 60, 60);
    add(minus);
    minus.addItemListener(this);

    addition = new JLabel("+");
    addition.setBounds(250, 400, 40, 40);
    add(addition);
    addition.setVisible(false);

    subtraction = new JLabel("-");
    subtraction.setBounds(250, 400, 40, 40);
    add(subtraction);
    subtraction.setVisible(false);

    equals = new JLabel("=");
    equals.setBounds(450, 400, 60, 60);
    add(equals);

    addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
         System.exit(0);
        }
    } );

  }

  public void Check() { //this is a method to see if their is anything already in the textareas
    empty = false;
    empty2 = false;
    if(FirstOne.getText().trim().isEmpty()) {
      empty = true;
    }
    if(SecondOne.getText().trim().isEmpty()){
      empty2 = true;
    }
  }

  public void actionPerformed(ActionEvent e) {
    Object src = e.getSource();

    if (src == zero) {
      Check();
      if (empty == true) { //this is a repeated line of code because it deals with things within actionevent, what is printed in text areas
      FirstOne.append("0");
      }
      else if (empty2 == true) {
        SecondOne.append("0");
      }
    }

    if (src == first) {
      Check();
      if (empty == true) {
      FirstOne.append("1");
      }
      else if (empty2 == true) {
        SecondOne.append("1");
      }
    }

    if (src == two) {
      Check();
      if (empty == true) {
      FirstOne.append("2");
      }
      else if (empty2 == true) {
        SecondOne.append("2");
      }
    }

    if (src == three) {
      Check();
      if (empty == true) {
      FirstOne.append("3");
      }
      else if (empty2 == true) {
        SecondOne.append("3");
      }
    }

    if (src == four) {
      Check();
      if (empty == true) {
      FirstOne.append("4");
      }
      else if (empty2 == true) {
        SecondOne.append("4");
      }
    }

    if (src == five) {
      Check();
      if (empty == true) {
      FirstOne.append("5");
      }
      else if (empty2 == true) {
        SecondOne.append("5");
      }
    }

    if (src == six) {
      Check();
      if (empty == true) {
      FirstOne.append("6");
      }
      else if (empty2 == true) {
        SecondOne.append("6");
      }
    }

    if (src == seven) {
      Check();
      if (empty == true) {
      FirstOne.append("7");
      }
      else if (empty2 == true) {
        SecondOne.append("7");
      }
    }

    if (src == eight) {
      Check();
      if (empty == true) {
      FirstOne.append("8");
      }
      else if (empty2 == true) {
        SecondOne.append("8");
      }
    }

    if (src == nine) {
      Check();
      if (empty == true) {
      FirstOne.append("9");
      }
      else if (empty2 == true) {
        SecondOne.append("9");
      }
    }

  }

  public void itemStateChanged(ItemEvent e) {

    if(e.getSource() == plus) {
      boolean checked = plus.getState();
      if(checked == true) {
        addition.setVisible(true);
      }
      else {
        addition.setVisible(false);
      }
    }

    if(e.getSource() == minus) {
      boolean checked = minus.getState();
      if(checked == true) {
        subtraction.setVisible(true);
      }
      else {
        subtraction.setVisible(false);
      }
    }
  }

  public static void main(String[] args) {
    NumberGame myWindow = new NumberGame(); //creates a new frame that does the class Restaurant
    myWindow.setSize(800,700);
    myWindow.setVisible(true);
    myWindow.setTitle("Number Game");
  }

}
