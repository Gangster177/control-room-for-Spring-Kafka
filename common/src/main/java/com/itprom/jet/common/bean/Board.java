package com.itprom.jet.common.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Board {
    private String name;
    private String location;
    private Route route;
    private boolean busy;
    private double speed;
    private double x;
    private double y;
    private double angle;

    public boolean noBusy() {  // -> board::noBusy
        return !busy;
    }
    public boolean hasRoute(){
        return route != null;
    }

    public void calculatePosition(RoutePath routDirection) {
        double t = routDirection.getProgress();

        double toX = (1 - t) * routDirection.getFrom().getX() + t * routDirection.getTo().getX();
        double toY = (1 - t) * routDirection.getFrom().getY() + t * routDirection.getTo().getY();

        double deltaX = this.x - toX;
        double deltaY = this.y - toY;

        this.angle = Math.toDegrees(Math.atan2(deltaY,deltaX));
        if(this.angle < 0){
            this.angle = 360 + this.angle;
        }
        this.x = toX;
        this.y = toY;
    }
}
