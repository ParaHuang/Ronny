package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Zoo zoo = new Zoo();

		Scanner scanner = new Scanner(System.in);
		System.out.println("how old is the dog:");
		int age1 = scanner.nextInt();
		System.out.println("how old is the cat:");
		int age2 = scanner.nextInt();
		System.out.println("how old is the bird:");
		int age3 = scanner.nextInt();

		Dog dog = new Dog(age1);
		Cat cat = new Cat(age2);
		Bird bird = new Bird(age3);

//		Dog dog = new Dog();
//		Cat cat = new Cat();
//		Bird bird = new Bird();

		zoo.addAnimal(dog);
		zoo.addAnimal(cat);
		zoo.addAnimal(bird);

		zoo.makeAllSounds();
		System.out.println();
		zoo.introduceAll();
	}

}

class Zoo {
	// define something to save as many animals as the program needs
	private ArrayList<Animal> animals = new ArrayList<Animal>();

	public void addAnimal(Animal animal) {
		// save the animal
		animals.add(animal);
	}

	public void makeAllSounds() {
		for (Animal a : animals) {
			a.makeSound();
		}
	}

	public void introduceAll() {
		for (Animal a : animals) {
			a.introduce();
		}
	}
}

class Animal {
	protected String name;
	protected int age;

	public Animal(String name, int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Age must be a positive integer.");
		}
		this.name = name;
		this.age = age;
	}

	public void makeSound() {
		System.out.println("Some generic animal sound.");
	}

	public void introduce() {
		System.out.println("Hi! I'm " + name + " and I'm " + age + " years old.");
	}
}

class Dog extends Animal {
//	public Dog() {
//		super("Dog",1);
//	}
	public Dog(int age) {
		super("Dog", age);
	}

	@Override
	public void makeSound() {
		System.out.println("Dog:wolf wolf");
	}
}

class Cat extends Animal {
//	public Cat() {
//	super("Cat",1);
//}
	public Cat(int age) {
		super("Cat", age);
	}

	@Override
	public void makeSound() {
		System.out.println("Cat:meow meow");
	}

}

class Bird extends Animal {
//	public Bird() {
//	super("Bird",1);
//}
	public Bird(int age) {
		super("Bird", age); // call the constructor from super class
	}

	@Override
	public void makeSound() {
		System.out.println("Bird:Ji Ji");
	}
}
