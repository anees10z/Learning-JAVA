package ArraysAndSorting;

public class TrappingRainWater {
    public static int trap(int[] barHeight, int width) {
        int maxWaterTrapped = 0;
        int[] leftMaxBar = new int[barHeight.length];
        int[] rightMaxBar = new int[barHeight.length];
        // left
        // {4,2,0,6,3,2,5};
        int lmax = barHeight[0];
        leftMaxBar[0] = barHeight[0];
        leftMaxBar[barHeight.length - 1] = barHeight[barHeight.length - 1];

        for (int i = 1; i < barHeight.length - 1; i++) {
            if (barHeight[i] > lmax)
                lmax = barHeight[i];
            leftMaxBar[i] = lmax;
        }
        // right
        int rmax = barHeight[barHeight.length - 1];
        rightMaxBar[0] = barHeight[0];
        rightMaxBar[barHeight.length - 1] = barHeight[barHeight.length - 1];

        for (int i = barHeight.length - 2; i > 0; i--) {
            if (barHeight[i] > rmax)
                rmax = barHeight[i];
            rightMaxBar[i] = rmax;
        }

        // for (int i : rightMaxBar) {
        // System.out.print(i + " ");
        // }

        for (int i = 0; i < barHeight.length; i++) {
            int trapAtEachBar = (Math.min(leftMaxBar[i], rightMaxBar[i]) - barHeight[i]) * width;
            maxWaterTrapped += trapAtEachBar;
        }
        return maxWaterTrapped;
    }

    public static void main(String[] args) {
        int barHeight[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println();
        System.out.println("Max water trapped = " + trap(barHeight, 1));
        System.out.println();
    }
}
