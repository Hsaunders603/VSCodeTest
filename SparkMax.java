
public class SparkMax extends Motor {
    private int id;



    public SparkMax(int id){
        this.id = id;
      }
    
    public int getId(){
        return id;
    }

    @Override
    public void set(double speed) {
        super.set(speed);
        System.out.println("Yay! I set the motor to "+speed);
    }

    public String toString(){
        return String.format("<Sparkmax %s (%s)>", id, get());

    }

    public static void main(String[] args){
        Motor m = new SparkMax(62789);
        m.set(10);
        System.out.println("Motor speed: "+ m.get());
    }
}
