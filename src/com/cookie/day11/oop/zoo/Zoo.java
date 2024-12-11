package com.cookie.day11.oop.zoo;

public class Zoo {
	public static void main(String[] args) {
		ZooKeeper zookeeper = new ZooKeeper();
		zookeeper.feed(new Bear());
		zookeeper.feed(new Camel());
		zookeeper.feed(new Deer());
	}
}
