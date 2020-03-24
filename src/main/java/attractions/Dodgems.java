package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    double cost;

    public Dodgems(String name, int rating, double cost) {
        super(name, rating);
        this.cost = cost;
    }

    public double defaultPrice(){
        return this.cost;
    }
    public double priceFor(Visitor visitor){
        if(visitor.getAge() < 12 ){
            return this.cost / 2;
        }else{
            return this.cost;
        }
    }

}


