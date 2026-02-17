public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] bannerLines = {
            "   ***        ***      ******        ***** ",
            " **   **    **   **    **    **     **     ",
            "**     **  **     **   **     **   **     ",
            "**     **  **     **   **    **     **  ",
            "**     **  **     **   ******        ***",
            "**     **  **     **   **              **  ",
            "**     **  **     **   **               **     ",
            " **   **    **    **   **              **       ",
            "   ***        ***      **         *****    "
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}