
public class App {
    public static void main(String[] args) throws Exception {
        BeeHive beeHive = new BeeHive(565);
        beeHive.add(new Bee("abeille"));
        System.out.println();
        // beeHive.add("mum");
    }
}

// modificateur d'accès : public
// methodname
// type retour