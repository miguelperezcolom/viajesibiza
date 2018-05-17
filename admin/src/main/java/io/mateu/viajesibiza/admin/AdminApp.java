package io.mateu.viajesibiza.admin;


import io.mateu.common.BaseMDDApp;
import io.mateu.ui.core.client.app.AbstractApplication;
import io.mateu.ui.core.client.app.AbstractArea;
import io.mateu.ui.core.client.app.MateuUI;
import io.mateu.ui.mdd.server.util.Helper;

import java.util.ArrayList;
import java.util.List;

public class AdminApp extends BaseMDDApp
{
    static {
        Helper.loadProperties();
    }


    @Override
    public String getName() {
        return "Viajes Ibiza";
    }

    @Override
    public List<AbstractArea> buildAreas() {
        List<AbstractArea> l = new ArrayList<>();
        l.add(new Area());
        return l;
    }

}