import java.util.ArrayList;

public class SuperLista extends ArrayList<Integer>{
	public boolean add(Integer i) {
		System.out.println("Agregando "+i);
		return super.add(i);
	}
	public void Imprimir() {
		for(Integer a:this) {
			System.out.println(a);
		}
	}
	public double CalcularPromedio() {
		double prom=0;
		for(Integer i : this) {
			prom+=i;
		}
		prom=prom/size();
		return prom;
	}
	
}
