
public class Gauge {
    private int value;
    public Gauge(){
        
    }
    
    public void increase(){
        this.value++;
        if (this.value > 5){
            this.value--;
        }
    }
    
    public void decrease(){
        this.value--;
        
        if (this.value < 0){
            this.value++;
        }
    }
    
    public int value(){
        return this.value;
    }
    
    public boolean full(){
        if (this.value == 5){
            return true;
        } else {
            return false;
        }
    }
}
