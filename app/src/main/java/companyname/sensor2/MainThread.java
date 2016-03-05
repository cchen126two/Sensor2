package companyname.sensor2;

/**
 * Created by Cheng on 3/3/2016.
 */
public class MainThread extends Thread{
    private boolean running;
    public void setRunning(boolean running){
        this.running = running;

    }
    @Override
    public void run(){
        while (running)
        {

        }
    }
}
