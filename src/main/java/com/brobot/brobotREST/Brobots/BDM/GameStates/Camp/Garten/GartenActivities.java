package com.brobot.brobotREST.Brobots.BDM.GameStates.Camp.Garten;

import com.brobot.brobotREST.Brobots.BDM.DataModel.Items;
import com.brobot.brobotREST.Brobots.BDM.Steuerung.BDMGameRegionDefined;
import com.brobot.brobotREST.StateObjects.ObjectMethods.Click.ClickStateImage;
import com.brobot.brobotREST.StateObjects.ObjectMethods.Wait.WaitStateImage;
import org.springframework.stereotype.Component;

@Component
public class GartenActivities {

    private Garten garten;
    private Items items;
    private BDMGameRegionDefined bdoGameRegion;
    private ClickStateImage click;
    private WaitStateImage wait;

    private int anzahlFelder = 2;

    public GartenActivities(Garten garten, Items items,
                            BDMGameRegionDefined bdoGameRegion,
                            ClickStateImage click, WaitStateImage wait) {
        this.garten = garten;
        this.items = items;
        this.bdoGameRegion = bdoGameRegion;
        this.click = click;
        this.wait = wait;
    }

    public boolean dieFeldfruchteVerwalten(int wieViele) {
        for (int i=0; i<wieViele; i++) {
            feldfruchteVerwalten();
        }
        return true;
    }

    public boolean feldfruchteVerwalten() {
        return true;
    }

}