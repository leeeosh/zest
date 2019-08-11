
package ä��A;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class ä��B extends JFrame{
    JTextArea list;
    JTextField input;
    DatagramSocket socket; //�޴� �뵵
    InetAddress ip;
    
    
    public ä��B() throws Exception {
        socket = new DatagramSocket(6000);
        
        setTitle("ä�� Bȭ��");
        list = new JTextArea(10, 20);
        list.setEditable(false);
        input = new JTextField();
        input.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = input.getText();
                System.out.println("���� �Է�: " + str);
                list.append("��: " + str + "\n");
                input.setText("");
                
                try {
                    DatagramSocket socket = new DatagramSocket();
                    byte[] data = str.getBytes();
                    ip = InetAddress.getByName("127.0.0.1");
                    DatagramPacket packet 
                     = new DatagramPacket(data, data.length, ip, 5000);
                    socket.send(packet);
                    
                } catch (Exception e1) {
                }
            }
        });
        getContentPane().add(BorderLayout.CENTER, list);
        getContentPane().add(BorderLayout.SOUTH, input);
        input.setFont(new Font("����", Font.BOLD, 30));
        input.setBackground(Color.blue);
        input.setForeground(Color.DARK_GRAY);
        list.setFont(new Font("����", Font.BOLD, 30));
        list.setBackground(Color.MAGENTA);
        pack();
        setVisible(true);
    }
    
    public void process() {
        while (true) {
            byte[] data = new byte[256];
            DatagramPacket packet 
             = new DatagramPacket(data, data.length);
            try {
                socket.receive(packet);
                list.append("��: " + new String(data) + "\n");
            } catch (Exception e) {
            }
            
            
        }
    }
    public static void main(String[] args) throws Exception {
        ä��B name = new ä��B();
        //�޴� �κ��� ���� ����Ǿ� ���ư��� �־�� ��.
        name.process();
    }
}