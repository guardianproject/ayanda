package sintulabs.p2p;

/**
 * Created by sabzo on 3/22/18.
 */

public interface IServer {
    public int getPort();
    public String getAddress();
    public void setFileToShare(NearbyMedia media);
}
