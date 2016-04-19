package Classes;



public class Data {
	
	public int dia, mes, ano;
	
	public Data(int dia, int mes, int ano){
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	public Data(String data){
		//dd/mm/aaaa
		String  date[] = data.split("/");
		this.dia = Integer.parseInt(date[0]);
		this.mes = Integer.parseInt(date[1]);
		this.ano = Integer.parseInt(date[2]);
		
	}

}