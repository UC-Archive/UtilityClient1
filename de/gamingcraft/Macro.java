/*    */ package de.gamingcraft;
/*    */ 
/*    */ import net.minecraft.client.settings.KeyBinding;
/*    */ 
/*    */ public class Macro
/*    */ {
/*    */   private final String MACRO_NAME;
/*    */   private final String MACRO_COMMAND;
/*    */   private final KeyBinding MACRO_KEYBINDING;
/*    */   
/*    */   public Macro(String name, String command, KeyBinding kb) {
/* 12 */     this.MACRO_NAME = name;
/* 13 */     this.MACRO_COMMAND = command;
/* 14 */     this.MACRO_KEYBINDING = kb;
/*    */   }
/*    */   
/*    */   public String getName() {
/* 18 */     return this.MACRO_NAME;
/*    */   }
/*    */   
/*    */   public String getCommand() {
/* 22 */     return this.MACRO_COMMAND;
/*    */   }
/*    */   
/*    */   public KeyBinding getKeyBind() {
/* 26 */     return this.MACRO_KEYBINDING;
/*    */   }
/*    */ }


/* Location:              C:\Users\airbu\AppData\Roaming\.minecraft\versions\1.8.8-UC-Classic\1.8.8-UC-Classic.jar!\de\gamingcraft\Macro.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */