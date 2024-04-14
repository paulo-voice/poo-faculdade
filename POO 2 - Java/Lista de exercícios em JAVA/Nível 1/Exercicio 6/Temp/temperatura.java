package Temp;

public class temperatura {
	double fahrenheit=0;
	double celsius=0;
	
	public double conversao_Temp(double celsius) {
		fahrenheit=(9*celsius+160)/5;
		return fahrenheit;
	}

}
