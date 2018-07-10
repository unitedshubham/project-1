package Application1;

import pojo.Player;

public class Footballgame {

	public static void main(String[] args) {
		Player goalkeeper = new Player();
		Player striker = new Player("shubham", 20);
		System.out.println("striker : " + striker.getName() + striker.getAge());
        goalkeeper.setAge(40);
        System.out.println("-->" + goalkeeper.getAge());
	}

}
