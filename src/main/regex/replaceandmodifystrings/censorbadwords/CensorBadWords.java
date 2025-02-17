package regex.replaceandmodifystrings.censorbadwords;

public class CensorBadWords {
  private String[] badWords;

  CensorBadWords(String[] badWords){
      this.badWords = badWords;
  }

  public String censorText(String text){
      for(String word : badWords){
          String regex = "\\b"+word+"\\b";
          text = text.replaceAll(regex,"****");
      }
      return text;
  }
}
