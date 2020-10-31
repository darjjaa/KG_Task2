package com.company.line_drawers;


import com.company.LineDrawer;
import com.company.PixelDrawer;

import java.awt.*;

public class BriezenhaimLineDrawer implements LineDrawer {
    private PixelDrawer pd;

    public BriezenhaimLineDrawer(PixelDrawer pd) {
        this.pd = pd;
    }

    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        int step;
        if (Math.abs(x2 - x1) > Math.abs(y2 - y1)) {
            if (x1 > x2) {
                int c = x1; x1 = x2; x2 = c;
                c = y1; y1 = y2; y2 = c;
            }
            if (y2 > y1)
                step = 1;
            else
                step = -1;

            int dx = x2 - x1, dy = y2 - y1, e = 2 * dy * step - dx;
            int y = y1;

            for (int x = x1; x <= x2; x++) {
                pd.setPixel(x, y, Color.black);
                if (e > 0) {
                    e += 2 * dy * step - 2 * dx;
                    y += step;
                } else {
                    e += 2 * dy * step;
                }
            }
        } else {
            if (y1 > y2) {
                int c = y1; y1 = y2; y2 = c;
                c = x1; x1 = x2; x2 = c;
            }
            if (x2 > x1)
                step = 1;
            else
                step = -1;

            int dx = x2 - x1, dy = y2 - y1, e = 2 * dx * step - dy;
            int y = y1;

            for (int x = x1; y <= y2; y++) {
                pd.setPixel(x, y, Color.black);
                if (e > 0) {
                    e += 2 * dx * step - 2 * dy;
                    x += step;
                } else {
                    e += 2 * dx * step;
                }
            }
        }
    }
}