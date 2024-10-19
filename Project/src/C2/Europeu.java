package C2;

public class Europeu extends Castelo {
    private int numPaladino;

    public Europeu (int defesa, int pontosDeVida, String nome, int numPaladino)
    {
        super(defesa, pontosDeVida, nome);
        this.numPaladino = numPaladino;
    }

    public int getNumPaladino ()
    {
        return this.numPaladino;
    }

    public void setNumPaladino (int numPaladino)
    {
        this.numPaladino = numPaladino;
    }

    @Override
    public boolean ataque (int d)
    {
        this.setNumPaladino( this.getNumPaladino() - d );
        if ( this.getNumPaladino() < 0 )
        {
            if( super.ataque(d) )
            {
                this.setNumPaladino( this.getNumPaladino() + 10 );
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
        return super.situacao() + "\nQuantidade de Paladinos: " + this.getNumPaladino();
    }
    
}   
