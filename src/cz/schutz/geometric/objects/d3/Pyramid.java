package cz.schutz.geometric.objects.d3;

import cz.schutz.geometric.Convertible;
import cz.schutz.geometric.GeometricObject;
import cz.schutz.geometric.Object3D;
import cz.schutz.geometric.objects.d2.Triangle;

/**
 * Created by Petr Schutz on 12.10.2017
 *
 * @author Petr Schutz
 * @version 1.0
 */
public class Pyramid extends GeometricObject implements Object3D, Convertible<Triangle, Pyramid> {

    public Pyramid(double a, double b, double c, double d) {
        super(a, b, c, d);
    }

    @Override
    public Pyramid convertTo3D() {
        return null;
    }

    @Override
    public Triangle convertTo2D() {
        return null;
    }
}
