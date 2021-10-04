/*    */ package de.gamingcraft;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.util.ArrayList;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.settings.KeyBinding;
/*    */ import org.apache.commons.lang3.ArrayUtils;
/*    */ 
/*    */ 
/*    */ public class UtilityClient
/*    */ {
/* 12 */   public static ArrayList<KeyBinding> keyBinds = new ArrayList<>();
/* 13 */   public static float fovModi = 1.0F;
/* 14 */   public static float gammaModi = 1.0F;
/*    */   
/* 16 */   public static Theme selTheme = Theme.ORANGE;
/*    */   
/*    */   public static void onStart() {
/* 19 */     keyBinds.add(new KeyBinding("Fulbright", 38, "Utility Client"));
/* 20 */     keyBinds.add(new KeyBinding("Zoom", 46, "Utility Client"));
/*    */     
/*    */     try {
/* 23 */       Macros.onStart();
/* 24 */     } catch (IOException e) {
/* 25 */       e.printStackTrace();
/*    */     } 
/*    */     
/* 28 */     for (KeyBinding kb : keyBinds) {
/* 29 */       (Minecraft.getMinecraft()).gameSettings.keyBindings = (KeyBinding[])ArrayUtils.add((Object[])(Minecraft.getMinecraft()).gameSettings.keyBindings, kb);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public static ArrayList<KeyBinding> getKeyBindings() {
/* 35 */     return keyBinds;
/*    */   }
/*    */ }


/* Location:              C:\Users\airbu\AppData\Roaming\.minecraft\versions\1.8.8-UC-Classic\1.8.8-UC-Classic.jar!\de\gamingcraft\UtilityClient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */