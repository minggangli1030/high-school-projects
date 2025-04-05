

import java.util.ArrayList;
import java.util.List;

// 多态 - 可复用
public class Zoo {

	private List<Animal> animalList = new ArrayList<Animal>();

	public List<Animal> getAnimalList() {
		return animalList;
	}

	public void setAnimalList(List<Animal> animalList) {
		this.animalList = animalList;
	}

	public void show() {
		for (Animal animal : animalList) {
			animal.move();
		}
	}

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		List<Animal> list = new ArrayList<Animal>(); // 范型
		Animal dog1 = new Dog("black", "male", 2, 5, "4 legs");
		Animal dog2 = new Dog("gray", "female", 2, 3, "4 legs");
		Animal rabbit1 = new Rabbit("white", "male", 2, 5, "2 legs");
		Animal rabbit2 = new Rabbit("white", "male", 1, 5, "2 legs");
		list.add(dog1);
		list.add(dog2);
		list.add(rabbit1);
		list.add(rabbit2);
		zoo.setAnimalList(list);

		zoo.show();
	}
}
