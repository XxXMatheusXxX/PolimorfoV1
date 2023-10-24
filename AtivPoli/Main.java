package AtivPoli;



public class Main {
	public static void main(String[] args) {
		
	Horista horista = new Horista (100,"Thor", "M",200, "Qualquer");
	System.out.println(horista.getId());
	System.out.println(horista.getMatricula());
	System.out.println(horista.getEndereco());
	System.out.println(horista.getNome());
	System.out.println(horista.getTelefone());
	System.out.println(horista.calculaSalario(2,2));
	
}
}