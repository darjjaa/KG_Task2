package com.company.line_drawers;

import com.company.LineDrawer;

import java.awt.*;

public class GraphicsLineDrawer implements LineDrawer {
    private Graphics g;

    public GraphicsLineDrawer(Graphics g) {
        this.g = g;
    }
    @Override
    public void drawLine(int x, int y, int i, int i1) {
        g.drawLine(x, y, i, i1);
    }
}
