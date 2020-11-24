package clases.Sara.examen2019;

public class Ejercicio1{
    public static void main(String [] args){

        //Creacion de matriz
        int alumnos[][] = new int [2][10];

        //Almacenamiento en la matriz
        alumnos[0][0]=0;
        alumnos[1][0]=1;
        alumnos[0][1]=1;
        alumnos[1][1]=3;
        alumnos[0][2]=2;
        alumnos[1][2]=1;
        alumnos[0][3]=6;
        alumnos[1][3]=3;
        alumnos[0][4]=6;
        alumnos[1][4]=4;
        alumnos[0][5]=5;
        alumnos[1][5]=2;
        alumnos[0][6]=2;
        alumnos[1][6]=1;
        alumnos[0][7]=2;
        alumnos[1][7]=1;
        alumnos[0][8]=0;
        alumnos[1][8]=1;
        alumnos[0][9]=1;
        alumnos[1][9]=1;

        //calcular total de alumnos y calificaciones
        int calificaciones= 0;
        int totalAlumnos=0;
        for(int i=0; i<alumnos.length; i++){
            for( int j=0; j<alumnos[i].length; j++){
                totalAlumnos ++;
                calificaciones += alumnos[i][j];
            }
            
        }
//        System.out.println("El total de alumnos es: " + totalAlumnos);
//        System.out.println("La suma de todas las calificaciones es: " + calificaciones);

        //solucion ej 1 b)
        int totalAlumnosClaseA = 0;
        int totalAlumnosClaseB = 0;

        for (int i = 0; i < alumnos[0].length; i++) {
            totalAlumnosClaseA += alumnos[0][i];
            totalAlumnosClaseB += alumnos[1][i];
        }

        System.out.printf("Total Clase A: %d\n", totalAlumnosClaseA);
        System.out.printf("Total Clase B: %d\n", totalAlumnosClaseB);

        for (int i = 0; i < alumnos[0].length; i++) {
            int sumaAlumnos = 0;
            sumaAlumnos = alumnos[0][i] + alumnos[1][i];
            System.out.printf("Hay %d alumnos que sacaron %d\n", sumaAlumnos, i+1);
        }

        //calcular la media de cada curso 
        float media=0;
        int claseA=0;
        int claseB=0;

        for(int i =0;i<alumnos.length;i++){
            for (int j=0; j<alumnos[i].length;j++){
            
                
            }
        }
        System.out.println();

        //solucion ej1 c) d)
        float mediaA = 0;
        float mediaB = 0;
        float mediaTotal = 0;

        for (int i = 0; i < alumnos[0].length; i++) {
            mediaA += alumnos[0][i] * (i+1);
            mediaB += alumnos[1][i] * (i+1);
        }
        mediaTotal = mediaA + mediaB;
        mediaTotal = mediaTotal/(totalAlumnosClaseA+totalAlumnosClaseB);
        mediaA = mediaA/totalAlumnosClaseA;
        mediaB = mediaB/totalAlumnosClaseB;
        System.out.printf("La media de la clase A es: %3.2f\n", mediaA);
        System.out.printf("La media de la clase B es: %3.2f\n", mediaB);
        System.out.printf("La media de todos los alumnos es: %f\n", mediaTotal);

        //calcular la media total de datos 

        float mediatotal=0;

        for(int i =0;i<alumnos.length;i++){
            for (int j=0; j<alumnos[i].length;j++){
                mediatotal += alumnos[i][j];

                
            }
        }
        mediatotal = mediatotal / alumnos.length;
        System.out.println("La media total de datos del curso es, la media de alumnos por clase: "+ mediatotal);

        for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < alumnos[i].length; j++) {
                System.out.printf("%d | ", alumnos[i][j]);
            }
            System.out.println("");
        }
    }
}