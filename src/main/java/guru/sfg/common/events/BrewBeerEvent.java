package guru.sfg.common.events;


/**
 * Created by jt on 2019-07-21.
 */
public class BrewBeerEvent extends BeerEvent {

    public BrewBeerEvent() {
        super(new BeerDto());
    }

    public BrewBeerEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
