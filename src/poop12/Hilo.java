/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author poo03alu20
 */
// Definición de la clase Hilo que extiende la clase Thread para crear un hilo
public class Hilo extends Thread {

    // Constructor de la clase Hilo que recibe el nombre del hilo
    public Hilo(String name) {
        // Llama al constructor de la clase padre (Thread) y le pasa el nombre del hilo
        super(name);
    }
    // Sobrescribe el método run(), que define el código que ejecutará el hilo
    @Override
    public void run() {
        // Bucle para realizar 10 iteraciones
        for (int i = 0; i < 10; i++) {
            // Imprime el número de iteración y el nombre del hilo usando getName()
            System.out.println("Iteracion " + i + " hilo " + getName());
        }
        // Imprime un mensaje indicando que el hilo ha terminado
        System.out.println("Termina " + getName());
    }
    
}
