public class LollipopFactory {
	public IProduct.ILollipop makeNemoLollipop() {
		return new Nemo();
	}

	public IProduct.ILollipop makeCleoLollipop() {
		return new Cleo();
	}

	public IProduct.ILollipop makeBlinkyLollipop() {
		return new Blinky();
	}

}
