package test;

public class Auto {
    String modelo;
    int precio;
    Asiento [] asientos;
    String marca;
    Motor motor;
    int registro;
    static String cantidadCreados;
    int cantidadAsientos(){
    int casientos=0;
       for(int i=0;i<asientos.length;i++) {
    	   if(asientos[i]!=null) {
    		   casientos++;
    	   }
       }
       return casientos;
    }
    String verificarIntegridad(){
    	
    	if(registro!=motor.registro) {
        return "Las piezas no son originales";}
    	
        for(int i=0;i<asientos.length;i++) {
      	   if(asientos[i].registro!=registro) {
      		 return "Las piezas no son originales";
      	   }}
      	
        return "Auto original";
  
    }
}
