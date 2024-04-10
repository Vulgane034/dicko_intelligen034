public class dictionnaire {
public static String Translate(String phrase){
    String[] motsFR={" j arrive ","bonjour ","qui","quoi","nourriture"," sauce d arrachide ","ecole ","enfant "
    ,"ou est passer mon enfant ","ou","tu es eton ","tu derange ","l eau","tu parle de quoi","la femme","je voi"
    ,"tu vois","peau","robe ","mangue","Il est en retard pour le dîner","ananas","anial","il"};
    String[] motsET={"mele zou","memakiri ","zaa ","dje ","bidi ","nfiann ngondo ","zokoulu","ndomgni",
"me na ndomgni bi ine ve ","keve ","on ne nbol eton ","a te daagck laa","ndim","a te kari dje","min nga","me te yen"
,"wate yen","ikob","kaba","ndogdo","ànə̀á mbúz ású dínâ ànə̀á mbúh ású dínâ","zə̀g","tíd","ànə"};
 for(int i=0; i<motsFR.length; i++){
phrase=phrase.replaceAll(motsFR[i], motsET[i]);        

}
  return phrase;
}
}