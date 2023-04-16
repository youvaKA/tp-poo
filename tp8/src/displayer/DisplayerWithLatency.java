package displayer;

public class DisplayerWithLatency extends LedDisplayer{
    private int latency;

    public DisplayerWithLatency (int width, int latency){
        super(width);
        this.latency = latency;
    }

    public void setMessage (String message){
        String msgWithLatency = message;

        for (int i=0 ; i<this.latency; i++){
            msgWithLatency = msgWithLatency + " ";
        }

        super.setMessage(msgWithLatency);
    }
}
