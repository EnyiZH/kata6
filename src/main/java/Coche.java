public class Coche {
    public int velocidad = 0;
    public int getVelocidad(){
        return velocidad;
    }
    public void acelerar(int i) {
        velocidad+=i;
    }

    public void frenar(int i) {
        velocidad-=i;
        if(velocidad<0){
            velocidad=0;
        }
    }
}
