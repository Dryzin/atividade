package javassortaula;

public class Search {
    private long contaComparacoes;

    public long getContaComparacoes() {
        return contaComparacoes;
    }
    
    public int linearSearch(Integer[] v, Integer x){
        this.contaComparacoes=0;
        for(int i=0; i<v.length; i++)
            if(x==v[i])
                return i;
        return -1;
    }
    
    public int binarySearch(Integer [] v, Integer x){
        int inicio = 0, fim = v.length-1;
        this.contaComparacoes=0;
        while(inicio<=fim){
            int meio = (inicio+fim)/2;
            if(x==v[meio])
                return meio;
            else
                if(x<v[meio])
                    fim = meio-1;
                else
                    if(x>v[meio])
                        inicio = meio+1;
        }//fimm while
        return -1;
        
    }
}
