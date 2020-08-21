public class left2 {
  public String left2(String str) {
    String str1 = str.substring(0, 2);
    String str2 = str.substring(2, str.length());
    return str2 + str1;
  }
}
