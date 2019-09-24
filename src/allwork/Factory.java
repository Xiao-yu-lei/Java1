interface Fruits {
    //采摘水果
    String get();
}
class Apple implements Fruits {

    @Override
    public String get() {
        System.out.println("采摘苹果");
        return "采摘苹果";
    }
}
class Banana implements Fruits {

    @Override
    public String get() {
        System.out.println("采摘香蕉");
        return "采摘香蕉";
    }
}
class Factory {

     public static Fruits getFruits(String name) {
        if (name.equals("苹果")) {
            return new Apple();
        }else if (name.equals("香蕉")) {
            return new Banana();
        }else {
            return null;
        }
    }
}