package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * list�ӿڵ�ʵ����
 * @author tzh666
 *
 */
class Player{
	
	private String name;
	private int age;
	
	protected Player(){
		
	}
	
	protected Player(String name,int age){
		this.setName(name);
		this.setAge(age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class Practice3 {
	
	public static void main(String[] args) {
	
		Player player1 = new Player();
		Player player2 = new Player("����",20);
		
		player1.setAge(30);
		player1.setName("����");
		
		List<Player> list = new ArrayList<>();
		list.add(player1);
		list.add(player2);
		
		Iterator<Player> it = list.iterator();
		while(it.hasNext()) 
			System.out.println(it.next().getName());	
		
	//	for(int i=0;i<list.size();i++) 
	//		System.out.println("���Ϊ��"+i+" ����Ϊ��"+list.get(i).getName()+" ����Ϊ��"+list.get(i).getAge());	
	}
	
}
