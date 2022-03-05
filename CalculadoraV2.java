public class CalculadoraV2{
	// Factorial de un numero.
	int contador;
	int resultado;
	public void factorialUtilizandoMientras(int a){
		contador=1;
		resultado=1;
		while(contador<=a){
			resultado=resultado*a;
			a=a-1;
		}
		System.out.println(resultado);
	}
	public void factorialUtilizandoFor(int a){
		resultado=1;
		for(int i=1;i<=a;i++){
			resultado=resultado*i;
		}
		System.out.println(resultado);
	}
	public int factorialUtilizandoRecursividad(int a){
		if(a>1){
			return a*factorialUtilizandoRecursividad(a-1);
		}else{
			return 1;
		}
	}
}