
public class Principal {
    
    public static void main(String[] args) {
        
           Arquero arquero1 = new Arquero ();    
            arquero1.atributos(10, 15, 8, 200);
            arquero1.razaFaccion("Arquero", "Klaxxi");
                arquero1.tiroImpecable();
                arquero1.triShot();
                arquero1.setNickname("Florencio");
                
                
                
            
           Mago mago1 = new Mago();
            mago1.atributos(8, 12, 15, 160);
            mago1.razaFaccion("Mago", "Shaohao");
                mago1.regenerarMana();
                mago1.tormentaHelada();


           Ilusionista ilusionista1 = new Ilusionista();
            ilusionista1.atributos(10, 15, 20, 200);
            ilusionista1.razaFaccion("Ilusionista", "Shaohao");
            ilusionista1.setNickname("El barto");
                ilusionista1.InvocarClon();
                ilusionista1.regenerarMana();
                ilusionista1.pocionSalud();
                
                
        
        
    }
    
    
}
