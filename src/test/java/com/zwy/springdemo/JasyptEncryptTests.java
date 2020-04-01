package com.zwy.springdemo;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * 读取配置文件，加密密钥
 * 将配置文件中属性对应的字段值 同时没有 ENC()包括的，加密
 */

class JasyptEncryptTests {

	@Test
	public void split(){
		String idfa="eb62c82b47dcefada016bb7f84a92970";
		System.out.println(idfa.split("\t")[0]);
	}

	@Test
	public void encrypt(){

//		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
//		textEncryptor.setPassword("G0CvDz7oJn6");
//		//要加密的数据（数据库的用户名或密码）
//		String password = textEncryptor.encrypt("root123");

	}

}
