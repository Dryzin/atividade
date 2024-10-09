package javassortaula;

import java.util.Comparator;

public class BubbleSort<T> {
    private long contaCompacaoes;
     void troca(T[] v, int i, int j){
        T temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }

    public long getContaCompacaoes() {
        return contaCompacaoes;
    }
     
     
    public T[] sort(T v[], Comparator<T> comparador){
        int n = v.length;
        this.contaCompacaoes=0;
        for(int fase=1;fase<n;fase++)
            for(int j=0;j<n-fase;j++){
                this.contaCompacaoes++;
                if(comparador.compare(v[j], v[j+1])>0)
                    troca(v,j,j+1);
        }
        return v;
    }
    
}
