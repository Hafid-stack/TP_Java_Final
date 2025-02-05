package Application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();


do {

manager.options();

switch (manager.getOptionSelected()){
    case 1: manager.AddEmployee();
    break;
    case 2: manager.UpdateEmployee();
    break;
    case 3: manager.DeleteEmployee();
    break;
    case 4: manager.DisplayEmployees();
    break;
}

}
while ( true);
    }
}