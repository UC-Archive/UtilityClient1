/*    */ package de.gamingcraft;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import net.minecraft.client.gui.GuiButton;
/*    */ import net.minecraft.client.gui.GuiScreen;
/*    */ import net.minecraft.client.gui.ScaledResolution;
/*    */ import net.minecraft.client.resources.I18n;
/*    */ 
/*    */ public class GuiUtilityClient extends GuiScreen {
/*    */   private final GuiScreen parent;
/*    */   
/*    */   public GuiUtilityClient(GuiScreen p_i1046_1_) {
/* 13 */     this.parent = p_i1046_1_;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void initGui() {
/* 23 */     this.buttonList.add(new GuiButton(1, this.width / 2 - 100, this.height / 6 + 48, 200, 20, "Comming soon!"));
/* 24 */     this.buttonList.add(new GuiButton(2, this.width / 2 - 100, this.height / 6 + 78, 200, 20, "Comming soon!"));
/* 25 */     this.buttonList.add(new GuiButton(3, this.width / 2 - 100, this.height / 6 + 108, 200, 20, "Comming soon!"));
/*    */     
/* 27 */     this.buttonList.add(new GuiButton(200, this.width / 2 - 100, this.height / 6 + 168, I18n.format("gui.done", new Object[0])));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void actionPerformed(GuiButton button) throws IOException {
/* 36 */     if (button.enabled)
/*    */     {
/* 38 */       if (button.id == 200) {
/*    */         
/* 40 */         this.mc.gameSettings.saveOptions();
/* 41 */         this.mc.displayGuiScreen(this.parent);
/*    */       } 
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void drawScreen(int mouseX, int mouseY, float partialTicks) {
/* 51 */     drawDefaultBackground();
/* 52 */     this.fontRendererObj.drawStringWithShadow("§4Utility §cClient", ((new ScaledResolution(this.mc)).getScaledWidth() / 2 - this.fontRendererObj.getStringWidth("Utility Client") / 2), 50.0F, 0);
/* 53 */     super.drawScreen(mouseX, mouseY, partialTicks);
/*    */   }
/*    */ }


/* Location:              C:\Users\airbu\AppData\Roaming\.minecraft\versions\1.8.8-UC-Classic\1.8.8-UC-Classic.jar!\de\gamingcraft\GuiUtilityClient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */