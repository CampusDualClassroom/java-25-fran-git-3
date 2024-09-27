package com.campusdual.classroom;

import java.util.Stack;

public class Exercise25 {

    // Método que crea y devuelve una pila poblada
    public static Stack<String> createStack() {
        Stack<String> stack = new Stack<>();

        // Añadir elementos a la pila
        stack.push("Smith");
        stack.push("Montessori");
        stack.push("Peralta");
        stack.push("House");

        return stack;
    }

    // Método que imprime y vacía la pila
    public static void printAndEmptyStack(Stack<String> stack) {
        while (!stack.isEmpty()) {
            // Obtener y mostrar el primer elemento
            String element = stack.pop(); // pop() devuelve y elimina el primer elemento de la pila
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Crear y poblar la pila
        Stack<String> myStack = createStack();

        // Imprimir y vaciar la pila
        printAndEmptyStack(myStack);
    }
}
