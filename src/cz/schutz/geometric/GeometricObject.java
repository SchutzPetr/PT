package cz.schutz.geometric;

import java.util.Arrays;

/**
 * Created by Petr Schutz on 12.10.2017
 *
 * @author Petr Schutz
 * @version 1.0
 */

public abstract class GeometricObject {

    private double[] params;

    public GeometricObject(double... params) {
        this.params = params;
    }

    protected double[] getParams() {
        return params;
    }

    protected double getParametr(int index) {
        if(index < 0 || params.length < index){
            return -1;
        }else{
            return params[index];
        }
    }

    @Override
    public String toString() {
        return "Im a " + getClass().getSimpleName() + " and my params are " + Arrays.toString(params);
    }
}
