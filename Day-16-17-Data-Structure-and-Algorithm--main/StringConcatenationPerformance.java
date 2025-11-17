public class StringConcatenationPerformance {
    public static void main(String[] args) {
        int numStrings = 10000;
        String str = "Hello";

        // String Concatenation
        long startTime = System.currentTimeMillis();
        String stringResult = "";
        for (int i = 0; i < numStrings; i++) {
            stringResult += str;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String Concatenation Time: " + (endTime - startTime) + " ms");

        // StringBuilder Concatenation
        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numStrings; i++) {
            stringBuilder.append(str);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder Concatenation Time: " + (endTime - startTime) + " ms");

        // StringBuffer Concatenation
        startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < numStrings; i++) {
            stringBuffer.append(str);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer Concatenation Time: " + (endTime - startTime) + " ms");
    }
}
