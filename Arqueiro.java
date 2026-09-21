class Arqueiro extends Personagem {

    private int flecha;

    public Arqueiro(String nomePersonagem, int vidaPersonagem, int nivelPersonagem, int forcaPersonagem) {

        super(nomePersonagem, vidaPersonagem, forcaPersonagem, nivelPersonagem);

        flecha = 15;
    }
    @Override 
    public String habilidade(){
        return "Atirar flechas";
    }
    public int getFlecha() {
        return flecha;
    }

    public void setFlecha(int flecha) {
        if (flecha >= 0) {
            this.flecha = flecha;
        } else {
            System.out.println("Flecha não pode ser negativa.");
        }
    }

    @Override
    public void ficha() throws SemFlechaException{ 
        super.ficha();
        System.out.println("Flecha: " + getFlecha());
    }
}