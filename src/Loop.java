import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Loop extends  JFrame{
    JLabel lb_title;
    public void name(){
//        JOptionPane.showMessageDialog(null,"dara");

    }
    public Loop(){

        lb_title= new JLabel("Register Form");
        lb_title.setBounds(250,30,500,50);
        lb_title.setFont(new Font("Times New Roman",Font.BOLD,30));
        lb_title.setForeground(Color.RED);
        add(lb_title);
        name();
        setLayout(null);
        setSize(700,700);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Loop();
//        Scanner op = new Scanner(System.in);
//        System.out.print("Input N=");
//        int n = op.nextInt();
//        int sum =0,inc=0;
//        for(int i=1;i<=n;i++){
////             inc=i+2;
////            System.out.print(inc+" ");
////            sum=sum+inc;
//            System.out.print(" "+i*2);
//            sum=sum+i*2;
//        }
//        System.out.println("="+sum);
    }
}
