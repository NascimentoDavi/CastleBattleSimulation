package C2;

public class Japones extends Castelo {
    private int numSamurai;

    public Japones (int defesa, int pontosDeVida, String nome, int numSamurai)
    {
        super(defesa, pontosDeVida, nome);
        this.numSamurai = numSamurai;
    }

    public int getNumSamurai ()
    {
        return this.numSamurai;
    }

    public void setNumSamurai (int numSamurai)
    {
        this.numSamurai = numSamurai;
    }

    @Override
    public boolean ataque (int d)
    {
        this.setNumSamurai(this.getNumSamurai() - d );
        if ( this.getNumSamurai() < 0 )
        {
            if( super.ataque(d) )
            {
                this.setNumSamurai( this.getNumSamurai() + 15 );
                return true;
            } else
            {
                return false;
            }
        } else {
            return true;
        }
    }

    // Sobrescrevendo o método situacao da classe pai
    @Override
    public String situacao() {
        return super.situacao() + "\nQuantidade de Samurais: " + this.getNumSamurai();
    }
    
}
