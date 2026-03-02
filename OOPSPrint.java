public class OOPSPrint {

    public static class CharacterPattern {

        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static String[] getOPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }
	
	public static String[] getOPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

<<<<<<< HEAD
    public static String[] getPPattern() {
=======
     // Helper method for O
    static String[] getOPattern() {
        return new String[]{
                String.join("", " *** "),
                String.join("", "*   *"),
                String.join("", "*   *"),
                String.join("", "*   *"),
                String.join("", "*   *"),
                String.join("", "*   *"),
                String.join("", " *** ")
        };
    }

    // Helper method for P
    static String[] getPPattern() {
>>>>>>> bd341665e817622a1f3ed25be73e4fd1faa45b16
        return new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
    }

    public static void main(String[] args) {

        CharacterPattern[] letters = {
                new CharacterPattern('O', getOPattern()),
                new CharacterPattern('O', getOPattern()),
                new CharacterPattern('P', getPPattern()),
                new CharacterPattern('S', getSPattern())
        };

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPattern letter : letters) {
                line.append(letter.getPattern()[i]).append("   ");
            }

            System.out.println(line);
        }
    }
}
