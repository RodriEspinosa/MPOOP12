/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author Dell S
 */
public class Sincronizado {
    // Método sincronizado que se llamará desde múltiples hilos
    public synchronized void metodoSincronizado(String nombreHilo) {
        // Bucle de ejemplo que representa el trabajo en el método sincronizado
        for (int i = 0; i < 5; i++) {
            // Imprime el número de iteración y el nombre del hilo que está ejecutando este método
            System.out.println("Hilo " + nombreHilo + " ejecutando metodo sincronizado, iteracion " + i);
            try {
                // Simula un pequeño retraso para observar mejor la sincronización
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Mensaje indicando que el hilo ha terminado de ejecutar el método sincronizado
        System.out.println("Hilo " + nombreHilo + " terminó de ejecutar el método sincronizado");
    }
}
