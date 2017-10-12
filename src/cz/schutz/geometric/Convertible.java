package cz.schutz.geometric;

/**
 * Created by Petr Schutz on 12.10.2017
 *
 * @author Petr Schutz
 * @version 1.0
 */
public interface Convertible<T extends Object2D, E extends Object3D> {

    E convertTo3D();

    T convertTo2D();
}
