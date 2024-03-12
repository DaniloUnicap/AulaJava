import java.util.ArrayList;

public class CadastroCarro {
    private ArrayList<Carro> carros;

    public CadastroCarro() {
        carros =new ArrayList<>();
    }

    public void inserir (Carro carro) {
        carros.add(carro);
    }

    public Carro consultarCarro (String placa) {
        for (int i = 0; i < carros.size(); i++) {
            if (placa == carros.get(i).getPlaca()) {
                return carros.get(i);
            }
        }
            return null;
    }
    public void ListarCarros() {
        for (int i = 0; i < carros.size(); i++) {
            carros.get(i).exibirInfoCarro();
        }
    }

    public boolean removerCarro (String placa) {
        Carro c1 = consultarCarro(placa);
        if (c1 == null) {
            return false;
        }
        
        carros.remove(c1);
        return true;
    }
}

