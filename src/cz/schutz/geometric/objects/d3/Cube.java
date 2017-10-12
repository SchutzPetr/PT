package cz.schutz.geometric.objects.d3;

import cz.schutz.geometric.Convertible;
import cz.schutz.geometric.GeometricObject;
import cz.schutz.geometric.Object3D;
import cz.schutz.geometric.objects.d2.Square;

/**
 * Created by Petr Schutz on 12.10.2017
 *
 * @author Petr Schutz
 * @version 1.0
 */
public class Cube extends GeometricObject implements Object3D, Convertible<Square, Cube> {

    public Cube(double width) {
        super(width);
    }

    @Override
    public Cube convertTo3D() {
        return null;
    }

    @Override
    public Square convertTo2D() {
        return null;
    }
}
