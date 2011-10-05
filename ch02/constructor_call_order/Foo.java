class Bar {
    public Bar() {
	System.out.println("Bar");
    }
}

class Foo extends Bar {
    public Foo() {
	System.out.println("Foo");
	super();
    }

    public static void main(String[] args) {
	Foo foo = new Foo();
    }
}