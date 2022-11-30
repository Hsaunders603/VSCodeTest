public class DriveTrain {
    private Motor left;
    private Motor right;

    public DriveTrain(Motor left, Motor right){
        this.left = left;
        this.right = right;
    }

    public void move(double leftSpeed, double rightSpeed){
        left.set(leftSpeed);
        right.set(rightSpeed);
    }

    @Override
    public String toString(){
        return String.format(" Drivetrain %s:%s", left, right);
    }

    public static void main(String... args) {
        Motor motorLeft = new SparkMax(1);
        Motor motorRight = new SparkMax(2);
        DriveTrain drive = new DriveTrain(motorLeft, motorRight);
        System.out.println(drive.toString());
    }
}