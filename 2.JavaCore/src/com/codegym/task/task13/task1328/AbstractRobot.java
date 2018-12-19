package com.codegym.task.task13.task1328;

import java.util.Random;

public abstract class AbstractRobot implements CanAttack, CanDefend {
    private static int hitCount;

    abstract String getName();

    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        Random random = new Random();
        hitCount = random.nextInt(4) + 1;

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            attackedBodyPart = BodyPart.LEG;
        } else if (hitCount == 4) {
            attackedBodyPart = BodyPart.CHEST;
        }
        return attackedBodyPart;
    }

    public BodyPart defend() {
        BodyPart defendedBodyPart = null;
        Random random = new Random();
        hitCount = random.nextInt(4) + 1;

        if (hitCount == 1) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            //hitCount = 0;
            defendedBodyPart = BodyPart.ARM;
        } else if (hitCount == 4) {
            defendedBodyPart = BodyPart.CHEST;
        }
        return defendedBodyPart;
    }
}
