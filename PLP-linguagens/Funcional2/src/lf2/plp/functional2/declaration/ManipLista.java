package lf2.plp.functional2.declaration;

public class ManipLista {

    public boolean estaEmSequencia() {
        if (lista.size() <= 1) {
            return true;
        }

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) != i + lista.get(0)) {
                return false;
            }
        }
        
        return true;
    }

    public boolean temParidade() {
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i).equals(lista.get(i - 1))) {
                return true;
            }
        }
        return false;
    }

    public boolean contadorDeSimilares() {
        int count = 0;
        int tamanho = Math.min(lista1.size(), lista2.size());
        for (int i = 0; i < tamanho; i++) {
            if (lista1.get(i).equals(lista2.get(i))) {
                count++;
            }
        }
        return count;   
    }
}
