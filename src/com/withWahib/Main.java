package com.withWahib;

import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        // نافذة 1
        JFrame نافذة = new JFrame();// تعريف النافذة
        نافذة.setTitle("نافذة رقم 1 ");// تحديد عنوانها بالدالة التالية
        نافذة.setSize(200, 150);//تحديد طول وعرض النافذة
        نافذة.setVisible(true);//تفعيل النافذة
        // نافذة 2
        JFrame i = new JFrame();
        نافذة.setTitle("نافذة رقم 2 ");
        نافذة.setSize(200, 150);
        نافذة.setVisible(true);
    }
}
