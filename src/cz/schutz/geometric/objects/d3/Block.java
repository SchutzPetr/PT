package cz.schutz.geometric.objects.d3;

import cz.schutz.geometric.Convertible;
import cz.schutz.geometric.GeometricObject;
import cz.schutz.geometric.Object3D;
import cz.schutz.geometric.objects.d2.Rectangle;

/**
 * Created by Petr Schutz on 12.10.2017
 *
 * @author Petr Schutz
 * @version 1.0
 */
public class Block extends GeometricObject implements Object3D, Convertible<Rectangle, Block> {

    public Block() {
        super();
    }

    @Override
    public Block convertTo3D() {
        return null;
    }

    @Override
    public Rectangle convertTo2D() {
        return null;
    }
}
