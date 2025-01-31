public class ContaBanco {
    //atributos
    public int numConta;
    protected String tipo;
    private String pessoa;
    private double saldo;
    private boolean status;

    //metodos personalizados
    public void estadoAtual(){
        System.out.println("---------------------------");
        System.out.println("conta" +this.getNumConta());
        System.out.println("conta" +this.getTipo());
        System.out.println("conta" +this.getPessoa());
        System.out.println("conta" +this.getSaldo());
        System.out.println("stauts" +this.getStatus());
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC"){
            this.setSaldo(50); //pelo metodo
        }else if(t == "CP"){
            this.setSaldo(150);
        }
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("conta não pode ser fechada pois ainda tem saldo");
        }else if (this.getSaldo() < 0){
            System.out.println("conta não pode ser fechada pois está negativada");
        } else {
            this.setStatus(false);
            System.out.println("conta fechada com sucesso!");
        }
    }
    public void depositar(float v){
        //if(this.status == true) abreviado
        if (this.getStatus()){
            //this.saldo = this.saldo + v; //mexendo direto nos atributos XX
            this.setSaldo(this.getSaldo() + v );
            System.out.println("deposito realizado na conta de "+this.getPessoa());
        }else {
            System.out.println("impossivel depositar numa conta fechada");
        }
    }
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("saque realizado com sucesso na conta de "+this.getPessoa());
            } else{
                System.out.println("saldo insuficiente para saque");
            }
        } else{ //verifica se a conta esta fechada else da conta fechada ou aberta
            System.out.println("impossivel sacar de uma conta fechada");
        }
    }
    public void pagarMensal(){

    }
    //metodos especiais get set e construtor

    public ContaBanco(){
        this.saldo=0;
        this.status=false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
