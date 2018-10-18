
public class Pbase {
    
     private String raza, nickname;
     private int fuerza, destreza, inteligencia, salud, oro, plata;

    public Pbase() {
        plata=0;
        oro=0;
    }
        
     public void atributos  (int fuerza, int destreza, int inteligencia, int salud){
        
    }
    public void razaFaccion (String raza, String faccion){
    
    }
    
    public void pocionSalud (){
           salud = salud+50; 
           System.out.println("A tomado una pocion de salud, vida regenerada en 50 pv");
    }
    
    public void atacar (){
        
    }
    public void defender (){
        
    }
    public void avanzar(){
        
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    
    
    
}
