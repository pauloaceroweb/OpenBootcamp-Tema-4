public class Main {
    public static void main(String[] args) {

        System.out.println("-");
        System.out.println("********************************************");
        System.out.println("OPEN BOOTCAMP");
        System.out.println("Introducción a la programación");
        System.out.println("Ejercicios tema 4 - Sentencias de Control");

        // PUNTO No. 1 (if)
        System.out.println("********************************************");
        System.out.println("1. Sentencia de Control if");
        int numeroIf = 2;

        if (numeroIf > 0) {
            System.out.println("El número " + numeroIf + " Es positivo");
        } else if (numeroIf == 0) {
            System.out.println("El número es: " + numeroIf + " Es Cero");
        } else {
            System.out.println("El número " + numeroIf + " Es negativo");
        }

        //PUNTO No. 2 (While)
        System.out.println("********************************************");
        System.out.println("2. Sentencia de Control while");
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("La variable ahora es: "+ numeroWhile);
        }

        //PUNTO No. 3 (Do while)
        System.out.println("********************************************");
        System.out.println("3. Sentencia de Control Do While");
        int numeroDoWhile = 100;
        do {
            numeroDoWhile++;
            System.out.println("La variable ahora es: " + numeroDoWhile);
        } while (numeroDoWhile < 3);

        //PUNTO No. 4 (For)
        System.out.println("********************************************");
        System.out.println("4. Sentencia de Control For");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++ ) {
            System.out.println("La variable ahora es: " + numeroFor);
        }

        //PUNTO No. 5 (Switch)
        System.out.println("********************************************");
        System.out.println("5. Sentencia de Control Switch");
        var estacion = "Otoño";
        switch (estacion) {
            case "Verano" :
                System.out.println("Es verano");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es una estación por favor ingrese un valor válido");
        }
        System.out.println("********************************************");

    }
}