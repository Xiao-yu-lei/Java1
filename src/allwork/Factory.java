interface Fruits {
    //��ժˮ��
    String get();
}
class Apple implements Fruits {

    @Override
    public String get() {
        System.out.println("��ժƻ��");
        return "��ժƻ��";
    }
}
class Banana implements Fruits {

    @Override
    public String get() {
        System.out.println("��ժ�㽶");
        return "��ժ�㽶";
    }
}
class Factory {

     public static Fruits getFruits(String name) {
        if (name.equals("ƻ��")) {
            return new Apple();
        }else if (name.equals("�㽶")) {
            return new Banana();
        }else {
            return null;
        }
    }
}