import java.sql.SQLOutput;

public class Savings_account extends Account {
    protected boolean status;

    public Savings_account(float balance, float annualRate) {
        super(balance, annualRate);
        if (balance >= 10000) {
            status = true;
        } else {
            status = false;
        }
    }

    @Override
    public void consign(float amount) {
        if (status) {
            super.consign(amount);
        }else {
            System.out.println("Cuenta inactiva, no puede realizar este movimiento");
        }
    }
    @Override
    public void withdraw(float amount) {
        if (status){
            super.withdraw(amount);
        }else {
            System.out.println("Cuenta inactiva, no puede realizar este movimiento");
        }
    }

    @Override
    public void monthlyStatement() {
        if(numberWithdrawals > 4){
            monthlyCommission = (numberWithdrawals - 4) * 1000;
        }
        super.monthlyStatement();
        if(balance < 10000){
            status = false;
        }
        System.out.println("Retiros realizados:"+numberWithdrawals);
        if (status){
            System.out.println("Estado de cuenta: Activo");
        }else {
            System.out.println("Estado de cuenta: Inactiva");
        }
    }
    public void status(){
        System.out.println("Balance:$ "+balance);
        System.out.println("Comision:$ "+this.monthlyCommission);
        System.out.println("Movimientos:"+(numberWithdrawals+numberConsignments));
    }
}
