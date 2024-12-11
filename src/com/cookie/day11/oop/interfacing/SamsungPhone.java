package com.cookie.day11.oop.interfacing;

public class SamsungPhone implements PhoneInterface {

	@Override
	public void printLogo() {
		System.out.println("=====SAMSUNG=====");
	}

	@Override
	public void sendCall() {
		System.out.println("=====SAMSUNG CALL=====");
	}
	public static void main(String[] args) {
		PhoneInterface phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		
		SamsungPhone s = new SamsungPhone();
		s.printLogo();
		s.sendCall();
	}
}
