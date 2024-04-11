public class current_account extends Account{
    protected float overdraft = 0;
    protected float mod_ammount;
    public current_account(float balance, float annualRate) {
        super(balance, annualRate);
    }

    @Override
    public void consign(float amount) {
        if (overdraft >0){
            mod_ammount = amount - overdraft;
            if (mod_ammount > 0){
                overdraft = 0;
                super.consign(mod_ammount);
            }else {
                overdraft -= amount;
            }
        }else {
            super.consign(amount);
        }
    }

    @Override
    public void withdraw(float amount) {
        if (amount>balance){
            overdraft += (amount-balance);
            super.withdraw(balance);
        }else {
            super.withdraw(amount);
        }
    }

    @Override
    public void monthlyStatement() {
        super.monthlyStatement();
        System.out.println("Datos mensuales actualizados");
    }
    public void status(){
        System.out.println("Balance:$ "+balance);
        System.out.println("Comision:$ "+this.monthlyCommission);
        System.out.println("Movimientos:"+(numberWithdrawals+numberConsignments));
        System.out.println("Sobregiro:$ "+this.overdraft);
    }
}
