import java.util.ArrayList;

public class User {

    private String userName;
    private String password;
    private ArrayList watchedMedia = null;
    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setWatchedmedia(ArrayList watchedmedia){
        this.watchedMedia = watchedmedia;
    }
    public ArrayList getwatchedmedia(){
        return watchedMedia;
    }
   public void watchedMedia(Media media){
        if(!watchedMedia.contains(watchedMedia)){
            watchedMedia.add(watchedMedia);
        }
   }
}
