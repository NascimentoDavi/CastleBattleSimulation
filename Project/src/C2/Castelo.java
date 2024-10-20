package C2;

public abstract class Castelo {

    private int defesa;
    private int pontosDeVida;
    private String nome;

    public Castelo(int defesa, int pontosDeVida, String nome) {
        this.defesa = defesa;
        this.pontosDeVida = pontosDeVida;
        this.nome = nome;
    }

    public int getDefesa ()
    {
        return this.defesa;
    }

    public int getPontosDeVida ()
    {
        return this.pontosDeVida;
    }

    public String getNome ()
    {
        return this.nome;
    }

    public void setDefesa (int defesa)
    {
        this.defesa = defesa;
    }

    public void setPontosDeVida (int pontosDeVida)
    {
        this.pontosDeVida = pontosDeVida;
    }

    public void setNome (String nome)
    {
        this.nome = nome;
    }

    public String situacao ()
    {
        return "Defesa: " + this.getDefesa() + "\nPontos de Vida: " + this.getPontosDeVida() + "\nNome: " + this.getNome();
    }
    
    public boolean ataque (int p) 
    {
        if ( this.getDefesa() > 0 )
        {
            this.setDefesa( this.getDefesa() - 1 );
            return true;

        } else 
        {
            if( this.getPontosDeVida() > 0 )
            {
                this.setPontosDeVida( this.getPontosDeVida() - 1 );
                this.setDefesa(2);
                return true;
            } else {
                return false;
            }
        }
    }

}
