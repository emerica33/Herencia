
public class Principal {
    
    public static void main(String[] args) {
        
           Arquero arquero1 = new Arquero ();    
            arquero1.atributos(10, 15, 8, 200);
            arquero1.razaFaccion("Arquero", "Klaxxi");
                arquero1.tiroImpecable();
                arquero1.triShot();
            
           Mago mago1 = new Mago();
            mago1.atributos(8, 12, 15, 160);
            mago1.razaFaccion("Mago", "Shaohao");
                mago1.regenerarMana();
                mago1.tormentaHelada();
        
    }
    
    
}
