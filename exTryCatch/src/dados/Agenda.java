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
        this.posicaoAtual = 0;
    }

    @Override
    public boolean hasNext(){
        if(colecao.get(posicaoAtual+1) != null){
            return true;
        }
        return false;
    }

    @Override
    public Object next(){
        posicaoAtual++;
        return colecao.get(posicaoAtual-1);
    }

    public boolean addPessoa(Pessoa p){
        return colecao.add(p);
    }


}
