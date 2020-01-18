public class ValueGenerator {
    static int vetor[];

    public static boolean pertence(int valor, int tam) {
        for (int i = 0; i < tam; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        vetor = new int[Integer.parseInt(args[0])];
        // System.out.println("Build a vector of size " + vetor.length);

        int valor, pos;
        // gerei valotres aleatorios
        // pos = 0;
        for (pos = 0; pos < vetor.length; pos++) {
            do {
                valor = (int) (Math.random() * 100000) % 100000;
            } while (pertence(valor, pos));
            // System.out.println("Valor gerado = " + valor);
            vetor[pos] = valor;
        }
        // print estes caras
        for (pos = 0; pos < vetor.length; pos++) {
            System.out.println(vetor[pos]);
        }
    }
}