public class WordChecker{
  private ArrayList<String> wordList;

  public WordChecker(ArrayList<String> words) {
    wordList = words;
  }
      
public static boolean isWordChain() {
      for (int i = 1; i < wordList.size(); i++) {
        if (wordList.get(i).indexOf(wordList.get(i - 1)) == -1) {
          return false;
        }
      }
      return true;
    }

    public static ArrayList<String> createList(String target) {
      ArrayList<String> result = new ArrayList<String>();

      for (String word : wordList) {
        if (word.indexOf(target) == 0) {
          result.add(word.substring(target.length()));
        }
      }

      return result;
    }
  }

