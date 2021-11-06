public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(new Realisation().square1(2, 3, Math.pow(10, -5))); // ссылка на анонимный класс
        System.out.println();
        System.out.println(Functional.square2(2, 4, Math.pow(10, -5))); // ссылка на статический метод
        System.out.println();
        System.out.println(new Realisation().square3(1, 5, Math.pow(10, -5))); // ссылка на анонимный класс
        System.out.println();
        Realisation realisation = new Realisation();
        System.out.println(realisation.square4(1, 3, Math.pow(10, -5))); // ссылка на метод экземпляра
        System.out.println();
        Realisation.Inner inner = realisation.new Inner();
        System.out.println(inner.square5(0.01, 2, Math.pow(10, -5))); // вызов метода вложенного класса

    }

}
