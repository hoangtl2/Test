package main.java.com.auction.common.models;
import java.time.LocalDateTime;
import java.util.UUID;
public abstract class Entity {
    private String id;
    private LocalDateTime createdate;
    public Entity(){
        this.id = UUID.randomUUID().toString();
        this.createdate = LocalDateTime.now();
    }
}
