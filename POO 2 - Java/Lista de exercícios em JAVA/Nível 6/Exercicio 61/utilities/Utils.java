package utilities;

public class Utils {
	public static double REAJUSTE(double salario, double indice) {
        double reajuste = indice / 100.0;
        double salarioAtt = salario * (1 + reajuste);
        return salarioAtt;
    }
	

}
