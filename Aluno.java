public class Aluno{
    private String nome;
    private double media;
    private int numFaltas;
    private int numAulas;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }


    public double getMedia(){
        return media;
    }
    public void setMedia(double media){
        this.media = media;
    }


    public int getNumFaltas(){
        return numFaltas;
    }
    public void setNumFaltas(int numFaltas){
        this.numFaltas = numFaltas;
    }


    public int getNumAulas(){
        return numAulas;
    }
    public void setNumAulas (int numAulas){
        this.numAulas = numAulas;
    }


    public Aluno(){

    }
    public void cadastrar(String nome){
        this.nome = nome;
    }

    public boolean verificaSituacao(){
        if ((media < 5) || (numFaltas > 25)){
        return false; 
    }
    else if ((media >=5) && (numFaltas < 25)){
    return true;
}
    else
    return true; 
}}
