class Try {
    public static void main(String[] args) {
	Thing t = new Top();
	System.out.println(t.getName());
    }
}

interface Thing {
    String getName();
}

class Bottom {
    public String getName() {
	return "class Bottom";
    }
}

class Top extends Bottom implements Thing {
}