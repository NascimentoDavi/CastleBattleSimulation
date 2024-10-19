package C2;

public abstract class Castelo {

    private int defesa;
    private int pontosDeVida;
    private String nome;

    public Castelo() {

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

    public abstract String situacao ();
    public abstract boolean ataque (int p);

}
