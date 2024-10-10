/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_pactico1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Ejercicio_Pactico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numEmpleados = 0; //Cantidad de empleados por consultar
        double Salario = 0; //Salario por calcular monto
        double controladorSalarioSEM = 0; //variable que contendrá el monto del SEM actual
        double controladorSalarioIVM = 0;//variable que contendrá el monto del IVM actual
        double totalDebido = 0.00; //Variable que almacenará la suma de los SEM e IVM
        numEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de empleados: ")); //Solicita la cantida de empleados por ingresar salario
        for(int i = 1; i <= numEmpleados; i++){ //Por cada empleado en numEmpleados se repetirá la acción
            Salario = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el salario del " + i + "° empleado: ")); //Solicita el salario del empleado actual
            controladorSalarioSEM = Salario * 0.0508; //Tomará el 5.09% del salario del empleado actual
            controladorSalarioIVM = Salario * 0.0925; //Tomará el 9.25% del salario del empleado actual
            totalDebido = totalDebido + (controladorSalarioIVM + controladorSalarioSEM); //Suma al total por pagar lo almacenado actualmente en controladorSalarioSEM y controladorSalarioIVM
        }
        JOptionPane.showMessageDialog(null, "La empresa debera abonar a la CCSS el monto de: ₡" + totalDebido + " por concepto de SEM e IVM."); //Muestra el total sumado al usuario
    }
    
}
