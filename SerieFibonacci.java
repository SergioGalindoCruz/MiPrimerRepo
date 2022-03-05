public class SerieFibonacci{
	//Serie Fibonacci
	int a;
	int b;
	int suma;
	public void SerieFibonacciMientras(int numero){
		a=0;
		b=1;
		while(a<=numero){
			suma = a+b;
			a = b;
			b = suma;
		}
		System.out.println(suma);
	}
//	public void factorialUtilizandoFor(int a){
//		resultado=1;
//		for(int i=1;i<=a;i++){
//			resultado=resultado*i;
//		}
//		System.out.println(resultado);
//	}
//	public int factorialUtilizandoRecursividad(int a){
//		if(a>1){
//			return a*factorialUtilizandoRecursividad(a-1);
//		}else{
//			return 1;
//		}
//	}
}