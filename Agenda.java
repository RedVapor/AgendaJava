import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<Contato> contatos = new ArrayList<>();

    ////
    public void adicionarContato(Contato newContato) {
        contatos.add(newContato);
    }

    public void removerContato(int index) {
        contatos.remove(index);
    }

    public void buscarPorNome(String query) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equals(query)) {
                System.out.println(contatos.get(i).toString());
            }
        }
    }

    public void listarTodos() {
        for (int i = 0; i < contatos.size(); i++) {
            System.out.println("CONTATO NÚMERO " + i);
            System.out.println(contatos.get(i).toString());
            System.out.print("\n");
        }
    }

    public void editarContato(int index, Contato contato) {
        contatos.set(index, contato);
    }
}
