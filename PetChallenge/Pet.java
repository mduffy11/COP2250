// Pet.java

public class Pet {
	private String name;
	private int age;
	private String type;

	public Pet(String name, int age, String type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}

	public String getName() { return name; }
	public int getAge() { return age; }
	public String getType() { return type; }

	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		}
	}

	public void speak() {
		String sound;

		if (type.equalsIgnoreCase("Dog")) sound = "Woof!";
		else if (type.equalsIgnoreCase("Cat")) sound = "Meow!";
		else if (type.equalsIgnoreCase("Bird")) sound = "Chirp!";
		else sound = "...";

		System.out.println(name + " (" + type + ", " + age + " years old) says: " + sound);
	}

	public void haveBirthday() {
		age++;
		System.out.println("\n" + name + " had a birthday!");
	}
}
