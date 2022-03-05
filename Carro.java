public class Carro{
	int kilometraje = 0 ;
	public void avanzar(int a){
		if(a>0){
		kilometraje=kilometraje+a;
	}else{
		System.out.println("no se puede sumar kilometros negativos");
	}
	}
	public int obtenerKilometraje(){
		return kilometraje;
	}

}