
package boletin3_consumo;

/**
 *
 * @author finfanterodal
 */
public class Consumo {
    //Atributos:
    private float kilometros,litros, Vmed,pGas, cm;
    
    //Constructores:
    public Consumo(){   //Sin parametros   
    }
    public Consumo(float km,float l,float vm,float pg){
        kilometros = km;
        litros = l;
        Vmed = vm;
        pGas = pg;          
    }
    
   //Métodos:
    //Getter devolvemos valores.consumo2 y consumo1.
    public float getTempo(){
        float tiempo = kilometros/Vmed;
    return tiempo;    
    }
    
    public float consumoMedio(){
          cm = litros * 100 / kilometros;
          return cm;
    }
    
     public float consumoEuros(){
         float cEu = cm * pGas;
         return cEu;           
    }
     public float getvMed(){
      return Vmed;
    }
     
    public float getlitros(){
       return litros;
    }
    
     public float getPGas(){
      return  pGas;
    }
    
    //Setters Ponemos valores.
    public void setKms(float km){
        kilometros= km;
    }
    public void setlitros(float l){
        litros= l;
    }
    public void setvMed(float vm){
      Vmed = vm;
    }
    public void  setPGas(float pg){
        pGas = pg;
    }
}
