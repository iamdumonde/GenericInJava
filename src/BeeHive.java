// import java.util.ArrayList;

public class BeeHive extends Generic<Bee>{
    // private ArrayList<Bee> beeList;

    public BeeHive(int numBees){
        // this.beeList = new ArrayList<Bee>();
        for (int i = 0; i < numBees; i++) {
            elementList.add(new Bee("bee" + i));
        }
    }

   
}
