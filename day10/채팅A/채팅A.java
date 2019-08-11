
package 채팅A;

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

public class 채팅A extends JFrame{
    JTextArea list;
    JTextField input;
    DatagramSocket socket; //받는 용도
    InetAddress ip;
    
    
    public 채팅A() throws Exception {
        socket = new DatagramSocket(5000);	//내 포트의 번호를 설정한 것
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setTitle("채팅 A화면");
        list = new JTextArea(10, 20);
        list.setEditable(false);//채팅이 내려가는 곳에 글씨를 쓸 수 없게 만든것
        input = new JTextField();
        input.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = input.getText();
                System.out.println("내가 입력: " + str);
                list.append("k: " + str + "\n");
                input.setText("");
                
                try {
                    DatagramSocket socket = new DatagramSocket();
                    byte[] data = str.getBytes();
                    ip = InetAddress.getByName("127.0.0.1");
                    DatagramPacket packet 
                     = new DatagramPacket(data, data.length, ip, 6000);	//받는 쪽의 포트 번호를 설정
                    socket.send(packet);
                    
                } catch (Exception e1) {
                }
            }
        });
        getContentPane().add(BorderLayout.CENTER, list);
        getContentPane().add(BorderLayout.SOUTH, input);
        input.setFont(new Font("굴림", Font.BOLD, 30));
        input.setBackground(Color.yellow);
        input.setForeground(Color.blue);
        list.setFont(new Font("굴림", Font.BOLD, 30));
        list.setBackground(Color.green);
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
                list.append("너: " + new String(data) + "\n");
            } catch (Exception e) {
            }
            
            
        }
    }
    public static void main(String[] args) throws Exception {
        채팅A name = new 채팅A();
        //받는 부분이 먼저 실행되어 돌아가고 있어야 함.
        name.process();
    }
}