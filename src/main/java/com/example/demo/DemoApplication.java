package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@RequestMapping("/")
	public static String hello() {
		return "Hello from Spring Boot update from branch, prueba 6 de commit "+getIp();
	}

	 public static String getIp() {
 
        InetAddress ip;
        String hostname;
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            System.out.println("Your current IP address : " + ip);
            System.out.println("Your current Hostname : " + hostname);
 		return "Your current IP address : " + ip + ", Your current Hostname : " + hostname;
        } catch (UnknownHostException e) {
 
            e.printStackTrace();
        }
	return null;
    }
}
