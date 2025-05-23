package main;

import entity.NPC_OldMan;
import monster.MON_RedSlime;
import object.OBJ_Chest;
import object.OBJ_Door;
import object.OBJ_Key;

public class AssetSetter {
    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {

        gp.obj[0] = new OBJ_Key(gp);//as OBJ_Key is a subclass of SuperObject class
        gp.obj[0].worldX = 23 * gp.tileSize;
        gp.obj[0].worldY = 7 * gp.tileSize;

        gp.obj[1] = new OBJ_Key(gp);
        gp.obj[1].worldX = 23 * gp.tileSize;
        gp.obj[1].worldY = 40 * gp.tileSize;

        gp.obj[2] = new OBJ_Key(gp);
        gp.obj[2].worldX = 38 * gp.tileSize;
        gp.obj[2].worldY = 9 * gp.tileSize;

        gp.obj[3] = new OBJ_Door(gp);
        gp.obj[3].worldX = 10 * gp.tileSize;
        gp.obj[3].worldY = 11 * gp.tileSize;

        gp.obj[4] = new OBJ_Door(gp);
        gp.obj[4].worldX = 8 * gp.tileSize;
        gp.obj[4].worldY = 28 * gp.tileSize;

        gp.obj[5] = new OBJ_Door(gp);
        gp.obj[5].worldX = 12 * gp.tileSize;
        gp.obj[5].worldY = 22 * gp.tileSize;

        gp.obj[6] = new OBJ_Chest(gp);
        gp.obj[6].worldX = 10 * gp.tileSize;
        gp.obj[6].worldY = 8 * gp.tileSize;
    }

    public void setNPC(){
        gp.npc[0]= new NPC_OldMan(gp);
        gp.npc[0].worldX = 21 * gp.tileSize;
        gp.npc[0].worldY = 21 * gp.tileSize;

    }
    public void setMonster(){
//22 13 , 22 37 , 12 36 , 27 20 //
        gp.monster[0]=new MON_RedSlime(gp);
        gp.monster[0].worldX = 12 * gp.tileSize;
        gp.monster[0].worldY = 21 * gp.tileSize;

        gp.monster[1]=new MON_RedSlime(gp);
        gp.monster[1].worldX = 36 * gp.tileSize;
        gp.monster[1].worldY = 21 * gp.tileSize;

        gp.monster[2]=new MON_RedSlime(gp);
        gp.monster[2].worldX = 35 * gp.tileSize;
        gp.monster[2].worldY = 11 * gp.tileSize;

        gp.monster[3]=new MON_RedSlime(gp);
        gp.monster[3].worldX = 23 * gp.tileSize;
        gp.monster[3].worldY = 26 * gp.tileSize;
    }
}