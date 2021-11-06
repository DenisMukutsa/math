public class Realisation implements Functional {
    public class Inner {

        public double square5 (double intervalX, double intervalY, double correctness) {
            double a = intervalX;
            double b = intervalY;
            double x = 0;


            if(function5(a) * function5(b) < 0) { //проверка условия на сходимость
                for (int i = 0; ; i++) {
                    x = (a + b) / 2;
                    if (Math.abs(function5(x)) < correctness) { // проверка условия на точность
                        break;
                    } else {
                        if (function5(a) * function5(x) < 0) {
                            b = x;
                        } else {
                            a = x;
                        }
                    }
                }
            }
            return x;

        }

        public double function5(double parameter) {
            double result = Math.exp(-parameter) - 0.5;
            return result;
        }
    }
}
