class Temperature
{
	static public void main (String args [])
	{
		double tempC = 32.50;
		double tempF = (tempC * 1.8) + 32.0;
	
		System.out.println("Temperature in Fahrenhiet = " + tempF );
		
		
		tempC = (tempF - 32) * 0.56;
		
		System.out.println("Temperature in Celcious = " + tempC );
		
	}
}