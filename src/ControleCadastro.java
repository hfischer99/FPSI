import java.util.ArrayList;

public class ControleCadastro {
	private ViewCadastro viewCadastro;
	private ArrayList<Carro> estoque;
	
	public ControleCadastro() {
		viewCadastro = new ViewCadastro();
		estoque = new ArrayList<>();
		trataMenu();
	}

	private void trataMenu() {
		boolean continuar = true;
		do {
			String opc = viewCadastro.mostraMenu();
			
			switch(opc) {
			case "1":
				 estoque.add(viewCadastro.inserir());
				break;
			case "2":
				viewCadastro.listar(estoque);
				break;
			case "3":
				viewCadastro.alterar(estoque);
				break;
			case "4":
				viewCadastro.excluir(estoque);
				break;
			case "5":
				viewCadastro.pesquisar(estoque);
				break;
			case "6":
				System.out.println("Voc� optou por sair do sistema! At� a pr�xima...");
				continuar = false;
				System.exit(0);
				break;
			default:
				System.out.println("OP��O INV�LIDA!!!!");
				break;
			}
		}while(continuar);
		
	}
	
}
