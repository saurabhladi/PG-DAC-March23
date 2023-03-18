class GrossSalary
{
	static public void main(String args[])
	
	{
		double Basic= 10000.8989009;
		double TA = 5600.6778;
		double DA = 0.14 * Basic;
		double PetrolAllow = 7000.3443534546;
		double TaxDeduction = 0.1075* DA;
        double Gross = (Basic + TA + DA + PetrolAllow - TaxDeduction )	;
		
		System.out.println("Gross Salary = " + Gross);
	}
}