class PasswordGenerator {

  int num;
  int length;
  boolean special;
  String specialChars = "!@#$%^&*()_+-=[]{}|;':\"<>,.?/";
  String nonSpecialChars = "1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";

  public PasswordGenerator(int num, int length, boolean special) {
    this.num = num;
    this.length = length;
    this.special = special;
  }

  public String generate() {
    String passwordString = "";
    int rand = 0;
    if (special) {
      for (int i = 0; i < num; i++) {
        String password = "";
        for (int j = 0; j < length; j++) {
          password += (char) (Math.random() * 94 + 33);
        }
        passwordString += password + "\n";
        System.out.println(password);
      }
    }
    if (!special) {
      for (int i = 0; i < num; i++) {
        String password = "";
        for (int j = 0; j < length; j++) {
          rand = (int) (Math.random() * nonSpecialChars.length());
          password += nonSpecialChars.substring(rand, rand + 1);
        }
        passwordString += password + "\n";
        System.out.println(password);
      }
    }
    return passwordString;
  }
}