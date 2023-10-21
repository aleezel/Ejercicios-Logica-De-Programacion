package ejerciciosLogica;
import java.util.Scanner;

public class ej7CalcularMinutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String diaSemana;
        
        
        int horas, minutos;
        int minutosHastaFinDeSemana = 0;

       
        do {
            System.out.print("Ingrese un día de la semana (Lunes, Martes, Miércoles, Jueves, Viernes): ");
            diaSemana = scanner.nextLine().trim().toLowerCase();
        } while (!diaSemana.matches("lunes|martes|miércoles|jueves|viernes"));

        // Solicitar al usuario una hora (horas y minutos)
        do {
            System.out.print("Ingrese la hora en el formato HH:MM: ");
            String hora = scanner.nextLine().trim();
            String[] partesHora = hora.split(":");
            if (partesHora.length == 2) {
                try {
                    horas = Integer.parseInt(partesHora[0]);
                    minutos = Integer.parseInt(partesHora[1]);
                    if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59) {
                        break;
                    }
                } catch (NumberFormatException e) {
                }
            }
            System.out.println("Esa hora no es válida, por favor ingresa otra.");
        } while (true);

        // Calcular cuántos minutos faltan para el fin de semana
        switch (diaSemana) {
            case "lunes":
                minutosHastaFinDeSemana = ((3 - horas) * 60 - minutos);
                break;
            case "martes":
                minutosHastaFinDeSemana = ((3 - horas) * 60 - minutos) + (24 * 60);
                break;
            case "miércoles":
                minutosHastaFinDeSemana = ((3 - horas) * 60 - minutos) + (24 * 60 * 2);
                break;
            case "jueves":
                minutosHastaFinDeSemana = ((3 - horas) * 60 - minutos) + (24 * 60 * 3);
                break;
            case "viernes":
                if (horas < 15) {
                    minutosHastaFinDeSemana = ((15 - horas) * 60 - minutos);
                }
                break;
        }

        // A través del if, se muestra el mensaje con el resultado final en caso de ser corrector los números
        if (minutosHastaFinDeSemana > 0) {
            System.out.println("Faltan " + minutosHastaFinDeSemana + " minutos para el fin de semana");
        } else {
            System.out.println("¡Ya es fin de semana!");
        }

        scanner.close();
    }
}