/*    */ package de.gamingcraft;
/*    */ 
/*    */ public enum Theme {
/*  4 */   DARK_MODE('8', '7'),
/*  5 */   LIGHT_MODE('f', 'f'),
/*  6 */   RED('4', 'c'),
/*  7 */   ORANGE('6', 'e'),
/*  8 */   BLUE('1', '9');
/*    */   
/*    */   char PREFIX_COLOR;
/*    */   char SUFFIX_COLOR;
/*    */   
/*    */   Theme(char colorCode_prefix, char colorCode_suffix) {
/* 14 */     this.PREFIX_COLOR = colorCode_prefix;
/* 15 */     this.SUFFIX_COLOR = colorCode_suffix;
/*    */   }
/*    */   
/*    */   public String getPrefix() {
/* 19 */     return "§" + this.PREFIX_COLOR;
/*    */   }
/*    */   
/*    */   public String getSuffix() {
/* 23 */     return "§" + this.SUFFIX_COLOR;
/*    */   }
/*    */ }


/* Location:              C:\Users\airbu\AppData\Roaming\.minecraft\versions\1.8.8-UC-Classic\1.8.8-UC-Classic.jar!\de\gamingcraft\Theme.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */