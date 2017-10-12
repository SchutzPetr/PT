package cz.schutz.geometric.objects.d2;

import cz.schutz.geometric.GeometricObject;
import cz.schutz.geometric.Object2D;

/**
 * Created by Petr Schutz on 12.10.2017
 *
 * @author Petr Schutz
 * @version 1.0
 */
public class Square extends GeometricObject implements Object2D {

    @SuppressWarnings("SuspiciousNameCombination")
    public Square(double width) {
        super(width);
    }

    @Override
    public double getCircuit() {
        return getParametr(0) * 4;
    }

    @Override
    public double getContends() {
        return Math.pow(getParametr(0), 2);
    }
}
