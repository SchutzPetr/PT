package cz.schutz.geometric.objects.d2;

import cz.schutz.geometric.GeometricObject;
import cz.schutz.geometric.Object2D;

/**
 * Created by Petr Schutz on 12.10.2017
 *
 * @author Petr Schutz
 * @version 1.0
 */
public class Rectangle extends GeometricObject implements Object2D {

    public Rectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public double getCircuit() {
        return (getParametr(0) + getParametr(1)) * 2;
    }

    @Override
    public double getContends() {
        return getParametr(0) * getParametr(1);
    }
}
