public class Main {
    public static void main(String[] args) {

        int fechaDeLanzamiento = 1990;
        boolean incluidoEnElPlan = true;
        double calificacion = 8.5;
        String director = "Christopher Nolan";
        int duracion = 152;
        String genero = "Drama, Acción";

        double media = (8.2 + 6.0 + 9.0) / 3;

        int a = 10; // Atribui o valor 10 à variável a
        int b = 5; // Atribui o valor 5 à variável b
        int c = 30; // Atribui o valor 30 à variável c

        boolean igual = (b == a); //En este caso la variable igual quedará con valor *false, pues el el valor de b no es igual al valor de a.
        boolean diferente = (b != c); //La variable diferente quedará con el valor de *true*, pues el valor de b es diferente del valor de c.
        boolean mayor= (b > a); //la variable mayor quedará con el valor *false*, pues el valor de b es menor que el valor de a.
        boolean menorIgual = (b <= c); //La variable menor igual quedará con el valor de *true*, pues el valor de b es menor que el valor de c.

        int num = 5;
        int resultado = ++num; //num es incrementado para 6 e después es atribuido al resultado

        String sinopsis = """
                Batman (Bruce Wayne) es un superhéroe de Gotham City,
                Conocido por su liderazgo y su inteligencia.
                Está enfrentado a un enemigo llamado Batwoman,
                Un villano conocido por su liderazgo y su inteligencia.
                Los dos personajes se enfrentan en una batalla de guerra en la isla de Gotham,
                Donde Batman se une a Batwoman para vengar de sus enemigos.
                Fue lanzada en:
                """ + fechaDeLanzamiento;

        String saludo = "Hola, ";
        String nombre = "Alura";
        String mensaje = saludo + nombre + "!";
        String contrasena= "12345";

        String name = "Maria";
        int edad = 30;
        double valor = 55.9999;

        String lastname = "Jacinto";
        int aulas = 4;
        String saludos = """
                  Hola, %s!
                  Bienvenido al curso de Java.
                  Tendremos %d aulas para mostrarte lo que es necesario para que puedas dar tu primeros pasos en este lenguaje
                  """.formatted(lastname, aulas);

        int clasificacion = (int) (media / 2);

        double temperaturaEnCelsius = 30.4;
        double temperaturaEnFahrenheit = (temperaturaEnCelsius * 1.8) + 32;

        String contenido = String.format("La temperatura de %f Celsius es equivalente a %f Fahrenheit", temperaturaEnCelsius, temperaturaEnFahrenheit);


        System.out.println("Bienvenido(a) a Screen Match!");
        System.out.println("Pelicula: Batman");
        System.out.println(media);
        System.out.println(igual);
        System.out.println(diferente);
        System.out.println(mayor);
        System.out.println(menorIgual);

        /*
        * interesante cucrso
        * me gusto
        * muy intuitivo
        * */

        System.out.println(num); // imprime 6
        System.out.println(resultado); // imprime 6
        System.out.println(sinopsis);
        System.out.println(mensaje);

        if (contrasena.equals("12345")) {
            System.out.println("Acceso autorizado!");
        } else {
            System.out.println("Contraseña incorrecta.");
        }

        System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", name, edad, valor));
        System.out.println(saludos);
        System.out.println("Tu clasificación es: " + clasificacion);
        System.out.println(contenido);

        int temperaturaEnFahrenheitEntero = (int) temperaturaEnFahrenheit;
        System.out.println("La temperatura en Fahrenheit entera es: " + temperaturaEnFahrenheitEntero);

    }
}