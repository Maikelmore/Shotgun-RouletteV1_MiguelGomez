//import java.util.Random;        // importo Todas las cosas que me puedan hacer falta para tenerlas a mano 
import java.util.Scanner;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
public class App{
    public static void main(String[] args){ // Básico de java 

        //Random random = new Random();
        // He creado todas las variables que me hacian falta para el desarollo del juego como numero de vidas tipos de cartuchos y nombre de entre otras 
        // Hay muchas que no estan en uso por que las funciones han ido apareciendo y desapareciendo que he mantido por si acaso 
        int selecciónmenu;
        int selecciónjugadores;
        int seleccióndificultad;
        int cartuchosminimos=3;
        //int cartuchosmaximos=5;
        int vidasmaquina=0;
        int vidasjugador1=0;
        int numerocartucho=0;
        int elecciónjugador;
        //boolean[]cartuchos= new boolean[numerocartucho] ;
        boolean dowhile=true;
        boolean dowhile2= true;
        String Nombrejugador = "";
        // Dos variables para no petar el codigo con el texto de los objetos y la historia 
        String Historia="-'Tengo una enfermedad extraña psiconoseque , me gusta jugar a este juego y como nadie quiere jugar conmigo pues secuetro a gente y la obligo a jugar por su vida a dia de hoy nadie me ha ganado'";
        String objetos="-'No se pueden usar a menos que pases a la segunda fase no creo que llegues tan lejos'";
        
        Scanner lector = new Scanner (System.in);// El arte asci para el titulo del juego 
        System.out.println("\r\n" + //
                    "\r\n" + //
                    " _______           _______ _________ _______           _                \r\n" + //
                    "(  ____ \\|\\     /|(  ___  )\\__   __/(  ____ \\|\\     /|( (    /|         \r\n" + //
                    "| (    \\/| )   ( || (   ) |   ) (   | (    \\/| )   ( ||  \\  ( |         \r\n" + //
                    "| (_____ | (___) || |   | |   | |   | |      | |   | ||   \\ | |         \r\n" + //
                    "(_____  )|  ___  || |   | |   | |   | | ____ | |   | || (\\ \\) |         \r\n" + //
                    "      ) || (   ) || |   | |   | |   | | \\_  )| |   | || | \\   |         \r\n" + //
                    "/\\____) || )   ( || (___) |   | |   | (___) || (___) || )  \\  |         \r\n" + //
                    "\\_______)|/     \\|(_______)   )_(   (_______)(_______)|/    )_)         \r\n" + //
                    "                                                                        \r\n" + //
                    " _______  _______           _        _______ __________________ _______ \r\n" + //
                    "(  ____ )(  ___  )|\\     /|( \\      (  ____ \\\\__   __/\\__   __/(  ____ \\\r\n" + //
                    "| (    )|| (   ) || )   ( || (      | (    \\/   ) (      ) (   | (    \\/\r\n" + //
                    "| (____)|| |   | || |   | || |      | (__       | |      | |   | (__    \r\n" + //
                    "|     __)| |   | || |   | || |      |  __)      | |      | |   |  __)   \r\n" + //
                    "| (\\ (   | |   | || |   | || |      | (         | |      | |   | (      \r\n" + //
                    "| ) \\ \\__| (___) || (___) || (____/\\| (____/\\   | |      | |   | (____/\\\r\n" + //
                    "|/   \\__/(_______)(_______)(_______/(_______/   )_(      )_(   (_______/\r\n" + //
                    "\r\n" + //
                    "");
        System.out.println("- 'Ah ya te has despertado!'");// El arte asci para el personaje del malo 
        System.out.println("                     ______\r\n" + //
                    "                    <((((((\\\\\\\r\n" + //
                    "                    /      . }\\\r\n" + //
                    "                    ;--..--._|}\r\n" + //
                    " (\\                 '--/\\--'  )\r\n" + //
                    "  \\\\                | '-'  :'|\r\n" + //
                    "   \\\\               . -==- .-|\r\n" + //
                    "    \\\\               \\.__.'   \\--._\r\n" + //
                    "    [\\\\          __.--|       //  _/'--.\r\n" + //
                    "    \\ \\\\       .'-._ ('-----'/ __/      \\\r\n" + //
                    "     \\ \\\\     /   __>|      | '--.       |\r\n" + //
                    "      \\ \\\\   |   \\   |     /    /       /\r\n" + //
                    "       \\ '\\ /     \\  |     |  _/       /\r\n" + //
                    "        \\  \\       \\ |     | /        /\r\n" + //
                    "         \\  \\      \\        /");
        System.out.println("-'Menos mal pensaba que me habia pasado con el Sonifero y te había matado'");//Un poco de dialogo para que el jugador se meta en situación 
        System.out.println("-'No se como te llamas, ya que vamos a hacer esto al menos quiero saber como te llamas'");
        Nombrejugador = lector.nextLine();
        System.out.println("-'Ah te llamas "+ Nombrejugador +" me gustaria poder decirte que es un nombre bonito pero mi religión no me permite mentir' ");
        System.out.println("-'Yo soy Maikel, tu colega el Spicopata, la verdad me has caido bien yo creo que vamos a disfurtar'");
        
        do{//Todo el menu esta metido dentro de un doWhile para que se repita "infinitamente" mientras no se elija la opción indicada 
            System.out.println("-'Bueno que quieres hacer'");
            System.out.println("1.Leer Historia\n2.Conocer los objetos\n3.Jugar \n4.salir \n");
            selecciónmenu= lector.nextInt();
            switch (selecciónmenu) {//Cogemos la decisión del jugador para selecionar la opción elegida 
            case 1:
                System.out.println(Historia);
                break;
                
            case 2:
                System.out.println(objetos);
                break;
                
            case 3:
                do{//Un case para seleccionar el numero de jugadores
                    System.out.println("-'¿Con cuantos amigos quieres jugar?'");
                    System.out.println("1.'Yo solo'\n2.'Yo y mi colega'\n3.'Yo y dos más'\n4.'Nosotros cuatro'");
                    selecciónjugadores= lector.nextInt();
                    switch(selecciónjugadores){
                        case 1:
                            dowhile2=false;//Cambiamos el valor de boolean para que no continue el bucle 
                            System.out.println("-'Buena elección vamos a ello'");
                            System.out.println("-'Como quieres jugar'");
                            System.out.println("1.Modo easy(5 cartuchos minimo 3 de ellos de verdad  y 3 vidas )\n2.Modo serio(7 cartuchos minimo 4 de ellos de verdad y 4 vidas)\n3.Modo tryhard(10 cartuchos minimo 5 de ellos de verdad y 5 vidas)");
                            seleccióndificultad= lector.nextInt();
                            switch (seleccióndificultad) {// selección del modo de juego para adaptar el numero de cartuchos y vidas de los jugadores 
                                case 1:
                                    System.out.println("-'Bueno okaaay como tu digas'");
                                    vidasjugador1=3;
                                    System.out.println("Se han confugrado las vidas del jugador a "+vidasjugador1+ " vidas");
                                    vidasmaquina=3;
                                    System.out.println("Se han confugrado las vidas de Maikel a " +vidasmaquina+" vidas");
                                    numerocartucho=5;
                                    System.out.println("Se ha configurado los cartuchos maximo dentro de la escopeta a "+numerocartucho);
                                    cartuchosminimos=3;
                                    System.out.println("Se ha configurado los cartuchos reales minimos dentro de la escopeta a "+cartuchosminimos);
                                    //cartuchosmaximos=5;
                                    //int[] cartuchos_escopeta_facil = {0,0,0,0,0};
                                    //int suma_cartuchos_facil = 0;  
                                        //do {
                                           // for (int i = 0; i < cartuchos_escopeta_facil.length; i++) {
                                            //cartuchos_escopeta_facil[i] = random.nextInt(2);
                                            //suma_cartuchos_facil += cartuchos_escopeta_facil[i];
                                            //}
                                        //}while(suma_cartuchos_facil < 3); 
                                     // juego completo para facil 
                                    System.out.println("-'Empiezas tu te doy esa ventaja'");
                                    System.out.println("-'Tienes que elegir a quien disparar'");
                                    System.out.println("-'Yo siempre te disparare a ti'");                                                 
                                    do{   // La opción al principio de cada turno para sellecionar a quien disparar                                                                
                                        System.out.println("-'A quien quieres disparar'");
                                        System.out.println("1.Dispararme a mi mismo (En caso de ser real la bala perderas vida)\n2.Disparar a Maikel");
                                        elecciónjugador=lector.nextInt();
                                        switch(elecciónjugador){
                                            case 1:// Tpdo esto esta comentado ya que no me ha funcionado y no queria que diera error por algo que no voy a usar 
                                                //if (cartuchos_escopeta_facil[0]==1){
                                                    //System.out.println("Puuuum");
                                                    //System.out.println("-'Pringado'");
                                                    //vidasjugador1=vidasjugador1--;
                                                    
                                                //}else{
                                                    
                                                   // System.out.println("CLick");
                                                   // System.out.println("-'Puuf menuda suerte'");
                                                  //  }
                                            case 2:
                                        }
                                    }while (vidasjugador1>0 & vidasmaquina>0);        
                                    break;
                                case 2 :
                                    System.out.println("-'Bueno okaaay como tu digas'");
                                    vidasjugador1=4;
                                    vidasmaquina=4;
                                    numerocartucho=7;                                    
                                    //int[] cartuchos_escopeta_medio = {0,0,0,0,0,0,0};
                                    //int suma_cartuchos_medio= 0;  
                                        //do {
                                           // for (int i = 0; i < cartuchos_escopeta_medio.length; i++) {
                                            //cartuchos_escopeta_medio[i] = random.nextInt(2);
                                           // suma_cartuchos_medio += cartuchos_escopeta_medio[i];
                                            //}
                                       // }while(suma_cartuchos_medio < 4);                                      
                                    // juego completo medio           
                                    break;
                                case 3 :
                                    System.out.println("-'Bueno okaaay como tu digas'");
                                    vidasjugador1=5;
                                    vidasmaquina=5;
                                    numerocartucho=10;
                                    //int tipocartuchodificil=(int)(Math.random()); 
                                    //Juego completo dificl           

                                    break;

                            
                            default:
                                System.out.println("-'Esa no era una opción idiota'");
                                break;
                            }
                        case 2://Todas estas opciones son para poner más jugadores en un futuro por ahora no funcionan 
                            System.out.println("-'Lo siento colega hoy no habra más invitados'");
                            break;                    
                        case 3:
                            System.out.println("-'Lo siento colega hoy no habra más invitados'");
                            break;                    
                        case 4:
                            System.out.println("-'Lo siento colega hoy no habra más invitados'");
                            break;                    
                        default:
                            System.out.println("-'No hay por que alargar lo inevitable elige una de las opciones'");
                            break;
                        }
                }while(dowhile2=true);
                
            case 4: // La opción de salir no funciona ya que se supone que estas encerrado en un sotano para que el jugador sienta un poco de realismo 
                System.out.println("-'Ya te gustaria "+Nombrejugador+" de aqui solo se sale ganando el juego, osea matandome'");
                break;
                
            default:
            System.out.println("-'Venga no me vaciles que con lo único que estas jugando es con tu vida'");
            break;
            }
        
        }while (dowhile=true);      
        lector.close();
    }

}
    
