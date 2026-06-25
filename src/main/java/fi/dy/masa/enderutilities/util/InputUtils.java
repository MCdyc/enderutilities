package fi.dy.masa.enderutilities.util;

public class InputUtils
{
    public static int getMouseWheelSteps(int dWheel)
    {
        if (dWheel == 0)
        {
            return 0;
        }

        return Math.abs(dWheel) >= 120 ? dWheel / 120 : dWheel;
    }
}
