public class Main {

	public static void main(String[] args){
		Coche miCoche = new Coche();
		miCoche.AñadirPuertas();
		System.out.println(miCoche.puertas);
	}

	class Coche {
		public int puertas = 1;

		public void AgregarPuertas(){
			this.puertas+;
		}
	}