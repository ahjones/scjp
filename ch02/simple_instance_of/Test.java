class Test {
    public static void main(String[] args) {
	Test t1 = new Test();
	Test t2 = new Test();
	if (!t1.equals(t2))
	    System.out.println("they're not equal");
	if (t1 instanceof Object)
	    System.out.println("t1's an Object");
    }
}