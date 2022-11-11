public class Complexo {

    private float real;

    private float imag;

    private float modulo;

    private double angulo;

    public Complexo(float real, float imag){

        this.real = real;

        this.imag = imag;

    }

    public Complexo(float real){

        this.real = real;

    }

    public float getReal(){

        return this.real;

    }

    public float getImag(){

        return this.imag;

    }

    public float getModulo(){

        return this.modulo;

    }

    public double getAngulo(){

        return this.angulo;

    }

    public void setReal(float real){

        this.real = real;

    }

    public void setImag(float imag){

        this.imag = imag;

    }

    public void Modulo(){

        this.modulo = (float) Math.abs(Math.sqrt((this.real * this.real) + (this.imag * this.imag)));

    }

    public void Angulo(){

        float x = getReal();
        float y = getImag();

        if(Math.round(Math.toDegrees(Math.atan2(y,x))) >= 0){
            this.angulo = Math.round(Math.toDegrees(Math.atan2(y,x)));
        }else{
            this.angulo = 360 + Math.round(Math.toDegrees(Math.atan2(y,x)));
        }

    }

    public int Sinal(){

        return 0;

    }

}
