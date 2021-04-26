package guru.sfg.common.events;


/**
 * Created by jt on 2019-07-21.
 */
public class NewInventoryEvent extends BeerEvent {
    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
