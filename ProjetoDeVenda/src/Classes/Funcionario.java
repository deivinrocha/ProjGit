package Classes;

public class Funcionario extends Pessoa{
	
	 String cargo;
	 double salario;	 
	 String departamento;
	 Data dataContratacao;
	 
	 public Funcionario(String nome,String cpf, Data dataN, String cargo, double salario, String departamento, Data dataContrata){
		 super(nome, dataN);
		 this.cargo = cargo;
		 this.salario = salario;
		 this.departamento = departamento;
		 this.dataContratacao = dataContrata;
	 }	

	public String getCargo(){
		 return cargo;
	 }
	 
	 public void setCargo(String cargo){
		 this.cargo = cargo;
	 }
	 
	 public double getSalario(){
		 return salario;
	 }
	 
	 public void setSalario(double salario){
		 this.salario = salario;
	 }
	 
	 public String getDepartamento(){
		 return departamento;
	 }
	 
	 public void setDepartamento(String departamento){
		 this.departamento = departamento;
	 }
	 
	 
	 
	 

}
