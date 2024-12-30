package com.cookie.day2n.innerclass;

public class MonsterBall {
	 int size = 100;
	 int price = 5000;
	 
	 void showPokemon() {
//		 int exp = 4000;
		 
		 record Pokemonster() {
			 static String name = "꼬부기";
			 static int level = 100;
			 
			 public void getPokemonlv() {
				 System.out.println(level);
//				 System.out.println(exp);
			 }
		 }
	 }
	 
	 // static 이 아닌 경우 외부와 연결되어 있는 외부 참조를 갖게됨
	 // 메모리가 더 사용되고 느려지므로 static 권장
	static class Pokemon{
		String name = "이상해씨";
		int level = 100;
		static final int cost = 1000; // 인스턴스 클래스 내부에서는 static final 상수만 선언가능
		
		public void getPokeMember() {
			System.out.println(name);
			System.out.println(level);
			System.out.println(cost);
			
//			System.out.println(size);
//			System.out.println(price);
		}
	}
	
	public static void main(String [] args) {
		MonsterBall ball = new MonsterBall();
		MonsterBall.Pokemon pokemon = new Pokemon();
		pokemon.getPokeMember();
	}
}
