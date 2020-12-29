package MoonSurface;


public class JustSurface extends MoonSurface {

    private String flagOnSurface;

    public JustSurface(String name, int persentOfOxygen) {
        super(name, persentOfOxygen);
    }


    public String getFlagOnSurface() {
        return flagOnSurface;
    }

    public void setFlagOnSurface(String flagOnSurface) {
        this.flagOnSurface = flagOnSurface;
    }



    public static  class MoonCity {
        public int numOfArrived ;

        public int getNumOfArrived() {
            return numOfArrived;
        }

        public void setNumOfArrived(int numOfArrived) {
            this.numOfArrived = numOfArrived;
        }
    }

   public  static  class Hangar {
        public  boolean destroyed = true;

       public boolean isDestroyed() {
           return destroyed;
       }

       public void setDestroyed(boolean destroyed) {
           this.destroyed = destroyed;
       }
   }
}
