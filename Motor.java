public class Motor {
    // -1.0 on full speed backwards
    // 1.0  on full speed onwards
    // 0.0 is off
    private double speed;
    
    public void set(double speed){
        this.speed = speed;
        if (speed > 1.0) {
            this.speed = 1.0;
        } else if (speed < -1.0){
            this.speed = -1.0;
        } else {
            this.speed = speed;
        }

    }

    public double get(){
        return speed;
    }

    public void stop(){
        speed = 0.0;
    }

    @Override
    public String toString(){
        return String.format("Motor %s (%s)", speed);
    }
    
}
