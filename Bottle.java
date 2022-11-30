
public class Bottle {
    /**
     * String color is the color of the bottle
     */
    String color;
    /**
     * double volume is the total volume of the bottle
     */
    double volumeOz;
    /**
     * double liquidVolume 
     */
    double liquidVolumeOz;
    String liquidType;
    
    public Bottle (String color, double volumeOz, 
                double liquidVolumeOz, String liquidType){

        this.color = color;
        this.volumeOz = volumeOz;

        this.liquidVolumeOz = liquidVolumeOz;
        this.liquidType = liquidType;
        
    }

    public void drink (double amountToDrink){
        if (amountToDrink>liquidVolumeOz){
            amountToDrink = liquidVolumeOz;
        }
        
            liquidVolumeOz-=amountToDrink;
        
    }
    
    public void fill (double amountToFill){

        if (amountToFill> remainingVolume()) {
            amountToFill = remainingVolume();
        }
        liquidVolumeOz += amountToFill;
        
    }
    public boolean isEmpty(){
      return liquidVolumeOz<=0.0;
    }
    public void fill(){
        fill(remainingVolume());
    }
    public double remainingVolume(){
        return volumeOz - liquidVolumeOz;
    }


    public String toString() {
        return String.format("%s Bottle (%s) (%s/%s)", color, liquidType, liquidVolumeOz, volumeOz);
    }

    public static void main(String[] args){
        Bottle bottle = new Bottle("Purple", 18.0, 16.0, "Vodka");
        System.out.println("There is "+ bottle.remainingVolume()+"oz remaining to fill.");
        System.out.println(bottle+"   Before drinking");
        bottle.drink(5.0);
        System.out.println(bottle+"   After drinking 5oz");
        bottle.drink(13.0);
        System.out.println(bottle+"   After drinking 13oz");
        bottle.fill(6.0);
        System.out.println(bottle+"   After filling 6oz");

        
    }
}

