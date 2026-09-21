class Mago extends Personagem {

    private int mana;

    public Mago(String nomePersonagem, int vidaPersonagem, int nivelPersonagem, int forcaPersonagem) {

        super(nomePersonagem, vidaPersonagem, forcaPersonagem, nivelPersonagem);

        mana = 50;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana >= 0) {
            this.mana = mana;
        } else {
            System.out.println("Mana não pode ser negativa.");
        }
    }

    @Override
    public void ficha() {
        super.ficha();
        System.out.println("Mana: " + getMana());
    }

    @Override 
    public String habilidade() throws SemManaException{
        return "Feitiço arcano";
    }
}