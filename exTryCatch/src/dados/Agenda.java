package dados;
import java.util.ArrayList;

public class Agenda implements Iterador{
    private int posicaoAtual;
    private ArrayList<Pessoa> colecao;

    public Agenda(){
        colecao = new ArrayList<>();
    }

    @Override
    public void reset(){
        this.posicaoAtual = -1;
    }

    @Override
    public boolean hasNext(){
        if(colecao.get(posicaoAtual) != null){
            return true;
        }
        return false;
    }

    @Override
    public Object next(){
        return colecao.get(posicaoAtual+1);
    }

    public boolean addPessoa(Pessoa p){
        if(colecao.add(p)){
            this.posicaoAtual++;
        }
        return false;
    }


}
