package com.cookie.day11.oop.stage;

public class Stage {
	public static void main(String[] args) {
		Musician musician = new Musician();
		musician.play(new Base());
		musician.play(new Guitar());
		musician.play(new Drum());
	}
}
