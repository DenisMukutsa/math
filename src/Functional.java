public interface Functional {
    default double square1 (double intervalX, double intervalY, double correctness) {
        double a = intervalX;
        double b = intervalY;
        double x = 0;

        if(function1(a) * function1(b) < 0) { //проверка условия на сходимость
            for (int i = 0; ; i++) {
                x = (a + b) / 2;
                if (Math.abs(function1(x)) < correctness) { // проверка условия на точность
                    break;
                } else {
                    if (function1(a) * function1(x) < 0) {
                        b = x;
                    } else {
                        a = x;
                    }
                }
            }
        }
        return x;

    }

    default double function1(double parameter) {
        double result = Math.sin(parameter) - 0.75;
        return result;
    }

    static double square2 (double intervalX, double intervalY, double correctness) {
        double a = intervalX;
        double b = intervalY;
        double x = 0;

        if(function2(a) * function2(b) < 0) { //проверка условия на сходимость
            for (int i = 0; ; i++) {
                x = (a + b) / 2;
                if (Math.abs(function2(x)) < correctness) { // проверка условия на точность
                    break;
                } else {
                    if (function2(a) * function2(x) < 0) {
                        b = x;
                    } else {
                        a = x;
                    }
                }
            }
        }
        return x;

    }

    static double function2(double parameter) {
        double result = Math.tan(parameter);
        return result;
    }

    default double square3 (double intervalX, double intervalY, double correctness) {
        double a = intervalX;
        double b = intervalY;
        double x = 0;



        if(function3(a) * function3(b) < 0) { //проверка условия на сходимость
            for (int i = 0; ; i++) {
                x = (a + b) / 2;
                if (Math.abs(function3(x)) < correctness) { // проверка условия на точность
                    break;
                } else {
                    if (function3(a) * function3(x) < 0) {
                        b = x;
                    } else {
                        a = x;
                    }
                }
            }
        }
        return x;

    }

    default double function3(double parameter) {
        double result = Math.pow(parameter, 3) - 8*parameter + 2;
        return result;
    }

    default double square4 (double intervalX, double intervalY, double correctness) {
        double a = intervalX;
        double b = intervalY;
        double x = 0;



        if(function4(a) * function4(b) < 0) { //проверка условия на сходимость
            for (int i = 0; ; i++) {
                x = (a + b) / 2;
                if (Math.abs(function4(x)) < correctness) { // проверка условия на точность
                    break;
                } else {
                    if (function4(a) * function4(x) < 0) {
                        b = x;
                    } else {
                        a = x;
                    }
                }
            }
        }
        return x;

    }

    default double function4(double parameter) {
        double result = Math.log(Math.pow(parameter, 3)) - 2;
        return result;
    }

    default double square5 (double intervalX, double intervalY, double correctness) {
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

    default double function5(double parameter) {
        double result = Math.exp(-parameter) - 0.5;
        return result;
    }
}


