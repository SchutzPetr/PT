package cz.schutz.geometric.objects.d3;

import cz.schutz.geometric.Convertible;
import cz.schutz.geometric.GeometricObject;
import cz.schutz.geometric.Object3D;
import cz.schutz.geometric.objects.d2.Circle;

/**
 * Created by Petr Schutz on 12.10.2017
 *
 * @author Petr Schutz
 * @version 1.0
 */
public class Cylinder extends GeometricObject implements Object3D, Convertible<Circle, Cylinder> {

    public Cylinder(double radius, double height) {
        super(radius, height);
    }

    @Override
    public Cylinder convertTo3D() {
        return null;
    }

    @Override
    public Circle convertTo2D() {
        return null;
    }
}
