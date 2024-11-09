package test;

public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;
    
    void cambiarRegistro(int nuevoregistro){
        registro=nuevoregistro;
     }
    
     void asignarTipo(String nuevotipo){
        if(nuevotipo=="electrico" || nuevotipo=="gasolina"){
            tipo=nuevotipo;
        }
      }
}
