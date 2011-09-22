public class Animal {
    public void eat() {
	System.out.println("Animal eating");
    }

    public void printYourself() {
	System.out.println("Animal");
    }
}

class Horse extends Animal {
    public void eat() {
	System.out.println("Horse eating");
    }

    public void printYourself() {
	System.out.println("Horse");
	super.eat();
	super.printYourself();
    }

    public static void main(String [] args) {
	Animal a = new Horse();
	a.printYourself();
    }
}