package application;

public class RandomGenerators 
{
	Integer randomGenerator(Integer randomNumberRange)
	{
		//randomNumber = 0.-1. * randomNumberRange
		return  (int) (Math.random() *randomNumberRange);
	}
}
