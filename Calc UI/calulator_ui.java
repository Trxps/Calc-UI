import java.awt.BorderLayout;
import java.awt.FlowLayout;        
import javax.swing.*;        
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calulator_ui extends calulator_main {

    JFrame frame = new JFrame("cal");

    JPanel panel = new JPanel(new FlowLayout());
    JPanel screen = new JPanel(new BorderLayout());
    JTextArea text = new JTextArea(1,20);
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");

    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton button0 = new JButton("0");

    JButton add = new JButton("+");
    JButton subtract = new JButton("-");
    JButton mutliple = new JButton("*");
    JButton divide = new JButton("/");
    JButton equals = new JButton("=");

    JButton clear = new JButton("C");

    JLabel label = new JLabel();



    double numberone,numbertwo,result;


    int addc=0, subc=0,mutlic=0,divc=0;






    public calulator_ui() {
        ui();
        placeComponets();
        createListeners();



    }




    public void placeComponets(){

        screen.add(text, BorderLayout.NORTH);
        panel.add(button0);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(add);
        panel.add(mutliple);
        panel.add(subtract);
        panel.add(divide);
        panel.add(clear);
        panel.add(equals);
        panel.add(label);
    }


    public void ui(){

        frame.setVisible(true); 
        frame.setSize(250,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

    }




    public void createListeners(){

        this.button0.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        onCutClicked(ae);
                    }
                });
        this.button1.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        onCutClicked(ae);
                    }
                });
        this.button2.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        onCutClicked(ae);
                    }
                });
        this.button3.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        onCutClicked(ae);
                    }
                });
        this.button4.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        onCutClicked(ae);
                    }
                });
        this.button5.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        onCutClicked(ae);
                    }
                });
        this.button6.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        onCutClicked(ae);
                    }
                });
        this.button7.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        onCutClicked(ae);
                    }
                });
        this.button8.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        onCutClicked(ae);
                    }
                });
        this.button9.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        onCutClicked(ae);
                    }
                });
        this.add.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        onCutClicked(ae);
                    }
                });
        this.subtract.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        onCutClicked(ae);
                    }
                });
        this.mutliple.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        onCutClicked(ae);
                    }
                });
        this.divide.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        onCutClicked(ae);
                    }
                });
        this.equals.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        onCutClicked(ae);
                    }
                });



    }

    void onCutClicked(ActionEvent ae){

        Object source = ae.getSource();

        if(source==button0)
        {
            text.append("0");

        }   

        if(source==button1)
        {
            text.append("1");

        }   

        if(source==button2)
        {
            text.append("2");

        }   

        if(source==button3)
        {
            text.append("3");

        }   

        if(source==button4)
        {
            text.append("4");

        }   

        if(source==button5)
        {
            text.append("5");

        }   

        if(source==button6)
        {
            text.append("6");

        }   

        if(source==button7)
        {
            text.append("7");

        }   

        if(source==button8)
        {
            text.append("8");

        }   

        if(source==button9)
        {
            text.append("9");


        }

        if (source==add)
        {
            numberone=number_reader();
            text.setText("");
            addc=1;
            subc=0;
            mutlic=0;
            divc=0;
        }

        if (source==subtract)
        {
            numberone=number_reader();
            text.setText("");
            addc=0;
            subc=1;
            mutlic=0;
            divc=0;
        }

        if (source==mutliple)
        {
            numberone=number_reader();
            text.setText("");
            addc=0;
            subc=0;
            mutlic=1;
            divc=0;
        }

        if (source==divide)
        {
            numberone=number_reader();
            text.setText("");
            addc=0;
            subc=0;
            mutlic=0;
            divc=1;
        }



        if (source==equals)
        {
            numbertwo=number_reader();
            if (addc>0)
            {
                result=numberone+numbertwo;
                text.setText(Double.toString(result));
            }

            if (subc>0)
            {
                result=numberone-numbertwo;
                text.setText(Double.toString(result));
            }

            if (divc>0)
            {
                result=numberone/numbertwo;
                text.setText(Double.toString(result));
            }

            if (mutlic>0)
            {
                result=numberone*numbertwo;
                text.setText(Double.toString(result));
            }

        }
    }









    public double number_reader()

    {

        double returnnumber;
        String numberstring;
        numberstring=text.getText();
        returnnumber=Double.valueOf(numberstring);

        return returnnumber;


    }


}