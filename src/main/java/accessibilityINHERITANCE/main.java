/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accessibilityINHERITANCE;

/**
 *
 * @author EXA
 */
// Parent class dengan 4 modifier akses yang berbeda
class Parent {
    public void publicMethod() {
        System.out.println("Ini adalah public method dari parent class.");
    }

    protected void protectedMethod() {
        System.out.println("Ini adalah protected method dari parent class.");
    }

    void defaultMethod() {
        System.out.println("Ini adalah default method dari parent class.");
    }

    private void privateMethod() {
        System.out.println("Ini adalah private method dari parent class.");
    }
}

// Child class yang melakukan method overriding
class Child extends Parent {
    @Override
    public void publicMethod() {
        System.out.println("Ini adalah public method yang di-overriding di child class.");
    }

    @Override
    protected void protectedMethod() {
        System.out.println("Ini adalah protected method yang di-overriding di child class.");
    }

    @Override
    void defaultMethod() {
        System.out.println("Ini adalah default method yang di-overriding di child class.");
    }

    // Tidak bisa melakukan overriding pada private method
    // Karena private method hanya dapat diakses di dalam parent class
}

// Contoh penggunaan kelas
public class main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.publicMethod();       // Output: Ini adalah public method dari parent class.
        parent.protectedMethod();    // Output: Ini adalah protected method dari parent class.
        parent.defaultMethod();      // Output: Ini adalah default method dari parent class.

                System.out.println("=========================================================");

        
        Child child = new Child();
        child.publicMethod();        // Output: Ini adalah public method yang di-overriding di child class.
        child.protectedMethod();     // Output: Ini adalah protected method yang di-overriding di child class.
        child.defaultMethod();       // Output: Ini adalah default method yang di-overriding di child class.
    }
}
