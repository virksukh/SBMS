package in.india;

public class Car  {
    public void drive(){
        Engine engine = new Engine();
        int engStatus = engine.start();
        if(engStatus == 1){
            System.out.println("journey started");
        }else{
            System.out.println("engine problem");
        }
    }
}
