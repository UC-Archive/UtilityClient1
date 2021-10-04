/*    */ package de.gamingcraft;
/*    */ 
/*    */ import net.minecraft.client.Minecraft;
/*    */ 
/*    */ public class CPSThread
/*    */   extends Thread {
/*    */   public void run() {
/*    */     while (true) {
/*  9 */       loop();
/*    */       try {
/* 11 */         Thread.sleep(1000L);
/* 12 */       } catch (InterruptedException e) {
/* 13 */         e.printStackTrace();
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public void loop() {
/* 19 */     (Minecraft.getMinecraft()).clicks = 0;
/* 20 */     (Minecraft.getMinecraft()).clicks_other = 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\airbu\AppData\Roaming\.minecraft\versions\1.8.8-UC-Classic\1.8.8-UC-Classic.jar!\de\gamingcraft\CPSThread.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */