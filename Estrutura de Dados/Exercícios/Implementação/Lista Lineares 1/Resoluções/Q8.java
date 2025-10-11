package Resoluções;

public class Q8 {
    public static int pegarSanduiche(int[] alunos, int[] sanduiches) {
        int indiceSanduiche = 0;
        int numAlunos = alunos.length;
        int recusasSeguidas = 0;

        while (numAlunos > 0 && indiceSanduiche < sanduiches.length) {
            if (alunos[0] == sanduiches[indiceSanduiche]) {
                for (int i = 0; i < numAlunos - 1; i++) {
                    alunos[i] = alunos[i + 1];
                }
                numAlunos--;
                indiceSanduiche++;
                recusasSeguidas = 0;
            }

            else {
                int primeiro = alunos[0];
                for (int i = 0; i < numAlunos - 1; i++) {
                    alunos[i] = alunos[i + 1];
                }
                alunos[numAlunos - 1] = primeiro;
                recusasSeguidas++;

                if (recusasSeguidas == numAlunos) {
                    break;
                }
            }
        }

        return numAlunos;

    }

    public static void main(String[] args) {
        int[] alunos = { 1, 1, 0, 0 };
        int[] sanduiches = { 0, 1, 0, 1 };

        int resultado = pegarSanduiche(alunos, sanduiches);
        System.out.println("Alunos que não conseguiram comer: " + resultado);

    }
}
