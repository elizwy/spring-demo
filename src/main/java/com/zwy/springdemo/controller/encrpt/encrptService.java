package com.zwy.springdemo.controller.encrpt;


import org.jasypt.util.text.BasicTextEncryptor;

import java.util.Scanner;

public class encrptService  {
        private static final String PASSWORD="G0CvDz7oJn6";
        public static void main(String[] args) {
                BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
                textEncryptor.setPassword(PASSWORD);
                Scanner scanner = new Scanner(System.in);
                while (true){
                        String[] split = scanner.nextLine().split("=", 2);
                        if(split[1].startsWith("ENC(")){
                                continue;
                        }
                        String encryptString = textEncryptor.encrypt(split[1]);
                        System.out.println(split[0]+"=ENC("+encryptString+")");
                }
        }

        private static void encrpt(String[] strings) {


        }
}
