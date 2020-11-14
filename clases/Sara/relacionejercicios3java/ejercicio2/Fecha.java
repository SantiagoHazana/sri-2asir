public class Fecha {
    int dia;
    int mes;
    int año;

    //Constructor 
    Fecha(int dia,int mes,int año){
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }
    
    //Metodos
    public static comprobarDia(int dia){
        if (dia >= 1 && dia <= 30){
            return dia;
        }else{
            return dia=1;
        }
    }

    public static comprobarMes(int mes){
        if (mes >= 1 && mes <= 12){
            return mes;
        }else{
            return mes=1;
        }

    }
    
    //Metodo para pasar a cadena
    public String toString(){
        return string.format("Fecha[Dia: %d,Mes: %d,Año: %d]",this.dia,this.mes,this.año);
    }
}
