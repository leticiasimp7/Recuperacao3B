
public class EngenheiroEletrico extends Engenheiro{
	public String obterInformacoesFuncionario(){
		getCPF();
		getNome();
		return "Engenheiro Eletrico";
	}
}
