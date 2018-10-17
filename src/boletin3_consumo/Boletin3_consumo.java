
package boletin3_consumo;

/**
 *
 * @author finfanterodal
 */
public class Boletin3_consumo {

    
    public static void main(String[] args) {
        //Obxecto Consume con constructor sin parámetros.
   Consumo consumo1 = new Consumo();
   //Ponemos valores de litros y precio gasolina.
   consumo1.setlitros(7000f);
   consumo1.setPGas(1.57f);
   //Visualizamos Litros y Precio gas Obxecto1
   System.out.print("\nLitros1 = "+ consumo1.getlitros());
   System.out.print("\nPrecioGasolina1 = "+consumo1.getPGas() );
   
        //Obxecto Consume con el constructor con parámetros.
   Consumo consumo2 = new Consumo(50f, 20f ,100f,1.57f);
   //Consumo medio OBxect2 
   float resposta= consumo2.consumoMedio();
   System.out.print("\nConsumo Medio2 = "+ resposta);
  //Variamos litros consumidos.
  consumo2.setlitros(30f);
  //Visualizamos Vmedia 
  System.out.print("\nVelocidade Media2 = "+consumo2.getvMed());
    }
    
}
