import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float in_balance, in_rate, add_bal,withdraw;
        int opc = 0;
        System.out.println("Bienvenido! Ingrese lo siguientes datos.\n");
        System.out.println("Balance inicial de la cuenta:\n");
        in_balance = sc.nextFloat();
        System.out.println("Tasa anual:\n");
        in_rate = sc.nextFloat();
        Savings_account account = new Savings_account(in_balance,in_rate);
        while (opc != 5){
            System.out.println("¿Que transaccion desea realizar?\n1.Consignar\n2.Retirar\n3.Extracto\n4.Resumen\n5.Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    while (true){
                        System.out.println("Ingrese el monto\n");
                        add_bal = sc.nextFloat();
                        if (add_bal < 0){
                            System.out.println("No puede ingresar valores negativos! \n");
                        }else {
                            account.consign(add_bal);
                            System.out.println("Ingreso exitoso.");
                            break;
                        }
                    }
                    break;
                case 2:
                    while (true){
                        System.out.println("Ingrese el monto\n");
                        withdraw = sc.nextFloat();
                        if (withdraw < 0){
                            System.out.println("No puede retirar montos negativos!");
                        }else{
                            account.withdraw(withdraw);
                            break;
                        }
                    }
                    break;
                case 3:
                    account.monthlyStatement();
                    break;
                case 4:
                    account.status();
                    break;
                case 5:
                    System.out.println("Gracias por utilizar este sistema");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }
    }
}