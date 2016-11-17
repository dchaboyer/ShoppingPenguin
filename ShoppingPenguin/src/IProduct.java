public interface IProduct {

	public String getName();

	public double getCost();

	public void setName(String inputName);

	public void setCost(double inputCost);
	
	public interface ILollipop extends IProduct{
		public String getColour();
		public void setColour(String colour);
	}
	
	public interface ISong extends IProduct{
		public String getGenre();
		public void setGenre(String input);
		
	}
}

