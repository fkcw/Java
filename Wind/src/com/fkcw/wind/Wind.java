package com.fkcw.wind;

import javax.swing.*;

/**
 * һ���򵥵�java��������
 */
public class Wind {
 
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Hello World��");
        JLabel label = new JLabel("Hello World��");
 
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ���ùرյ��¼�
        frame.setSize(300, 100);// ���ô�С
        frame.setVisible(true);// ʹ���ڿ���
    }
}

