public class Match {
    Fighter f1, f2;
    int minWeight, maxWeight;
    double Starter;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    boolean isStart(){
        if((f1.weight>=minWeight && f1.weight<=maxWeight) &&
                (f2.weight>=minWeight && f2.weight<=maxWeight)){
            return true;
        }else
            return false;
    }
    boolean whoStart(){
        this.Starter = Math.random()*100;
        if(this.Starter<=50.0){
            return true;
        }else
            return false;
    }
    double isDodge(){
        double isDodge = Math.random()*100;
        return isDodge;
    }
    void hit(Fighter foe1,Fighter foe2){
        if(isDodge()>foe2.Dodge) {
            foe2.health -= foe1.damage;
            System.out.println(foe1.name+" hit to "+foe2.name);
        }else {
            System.out.println(foe2.name + "Dodged !");
        }
    }
    void start(){
        if(isStart()==true && whoStart()==true){
            while (this.f1.health>=0 && this.f2.health>=0){
                hit(this.f1,this.f2);
                hit(this.f2,this.f1);
                System.out.println(this.f1.name+" = "+this.f1.health+" || "
                        +this.f2.name+" = "+ this.f2.health);
                System.out.println("=====Round finish");

                }
            }
        if(isStart()==true && whoStart()==false){
            while (this.f1.health>=0 && this.f2.health>=0) {
                hit(this.f2, this.f1);
                if (this.f1.health<=0) {
                    System.out.println(this.f2.name+" WON!");
                        break;
                }
                hit(this.f1, this.f2);
                if (this.f2.health<=0) {
                    System.out.println(this.f1.name+" WON!");
                    break;
                }

                System.out.println(this.f1.name + " = " + this.f1.health + " || "
                        + this.f2.name + " = " + this.f2.health);
                System.out.println("=====Round finish");
            }


        }
    }


}
