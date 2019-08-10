import java.util.Stack;
public class SuperPila extends Stack <Integer> {
	Integer suma=0;
	public Integer push(Integer i) {
		this.suma+=i;
		return super.push(i);
	}
	public double getPromedio() {
		return this.suma/this.size();
	}
	public double getSuma() {
		return this.suma;
	}
}
