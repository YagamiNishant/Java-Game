package object;

import main.GamePanel;

import java.io.IOException;

import javax.imageio.ImageIO;
import  entity.Entity;
public class OBJ_Key extends Entity {

    public OBJ_Key(GamePanel gp) {
        super(gp);
        name = "Key";
        down1=setup("/object/key", gp.tileSize,gp.tileSize);

    }
}