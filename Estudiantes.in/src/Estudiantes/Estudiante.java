
package Estudiantes;

/**
 *
 * @author Ragnarok
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Estudiante {

    
    public static void main(String[] args) throws IOException {
        
        File archivo;
        
        
        Scanner lee=new Scanner (System.in);
       
       
        String nombre,nctrl,espec;
        int edad,sem;
        float ed;
       
        //variables del programa
        int opciones=1;
        while (opciones!=4)
        {
            
            //menu del usuario
            System.out.println("Menu de alumno con archivos \n");
            System.out.println("1. agregar alumno");
            System.out.println("2. consultar alumno");
            System.out.println("3. listado general de alummnos");
            System.out.println("4. salir\n");
            opciones=lee.nextInt();
            switch(opciones)
            {//inicio witch
                case 1:
                    //preparando el obojeto para escribir en el archivo
                    File fichero=new File("alumnos.txt");
                    FileWriter fw=new FileWriter(fichero, true);
                    BufferedWriter bw=new BufferedWriter(fw);
                    PrintWriter escribef=new PrintWriter(bw);
                    
                    // pidiendo datos alumno
                    System.out.println("nombre del alumno");
                    nombre=lee.next();
                    System.out.println("apellido del alumno");
                    nctrl=lee.next();
                    System.out.println("cedula");
                    espec=lee.next();
                    System.out.println("edad");
                    edad=lee.nextInt();
                    System.out.println("semestre");
                    sem=lee.nextInt();
                    
                    
                    System.out.println("CALIFICACIONES: \n");
                    System.out.println("estructura de datos: ");
                    ed=lee.nextFloat();
                    
                    escribef.println(nctrl);
                    escribef.println(nombre);
                    escribef.println(espec);
                    escribef.println(edad);
                    escribef.println(sem);
                    escribef.println(ed);
                    
                    
                     System.out.println("Datos almacenados:\n");
                    escribef.close();
                    break;
                    
         case 2:
                    
                    File fichero1 = new File("alumnos.txt");
                    FileReader readerEnt = new FileReader(fichero1);
                    BufferedReader leerf = new BufferedReader(readerEnt);
                    
                    String control, ctrl_busca;
                    int encontrado=0;
                    System.out.println("Dame el apellido del alumno: ");
                    ctrl_busca=lee.next();
                    while((control=leerf.readLine())!=null)
                    {
                        if (control.equals(ctrl_busca))
                        {
                            nombre=leerf.readLine();
                            espec=leerf.readLine();
                            edad=Integer.parseInt(leerf.readLine());
                            sem=Integer.parseInt(leerf.readLine());
                            ed=Float.parseFloat(leerf.readLine());
                            System.out.println("Datos del alumno: \n");
                            System.out.println("Nombre: "+nombre);
                            System.out.println("apellido: "+control);
                            System.out.println("cedula: "+espec);
                            System.out.println("edad: "+edad);
                            System.out.println("semestre: "+sem);
                            System.out.println("estructura de datos: "+ed);
                            encontrado++;
                        }
                    }
                    if (encontrado==0)
                        System.out.println("El alumno no esta dado de alta");
                    leerf.close();
                    break;
                case 3:
                    
                    File fichero2 = new File("alumnos.txt");
                    FileReader readerEnt1 = new FileReader(fichero2);
                    BufferedReader leerf1 = new BufferedReader(readerEnt1);
                    System.out.println("Listado general de alumnos");
                    String control1;
                    System.out.println("apellido   nombre   cedula   edad" + "   sem   ED");
                    while((control1=leerf1.readLine())!=null)
                    {
                            nombre=leerf1.readLine();
                            espec=leerf1.readLine();
                            edad=Integer.parseInt(leerf1.readLine());
                            sem=Integer.parseInt(leerf1.readLine());
                            ed=Float.parseFloat(leerf1.readLine());
                            System.out.println(control1+"   "+nombre+"   "+
                                    espec+"   "+edad+"   "+sem+"   "+ed);
                    }
                    leerf1.close();
                    break;
                case 4: 
                    System.out.println("Salida del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida, solo del 1 al 4...");
                    
                    try {
        
        archivo = new File("C:\\Users\\Ragnarok\\OneDrive\\Escritorio\\Estudiantes.in\\archivo.txt"); 
        //Ubicacion del lugar donde ira guardado el arichivo.txt
        if(archivo.createNewFile()){
           System.out.println("Se ha creado el archivo");
        }
    } catch(IOException e){
        System.err.println("No se ha podido crear el archivo" +e);
    }
}
    
      }

    }
}    
 

        
        