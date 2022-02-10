package abstractclass;

public class AnimalExam {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("=============");
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("============");
		//메소드 다형성
		animalSound(new Dog());
		animalSound(new Cat());
		animalSound(new Ham());
		
	}


	
	private static void animalSound(Animal animal) {
		animal.sound();
		
	}

	//메소드 오버로딩, 이런식으로 하면 항목을 계속 추가해야하지만.
	//animal로 받으면 한번에 끝이난다.	
//	private static void animalSound(Cat cat) {
//		cat.sound();
//		
//	}
//	private static void animalSound(Dog dog) {
//		dog.sound();
//		
//	}

	
}
