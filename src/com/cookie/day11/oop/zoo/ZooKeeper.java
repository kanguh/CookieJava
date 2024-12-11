package com.cookie.day11.oop.zoo;

public class ZooKeeper {
	public void feed(FoodInterface animal) {
		System.out.println("feed "+animal.favoriteFood());
	}
}
