
public class Principal {
    
    public static void main(String[] args) {
        
           Arquero arquero1 = new Arquero ();    
            arquero1.destreza = 15;
            arquero1.salud = 200;
            arquero1.fuerza = 10;
            arquero1.inteligencia = 7;
            arquero1.faccion = "Klaxxi";
            arquero1.raza = "Arquero";
                arquero1.tiroImpecable();
                arquero1.triShot();
            
        Mago mago1 = new Mago();
            mago1.destreza = 13;
            mago1.salud = 165;
            mago1.fuerza = 6;
            mago1.inteligencia = 15;
            mago1.faccion = "Shaohao";
            mago1.raza = "Mago";
                mago1.regenerarMana();
                mago1.tormentaHelada();
        
    }
    
    
}
