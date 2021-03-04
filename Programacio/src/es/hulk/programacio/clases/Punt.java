package es.hulk.programacio.clases;

public class Punt {

    public double distance(double x1, double y1, double x2, double y2) {

        x1 = 1;
        x2 = 4;
        y1 = 6;
        y2 = 5;

        double ac = Math.abs(y2 - y1);
        double cb = Math.abs(x2 - x1);

        return Math.hypot(ac, cb);
    }

}
