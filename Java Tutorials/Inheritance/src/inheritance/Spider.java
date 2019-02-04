
package inheritance;

/* @author costantiniwm */

import monsters.Monster;

public class Spider extends Monster
{
    void whatever()
    {
        this.getHitPoints();
        this.setHitPoints(60);
    }

    @Override
    protected void description() {
       
    }


   
}
