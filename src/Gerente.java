
public class Gerente implements Funcionario{

	private String nome;
	private String horario;
	private int CPF;
	private int anoInicio;
	
	public String getNome() {
		return nome;
	}
	
	public String obterInformacoesFuncionario(){
		getCPF();	
		System.out.println("Operador de Maquina");
		return this.nome;			
	}
	
	public boolean temInsalubridade(){
		return false;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public int getAnoInicio() {
		return anoInicio;
	}
	public void setAnoInicio(int anoInicio) {
		this.anoInicio = anoInicio;
	}
	
	public void Status(){
		System.out.println(getNome());
		System.out.println(getCPF());
		System.out.println(getAnoInicio());
		System.out.println(getHorario());
	}
	

}
