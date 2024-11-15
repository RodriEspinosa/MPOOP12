/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

/**
 *
 * @author poo03alu20
 */
public class POOP12 {
    // Método principal del programa
    public static void main(String[] args) {
        /*
        // Crea y ejecuta múltiples hilos usando la clase Hilo (Threads)
        // Crear e iniciar los hilos con prioridad por defecto
        Hilo h1 = new Hilo("Hilo1");
        Hilo h2 = new Hilo("Hilo2");
        Hilo h3 = new Hilo("Hilo3");

        System.out.println("Ejecutando los hilos con la prioridad por defecto");
        h1.start();
        h2.start();
        h3.start();

        // Esperar a que los hilos terminen
        try {
            h1.join();
            h2.join();
            h3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Crear nuevas instancias de los hilos y asignarles nuevas prioridades
        h1 = new Hilo("Hilo1");
        h2 = new Hilo("Hilo2");
        h3 = new Hilo("Hilo3");

        h1.setPriority(Thread.MAX_PRIORITY);
        h2.setPriority(Thread.NORM_PRIORITY);
        h3.setPriority(Thread.MIN_PRIORITY);

        // Iniciar los hilos nuevamente con las nuevas prioridades
        System.out.println("Ejecutando hilos con prioridades modificadas:");
        h1.start();
        h2.start();
        h3.start();
        */
        /*
        // Crea e inicia hilos usando la clase HiloR implementada con Runnable
        new Thread(new HiloR(), "HiloR1").start();   // Crea e inicia un hilo con HiloR y el nombre "HiloR1"
        new Thread(new HiloR(), "HiloR2").start();   // Crea e inicia un hilo con HiloR y el nombre "HiloR2"
        new Thread(new HiloR(), "HiloR3").start();   // Crea e inicia un hilo con HiloR y el nombre "HiloR3"
        */
        
        //Metodo sincronizado
        // Crea una instancia del recurso compartido que será usada por todos los hilos
        Sincronizado recurso = new Sincronizado();

        // Crea varios hilos (instancias de Thread) que comparten el mismo recurso
        Thread hilo1 = new Thread(() -> new HiloS(recurso).run(), "Hilo1");
        Thread hilo2 = new Thread(() -> new HiloS(recurso).run(), "Hilo2");
        Thread hilo3 = new Thread(() -> new HiloS(recurso).run(), "Hilo3");

        // Inicia los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }  // Fin del método main
}  // Fin de la clase POOP12