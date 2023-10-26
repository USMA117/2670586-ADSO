import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        Scanner tecladoTexto = new Scanner(System.in);
        Scanner tecladoNumeros = new Scanner(System.in);
        // Curso curso_01 = new Curso (12345, "PHP", "Programacion", 50 );

        // curso_01.imprimirDetalle();

        int opcion = 0;
        int espaciosLlenos = 0;
        int espacio = 100;
        Curso listaCursos [] = new Curso[espacio];
        // listaCursos[0] = new Curso (12345, "PHP", "Programacion", 50 );
        // listaCursos[1] = new Curso (123, "JAVA", "Programacion", 20 );
        // listaCursos[2] = new Curso (1256, "JS", "Programacion", 30 );

        for(int i = 0; i < listaCursos.length; i++){
            if(listaCursos[i] != null){
                espaciosLlenos++;
            }
        }
        espacio -= espaciosLlenos;

        do{
            System.out.println("+------------------------------------------+");
            System.out.println("|              MENU DE CURSOS              |");
            System.out.println("+------------------------------------------+");
            System.out.println("|               Memoria: "+espacio+"                |");
            System.out.println("|   1. Crear curso.                        |");
            System.out.println("|   2. Listar todos los cursos.            |");
            System.out.println("|   3. Ver detalle de curso.               |");
            System.out.println("|   4. Editar informacion de un curso.     |");
            System.out.println("|   5. Agregar tema a curso.               |");
            System.out.println("|   6. Eliminar curso.                     |");
            System.out.println("|   7. Salir.                              |");
            System.out.println("|                                          |");
            System.out.println("+------------------------------------------+");
            System.out.print("Ingrese una opcion -> ");
            opcion = tecladoNumeros.nextInt();

            if(opcion == 1){
                System.out.println("+------------------------------------------+");
                System.out.println("|              CREAR CURSO                 |");
                System.out.println("+------------------------------------------+");
                System.out.print("Ingrese codigo del curso -> ");
                int codigo = tecladoNumeros.nextInt();
                System.out.print("Ingrese nombre del curso -> ");
                String nombreCurso = tecladoTexto.nextLine();
                System.out.print("Ingrese area del curso -> ");
                String area = tecladoTexto.nextLine();
                System.out.print("Ingrese duracion del curso -> ");
                int duracion = tecladoNumeros.nextInt();
                System.out.println("+------------------------------------------+");

                boolean cursoExistente = false;

                for (int i = 0; i < listaCursos.length; i++) {
                    if (listaCursos[i] != null && codigo == listaCursos[i].getCodigo()) {
                        System.out.println("Este Curso ya existe");
                        cursoExistente = true;
                        break;
                    }
                }

                if (cursoExistente == false) {
                    for (int i = 0; i < listaCursos.length; i++) {
                        if (listaCursos[i] == null) {
                            listaCursos[i] = new Curso(codigo, nombreCurso, area, duracion);
                            espacio--;
                            break;
                        }
                    }
                }

                // listaCursos[0].imprimirDetalle();

            }else if(opcion == 2){
                System.out.println("---------------------------");
                System.out.println("|     LISTA DE CURSOS     |");
                System.out.println("---------------------------");
                for(int i = 0; i < listaCursos.length;i++){
                    if(listaCursos[i] != null){
                        // System.out.println((i+1)+". "+listaCursos[i].getNombreCurso());
                        System.out.print((i+1)+". ");
                        listaCursos[i].imprimirDetalle();
                    }
                }
                System.out.println("\n---------------------------");

            }else if(opcion == 3){
                System.out.print("Ingrese el nombre del curso -> ");
                String nombreBusqueda = tecladoTexto.nextLine();
                for(int i = 0;i < listaCursos.length;i++){
                    if(listaCursos[i] != null){
                        if(nombreBusqueda.equals(listaCursos[i].getNombreCurso())){
                            System.out.println("---------------------------");
                            System.out.println("|    DETALLE DEL CURSO    |");
                            System.out.println("---------------------------");
                            listaCursos[i].imprimirDetalle();
                        }else{
                            System.out.println("Este curso no esta disponible aun...");
                            break;
                        }
                        
                    }
                }
                System.out.println("---------------------------");

            }else if(opcion == 4){
                System.out.print("Ingrese el nombre del curso -> ");
                String nombreBusqueda = tecladoTexto.nextLine();
                for(int i = 0;i < listaCursos.length;i++){
                    if(listaCursos[i] != null){
                        if(nombreBusqueda.equals(listaCursos[i].getNombreCurso())){
                            System.out.println("---------------------------");
                            System.out.println("|      EDITAR CURSO       |");
                            System.out.println("---------------------------");
                            System.out.print("Ingrese nuevo nombre del curso -> ");
                            String nombreCurso = tecladoTexto.nextLine();
                            System.out.print("Ingrese area del curso -> ");
                            String area = tecladoTexto.nextLine();
                            System.out.print("Ingrese duracion del curso -> ");
                            int duracion = tecladoNumeros.nextInt();
                            listaCursos[i].editarInformacionCurso(nombreCurso, area, duracion);
                        }
                        // else{
                        //     System.out.println("Este curso no esta disponible aun...");
                        //     break;
                        // }
                        
                    }
                }

            }else if(opcion == 5){
                System.out.print("Ingrese el nombre del curso -> ");
                String nombreBusqueda = tecladoTexto.nextLine();
                for(int i = 0;i < listaCursos.length;i++){
                    if(listaCursos[i] != null){
                        if(nombreBusqueda.equals(listaCursos[i].getNombreCurso())){
                            System.out.println("---------------------------");
                            System.out.println("|  AGREGAR TEMA AL CURSO  |");
                            System.out.println("---------------------------");
                            System.out.print("Ingresar tema -> ");
                            String tema = tecladoTexto.nextLine();
                            listaCursos[i].agregarTema(tema);
                        }
                        // else{
                        //     System.out.println("Este curso no esta disponible aun...");
                        //     break;
                        // }
                        
                    }
                }
                System.out.println("---------------------------");

            }else if(opcion == 6){
                int posicion_eliminar =0;
                System.out.print("Ingrese el nombre del curso -> ");
                String nombreBusqueda = tecladoTexto.nextLine();
                for(int i = 0;i < listaCursos.length;i++){
                    if(listaCursos[i] != null){
                        if(nombreBusqueda.equals(listaCursos[i].getNombreCurso())){
                            
                            posicion_eliminar = i;
                            for(int j = posicion_eliminar; j < listaCursos.length-1; j++ ){
                                listaCursos[j] = listaCursos[j+1];
                            }

                            System.out.println("---------------------------");
                            System.out.println("|      CURSO ELIMINADO    |");
                            System.out.println("---------------------------");
                        }
                        // else{
                        //     System.out.println("Este curso no esta disponible aun...");
                        //     break;
                        // }
                        
                    }
                }
                
                espacio++;
            }
        }while(opcion != 7);
    }

}