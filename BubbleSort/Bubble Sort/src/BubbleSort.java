public class BubbleSort {

    int[] numeros = {70,180,69,0,7,10};

    public static void main(String[] args) {
        
        BubbleSort bs = new BubbleSort();
        bs.sort();
        

    }

    public void sort(){
        int n;
        int tamanho = numeros.length;

        for(int i= 0;i < tamanho;i++){
            for(int j=0;j < tamanho - i - 1;j++){
                if(numeros[j] > numeros[j+1]){
                    n = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = n;
                }
                  }
                    }
        for(int x = 0;x < tamanho;x++){
            System.out.print(numeros[x]+", ");
        }

    }
}
