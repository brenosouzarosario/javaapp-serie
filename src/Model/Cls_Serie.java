package Model;

public class Cls_Serie {

    String resultado = "";

    public String calcularSerie(String tipoSerie, int numero) {
        switch (tipoSerie) {
            case "2": {
                for (int ct = numero; ct <= 30; ct = ct + 2) {
                    resultado = resultado + String.valueOf(ct) + "/";
                }
                break;
            }
            case "3": {
                for (int ct = numero; ct <= 30; ct = ct + 3) {
                    resultado = resultado + String.valueOf(ct) + "/";
                }
                break;
            }
            case "F": {
                int aux = 0;//anterior
                int ct = 0;//proximo
                //numero é o atual
                while (ct <= 30) {
                    ct = aux + numero;//ct é o proximo, recebe o anterior mais o atual
                    numero = aux;//atual recebe o anterior
                    aux = ct;//anterior recebe o proximo, pois o valor do proximo mudará na proxima rodada
                    if (ct <= 30) {
                        resultado = resultado + String.valueOf(ct) + "/";
                    }
                }
                break;
            }
        }
        return resultado;
    }
}
