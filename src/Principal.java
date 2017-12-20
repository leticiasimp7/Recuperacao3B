
public class Principal {

	public static void main(String[] args) {
	OperadorMaquina om= new OperadorMaquina();
	om.setNome("Joao");
	om.setAnoInicio(1999);
	om.setCPF(443767344);
	om.setHorario("07:00");
	
	Gerente g= new Gerente();
	g.setNome("Gabriel");
	g.setAnoInicio(1988);
	g.setCPF(9874757);
	g.setHorario("14:00");
	

	om.obterInformacoesFuncionario();
	om.temInsalubridade();
	
	g.obterInformacoesFuncionario();
	g.temInsalubridade();
	
	
	
	}

}
