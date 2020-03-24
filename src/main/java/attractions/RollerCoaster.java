package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed{

    double cost;

    public RollerCoaster(String name, int rating, double cost) {
        super(name, rating);
        this.cost = cost;
    }
    public boolean isAllowed(Visitor visitor){
        if (visitor.getAge() >= 12 && visitor.getHeight() > 1.45){
            return true;
        } else {
            return false;
        }
    }
    public double defaultPrice(){
        return this.cost;
    }
    public double priceFor(Visitor visitor){
        if(visitor.getHeight() > 2.00){
            return this.cost * 2;
        }else{
            return this.cost;
        }
    }


}
