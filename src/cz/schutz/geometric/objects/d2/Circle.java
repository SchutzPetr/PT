package cz.schutz.geometric.objects.d2;

import cz.schutz.geometric.GeometricObject;
import cz.schutz.geometric.Object2D;

/**
 * Created by Petr Schutz on 12.10.2017
 *
 * @author Petr Schutz
 * @version 1.0
 */
public class Circle extends GeometricObject implements Object2D {

    public Circle(double radius) {
        super(radius * 2);
    }

    @Override
    public double getCircuit() {
        return getParametr(0) * Math.PI;
    }

    @Override
    public double getContends() {
        return (Math.PI * Math.pow(getParametr(0), 2)) / 4;
    }
}
