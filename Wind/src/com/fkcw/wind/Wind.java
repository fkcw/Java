package com.fkcw.wind;

import javax.swing.*;

/**
 * 一个简单的java窗体例子
 */
public class Wind {
 
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Hello World！");
        JLabel label = new JLabel("Hello World！");
 
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 设置关闭的事件
        frame.setSize(300, 100);// 设置大小
        frame.setVisible(true);// 使窗口可视
    }
}

