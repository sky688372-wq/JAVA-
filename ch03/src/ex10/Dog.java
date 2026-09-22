package ex10;

class Dog extends Animal{
	void bark() {
		System.out.println(name +"가 멍멍 짖습니다.");
	}
	
	public Dog(String name) {
		super(name);
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog("쵸코");
		dog.eat();
		dog.bark();
	}
}

class Animal {
	String name;
	
	void eat() {
		System.out.println(name + "가 먹이를 먹습니다.");
	}
	
	public Animal(String name) {
		this.name = name;
	}
}
