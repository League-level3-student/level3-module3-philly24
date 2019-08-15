package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		Animal panda = new Panda();
		Animal dog = new Dog();
		Animal cow = new Cow();
		Animal monkey = new Monkey();
		farm.add(panda);
		farm.add(dog);
		farm.add(cow);
		farm.add(monkey);
		
		for (int i = 0; i < farm.size(); i++) {
			farm.get(i).makeNoise();
			farm.get(i).task();
			System.out.println();
		}
		
	}
}
