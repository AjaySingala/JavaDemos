class Overloading {
    public static void main(String[] args) {
        MyMath obj = new MyMath();
        System.out.println(obj.add(10,5));
        System.out.println(obj.add(100.25f, 200.65f));  
        System.out.println(obj.add("John", "Smith"));  
    }
}

class MyMath {
    public int add(int x, int y) {
        return x + y;
    }

    public float add(float x, float y) {
        return x + y;
    }

    public String add(String a, String b) {
        return a + b;
    }
}