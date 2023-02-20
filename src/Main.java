public class Main {
    public static void main(String[] args) {

        int numeroIF = 0;
        if (numeroIF > 0) {
            System.out.println("El numero " + numeroIF + " es POSITIVO");
        } else if (numeroIF < 0) {
            System.out.println("El numero " + numeroIF + " es NEGATIVO");
        }else{
            System.out.println("El numero " + numeroIF + " es CERO");
        }



        int numeroWhile = 1;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("numero While " + numeroWhile);
        }

        int numeroDoWhile = 3;
        do {
            numeroDoWhile++;
            System.out.println("numero do-While " + numeroDoWhile);
        } while (numeroDoWhile < 3);

        int numeroFor;
        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("numero For " + numeroFor);
        }


        String estacion ="gato";
        switch (estacion){
            case"INVIERNO":
                System.out.println("INVIERNO");
                break;
            case"VERANO":
                System.out.println("VERANO");
                break;
            case"PRIMAVERA":
                System.out.println("PRIMAVERA");
                break;
            case"OTOÑO":
                System.out.println("OTOÑO");
                break;
            default:
                System.out.println("No es una estación del Año");
        }
    }
}