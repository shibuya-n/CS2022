// PURELY COSMETIC; loading bar for when player says yes

public class loadingBar {

    public static void bar() throws Exception {
        String anim = "|/-·-\\";
        for (int x = 0; x <= 100; x++) {
            String data = "\r" + anim.charAt(x % anim.length()) + " " + x + "%" + " [LOADING...]";
            System.out.write(data.getBytes());
            Thread.sleep(100);
        }
    }
}
