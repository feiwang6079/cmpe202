package lab6;

public interface PriceDecorator {
	void wrapDecorator( PriceDecorator w );
    double getPrice();
}
