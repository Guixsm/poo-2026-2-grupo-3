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
        if (defesa >= 0) {
            this.defesa = defesa;
        } else {
            System.out.println("Defesa não pode ser negativa.");
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
        return "Escudo de aço";
    }
}