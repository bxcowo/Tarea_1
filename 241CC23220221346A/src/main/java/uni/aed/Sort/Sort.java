package uni.aed.Sort;

public class Sort {
    private Integer[] Y;
    private int nComp = 0, nInt = 0;
    private long tEjec = 0;

    public Sort() {
    }
    
    public Sort(Integer[] Y) {
        this.Y = Y;
    }

    public void setY(Integer[] Y) {
        this.Y = Y;
    }

    public void setnComp(int nComp) {
        this.nComp = nComp;
    }

    public void setnInt(int nInt) {
        this.nInt = nInt;
    }

    public void settEjec(long tEjec) {
        this.tEjec = tEjec;
    }

    public Integer[] getY() {
        return Y;
    }

    public int getnComp() {
        return nComp;
    }

    public int getnInt() {
        return nInt;
    }

    public long gettEjec() {
        return tEjec;
    }

    @Override
    public String toString() {
        String result = "";
        clear();
        for(Integer y : getY()){
            result = result.concat(y + " ");
        }
        return result;
    }
    
    public Integer[] Insertion_Sort(){
        clear();
        Integer[] X = getY().clone();
        int aux, k;
        boolean swapped;
        clear();
        long tIni = System.nanoTime();
        for(int i = 1; i < X.length; ++i){
            aux = X[i];
            k = i - 1;
            swapped = false;
            while(!swapped && k >= 0){
                ++nComp;
                if(aux < X[k]){
                    ++nInt;
                    X[k+1] = X[k];
                    --k;
                }else{
                    swapped = true;
                }
            }
            X[k+1] = aux;
        }
        long tFin = System.nanoTime();
        setnComp(nComp);
        setnInt(nInt);
        settEjec(tFin - tIni);
        return X;
    }
    
    public Integer[] Selection_Wu_Sort(){
        clear();
        Integer[] X = getY().clone();
        long tIni = System.nanoTime();
        int startIndex, minIndex, length, temp;
        length = X.length;
        for(startIndex = 0; startIndex <= length - 2; ++startIndex){
            minIndex = startIndex;
            for(int i = startIndex + 1; i <= length - 1; ++i){
                ++nComp;
                if(X[i] < X[minIndex]) minIndex = i;
            }
            ++nInt;
            temp = X[startIndex];
            X[startIndex] = X[minIndex];
            X[minIndex] = temp;
        }
        long tFin = System.nanoTime();
        setnComp(nComp);
        setnInt(nInt);
        settEjec(tFin - tIni);
        return X;
    }
    
    public Integer[] Bubble_Sort(){
        clear();
        Integer[] X = getY().clone();
        long tIni = System.nanoTime();
        int temp, bottom;
        boolean exchanged = true;
        bottom = X.length - 2;
        while(exchanged){
            exchanged = false;
            for(int i = 0; i <= bottom; ++i){
                ++nComp;
                if(X[i] > X[i+1]){
                    ++nInt;
                    temp = X[i];
                    X[i] = X[i+1];
                    X[i+1] = temp;
                    exchanged = true;
                }
            }
            --bottom;
        }
        long tFin = System.nanoTime();
        setnComp(nComp);
        setnInt(nInt);
        settEjec(tFin - tIni);
        return X;
    }
    
    private void clear(){
        setnComp(0);
        setnInt(0);
        settEjec(0);
    }
}
