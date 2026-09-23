class Guerreiro extends Personagem {

    private int defesa;

    public Guerreiro(String nomePersonagem, int vidaPersonagem, int nivelPersonagem, int forcaPersonagem) {

        super(nomePersonagem, vidaPersonagem, nivelPersonagem, forcaPersonagem);

        defesa = 5;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        if (defesa < 0) {
            throw new IllegalArgumentException("Defesa não pode ser negativa.");
        } else {
            this.defesa = defesa;
        }
    }

    @Override
    public void receberDano(int dano) {

        int danoEfetivo = Math.max(0, dano - defesa);

        super.receberDano(danoEfetivo);
    }

    @Override
    public void ficha() {
        super.ficha();
        System.out.println("Defesa: " + getDefesa());
    }

    @Override 
    public String habilidade() throws ForcaInsuficienteException{
        if (getForca() < 10) {
           throw new ForcaInsuficienteException("Força insuficiente!");
        }
           return "Escudo de aço";
    }
    public void usarhabilidade(){
        try{
            System.out.println(habilidade());
        } catch (ForcaInsuficienteException e){
            System.out.println(e.getMessage());
        }
    }
}